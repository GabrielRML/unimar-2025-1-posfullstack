package br.unimar.aitutor.adapter.gateway.openai;

import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIChatCompletionResponse;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIRequest;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAITranscriptionResponse;
import feign.RequestInterceptor;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(name = "openai", url = "${openai.base-url}", configuration = OpenAIClient.Config.class)
public interface OpenAIClient {

    @PostMapping("/chat/completions")
    OpenAIChatCompletionResponse chatCompletions(@RequestBody OpenAIRequest request);

    @PostMapping(value = "/audio/transcriptions", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    OpenAITranscriptionResponse transcribeAudio(@RequestBody Map<String, ?> formData);

    @Configuration
    class Config {

        @Value("${openai.api-key}")
        private String apiKey;

        @Bean
        public RequestInterceptor bearerTokenRequestInterceptor() {
            return template -> {
                if (!template.headers().containsKey(HttpHeaders.AUTHORIZATION)) {
                    template.header(HttpHeaders.AUTHORIZATION, "Bearer %s".formatted(apiKey));
                }
            };
        }

        @Bean
        public Encoder feignFormEncoder(ObjectFactory<HttpMessageConverters> converters) {
            return new SpringFormEncoder(new SpringEncoder(converters));
        }
    }
}

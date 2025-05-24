package br.unimar.aitutor.adapter.gateway.openai;

import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIChatCompletionResponse;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "openai", url = "${openai.base-url}")
public interface OpenAIClient {

    @PostMapping("/chat/completions")
    OpenAIChatCompletionResponse chatCompletions(
            @RequestHeader("Authorization") String bearerToken,
            @RequestBody OpenAIRequest request
    );
}

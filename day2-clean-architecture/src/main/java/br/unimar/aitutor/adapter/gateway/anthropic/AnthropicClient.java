package br.unimar.aitutor.adapter.gateway.anthropic;

import br.unimar.aitutor.adapter.gateway.anthropic.dto.AnthropicRequest;
import br.unimar.aitutor.adapter.gateway.anthropic.dto.AnthropicResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "anthropic", url = "${anthropic.base-url}")
public interface AnthropicClient {

    @PostMapping("/messages")
    AnthropicResponse messages(
            @RequestHeader("x-api-key") String apiKey,
            @RequestHeader("anthropic-version") String version,
            @RequestBody AnthropicRequest request
    );
}
package br.unimar.aitutor.adapter.gateway;

import br.unimar.aitutor.adapter.gateway.anthropic.AnthropicClient;
import br.unimar.aitutor.adapter.gateway.anthropic.dto.AnthropicMessage;
import br.unimar.aitutor.adapter.gateway.anthropic.dto.AnthropicRequest;
import br.unimar.aitutor.adapter.gateway.anthropic.dto.AnthropicResponse;
import br.unimar.aitutor.domain.gateway.LLMGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConditionalOnProperty(name = "llm.provider", havingValue = "anthropic")
public class AnthropicGateway implements LLMGateway {

    private final AnthropicClient anthropicClient;
    private final String apiKey;
    private final String anthropicVersion;

    public AnthropicGateway(AnthropicClient anthropicClient,
                            @Value("${anthropic.api-key}") String apiKey,
                            @Value("${anthropic.version}") String anthropicVersion) {
        this.anthropicClient = anthropicClient;
        this.apiKey = apiKey;
        this.anthropicVersion = anthropicVersion;
    }

    @Override
    public String generateAnswer(String userQuestion, String aiTutorPrompt) {
        AnthropicRequest request = new AnthropicRequest(
                "claude-3-7-sonnet-20250219",
                1024,
                List.of(
                        new AnthropicMessage("assistant", aiTutorPrompt),
                        new AnthropicMessage("user", userQuestion)
                )
        );
        AnthropicResponse response = anthropicClient.messages(apiKey, anthropicVersion, request);
        if (response.content() != null && !response.content().isEmpty()) {
            return response.content().getFirst().text();
        }
        return "Sem resposta da Anthropic!";
    }
}
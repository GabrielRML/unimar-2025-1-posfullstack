package br.unimar.aitutor.adapter.gateway;

import br.unimar.aitutor.adapter.gateway.openai.OpenAIClient;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIChatCompletionResponse;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIMessage;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIRequest;
import br.unimar.aitutor.domain.gateway.LLMGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConditionalOnProperty(name = "llm.provider", havingValue = "openai", matchIfMissing = true)
public class OpenAIGateway implements LLMGateway {

    private final OpenAIClient openAIClient;
    private final String apiKey;

    public OpenAIGateway(OpenAIClient openAIClient, @Value("${openai.api-key}") String apiKey) {
        this.openAIClient = openAIClient;
        this.apiKey = apiKey;
    }

    @Override
    public String generateAnswer(String userQuestion, String aiTutorPrompt) {
        OpenAIRequest request = new OpenAIRequest(
                "gpt-4.1",
                List.of(
                        new OpenAIMessage("developer", aiTutorPrompt),
                        new OpenAIMessage("user", userQuestion)
                )
        );
        String bearerToken = "Bearer %s".formatted(apiKey);
        OpenAIChatCompletionResponse response = openAIClient.chatCompletions(bearerToken, request);
        if (response.choices() != null && !response.choices().isEmpty()) {
            return response.choices().getFirst().message().content();
        }
        return "Sem resposta da OpenAI!";
    }
}

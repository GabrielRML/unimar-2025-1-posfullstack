package br.unimar.aitutor.adapter.gateway;

import br.unimar.aitutor.adapter.gateway.openai.OpenAIClient;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIChatCompletionResponse;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIMessage;
import br.unimar.aitutor.adapter.gateway.openai.dto.OpenAIRequest;
import br.unimar.aitutor.domain.gateway.LLMGateway;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConditionalOnProperty(name = "llm.provider", havingValue = "openai", matchIfMissing = true)
public class OpenAIGateway implements LLMGateway {

    private final OpenAIClient openAIClient;

    public OpenAIGateway(OpenAIClient openAIClient) {
        this.openAIClient = openAIClient;
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
        OpenAIChatCompletionResponse response = openAIClient.chatCompletions(request);
        if (response.choices() != null && !response.choices().isEmpty()) {
            return response.choices().getFirst().message().content();
        }
        return "Sem resposta da OpenAI!";
    }
}

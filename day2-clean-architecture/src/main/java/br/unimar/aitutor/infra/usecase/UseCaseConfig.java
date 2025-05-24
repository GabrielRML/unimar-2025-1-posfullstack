package br.unimar.aitutor.infra.usecase;

import br.unimar.aitutor.domain.gateway.LLMGateway;
import br.unimar.aitutor.domain.usecase.AnswerQuestionUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public AnswerQuestionUseCase answerQuestionUseCase(LLMGateway llmGateway) {
        return new AnswerQuestionUseCase(llmGateway);
    }
}

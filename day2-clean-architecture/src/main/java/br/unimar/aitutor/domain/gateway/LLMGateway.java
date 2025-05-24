package br.unimar.aitutor.domain.gateway;

public interface LLMGateway {
    String generateAnswer(String userQuestion, String aiTutorPrompt);
}

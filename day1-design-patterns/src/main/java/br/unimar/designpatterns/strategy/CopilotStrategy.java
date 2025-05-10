package br.unimar.designpatterns.strategy;

public class CopilotStrategy implements ModelStrategy {

    @Override
    public String generateResponse(String prompt) {
        return """
                Usuario: %s
                Resposta: Oi, eu sou o Modelo Copilot da Microsoft!
                """.formatted(prompt);
    }
}

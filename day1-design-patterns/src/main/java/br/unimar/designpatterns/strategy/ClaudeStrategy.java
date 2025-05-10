package br.unimar.designpatterns.strategy;

public class ClaudeStrategy implements ModelStrategy {
    
    @Override
    public String generateResponse(String prompt) {
        return """
                Usuario: %s
                Resposta: Oi, eu sou o Modelo Claude 3.7 Sonnet!
                """.formatted(prompt);
    }
}

package br.unimar.designpatterns.strategy;

public class GeminiStrategy implements ModelStrategy {

    @Override
    public String generateResponse(String prompt) {
        return """
                Usuario: %s
                Resposta: Oi, eu sou o Modelo Gemini da Google!
                """.formatted(prompt);
    }
}

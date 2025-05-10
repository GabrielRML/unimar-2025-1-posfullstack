package br.unimar.designpatterns.strategy;

public class ChatGPTStrategy implements ModelStrategy {

    @Override
    public String generateResponse(String prompt) {
        return """
                Usuario: %s
                Resposta: Oi, eu sou o Modelo 4o do ChatGPT!
                """.formatted(prompt);
    }
}

package br.unimar.designpatterns.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AIChatbotTest {

    public static final String EXPECTED_RESPONSE_CHAT_GPT = "Oi, eu sou o Modelo 4o do ChatGPT!";
    public static final String EXPECTED_RESPONSE_CLAUDE = "Oi, eu sou o Modelo Claude 3.7 Sonnet!";
    public static final String EXPECTED_RESPONSE_GEMINI = "Oi, eu sou o Modelo Gemini da Google!";
    public static final String EXPECTED_RESPONSE_COPILOT = "Oi, eu sou o Modelo Copilot da Microsoft!";

    @Test
    @DisplayName("Deve testar todas as estratégias individualmente")
    void testAllStrategies() {
        testStrategy(new ChatGPTStrategy(), "Oi modelo padrão!", EXPECTED_RESPONSE_CHAT_GPT);
        testStrategy(new ClaudeStrategy(), "Olá Claude!", EXPECTED_RESPONSE_CLAUDE);
        testStrategy(new GeminiStrategy(), "Oi modelo do Google?!", EXPECTED_RESPONSE_GEMINI);
        testStrategy(new CopilotStrategy(), "Olá Copilot!", EXPECTED_RESPONSE_COPILOT);
    }

    @Test
    @DisplayName("Deve manter o mesmo comportamento após múltiplas mudanças de estratégia")
    void testMultipleStrategyChanges() {
        AIChatbot aiChatbot = new AIChatbot(new ChatGPTStrategy());
        String prompt = "Teste de consistência";

        // Testa cada mudança de estratégia
        testStrategyChange(aiChatbot, new ChatGPTStrategy(), prompt, EXPECTED_RESPONSE_CHAT_GPT);
        testStrategyChange(aiChatbot, new ClaudeStrategy(), prompt, EXPECTED_RESPONSE_CLAUDE);
        testStrategyChange(aiChatbot, new GeminiStrategy(), prompt, EXPECTED_RESPONSE_GEMINI);
        testStrategyChange(aiChatbot, new CopilotStrategy(), prompt, EXPECTED_RESPONSE_COPILOT);
    }

    // Métodos helper para reduzir duplicação
    private void testStrategy(ModelStrategy strategy, String prompt, String expectedResponse) {
        AIChatbot aiChatbot = new AIChatbot(strategy);
        assertResponse(aiChatbot.generateResponse(prompt), prompt, expectedResponse);
    }

    private void testStrategyChange(AIChatbot aiChatbot, ModelStrategy strategy, String prompt, String expectedResponse) {
        aiChatbot.setModelStrategy(strategy);
        assertResponse(aiChatbot.generateResponse(prompt), prompt, expectedResponse);
    }

    private void assertResponse(String actualResponse, String expectedPrompt, String expectedModelResponse) {
        assertNotNull(actualResponse);
        assertTrue(actualResponse.contains("Usuario: " + expectedPrompt));
        assertTrue(actualResponse.contains("Resposta: " + expectedModelResponse));
    }
}
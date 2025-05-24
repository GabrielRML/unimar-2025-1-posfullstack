package br.unimar.aitutor.adapter.gateway.openai.dto;

import java.util.List;

public record OpenAIChatCompletionResponse(List<Choice> choices) {

    public record Choice(OpenAIMessage message) { }
}

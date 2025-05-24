package br.unimar.aitutor.adapter.gateway.openai.dto;

import java.util.List;

public record OpenAIRequest(String model, List<OpenAIMessage> messages) { }

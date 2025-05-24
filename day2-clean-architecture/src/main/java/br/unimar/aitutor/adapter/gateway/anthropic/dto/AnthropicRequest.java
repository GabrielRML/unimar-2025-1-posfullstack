package br.unimar.aitutor.adapter.gateway.anthropic.dto;

import java.util.List;

public record AnthropicRequest(String model, int max_tokens, List<AnthropicMessage> messages) { }
package br.unimar.aitutor.adapter.gateway.anthropic.dto;

import java.util.List;

public record AnthropicResponse(List<Content> content) {

    public record Content(String type, String text) { }
}
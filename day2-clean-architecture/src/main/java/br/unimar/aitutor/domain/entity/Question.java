package br.unimar.aitutor.domain.entity;

import br.unimar.aitutor.infra.exception.DomainException;

import java.time.LocalDateTime;

public class Question {

    private String content;
    private final LocalDateTime timestamp = LocalDateTime.now();

    public void validate() {
        if (content == null || content.trim().isEmpty())
            throw new DomainException("Pergunta não pode estar vazia");
        if (content.length() > 1000)
            throw new DomainException("Pergunta muito longa (máx: 1000 caracteres)");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
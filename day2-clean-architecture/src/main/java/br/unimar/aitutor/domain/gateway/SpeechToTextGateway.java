package br.unimar.aitutor.domain.gateway;

import java.io.InputStream;

public interface SpeechToTextGateway {
    String transcribe(String fileName, InputStream fileContent);
}

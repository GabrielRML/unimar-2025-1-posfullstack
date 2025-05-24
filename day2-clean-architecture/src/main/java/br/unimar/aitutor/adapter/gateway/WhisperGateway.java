package br.unimar.aitutor.adapter.gateway;

import br.unimar.aitutor.adapter.gateway.openai.OpenAIClient;
import br.unimar.aitutor.domain.gateway.SpeechToTextGateway;
import br.unimar.aitutor.infra.exception.InfrastructureException;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

@Service
public class WhisperGateway implements SpeechToTextGateway {

    private final OpenAIClient openAIClient;

    public WhisperGateway(OpenAIClient openAIClient) {
        this.openAIClient = openAIClient;
    }

    @Override
    public String transcribe(String fileName, InputStream fileContent) {
        try {
            String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
            Path tempPath = Files.createTempFile("audio_", ".%s".formatted(extension));
            Files.copy(fileContent, tempPath, StandardCopyOption.REPLACE_EXISTING);

            Map<String, Object> formData = new HashMap<>();
            formData.put("file", tempPath.toFile());
            formData.put("model", "whisper-1");

            var response = openAIClient.transcribeAudio(formData);

            Files.delete(tempPath);

            return response.text();
        } catch (Exception e) {
            throw new InfrastructureException("Erro ao transcrever audio", e);
        }
    }
}

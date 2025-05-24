package br.unimar.aitutor.domain.usecase;

import br.unimar.aitutor.domain.gateway.SpeechToTextGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public record AnswerVoiceQuestionUseCase(SpeechToTextGateway sttGateway, AnswerQuestionUseCase answerQuestionUseCase) {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnswerVoiceQuestionUseCase.class);

    public Output execute(Input input) {
        String textQuestion = sttGateway.transcribe(input.filename(), input.audioQuestion());
        LOGGER.debug("Question transcribed: {}", textQuestion);

        var output = answerQuestionUseCase.execute(new AnswerQuestionUseCase.Input(textQuestion));

        return new Output(output.answer());
    }

    public record Input(String filename, InputStream audioQuestion) {
    }

    public record Output(String answer) {
    }
}

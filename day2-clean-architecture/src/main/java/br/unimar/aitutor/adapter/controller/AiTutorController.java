package br.unimar.aitutor.adapter.controller;

import br.unimar.aitutor.domain.usecase.AnswerQuestionUseCase;
import br.unimar.aitutor.domain.usecase.AnswerVoiceQuestionUseCase;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/tutor")
public record AiTutorController(AnswerQuestionUseCase answerTextQuestion,
                                AnswerVoiceQuestionUseCase answerVoiceQuestion) {

    @PostMapping("/ask")
    public ResponseEntity<Response> askQuestion(@RequestBody Request request) {
        var input = new AnswerQuestionUseCase.Input(request.question());
        var output = answerTextQuestion.execute(input);
        return ResponseEntity.ok(new Response(output.answer()));
    }

    @PostMapping(value = "/ask-voice", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Response> askVoiceQuestion(@RequestParam("file") MultipartFile file) throws IOException {
        var input = new AnswerVoiceQuestionUseCase.Input(file.getOriginalFilename(), file.getInputStream());
        var output = answerVoiceQuestion.execute(input);
        return ResponseEntity.ok(new Response(output.answer()));
    }

    public record Request(String question) {
    }

    public record Response(String answer) {
    }
}
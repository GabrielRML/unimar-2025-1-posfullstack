package br.unimar.aitutor.adapter.controller;

import br.unimar.aitutor.domain.usecase.AnswerQuestionUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tutor")
public record TutorController(AnswerQuestionUseCase answerQuestion) {

    @PostMapping("/ask")
    public ResponseEntity<Response> askQuestion(@RequestBody Request request) {
        var input = new AnswerQuestionUseCase.Input(request.question(), request.studentName());
        var output = answerQuestion.execute(input);
        return ResponseEntity.ok(new Response(output.answer()));
    }

    public record Request(String question, String studentName) {
    }

    public record Response(String answer) {
    }
}
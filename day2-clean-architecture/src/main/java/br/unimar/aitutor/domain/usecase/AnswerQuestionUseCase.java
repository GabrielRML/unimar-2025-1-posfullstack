package br.unimar.aitutor.domain.usecase;

import br.unimar.aitutor.domain.entity.Question;
import br.unimar.aitutor.domain.gateway.LLMGateway;

public record AnswerQuestionUseCase(LLMGateway llmGateway) {

    public Output execute(Input input) {
        var question = new Question();
        question.setContent(input.question());
        question.setStudentName(input.studentName());
        question.validate();

        String userQuestion = question.getContent();
        String aiTutorPrompt = buildAiTutorPrompt();
        String answer = llmGateway.generateAnswer(userQuestion, aiTutorPrompt);

        return new Output(answer);
    }

    private String buildAiTutorPrompt() {
        return """
                Atue como um especialista em desenvolvimento FullStack, com foco em Clean Code, Design Patterns e Qualidade de Software.
                Seu objetivo é responder perguntas dos alunos de pós-graduação sobre esses tópicos.
                Mantenha um tom de voz informal e coeso, sempre responda com uma resposta didaticamente clara e, se possível, com analogias.
                NUNCA RESPONDA NADA FORA DESSE CONTEXTO!
                """;
    }

    public record Input(String question, String studentName) {
    }

    public record Output(String answer) {
    }
}
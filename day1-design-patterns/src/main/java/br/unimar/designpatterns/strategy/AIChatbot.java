package br.unimar.designpatterns.strategy;

public class AIChatbot {

    private ModelStrategy modelStrategy;

    public AIChatbot(ModelStrategy modelStrategy) {
        this.modelStrategy = modelStrategy;
    }

    public void setModelStrategy(ModelStrategy modelStrategy) {
        this.modelStrategy = modelStrategy;
    }

    public String generateResponse(String prompt) {
        return modelStrategy.generateResponse(prompt);
    }
}

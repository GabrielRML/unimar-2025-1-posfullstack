package br.unimar;

import br.unimar.cleancode.C;
import br.unimar.cleancode.Calculator;
import br.unimar.designpatterns.adapter.*;
import br.unimar.designpatterns.singleton.SingletonEager;
import br.unimar.designpatterns.singleton.SingletonLazy;
import br.unimar.designpatterns.strategy.*;

public class Main {
    public static void main(String[] args) {
        executeSamplesCleanCode();
        executeSamplesDesignPatterns();
    }

    private static void executeSamplesDesignPatterns() {
        executeSamplesDesignPatternsCreational();
        executeSamplesDesignPatternsStructural();
        executeSamplesDesignPatternsBehavioral();
    }

    private static void executeSamplesDesignPatternsBehavioral() {
        ModelStrategy defaultModel = new ChatGPTStrategy();
        AIChatbot aiChatbot = new AIChatbot(defaultModel);
        System.out.printf(aiChatbot.generateResponse("Oi modelo padrao!"));

        aiChatbot.setModelStrategy(new ClaudeStrategy());
        System.out.printf(aiChatbot.generateResponse("Oi modelo novo!"));

        aiChatbot.setModelStrategy(new GeminiStrategy());
        System.out.printf(aiChatbot.generateResponse("Oi modelo do Google?!"));
    }

    private static void executeSamplesDesignPatternsStructural() {
        Service adapterCsv = new AdapterCsv(new ServiceCsv());
        Service adapterXml = new AdapterXml(new ServiceXml());

        Client client = new Client();
        Service.User userByCsv = client.doWork(adapterCsv);
        System.out.printf("User by CSV: %s%n", userByCsv);

        Service.User userByXml = client.doWork(adapterXml);
        System.out.printf("User by XML: %s%n", userByXml);
    }

    private static void executeSamplesDesignPatternsCreational() {
        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        System.out.println(SingletonEager.getInstance());
        System.out.println(SingletonEager.getInstance());
        System.out.println(SingletonEager.getInstance());

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());
    }

    private static void executeSamplesCleanCode() {
        C c = new C();
        int v1 = 10;
        int v2 = 10;
        System.out.println(c.a(v1, v2));
        System.out.println(c.b(v1, v2));
        System.out.println(c.c(v1, v2));

        Calculator calculator = new Calculator();
        int valor1 = 10;
        int valor2 = 10;
        System.out.println(calculator.sum(valor1, valor2));
        System.out.println(calculator.subtract(valor1, valor2));
        System.out.println(calculator.multiply(valor1, valor2));
    }
}
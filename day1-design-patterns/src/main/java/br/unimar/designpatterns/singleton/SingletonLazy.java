package br.unimar.designpatterns.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (SingletonLazy.instance == null) {
            SingletonLazy.instance = new SingletonLazy();
        }
        return SingletonLazy.instance;
    }
}

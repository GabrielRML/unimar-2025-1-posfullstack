package br.unimar.designpatterns.adapter;

/**
 * Client expects to use Target interface.
 */
public class Client {
    public Service.User doWork(Service target) {
        return target.getUser();
    }
}
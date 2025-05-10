package br.unimar.designpatterns.adapter;

/**
 * Target interface expected by the Client.
 */
public interface Service {

    User getUser();

    record User(int id, String name, int age) { }
}
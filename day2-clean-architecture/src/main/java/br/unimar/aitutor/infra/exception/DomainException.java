package br.unimar.aitutor.infra.exception;

/**
 * Custom Exception to Domain Rules.
 */
public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }
}

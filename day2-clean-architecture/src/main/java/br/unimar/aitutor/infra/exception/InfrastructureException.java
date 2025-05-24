package br.unimar.aitutor.infra.exception;

/**
 * Custom Exception to Infrastructure Errors.
 */
public class InfrastructureException extends RuntimeException {

    public InfrastructureException(String message, Throwable cause) {
        super(message, cause);
    }
}

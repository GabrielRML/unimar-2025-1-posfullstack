package br.unimar.aitutor.infra.exception.handler;

import br.unimar.aitutor.infra.exception.DomainException;
import br.unimar.aitutor.infra.exception.InfrastructureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler({DomainException.class, InfrastructureException.class})
    public ResponseEntity<ApiError> expectedError(DomainException exception) {
        logger.debug(exception.getMessage());
        return ResponseEntity.unprocessableEntity().body(new ApiError(exception.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> unexpectedError(Exception exception) {
        logger.error("Unexpected exception: {}", exception.getMessage());
        return ResponseEntity.internalServerError().body(new ApiError(exception.getMessage()));
    }

    public record ApiError(String message) {
    }
}

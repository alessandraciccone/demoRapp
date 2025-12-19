package aciccone.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler {
    private ResponseEntity<Object> buildResponse(String message, HttpStatus status){
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", status.value());
        body.put("error",status.getReasonPhrase());
        body.put("message",message);
        return new ResponseEntity<>(body, status);

    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<Object> handleValidationException(ValidationException ex){
        return buildResponse(ex.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
    }
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException ex){
        return buildResponse(ex.getMessage(),HttpStatus.NOT_FOUND);
    }

    //badrequest

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Object> handleBadRequestException(BadRequestException ex){
        return buildResponse(ex.getMessage() ,HttpStatus.BAD_REQUEST);
    }

    //unauthorized
@ExceptionHandler (UnauthorizedException.class)
    public ResponseEntity<Object> handleUnauthorizedException(UnauthorizedException ex){
        return buildResponse(ex.getMessage(),HttpStatus.UNAUTHORIZED);
}


    //exception.class other exceptions
@ExceptionHandler(Exception.class)
public ResponseEntity<Object> handleOtherException(Exception ex){
    return buildResponse(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

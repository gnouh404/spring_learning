package com.learning.spr.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// class includes all exceptions
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<String> handlingException(RuntimeException e) {
        // errors caused by user input usually are http400(badRequest)
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    ResponseEntity<String> handlingValidation(MethodArgumentNotValidException e){
        return ResponseEntity.badRequest().body(e.getFieldError().getDefaultMessage());
    }

}

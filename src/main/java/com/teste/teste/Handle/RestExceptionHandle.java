package com.teste.teste.Handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.teste.teste.model.Error.ErrorMessage;
import com.teste.teste.model.Exception.ResourcesNotFoundException;

@ControllerAdvice
public class RestExceptionHandle {

    @ExceptionHandler(ResourcesNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourcesNotFoundException ex){
        
        ErrorMessage error = new ErrorMessage("Not found", HttpStatus.NOT_FOUND.value(), ex.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}

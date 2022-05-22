package com.example.REST.controller;


import com.example.REST.exception.SdaException;
import com.example.REST.model.ErrorMessage;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //Kjo e kthen kete controller qe do bej handle exceptions ne menyre globale
public class ExceptionHandlerController {

    @ExceptionHandler({Exception.class})
    public ErrorMessage handleException(Exception e){
        return new ErrorMessage(0,e.getMessage(),"");
    }

    @ExceptionHandler({SdaException.class})
     public ErrorMessage handleCustomException(SdaException e){
        return new ErrorMessage(1,e.getMessage(),"");
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ErrorMessage handleValidationException(MethodArgumentNotValidException e ){
        String message=e.getFieldErrors().get(0).getDefaultMessage();
        return new ErrorMessage(0,message,"");
    }
}

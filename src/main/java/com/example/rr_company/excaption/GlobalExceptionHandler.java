//package com.example.rr_company.excaption;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(CommonExcaption.class)
//    public ResponseEntity<ErrorDetails> handleUserNotExistsException(CommonExcaption exception) {
//        ErrorDetails errorDetails = new ErrorDetails(exception.getCode(), exception.getDescription());
//        return ResponseEntity.status(exception.getHttpStatusCode()).body(errorDetails);
//    }
//}
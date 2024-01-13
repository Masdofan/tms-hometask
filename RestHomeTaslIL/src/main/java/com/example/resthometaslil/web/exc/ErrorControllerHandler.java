package com.example.resthometaslil.web.exc;

import com.example.resthometaslil.dto.IlErrorMessage;
import com.example.resthometaslil.exc.StoreFailedException;
import com.example.resthometaslil.mapper.ErrorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RequiredArgsConstructor
@RestControllerAdvice
public class ErrorControllerHandler {

    private final ErrorMapper mapper;

    @ExceptionHandler(StoreFailedException.class)
    public ResponseEntity<IlErrorMessage> handle(StoreFailedException exc) {

    return ResponseEntity.status(exc.getCode())
            .body(mapper.toIl(exc));

    }

}

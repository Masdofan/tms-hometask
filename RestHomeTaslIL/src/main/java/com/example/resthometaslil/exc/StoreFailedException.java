package com.example.resthometaslil.exc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StoreFailedException extends RuntimeException{

    @JsonProperty("message")
    private final String errorMessage;
    private final String serviceName;
    private final Integer code;

    public StoreFailedException(String errorMessage, String serviceName, Integer code) {
        this.errorMessage = errorMessage;
        this.serviceName = serviceName;
        this.code = code;
    }


}

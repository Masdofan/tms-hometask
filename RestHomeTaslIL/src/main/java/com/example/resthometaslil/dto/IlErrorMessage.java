package com.example.resthometaslil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class IlErrorMessage {
    private String errorDetails;
    private String serviceName;
    private String action;
}

package com.example.resthometaslil.config;

import com.example.resthometaslil.exc.StoreFailedException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@RequiredArgsConstructor
@Configuration
public class FeignConfig {

    private final ObjectMapper mapper;

    @Bean
    public ErrorDecoder decoder(){
       return (methodKey, response) -> {

           int status = response.status();

           if (status >= 400 && status < 500) {
               Response.Body body = response.body();
               try {
                   return mapper.readValue(body.asInputStream(), StoreFailedException.class);
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }

            return null;
       };
    }

}

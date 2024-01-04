package com.example.resthometaslil.config;

import org.springdoc.core.models.GroupedOpenApi;

public class SwaggerConfig {

    public GroupedOpenApi carOpenApi() {
        String paths[] = {"/store/cars/**"};
        return GroupedOpenApi.builder()
                .group("store")
                .pathsToMatch(paths)
                .build();
    }

}

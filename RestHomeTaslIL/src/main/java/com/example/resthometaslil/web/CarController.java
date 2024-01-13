package com.example.resthometaslil.web;

import com.example.resthometaslil.dto.CarDto;
import com.example.resthometaslil.dto.IlErrorMessage;
import com.example.resthometaslil.service.StoreService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/store/cars")
@OpenAPIDefinition(info = @Info(
        title = "This is car controller",
        description = "The controller allows CRUD operation with cars",
        version = "0.0.1"
))
public class CarController {

    private final StoreService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<CarDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(
            tags = "CRUD",
            description = "Method to find car by id",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Car found",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(
                                            implementation = CarDto.class
                                    )
                            )
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Car not exist",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(
                                            implementation = IlErrorMessage.class
                                    )
                    ))
            }
    )
    public CarDto findById (@PathVariable(name = "id") Integer id) {
        return service.findById(id);
    }

}

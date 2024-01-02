package com.example.resthometaslil.web;

import com.example.resthometaslil.dto.CarDto;
import com.example.resthometaslil.service.StoreService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

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
    public ResponseEntity<CarDto> save(@Valid @RequestBody CarDto dto) {
        return ok(service.save(dto));
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
                            description = "Car found"
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Car not exist"
                    )
            }
    )
    public CarDto findById (@PathVariable(name = "id") Integer id) {
        return service.findById(id);
    }


}

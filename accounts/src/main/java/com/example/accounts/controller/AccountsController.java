package com.example.accounts.controller;

import com.example.accounts.constants.AccountsConstants;
import com.example.accounts.dto.CustomerDto;
import com.example.accounts.dto.ResponseDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Luis",
                        email = "dev.htp2k@gmail.com",
                        url = "https://github.com/HTFong"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://github.com/HTFong"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "Accounts microservice REST API Documentation",
                url = "http://localhost:8080//swagger-ui.html"
        )
)
@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
public class AccountsController {
    @PostMapping
    public ResponseEntity<ResponseDto> createAccount(@Valid @RequestBody CustomerDto customerDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.MESSAGE_201));
    }
}

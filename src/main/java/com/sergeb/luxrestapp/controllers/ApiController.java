package com.sergeb.luxrestapp.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        path = "/api/v1"
)
public class ApiController {

    @GetMapping(
            path = "/hey"
    )
    // TODO - Remove /hey - or keep for testing
    public String getWelcomeMessage() {
        return "How are we doing?";
    }

    @PostMapping(
            path = "/foo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    // TODO do not use magic strings
    public String validateData(@RequestBody String data){
        // TODO do not use magic strings, form and return JSON
        return """
                {
                    "result": "You are all good!"
                }
               """;
    }
}

package com.example.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloController {

    @Get
    @Produces("text/plain")
    public String index() {
            return "Hello World";
        }
}

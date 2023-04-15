package com.github.nmescv.demokotlinspringappfordevops.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleRestController {

    @GetMapping("/hello")
    fun hello(): String = "Hello, world"

    @GetMapping("/hello/response")
    fun responseEntityHelloWorld(): ResponseEntity<Greeting> = ResponseEntity.ok(Greeting("Hello, world"));

    @GetMapping("/hello/{name}")
    fun helloWithName(@PathVariable("name") name: String): String = "Hello, $name"

    class Greeting(val message: String)
}
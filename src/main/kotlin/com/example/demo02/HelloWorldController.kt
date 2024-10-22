package com.example.demo02

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloWorldController {
    @RequestMapping("/name")
    fun helloWorld(): String = "Hello, my name is Nathan."
}
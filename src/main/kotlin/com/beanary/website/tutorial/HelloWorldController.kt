package com.beanary.website.tutorial

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/")
class HelloWorldController {

    @GetMapping("hello")
    fun helloWorld(): String {
        return "Hello world from Kotlin"
    }

    @GetMapping("also-hello")
    fun alsoHelloWorld(): String ="Hello world also from Kotlin"

}
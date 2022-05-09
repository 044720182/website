package com.beanary.website.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class HomeController {

    @GetMapping("")
    fun helloWorld(): String {
        return "It's your home buddy!"
    }
}
package com.beanary.website.controller.idm

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/idm")
class IDMController {

    @GetMapping("")
    fun helloWorld(): String {
        return "It's your home buddy!"
    }
}
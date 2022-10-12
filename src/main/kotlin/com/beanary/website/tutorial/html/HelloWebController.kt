package com.beanary.website.tutorial.html

import com.beanary.website.repo.idm.UserRepo
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * https://www.javaguides.net/2020/08/spring-boot-kotlin-thymeleaf-example.html
 * https://studygyaan.com/spring-boot/thymeleaf-and-bootstrap-5-template-engine-in-spring-boot
 * https://studygyaan.com/spring-boot/fragments-in-thymeleaf
 * https://studygyaan.com/spring-boot/login-register-example-using-spring-boot
 */
@Controller
@RequestMapping("web/")
class HelloWebController (
    val userRepo: UserRepo
        ) {

    @GetMapping("index")
    fun hello(model: Model): String {
        model.addAttribute("users", userRepo.findAll())
        return "hello"
    }

}
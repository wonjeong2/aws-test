package com.example.awstest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun test(): String {
        return "잘 실행중임!!!!!!!"
    }
}
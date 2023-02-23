package com.example.springbootbasic.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @GetMapping("hello")
    fun hello(model: Model): String {
        model.addAttribute("data", "hello!!")
        return "hello" // resources/templates/hello.html
    }

    @GetMapping("hello-mvc")
    fun helloMvc(@RequestParam("name") name: String, model: Model): String {
        model.addAttribute("name", name)
        return "hello-template"
    }

    @GetMapping("hello-string")
    @ResponseBody
    fun helloString(@RequestParam("name") name: String): String {
        return "hello $name" // "hello spring"
    }

    @GetMapping("hello-api")
    @ResponseBody
    fun helloAPi(@RequestParam("name") name: String): Hello {
        val hello = Hello()
        hello.setName(name)
        return hello
    }

    class Hello {
        private var name = ""

        fun getName(): String {
            return name
        }

        fun setName(name: String) {
            this.name = name
        }
    }
}
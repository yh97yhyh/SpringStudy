package com.example.springbootbasic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootBasicApplication

fun main(args: Array<String>) {
	runApplication<SpringbootBasicApplication>(*args)
}

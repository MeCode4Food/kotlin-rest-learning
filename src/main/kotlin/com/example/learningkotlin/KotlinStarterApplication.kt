package com.example.learningkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication()
class KotlinStarterApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinStarterApplication:: class.java, *args)
}

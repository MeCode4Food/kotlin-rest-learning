package com.example.learningkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

@SpringBootApplication
class WhyIsLearningKotlinSoHardApplication

fun main(args: Array<String>) {
    SpringApplication.run(WhyIsLearningKotlinSoHardApplication:: class.java, *args)

    val connectionProps = Properties()
    val username = "root"
    val password = "root"

    connectionProps.put("user", username)
    connectionProps.put("password", password)

    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance()

        var conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/", connectionProps)
        println("connection works")
    } catch (ex: SQLException){

        println(ex.message)
    }
}

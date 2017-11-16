package ca.ryanmcleod.greeter

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GreeterApplication

fun main(args: Array<String>) {
    SpringApplication.run(GreeterApplication::class.java, *args)
}

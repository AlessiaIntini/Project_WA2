package org.example.iam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IamApplication

fun main(args: Array<String>) {
    runApplication<IamApplication>(*args)
}

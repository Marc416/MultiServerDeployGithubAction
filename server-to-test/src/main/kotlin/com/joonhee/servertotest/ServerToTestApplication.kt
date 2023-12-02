package com.joonhee.servertotest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerToTestApplication

fun main(args: Array<String>) {
    runApplication<ServerToTestApplication>(*args)
}

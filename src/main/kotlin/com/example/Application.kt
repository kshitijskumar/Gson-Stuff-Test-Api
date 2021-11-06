package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.application.*

//fun main() {
//    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
//        configureRouting()
//        configureSerialization()
//    }.start(wait = true)
//}
fun main(args: Array<String>) = EngineMain.main(args = args)

fun Application.module(testing: Boolean = false) {
    configureRouting()
    configureSerialization()
}
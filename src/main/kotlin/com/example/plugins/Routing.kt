package com.example.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
                call.respondText("Hello World!")
            }
        get(path = "/getAllValues") {
            call.respond(AllValuesResponse("someone", 22))
        }
        get(path = "/getOnlyName") {
            call.respond(OnlyNameResponse("someone"))
        }
    }
}

data class AllValuesResponse(
    val someName: String,
    val someNumber: Int
)

data class OnlyNameResponse(
    val someName: String
)

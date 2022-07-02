package aahan_coding

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import aahan_coding.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}

package com.example

import io.ktor.http.ContentType
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText(
                contentType = ContentType.parse("text/html"),
                text = """
                <h3>Task manager:</h3>
                <ol>
                    <li>tasks</li>
                    <li>submit new tasks</li>
                </ol>
                """.trimIndent()
            )


        }
    }
}

package dev.study.coroutine

import kotlinx.coroutines.delay
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

suspend fun main() {
    logger.debug { "starting main" }
    delay(1000)
    logger.debug { "done" }
}
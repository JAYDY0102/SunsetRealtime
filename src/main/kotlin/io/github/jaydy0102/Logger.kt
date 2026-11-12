package io.github.jaydy0102

object Logger : Runnable {
    override fun run() {
        logger()
    }

    fun logger() {
        Realtime.instance.logger.info("Time: ${System.currentTimeMillis()}")
    }
}
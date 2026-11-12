package io.github.jaydy0102

import org.bukkit.plugin.java.JavaPlugin
import java.util.TimeZone

class Realtime : JavaPlugin() {
    companion object {
        lateinit var instance: JavaPlugin
            private set
    }

    override fun onEnable() {
        instance = this
        logger.info("Realtime is starting...")
        saveDefaultConfig()
        val timeZone = config.getString("timeZone") ?: "UTC"
        TimeZone.setDefault(TimeZone.getTimeZone(timeZone))
        server.scheduler.runTaskTimer(this, Logger, 0L, 1L)
    }
}
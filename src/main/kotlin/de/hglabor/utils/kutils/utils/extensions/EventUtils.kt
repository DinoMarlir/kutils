package de.hglabor.utils.kutils.utils.extensions

import org.bukkit.Bukkit
import org.bukkit.event.Event

fun Event.call() = apply { Bukkit.getPluginManager().callEvent(this) }
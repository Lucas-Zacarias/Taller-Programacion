package com.example.tp_taller_programacion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
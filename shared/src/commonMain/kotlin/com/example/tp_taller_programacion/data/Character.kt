package com.example.tp_taller_programacion.data

import kotlinx.serialization.Serializable

@Serializable
class Character(
    val id: Long,
    val name: String,
    val description: String,
    val thumbnailUrl: String
)
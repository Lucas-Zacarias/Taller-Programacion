package com.example.tp_taller_programacion.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterData(
    @SerialName("results")
    val list: List<CharacterResult>
)

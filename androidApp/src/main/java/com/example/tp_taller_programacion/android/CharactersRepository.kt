package com.example.tp_taller_programacion.android

interface CharactersRepository {

    suspend fun getCharacters(timestamp: Long, md5: String): List<Character>

}

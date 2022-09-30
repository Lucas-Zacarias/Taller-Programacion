package com.example.tp_taller_programacion.domain.servicies

import com.example.tp_taller_programacion.data.Character
import com.example.tp_taller_programacion.data.CharactersResponse
import com.example.tp_taller_programacion.domain.repository.CharactersRepository
import com.example.tp_taller_programacion.utils.CharactersComparator
import com.example.tp_taller_programacion.utils.HashGenerator
import com.example.tp_taller_programacion.utils.PrivateKey
import com.example.tp_taller_programacion.utils.PublicKey
import io.ktor.util.date.*

class CharactersService {

    private val characterComparator = CharactersComparator()
    private val charactersRepository = CharactersRepository()

    suspend fun getMarvelCharacters() : List<Character> {
        val timestamp = getTimeMillis()

        val charactersResponse = charactersRepository.getMarvelCharacters(
            timestamp,
            HashGenerator.md5(timestamp.toString() + PrivateKey + PublicKey)
        )

          val characters = charactersResponse.toModel()

        return sortCharacters(characters)
    }

    private fun CharactersResponse.toModel(): List<Character> {
        return this.characters.list.map {
            Character(
                id = it.id,
                name = it.name,
                description = it.description,
                thumbnailUrl = it.thumbnail.toUrl()
            )
        }
    }

    private fun sortCharacters(characters: List<Character>): List<Character> {
        return characters.sortedWith(characterComparator)
    }
}
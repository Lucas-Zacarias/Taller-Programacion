package com.example.tp_taller_programacion.domain.repository

import com.example.tp_taller_programacion.utils.PublicKey
import com.example.tp_taller_programacion.data.CharactersResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class CharactersRepository {

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                }
            )
        }
    }

    suspend fun getMarvelCharacters(timestamp: Long, md5: String): CharactersResponse {
        val marvelResponse =
            httpClient.get{
                url("https://gateway.marvel.com/v1/public/characters")
                parameter("apikey", value = PublicKey)
                parameter("ts", timestamp)
                parameter("hash", md5)
            }.body<CharactersResponse>()
        return marvelResponse
    }

}
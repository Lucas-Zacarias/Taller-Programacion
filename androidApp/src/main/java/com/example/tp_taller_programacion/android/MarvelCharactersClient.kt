package com.example.tp_taller_programacion.android

import com.example.tp_taller_programacion.data.CharactersResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MarvelCharactersClient {

    @GET("v1/public/characters")
    @Headers("Accept: application/json")
    suspend fun getAllCharacters(
        @Query("ts") timestamp: Long,
        @Query("hash") md5: String
    ): CharactersResponse

}
package utils

import com.example.tp_taller_programacion.utils.HashGenerator
import kotlin.test.Test
import kotlin.test.assertEquals

class HashGeneratorTest {

    @Test
    fun md5_generate_according_hash(){

        //Given
        val text = "Hola estoy por ser hasheado"

        //When
        val result = HashGenerator.md5(text)

        //Then
        val expected = "32814c22a91b3a5cc82ec8a587bbd471"

        assertEquals(expected = expected, actual = result)
    }

}
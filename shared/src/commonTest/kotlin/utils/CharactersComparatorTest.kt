package utils

import com.example.tp_taller_programacion.data.Character
import com.example.tp_taller_programacion.utils.CharactersComparator
import kotlin.test.Test
import kotlin.test.assertEquals

class CharactersComparatorTest {

    @Test
    fun compare_character_1_with_description_and_character_2_without_description_should_return_negative_number(){
        //Given
        val character1 = Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url")
        val character2 = Character(2L, "Captain America", "", "url")

        //When
        val result = CharactersComparator().compare(character1, character2)

        //Then
        assertEquals(expected = -1, actual = result)
    }

    @Test
    fun compare_character_1_without_description_and_character_2_without_description_should_return_positive_number(){
        //Given
        val character1 = Character(1L, "Iron Man", "", "url")
        val character2 = Character(2L, "Captain America", "", "url")

        //When
        val result = CharactersComparator().compare(character1, character2)

        //Then
        assertEquals(expected = 1, actual = result)
    }

    @Test
    fun compare_character_1_with_description_and_character_2_with_description_should_return_negative_number(){
        //Given
        val character1 = Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url")
        val character2 = Character(2L, "Captain America", "The first super soldier", "url")

        //When
        val result = CharactersComparator().compare(character1, character2)

        //Then
        assertEquals(expected = -1, actual = result)
    }

    @Test
    fun compare_character_1_without_description_and_character_2_with_description_should_return_one(){
        //Given
        val character1 = Character(1L, "Iron Man", "", "url")
        val character2 = Character(2L, "Captain America", "The first super soldier", "url")

        //When
        val result = CharactersComparator().compare(character1, character2)

        //Then
        assertEquals(expected = 1, actual = result)
    }

    @Test
    fun compare_same_character_should_return_zero(){
        //Given
        val character1 = Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url")
        val character2 = Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url")

        //When
        val result = CharactersComparator().compare(character1, character2)

        //Then
        assertEquals(expected = 0, actual = result)
    }

}
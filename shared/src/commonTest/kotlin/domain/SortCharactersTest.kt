package domain

import com.example.tp_taller_programacion.data.Character
import com.example.tp_taller_programacion.domain.servicies.CharactersService
import kotlin.test.*

class SortCharactersTest {

    @Test
    fun sort_characters_with_description_in_ascending_order_by_id() {
        //Given
        val characterUnsorted = listOf(
            Character(5L, "Black Widow", "Shield's best agent", "url"),
            Character(2L, "Captain America", "The first super soldier", "url"),
            Character(6L, "Hawkeye", "Best equipped hero", "url"),
            Character(3L, "Hulk", "The big green hero", "url"),
            Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url"),
            Character(4L, "Thor", "God of Thunder", "url")
        )

        //When
        val charactersSorted = CharactersService().sortCharacters(characterUnsorted)

        //Then
        val expectedCharacterSortedList = listOf(
            Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url"),
            Character(2L, "Captain America", "The first super soldier", "url"),
            Character(3L, "Hulk", "The big green hero", "url"),
            Character(4L, "Thor", "God of Thunder", "url"),
            Character(5L, "Black Widow", "Shield's best agent", "url"),
            Character(6L, "Hawkeye", "Best equipped hero", "url")
        )

        assertEquals(expected = expectedCharacterSortedList, actual = charactersSorted)

    }

    @Test
    fun sort_characters_without_description_in_descending_order_by_id() {
        //Given
        val characterUnsorted = listOf(
            Character(5L, "Black Widow", "", "url"),
            Character(2L, "Captain America", "", "url"),
            Character(6L, "Hawkeye", "", "url"),
            Character(3L, "Hulk", "", "url"),
            Character(1L, "Iron Man", "", "url"),
            Character(4L, "Thor", "", "url")
        )

        //When
        val charactersSorted = CharactersService().sortCharacters(characterUnsorted)

        //Then
        val expectedCharacterSortedList = listOf(
            Character(6L, "Hawkeye", "", "url"),
            Character(5L, "Black Widow", "", "url"),
            Character(4L, "Thor", "", "url"),
            Character(3L, "Hulk", "", "url"),
            Character(2L, "Captain America", "", "url"),
            Character(1L, "Iron Man", "", "url")
        )

        assertEquals(expected = expectedCharacterSortedList, actual = charactersSorted)
    }

    @Test
    fun sort_characters_with_description_and_without_description_by_id() {
        //Given
        val characterUnsorted = listOf(
            Character(5L, "Black Widow", "", "url"),
            Character(2L, "Captain America", "The first super soldier", "url"),
            Character(6L, "Hawkeye", "", "url"),
            Character(3L, "Hulk", "", "url"),
            Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url"),
            Character(4L, "Thor", "God of Thunder", "url")
        )

        //When
        val charactersSorted = CharactersService().sortCharacters(characterUnsorted)

        //Then
        val expectedCharacterSortedList = listOf(
            Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url"),
            Character(2L, "Captain America", "The first super soldier", "url"),
            Character(4L, "Thor", "God of Thunder", "url"),
            Character(6L, "Hawkeye", "", "url"),
            Character(5L, "Black Widow", "", "url"),
            Character(3L, "Hulk", "", "url")
        )

        assertEquals(expected = expectedCharacterSortedList, actual = charactersSorted)
    }

}
package domain

import com.example.tp_taller_programacion.data.Character
import com.example.tp_taller_programacion.domain.servicies.CharactersService
import kotlin.test.*

class SortCharactersTest {

    @Test
    fun sort_characters_with_description_in_alphabetical_order_by_name(){
        //Given
        val characterUnsorted = listOf(
            Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url"),
            Character(2L, "Captain America", "", "url"),
            Character(3L, "Hulk", "The big green hero", "url"),
            Character(4L, "Thor", "God of Thunder", "url"),
            Character(5L, "Black Widow", "Shield's best agent", "url"),
            Character(6L, "Hawkeye", "Best equipped hero", "url")
        )

        //When
        val charactersSorted = CharactersService().sortCharacters(characterUnsorted)

        //Then
        val expectedCharacterSortedList = listOf(
            Character(5L, "Black Widow", "Shield's best agent", "url"),
            Character(2L, "Captain America", "", "url"),
            Character(6L, "Hawkeye", "Best equipped hero", "url"),
            Character(3L, "Hulk", "The big green hero", "url"),
            Character(1L, "Iron Man", "Tony Stark the red and yellow hero", "url"),
            Character(4L, "Thor", "God of Thunder", "url")
        )


    }

}
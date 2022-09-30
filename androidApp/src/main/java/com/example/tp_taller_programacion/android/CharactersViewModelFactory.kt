package com.example.tp_taller_programacion.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.tp_taller_programacion.domain.servicies.CharactersService

class CharactersViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val charactersService = CharactersService()
        return CharactersViewModel(charactersService) as T
    }
}
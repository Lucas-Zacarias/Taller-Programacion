package com.example.tp_taller_programacion.android

import androidx.recyclerview.widget.RecyclerView
import com.example.tp_taller_programacion.android.databinding.ListItemCharacterBinding
import com.squareup.picasso.Picasso
import com.example.tp_taller_programacion.data.Character

class CharacterViewHolder(private val binding: ListItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(character: Character) {
        binding.name.text = character.name
        binding.description.text = character.description
        if (character.thumbnailUrl.isNotEmpty()) {
            Picasso.get()
                .load(character.thumbnailUrl)
                .into(binding.image)
        } else {
            binding.image.setImageURI(null)
        }
    }

}

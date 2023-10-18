package com.example.pokedex.data.remote.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Ability (
    val ability: Species,

    @SerialName("is_hidden")
    val isHidden: Boolean,
    val slot: Long
)
package com.example.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Ability (
    val ability: Species,

    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Long
)
package com.nmssalman.locationpicker.geocoder

import com.google.gson.annotations.SerializedName

data class PlaceSuggestion(
    @SerializedName("description") val description: String,
    @SerializedName("place_id") val placeId: String
)

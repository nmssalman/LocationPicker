package com.nmssalman.locationpicker.geocoder.adapters.type

import com.nmssalman.locationpicker.LekuViewHolder
import com.nmssalman.locationpicker.geocoder.PlaceSuggestion
import com.nmssalman.locationpicker.geocoder.adapters.base.LekuSearchAdapter

abstract class SuggestSearchAdapter<T : LekuViewHolder> : LekuSearchAdapter<T, PlaceSuggestion>()

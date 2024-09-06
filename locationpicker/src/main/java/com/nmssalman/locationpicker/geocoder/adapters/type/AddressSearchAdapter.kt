package com.nmssalman.locationpicker.geocoder.adapters.type

import android.location.Address
import com.nmssalman.locationpicker.LekuViewHolder
import com.nmssalman.locationpicker.geocoder.adapters.base.LekuSearchAdapter

abstract class AddressSearchAdapter<T : LekuViewHolder> : LekuSearchAdapter<T, Address>()

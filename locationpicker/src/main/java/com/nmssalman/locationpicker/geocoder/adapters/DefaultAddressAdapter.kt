package com.nmssalman.locationpicker.geocoder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.nmssalman.locationpicker.LekuViewHolder
import com.nmssalman.locationpicker.R
import com.nmssalman.locationpicker.geocoder.adapters.type.AddressSearchAdapter
import com.nmssalman.locationpicker.getFullAddressString

class SearchViewHolder(
    val textView: TextView,
) : LekuViewHolder(textView)

class DefaultAddressAdapter(
    val context: Context,
) : AddressSearchAdapter<SearchViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.leku_search_list_item,
                parent,
                false
            ) as TextView

        return SearchViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        if (items.isNotEmpty()) {
            holder.textView.text = items[position].getFullAddressString(context)
        }
    }
}

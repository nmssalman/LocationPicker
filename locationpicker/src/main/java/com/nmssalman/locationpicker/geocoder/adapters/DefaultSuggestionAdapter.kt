package com.nmssalman.locationpicker.geocoder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.nmssalman.locationpicker.LekuViewHolder
import com.nmssalman.locationpicker.R
import com.nmssalman.locationpicker.geocoder.adapters.type.SuggestSearchAdapter

class SuggestionViewHolder(
    val textView: TextView,
) : LekuViewHolder(textView)

class DefaultSuggestionAdapter(
    val context: Context,
) : SuggestSearchAdapter<SuggestionViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SuggestionViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.leku_search_list_item,
                parent,
                false
            ) as TextView

        return SuggestionViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuggestionViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        if (items.isNotEmpty()) {
            holder.textView.text = items[position].description
        }
    }
}

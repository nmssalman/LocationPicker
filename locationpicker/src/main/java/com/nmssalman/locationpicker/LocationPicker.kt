package com.nmssalman.locationpicker

import com.nmssalman.locationpicker.tracker.LocationPickerTracker
import com.nmssalman.locationpicker.tracker.TrackEvents

object LocationPicker {

    private val EMPTY_TRACKER = EmptyLocationPickerTracker()

    private var tracker: LocationPickerTracker = EMPTY_TRACKER

    fun setTracker(tracker: LocationPickerTracker?) {
        if (tracker == null) {
            throw IllegalArgumentException("The LocationPickerTracker instance can't be null.")
        }
        LocationPicker.tracker = tracker
    }

    fun getTracker(): LocationPickerTracker {
        return tracker
    }

    fun reset() {
        tracker = EMPTY_TRACKER
    }

    class EmptyLocationPickerTracker : LocationPickerTracker {
        override fun onEventTracked(event: TrackEvents) { }
    }
}

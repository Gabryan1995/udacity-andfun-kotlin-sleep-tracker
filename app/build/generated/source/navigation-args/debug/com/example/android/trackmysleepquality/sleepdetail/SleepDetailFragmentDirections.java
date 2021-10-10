package com.example.android.trackmysleepquality.sleepdetail;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.trackmysleepquality.R;

public class SleepDetailFragmentDirections {
  private SleepDetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSleepDetailFragmentToSleepTrackerFragment() {
    return new ActionOnlyNavDirections(R.id.action_sleepDetailFragment_to_sleep_tracker_fragment);
  }
}

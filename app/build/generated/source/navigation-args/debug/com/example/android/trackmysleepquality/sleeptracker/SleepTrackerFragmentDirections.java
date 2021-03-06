package com.example.android.trackmysleepquality.sleeptracker;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.trackmysleepquality.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SleepTrackerFragmentDirections {
  private SleepTrackerFragmentDirections() {
  }

  @NonNull
  public static ActionSleepTrackerFragmentToSleepQualityFragment actionSleepTrackerFragmentToSleepQualityFragment(
      long sleepNightKey) {
    return new ActionSleepTrackerFragmentToSleepQualityFragment(sleepNightKey);
  }

  @NonNull
  public static ActionSleepTrackerFragmentToSleepDetailFragment actionSleepTrackerFragmentToSleepDetailFragment(
      long sleepNightKey) {
    return new ActionSleepTrackerFragmentToSleepDetailFragment(sleepNightKey);
  }

  public static class ActionSleepTrackerFragmentToSleepQualityFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSleepTrackerFragmentToSleepQualityFragment(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSleepTrackerFragmentToSleepQualityFragment setSleepNightKey(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("sleepNightKey")) {
        long sleepNightKey = (long) arguments.get("sleepNightKey");
        __result.putLong("sleepNightKey", sleepNightKey);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_sleepTrackerFragment_to_sleepQualityFragment;
    }

    @SuppressWarnings("unchecked")
    public long getSleepNightKey() {
      return (long) arguments.get("sleepNightKey");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSleepTrackerFragmentToSleepQualityFragment that = (ActionSleepTrackerFragmentToSleepQualityFragment) object;
      if (arguments.containsKey("sleepNightKey") != that.arguments.containsKey("sleepNightKey")) {
        return false;
      }
      if (getSleepNightKey() != that.getSleepNightKey()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (int)(getSleepNightKey() ^ (getSleepNightKey() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSleepTrackerFragmentToSleepQualityFragment(actionId=" + getActionId() + "){"
          + "sleepNightKey=" + getSleepNightKey()
          + "}";
    }
  }

  public static class ActionSleepTrackerFragmentToSleepDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSleepTrackerFragmentToSleepDetailFragment(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSleepTrackerFragmentToSleepDetailFragment setSleepNightKey(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("sleepNightKey")) {
        long sleepNightKey = (long) arguments.get("sleepNightKey");
        __result.putLong("sleepNightKey", sleepNightKey);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_sleep_tracker_fragment_to_sleepDetailFragment;
    }

    @SuppressWarnings("unchecked")
    public long getSleepNightKey() {
      return (long) arguments.get("sleepNightKey");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSleepTrackerFragmentToSleepDetailFragment that = (ActionSleepTrackerFragmentToSleepDetailFragment) object;
      if (arguments.containsKey("sleepNightKey") != that.arguments.containsKey("sleepNightKey")) {
        return false;
      }
      if (getSleepNightKey() != that.getSleepNightKey()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (int)(getSleepNightKey() ^ (getSleepNightKey() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSleepTrackerFragmentToSleepDetailFragment(actionId=" + getActionId() + "){"
          + "sleepNightKey=" + getSleepNightKey()
          + "}";
    }
  }
}

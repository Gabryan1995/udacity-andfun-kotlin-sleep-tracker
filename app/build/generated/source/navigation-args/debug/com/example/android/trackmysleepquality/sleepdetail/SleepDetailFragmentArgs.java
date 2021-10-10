package com.example.android.trackmysleepquality.sleepdetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SleepDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SleepDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SleepDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SleepDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SleepDetailFragmentArgs __result = new SleepDetailFragmentArgs();
    bundle.setClassLoader(SleepDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("sleepNightKey")) {
      long sleepNightKey;
      sleepNightKey = bundle.getLong("sleepNightKey");
      __result.arguments.put("sleepNightKey", sleepNightKey);
    } else {
      throw new IllegalArgumentException("Required argument \"sleepNightKey\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SleepDetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    SleepDetailFragmentArgs __result = new SleepDetailFragmentArgs();
    if (savedStateHandle.contains("sleepNightKey")) {
      long sleepNightKey;
      sleepNightKey = savedStateHandle.get("sleepNightKey");
      __result.arguments.put("sleepNightKey", sleepNightKey);
    } else {
      throw new IllegalArgumentException("Required argument \"sleepNightKey\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getSleepNightKey() {
    return (long) arguments.get("sleepNightKey");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("sleepNightKey")) {
      long sleepNightKey = (long) arguments.get("sleepNightKey");
      __result.putLong("sleepNightKey", sleepNightKey);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("sleepNightKey")) {
      long sleepNightKey = (long) arguments.get("sleepNightKey");
      __result.set("sleepNightKey", sleepNightKey);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SleepDetailFragmentArgs that = (SleepDetailFragmentArgs) object;
    if (arguments.containsKey("sleepNightKey") != that.arguments.containsKey("sleepNightKey")) {
      return false;
    }
    if (getSleepNightKey() != that.getSleepNightKey()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getSleepNightKey() ^ (getSleepNightKey() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "SleepDetailFragmentArgs{"
        + "sleepNightKey=" + getSleepNightKey()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull SleepDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
    }

    @NonNull
    public SleepDetailFragmentArgs build() {
      SleepDetailFragmentArgs result = new SleepDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSleepNightKey(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public long getSleepNightKey() {
      return (long) arguments.get("sleepNightKey");
    }
  }
}

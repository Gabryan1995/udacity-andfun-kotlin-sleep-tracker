package com.example.android.trackmysleepquality.sleepdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0006\u0010\u0017\u001a\u00020\u0015R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/android/trackmysleepquality/sleepdetail/SleepDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "sleepNightKey", "", "dataSource", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "(JLcom/example/android/trackmysleepquality/database/SleepDatabaseDao;)V", "_navigateToSleepTracker", "Landroidx/lifecycle/MutableLiveData;", "", "database", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "navigateToSleepTracker", "Landroidx/lifecycle/LiveData;", "getNavigateToSleepTracker", "()Landroidx/lifecycle/LiveData;", "night", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "doneNavigating", "", "getNight", "onClose", "app_debug"})
public final class SleepDetailViewModel extends androidx.lifecycle.ViewModel {
    private final long sleepNightKey = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    private final androidx.lifecycle.MediatorLiveData<com.example.android.trackmysleepquality.database.SleepNight> night = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToSleepTracker = null;
    
    public SleepDetailViewModel(long sleepNightKey, @org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.example.android.trackmysleepquality.database.SleepNight> getNight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToSleepTracker() {
        return null;
    }
    
    public final void doneNavigating() {
    }
    
    public final void onClose() {
    }
}
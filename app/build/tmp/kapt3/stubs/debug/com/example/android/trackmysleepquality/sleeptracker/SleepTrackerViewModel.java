package com.example.android.trackmysleepquality.sleeptracker;

import java.lang.System;

/**
 * ViewModel for SleepTrackerFragment.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010#\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020$J\u0006\u0010\'\u001a\u00020$J\u0013\u0010(\u001a\u0004\u0018\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\b\u0010)\u001a\u00020$H\u0002J\u0019\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020$J\u0006\u0010.\u001a\u00020$J\u0006\u0010/\u001a\u00020$J\u0019\u00100\u001a\u00020$2\u0006\u0010+\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00160\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000b0\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000b0\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0016\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepTrackerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;Landroid/app/Application;)V", "_navigateToSleepQuality", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "_showSnackbarEvent", "", "clearButtonVisible", "Landroidx/lifecycle/LiveData;", "getClearButtonVisible", "()Landroidx/lifecycle/LiveData;", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "navigateToSleepQuality", "getNavigateToSleepQuality", "()Landroidx/lifecycle/MutableLiveData;", "nights", "", "getNights", "nightsString", "Landroid/text/Spanned;", "kotlin.jvm.PlatformType", "getNightsString", "showSnackbarEvent", "getShowSnackbarEvent", "startButtonVisible", "getStartButtonVisible", "stopButtonVisible", "getStopButtonVisible", "tonight", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doneNavigating", "doneShowingSnackbar", "getTonightFromDatabase", "initializeTonight", "insert", "night", "(Lcom/example/android/trackmysleepquality/database/SleepNight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClear", "onStartTracking", "onStopTracking", "update", "app_debug"})
public final class SleepTrackerViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    private androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> tonight;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> nights = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.text.Spanned> nightsString = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> _navigateToSleepQuality = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showSnackbarEvent;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> startButtonVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> stopButtonVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> clearButtonVisible = null;
    
    public SleepTrackerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> getNights() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.text.Spanned> getNightsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> getNavigateToSleepQuality() {
        return null;
    }
    
    public final void doneNavigating() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowSnackbarEvent() {
        return null;
    }
    
    public final void doneShowingSnackbar() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStartButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStopButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getClearButtonVisible() {
        return null;
    }
    
    private final void initializeTonight() {
    }
    
    private final java.lang.Object getTonightFromDatabase(kotlin.coroutines.Continuation<? super com.example.android.trackmysleepquality.database.SleepNight> continuation) {
        return null;
    }
    
    private final java.lang.Object clear(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object update(com.example.android.trackmysleepquality.database.SleepNight night, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object insert(com.example.android.trackmysleepquality.database.SleepNight night, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onStartTracking() {
    }
    
    public final void onStopTracking() {
    }
    
    public final void onClear() {
    }
}
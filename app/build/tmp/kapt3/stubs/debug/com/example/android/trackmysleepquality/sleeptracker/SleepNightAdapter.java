package com.example.android.trackmysleepquality.sleeptracker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightAdapter$ViewHolder;", "clickListener", "Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightListener;", "(Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightListener;)V", "getClickListener", "()Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SleepNightAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.android.trackmysleepquality.database.SleepNight, com.example.android.trackmysleepquality.sleeptracker.SleepNightAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.sleeptracker.SleepNightListener clickListener = null;
    
    public SleepNightAdapter(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.sleeptracker.SleepNightListener clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.sleeptracker.SleepNightListener getClickListener() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.sleeptracker.SleepNightAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.android.trackmysleepquality.sleeptracker.SleepNightAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/android/trackmysleepquality/databinding/ListItemSleepNightBinding;", "(Lcom/example/android/trackmysleepquality/databinding/ListItemSleepNightBinding;)V", "getBinding", "()Lcom/example/android/trackmysleepquality/databinding/ListItemSleepNightBinding;", "bind", "", "item", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "clickListener", "Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightListener;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.android.trackmysleepquality.sleeptracker.SleepNightAdapter.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.trackmysleepquality.databinding.ListItemSleepNightBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.android.trackmysleepquality.database.SleepNight item, @org.jetbrains.annotations.NotNull()
        com.example.android.trackmysleepquality.sleeptracker.SleepNightListener clickListener) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/example/android/trackmysleepquality/sleeptracker/SleepNightAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.android.trackmysleepquality.sleeptracker.SleepNightAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}
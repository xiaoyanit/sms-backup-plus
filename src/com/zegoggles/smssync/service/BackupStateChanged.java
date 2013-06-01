package com.zegoggles.smssync.service;

public class BackupStateChanged extends StateChanged {
    public final int currentSyncedItems, itemsToSync;

    public BackupStateChanged(SmsSyncState state, int currentSyncedItems, int itemsToSync) {
        super(state);
        this.currentSyncedItems = currentSyncedItems;
        this.itemsToSync = itemsToSync;
    }

    @Override
    public String toString() {
        return "BackupStateChanged{" +
                "state=" + state +
                ", currentSyncedItems=" + currentSyncedItems +
                ", itemsToSync=" + itemsToSync +
                '}';
    }
}

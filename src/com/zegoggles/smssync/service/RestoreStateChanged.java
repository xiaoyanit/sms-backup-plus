package com.zegoggles.smssync.service;

public class RestoreStateChanged extends StateChanged {
    public final int currentRestoredCount, itemsToRestore, restoredCount, duplicateCount;

    public RestoreStateChanged(SmsSyncState state,
                              int currentRestoredCount,
                              int itemsToRestore,
                              int restoredCount,
                              int duplicateCount) {
        super(state);
        this.currentRestoredCount = currentRestoredCount;
        this.restoredCount = restoredCount;
        this.itemsToRestore = itemsToRestore;
        this.duplicateCount = duplicateCount;
    }

    @Override
    public String toString() {
        return "RestoreStateChanged{" +
                "state=" + state +
                ", currentRestoredCount=" + currentRestoredCount +
                ", itemsToRestore=" + itemsToRestore +
                ", restoredCount=" + restoredCount +
                ", duplicateCount=" + duplicateCount +
                '}';
    }
}

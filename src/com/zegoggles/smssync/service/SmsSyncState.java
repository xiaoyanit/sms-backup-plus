package com.zegoggles.smssync.service;

public enum SmsSyncState {
    IDLE,
    CALC,
    LOGIN,
    BACKUP,
    RESTORE,
    AUTH_FAILED,
    CONNECTIVITY_ERROR,
    GENERAL_ERROR,
    CANCELED_BACKUP,
    CANCELED_RESTORE,
    FINISHED_BACKUP,
    FINISHED_RESTORE,
    UPDATING_THREADS
}

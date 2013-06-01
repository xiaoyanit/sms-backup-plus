package com.zegoggles.smssync.service;

public class StateChanged {
    public final SmsSyncState state;

    public StateChanged(SmsSyncState state) {
        this.state = state;
    }
}

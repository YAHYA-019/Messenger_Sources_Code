package com.facebook.rsys.syncedclock.gen;

import java.util.ArrayList;

/* loaded from: ReceivedMessagesCache.class */
public abstract class ReceivedMessagesCache {
    public abstract ArrayList getInitialMessageIds();

    public abstract void writeCallback(String str, long j);
}

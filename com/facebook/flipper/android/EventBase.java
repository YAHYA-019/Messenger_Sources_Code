package com.facebook.flipper.android;

import com.facebook.jni.HybridClassBase;

/* loaded from: EventBase.class */
public class EventBase extends HybridClassBase {
    public EventBase() {
        initHybrid();
    }

    private native void initHybrid();

    public native void loopForever();
}

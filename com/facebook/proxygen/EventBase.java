package com.facebook.proxygen;

import X.0FI;

/* loaded from: EventBase.class */
public class EventBase extends NativeHandleImpl {
    public long mJniEnv;

    public EventBase() {
        init();
    }

    private native void close();

    private native void init();

    public void finalize() {
        int A03 = 0FI.A03(65408226);
        try {
            close();
            0FI.A09(1160770876, A03);
        } catch (Throwable th) {
            0FI.A09(-611237107, A03);
            throw th;
        }
    }

    public native void loopForever();

    public native void runInThread(Runnable runnable);

    public native void terminate();
}

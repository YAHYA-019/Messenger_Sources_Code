package com.facebook.proxygen;

import X.0FI;

/* loaded from: NativeRunnable.class */
public class NativeRunnable extends NativeHandleImpl implements Runnable {
    public native void close();

    public void finalize() {
        int A03 = 0FI.A03(-1202878750);
        try {
            close();
            0FI.A09(-793733174, A03);
        } catch (Throwable th) {
            0FI.A09(1283126462, A03);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public native void run();
}

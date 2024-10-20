package com.facebook.jni;

/* loaded from: NativeRunnable.class */
public class NativeRunnable implements Runnable {
    public final HybridData mHybridData;

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}

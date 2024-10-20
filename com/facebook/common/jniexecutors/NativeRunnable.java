package com.facebook.common.jniexecutors;

import X.0Pz;
import X.AnonymousClass052;
import X.C00j;
import X.C0gh;
import com.facebook.jni.HybridData;

/* loaded from: NativeRunnable.class */
public class NativeRunnable implements Runnable, AnonymousClass052 {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    static {
        C0gh.A02("jniexecutors");
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeRun();

    public Object getInnerRunnable() {
        return this;
    }

    @Override // X.AnonymousClass052
    public String getRunnableName() {
        String str = this.mNativeExecutor;
        return str == null ? "NativeRunnable" : 0Pz.A0W("NativeRunnable - ", str);
    }

    @Override // java.lang.Runnable
    public void run() {
        C00j.A07("%s", this, -693752208);
        try {
            nativeRun();
            C00j.A01(-291915969);
        } catch (Throwable th) {
            C00j.A01(570492259);
            throw th;
        }
    }

    public String toString() {
        return getRunnableName();
    }
}

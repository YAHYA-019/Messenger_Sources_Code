package com.facebook.common.jniexecutors;

import X.05U;
import X.30J;
import X.AnonymousClass001;
import android.util.Log;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;

/* loaded from: PooledNativeRunnable.class */
public class PooledNativeRunnable extends NativeRunnable {
    public static final 05U sPool;

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        30J r0 = new 30J(0);
        if (awakeTimeSinceBootClock == null) {
            throw AnonymousClass001.A0L("Must add a clock to the object pool builder");
        }
        sPool = new 05U(r0, awakeTimeSinceBootClock, PooledNativeRunnable.class, 16, 1024, 16);
    }

    public PooledNativeRunnable() {
        super(null);
    }

    public static PooledNativeRunnable allocate(HybridData hybridData) {
        PooledNativeRunnable pooledNativeRunnable = (PooledNativeRunnable) sPool.A01();
        pooledNativeRunnable.mHybridData = hybridData;
        return pooledNativeRunnable;
    }

    @Override // com.facebook.common.jniexecutors.NativeRunnable, java.lang.Runnable
    public void run() {
        try {
            super.run();
        } catch (Exception e) {
            Log.e("PooledNativeRunnable", "run crashed", e);
        }
        sPool.A02(this);
    }
}

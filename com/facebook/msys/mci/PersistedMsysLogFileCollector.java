package com.facebook.msys.mci;

import X.1SL;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: PersistedMsysLogFileCollector.class */
public class PersistedMsysLogFileCollector {
    public static final ConcurrentLinkedQueue mMsysLogFileCollectionCallbacks;

    static {
        1SL.A00();
        mMsysLogFileCollectionCallbacks = new ConcurrentLinkedQueue();
    }

    public static native void nativeCollectMsysLogFiles();

    public static void onCollectMsysLogFilesCallback(boolean z, String[] strArr) {
        synchronized (PersistedMsysLogFileCollector.class) {
            mMsysLogFileCollectionCallbacks.poll();
        }
    }
}

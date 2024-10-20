package com.facebook.msys.mcs;

import X.1Vt;
import com.facebook.msys.mci.Log;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SyncHandler.class */
public class SyncHandler {
    public NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public SyncHandler(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native void enableTraceTypeNative(int i);

    private native void executeSyncNative();

    private native void notifyAppEnterForegroundNative();

    private native void reportAppStateNative();

    private native void setProcessSyncResponseInIdleQueueNative(boolean z);

    public void enableTraceType(int i) {
        Log.log(4, "SyncHandler enableTraceType");
        enableTraceTypeNative(8);
    }

    public void notifyAppEnterForeground() {
        notifyAppEnterForegroundNative();
    }

    public void reportAppState() {
        reportAppStateNative();
    }
}

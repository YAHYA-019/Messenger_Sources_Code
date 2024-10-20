package com.facebook.msys.mci;

import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AppState.class */
public class AppState {
    public final NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public AppState() {
        this.mNativeHolder = initNativeHolder();
    }

    public AppState(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native NativeHolder initNativeHolder();

    private native void notifyAppEnterBackgroundNative(NotificationCenter notificationCenter);

    private native void notifyAppEnterForegroundNative(NotificationCenter notificationCenter);

    private native void setDisableAppStatePersistenceNative(boolean z);

    private native void setRegularAppStateUpdateNative(boolean z);

    public void notifyAppEnterBackground(NotificationCenter notificationCenter) {
        notifyAppEnterBackgroundNative(notificationCenter);
    }

    public void notifyAppEnterForeground(NotificationCenter notificationCenter) {
        notifyAppEnterForegroundNative(notificationCenter);
    }

    public void setDisableAppStatePersistence(boolean z) {
        setDisableAppStatePersistenceNative(z);
    }

    public void setRegularAppStateUpdate(boolean z) {
        setRegularAppStateUpdateNative(z);
    }
}

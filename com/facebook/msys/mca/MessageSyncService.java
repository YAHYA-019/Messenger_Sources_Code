package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MessageSyncService.class */
public abstract class MessageSyncService {
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    private native NativeHolder initNativeHolder(MessageSyncServiceConfig messageSyncServiceConfig);

    private native boolean isValidNative();

    private native void setStateNative(int i);

    private native void shutdownAndDeleteNative(NotificationScope notificationScope);

    private native void shutdownNative(NotificationScope notificationScope);
}

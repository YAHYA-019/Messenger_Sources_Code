package com.facebook.messenger.notification.engine;

import X.4SL;
import X.C46T;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NotificationEngineValueProviderSetterCompletionCallback.class */
public final class NotificationEngineValueProviderSetterCompletionCallback {
    public static final 4SL Companion = new Object();
    public NativeHolder mNativeHolder;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4SL] */
    static {
        C46T.A00();
    }

    public NotificationEngineValueProviderSetterCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private final native void failureNative(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th);

    private final native void successNative(MSGNotificationEngineContext mSGNotificationEngineContext);

    public final void failure(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th) {
        failureNative(mSGNotificationEngineContext, th);
    }

    public final void success(MSGNotificationEngineContext mSGNotificationEngineContext) {
        successNative(mSGNotificationEngineContext);
    }
}

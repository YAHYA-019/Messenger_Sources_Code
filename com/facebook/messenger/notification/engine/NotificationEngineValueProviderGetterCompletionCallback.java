package com.facebook.messenger.notification.engine;

import X.4SK;
import X.C46T;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NotificationEngineValueProviderGetterCompletionCallback.class */
public final class NotificationEngineValueProviderGetterCompletionCallback {
    public static final 4SK Companion = new Object();
    public NativeHolder mNativeHolder;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4SK] */
    static {
        C46T.A00();
    }

    public NotificationEngineValueProviderGetterCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private final native void failureNative(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th);

    private final native void successNative(MSGNotificationEngineContext mSGNotificationEngineContext, Object obj);

    public final void failure(MSGNotificationEngineContext mSGNotificationEngineContext, Throwable th) {
        failureNative(mSGNotificationEngineContext, th);
    }

    public final void success(MSGNotificationEngineContext mSGNotificationEngineContext, Object obj) {
        successNative(mSGNotificationEngineContext, obj);
    }
}

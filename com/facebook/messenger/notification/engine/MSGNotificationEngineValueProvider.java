package com.facebook.messenger.notification.engine;

import X.46S;
import X.C46T;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MSGNotificationEngineValueProvider.class */
public final class MSGNotificationEngineValueProvider {
    public static final 46S Companion = new Object();
    public final NativeHolder mNativeHolder = initNativeHolder();

    /* loaded from: MSGNotificationEngineValueProvider$ProviderGetterCallback.class */
    public interface ProviderGetterCallback {
        void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback);
    }

    /* loaded from: MSGNotificationEngineValueProvider$ProviderSetterCallback.class */
    public interface ProviderSetterCallback {
        void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.46S, java.lang.Object] */
    static {
        C46T.A00();
    }

    private final native NativeHolder initNativeHolder();

    public final native void registerGetter(String str, NotificationEngineValueType notificationEngineValueType, ProviderGetterCallback providerGetterCallback);

    public final native void registerSetter(String str, NotificationEngineValueType notificationEngineValueType, ProviderSetterCallback providerSetterCallback);
}

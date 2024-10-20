package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;

/* loaded from: GlobalNotificationCenter.class */
public class GlobalNotificationCenter extends NotificationCenterInternal {
    public GlobalNotificationCenter() {
        super(false);
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void addObserverNative(String str, int i);

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public AccountSession getAccountSession() {
        return null;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native NativeHolder initNativeHolder();

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void postStrictNotificationNative(String str, int i);

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void removeObserverNative(String str);
}

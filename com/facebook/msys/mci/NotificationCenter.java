package com.facebook.msys.mci;

import X.1Xv;
import X.1yH;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NotificationCenter.class */
public class NotificationCenter extends NotificationCenterInternal {
    public NotificationCenter() {
        super(false);
    }

    public void addObserver(1yH r302, String str, int i, 1Xv r305) {
        synchronized (this) {
            super.A01(r305, r302, str, 1);
        }
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

    public void removeEveryObserver(1yH r302) {
        synchronized (this) {
            super.A02(r302);
        }
    }

    public void removeObserver(1yH r302, String str, 1Xv r304) {
        synchronized (this) {
            super.A00(r304, r302, str);
        }
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void removeObserverNative(String str);
}

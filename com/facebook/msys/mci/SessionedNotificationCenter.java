package com.facebook.msys.mci;

import X.1Uc;
import X.1Xv;
import X.C14m;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SessionedNotificationCenter.class */
public class SessionedNotificationCenter extends NotificationCenterInternal {
    public final AccountSession mAccountSession;

    public SessionedNotificationCenter(AccountSession accountSession) {
        super(true);
        this.mAccountSession = accountSession;
    }

    public void addObserver(1Uc r302, String str, int i, 1Xv r305) {
        synchronized (this) {
            super.A01(r305, r302, str, i);
        }
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void addObserverNative(String str, int i);

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public AccountSession getAccountSession() {
        return this.mAccountSession;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public NativeHolder initNativeHolder() {
        throw new C14m("This method should never be called because only the account session can creates this object. You must use AccountSession#getSessionedNotificationCenter() instead.");
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void postStrictNotificationNative(String str, int i);

    public void removeEveryObserver(1Uc r302) {
        synchronized (this) {
            super.A02(r302);
        }
    }

    public void removeObserver(1Uc r302, String str, 1Xv r304) {
        synchronized (this) {
            super.A00(r304, r302, str);
        }
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void removeObserverNative(String str);
}

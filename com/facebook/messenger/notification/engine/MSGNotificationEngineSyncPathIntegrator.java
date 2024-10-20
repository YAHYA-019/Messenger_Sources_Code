package com.facebook.messenger.notification.engine;

import X.11T;
import X.C46T;
import X.C46i;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MSGNotificationEngineSyncPathIntegrator.class */
public final class MSGNotificationEngineSyncPathIntegrator {
    public static final C46i Companion = new Object();
    public NativeHolder mNativeHolder;

    /* loaded from: MSGNotificationEngineSyncPathIntegrator$MSGNotificationEngineOpenPathIntegratorCallback.class */
    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.46i] */
    static {
        C46T.A00();
    }

    public MSGNotificationEngineSyncPathIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MSGNotificationEngineSyncPathIntegrator(boolean z, boolean z2, boolean z3, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback) {
        11T.A0F(mSGNotificationEngineValueProvider, 4);
        11T.A0F(mailbox, 5);
        11T.A0F(mSGNotificationEngineOpenPathIntegratorCallback, 6);
        this.mNativeHolder = initNativeHolder(z, z2, z3, mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
    }

    public static final native NativeHolder initNativeHolder(boolean z, boolean z2, boolean z3, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback);
}

package com.facebook.messenger.notification.engine;

import X.1BL;
import X.4QA;
import X.C46T;
import X.C4V9;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MSGNotificationEngineInstagramSyncPathIntegrator.class */
public final class MSGNotificationEngineInstagramSyncPathIntegrator {
    public static final C4V9 Companion = new Object();
    public NativeHolder mNativeHolder;

    /* loaded from: MSGNotificationEngineInstagramSyncPathIntegrator$MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback.class */
    public class MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback {
        public void onIntegratorCreate(NativeHolder nativeHolder) {
        }
    }

    /* loaded from: MSGNotificationEngineInstagramSyncPathIntegrator$MSGNotificationEngineOpenPathIntegratorCallback.class */
    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4V9] */
    static {
        C46T.A00();
    }

    public MSGNotificationEngineInstagramSyncPathIntegrator(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, boolean z, boolean z2) {
        1BL.A1H(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
        if (z2) {
            initNativeHolderAsync(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, new 4QA(this), z);
        } else {
            this.mNativeHolder = initNativeHolder(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, z);
        }
    }

    public MSGNotificationEngineInstagramSyncPathIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, boolean z);

    public static final native void initNativeHolderAsync(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback mSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback, boolean z);
}

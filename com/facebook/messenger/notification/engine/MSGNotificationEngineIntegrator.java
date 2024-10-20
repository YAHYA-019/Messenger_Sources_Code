package com.facebook.messenger.notification.engine;

import X.C46T;
import X.C4Uc;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MSGNotificationEngineIntegrator.class */
public final class MSGNotificationEngineIntegrator {
    public static final C4Uc Companion = new Object();
    public NativeHolder mNativeHolder;

    /* loaded from: MSGNotificationEngineIntegrator$MSGNotificationEngineIntegratorCallback.class */
    public class MSGNotificationEngineIntegratorCallback {
        public void onNotification(MSGRenderedNotification mSGRenderedNotification) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Uc, java.lang.Object] */
    static {
        C46T.A00();
    }

    public MSGNotificationEngineIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, NotificationCenter notificationCenter, DatabaseConnection databaseConnection, Mailbox mailbox, MSGNotificationEngineIntegratorCallback mSGNotificationEngineIntegratorCallback);
}

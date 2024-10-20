package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* renamed from: X.4V9, reason: invalid class name */
/* loaded from: 4V9.class */
public final class C4V9 {
    private final NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, boolean z) {
        return MSGNotificationEngineInstagramSyncPathIntegrator.initNativeHolder(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, z);
    }

    private final void initNativeHolderAsync(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback mSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback, boolean z) {
        MSGNotificationEngineInstagramSyncPathIntegrator.initNativeHolderAsync(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, mSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback, z);
    }
}

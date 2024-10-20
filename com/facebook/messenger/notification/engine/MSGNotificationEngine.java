package com.facebook.messenger.notification.engine;

import X.C46T;
import X.C4Ub;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: MSGNotificationEngine.class */
public abstract class MSGNotificationEngine {
    public static final C4Ub Companion = new Object();

    /* loaded from: MSGNotificationEngine$MSGNotificationEngineOpenPathIntegratorCallback.class */
    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Ub, java.lang.Object] */
    static {
        C46T.A00();
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider);

    public final native void processOpenPathNotification(Map map, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback);
}

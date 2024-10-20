package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* renamed from: X.46f, reason: invalid class name */
/* loaded from: 46f.class */
public final class C46f implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public static final C46f A00 = new C46f();

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public final void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        11T.A0F(mSGNotificationEngineContext, 0);
        11T.A0F(notificationEngineValueProviderGetterCompletionCallback, 2);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, "android");
    }
}

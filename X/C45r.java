package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;

/* renamed from: X.45r, reason: invalid class name */
/* loaded from: 45r.class */
public final class C45r implements C45s {
    @Override // X.C45s
    public String Asm() {
        return "isNotificationMuted";
    }

    @Override // X.C45s
    public NotificationEngineValueType BIv() {
        return NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        11T.A0G(mSGNotificationEngineContext, 0, notificationEngineValueProviderGetterCompletionCallback);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, false);
    }
}

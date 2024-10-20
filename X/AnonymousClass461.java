package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;

/* renamed from: X.461, reason: invalid class name */
/* loaded from: 461.class */
public final class AnonymousClass461 implements C45s {
    @Override // X.C45s
    public String Asm() {
        return "isNotificationVisibleForThread";
    }

    @Override // X.C45s
    public NotificationEngineValueType BIv() {
        return NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        11T.A0F(mSGNotificationEngineContext, 0);
        11T.A0F(notificationEngineValueProviderGetterCompletionCallback, 2);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, true);
    }
}

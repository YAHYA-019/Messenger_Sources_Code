package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;

/* renamed from: X.45z, reason: invalid class name */
/* loaded from: 45z.class */
public final class C45z implements C45s {
    public final 1Br A00 = 1Bq.A00(83239);

    @Override // X.C45s
    public String Asm() {
        return "notification.showMessagePrefix";
    }

    @Override // X.C45s
    public NotificationEngineValueType BIv() {
        return NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        11T.A0F(mSGNotificationEngineContext, 0);
        11T.A0F(notificationEngineValueProviderGetterCompletionCallback, 2);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Boolean.valueOf(!((2yD) ((C5Z) this.A00.A00.get()).A01.A00.get()).AZk(36317745241665190L)));
    }
}

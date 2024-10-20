package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;

/* renamed from: X.46j, reason: invalid class name */
/* loaded from: 46j.class */
public final class C46j implements C45s {
    public final 1Br A00 = 1Bq.A00(16385);

    @Override // X.C45s
    public String Asm() {
        return "context.enableEngineAnnotation";
    }

    @Override // X.C45s
    public NotificationEngineValueType BIv() {
        return NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        11T.A0F(mSGNotificationEngineContext, 0);
        11T.A0F(notificationEngineValueProviderGetterCompletionCallback, 2);
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Boolean.valueOf(((2yD) this.A00.A00.get()).AZk(36314511129518083L)));
    }
}

package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;

/* renamed from: X.45y, reason: invalid class name */
/* loaded from: 45y.class */
public final class C45y implements C45v {
    public final 1Br A00 = 1Bu.A00(83770);

    @Override // X.C45v
    public String Asm() {
        return "handlePushBugReportLogging";
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderSetterCallback
    public void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback) {
        11T.A0G(mSGNotificationEngineContext, 0, obj);
        11T.A0F(notificationEngineValueProviderSetterCompletionCallback, 3);
        String obj2 = obj.toString();
        CDL cdl = (CDL) 1Br.A0B(this.A00);
        11T.A0F(obj2, 0);
        cdl.A02.BZQ(obj2);
        notificationEngineValueProviderSetterCompletionCallback.success(mSGNotificationEngineContext);
    }
}

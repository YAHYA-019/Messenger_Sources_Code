package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;
import com.facebook.push.constants.PushProperty;

/* renamed from: X.45u, reason: invalid class name */
/* loaded from: 45u.class */
public final class C45u implements C45v {
    public final 1Br A00 = 1Bu.A00(83770);

    @Override // X.C45v
    public String Asm() {
        return "handleNotifDebugLogging";
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderSetterCallback
    public void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback) {
        Boolean valueOf;
        11T.A0G(mSGNotificationEngineContext, 0, obj);
        11T.A0F(notificationEngineValueProviderSetterCompletionCallback, 3);
        String obj2 = obj.toString();
        java.util.Map notificationContextDict = mSGNotificationEngineContext.getNotificationContextDict();
        CDL cdl = (CDL) 1Br.A0B(this.A00);
        boolean A1X = 1BL.A1X(obj2, notificationContextDict);
        03Y A00 = CDL.A00(notificationContextDict);
        PushProperty pushProperty = (PushProperty) A00.first;
        Object obj3 = A00.second;
        if (pushProperty == null) {
            valueOf = false;
        } else {
            obj3 = null;
            C45d.A08((C45d) 1Br.A0B(cdl.A00), pushProperty, obj2, null);
            valueOf = Boolean.valueOf(A1X);
        }
        String str2 = (String) obj3;
        if (valueOf.booleanValue()) {
            notificationEngineValueProviderSetterCompletionCallback.success(mSGNotificationEngineContext);
        } else {
            notificationEngineValueProviderSetterCompletionCallback.failure(mSGNotificationEngineContext, AnonymousClass001.A0T(str2));
        }
    }
}

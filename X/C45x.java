package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;
import com.facebook.push.constants.PushProperty;
import java.util.HashMap;

/* renamed from: X.45x, reason: invalid class name */
/* loaded from: 45x.class */
public final class C45x implements C45v {
    public final 1Br A00 = 1Bu.A00(83770);

    @Override // X.C45v
    public String Asm() {
        return "handleNotifAbnormalLogging";
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
            C45d c45d = (C45d) 1Br.A0B(cdl.A00);
            obj3 = null;
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj2);
            A0u.putAll(pushProperty.A00());
            C45d.A09(c45d, A0u);
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

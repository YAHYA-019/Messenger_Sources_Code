package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderSetterCompletionCallback;
import com.facebook.push.constants.PushProperty;
import com.facebook.user.model.UserKey;

/* loaded from: Cwe.class */
public final class Cwe implements MSGNotificationEngineValueProvider.ProviderSetterCallback {
    public final 1Br A00;
    public final 1De A01;

    public Cwe(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A00 = 7zL.A0S(fbUserSession, r303, 49792);
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderSetterCallback
    public void setValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, Object obj, NotificationEngineValueProviderSetterCompletionCallback notificationEngineValueProviderSetterCompletionCallback) {
        7zS.A16(0, mSGNotificationEngineContext, obj, notificationEngineValueProviderSetterCompletionCallback);
        String obj2 = obj.toString();
        java.util.Map notificationContextDict = mSGNotificationEngineContext.getNotificationContextDict();
        03Y A00 = R11.A00(notificationContextDict);
        ThreadKey threadKey = (ThreadKey) A00.first;
        String str2 = (String) A00.second;
        if (str2 != null || threadKey == null) {
            notificationEngineValueProviderSetterCompletionCallback.failure(mSGNotificationEngineContext, AnonymousClass001.A0T(str2));
            return;
        }
        11T.A0F(notificationContextDict, 0);
        Object obj3 = notificationContextDict.get("notification.senderId");
        03Y A1G = obj3 == null ? 1BK.A1G((Object) null, "senderId not found") : 1BK.A1G(new UserKey(1Js.A03, obj3.toString()), (Object) null);
        UserKey userKey = (UserKey) A1G.first;
        String str3 = (String) A1G.second;
        if (str3 != null || userKey == null) {
            notificationEngineValueProviderSetterCompletionCallback.failure(mSGNotificationEngineContext, AnonymousClass001.A0T(str3));
            return;
        }
        Object obj4 = notificationContextDict.get("notification.senderContactPk");
        03Y A1G2 = (!(obj4 instanceof Long) || obj4 == null) ? 1BK.A1G((Object) null, "senderContactPk not found, or isn't a Long") : 1BK.A1G(obj4, (Object) null);
        Number number = (Number) A1G2.first;
        String str4 = (String) A1G2.second;
        if (str4 != null || number == null) {
            notificationEngineValueProviderSetterCompletionCallback.failure(mSGNotificationEngineContext, AnonymousClass001.A0T(str4));
            return;
        }
        Object obj5 = notificationContextDict.get("notification.timestampMs");
        03Y A1G3 = (!(obj5 instanceof Long) || obj5 == null) ? 1BK.A1G((Object) null, "timestampMs not found, or isn't a Long") : 1BK.A1G(obj5, (Object) null);
        Number number2 = (Number) A1G3.first;
        String str5 = (String) A1G3.second;
        if (str5 != null || number2 == null) {
            notificationEngineValueProviderSetterCompletionCallback.failure(mSGNotificationEngineContext, AnonymousClass001.A0T(str5));
            return;
        }
        5PI r0 = new 5PI();
        3pI r02 = new 3pI();
        r02.A09 = userKey;
        r02.A06 = number.longValue();
        r0.A0K = r02.A00();
        r0.A0V = threadKey;
        r0.A0E(obj2);
        r0.A05 = number2.longValue();
        r0.A06 = -1;
        NewMessageNotification A02 = ((C5ad) 1Br.A0B(this.A00)).A02(4YU.A0U(r0), ThreadCustomization.A03, ServerMessageAlertFlags.A04, new PushProperty(4rH.A03));
        11T.A0A(A02);
        ((AnonymousClass208) 1De.A00(this.A01, 17006)).BgR(A02);
        notificationEngineValueProviderSetterCompletionCallback.success(mSGNotificationEngineContext);
    }
}

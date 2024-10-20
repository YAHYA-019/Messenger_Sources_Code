package X;

import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;
import com.facebook.messenger.notification.engine.NotificationEngineValueType;

/* renamed from: X.460, reason: invalid class name */
/* loaded from: 460.class */
public final class AnonymousClass460 implements C45s {
    public final 1Br A02 = 1Bu.A00(66592);
    public final 1Br A00 = 1Bu.A00(83759);
    public final 1Br A01 = 1Bq.A00(83239);
    public final 1Br A03 = 1Bq.A00(32906);

    @Override // X.C45s
    public String Asm() {
        return "shouldBeSuppressedByClientDedupAndroid";
    }

    @Override // X.C45s
    public NotificationEngineValueType BIv() {
        return NotificationEngineValueType.NOTIFICATION_ENGINE_VALUE_TYPE_BOOLEAN;
    }

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        String str2;
        String str3;
        11T.A0F(mSGNotificationEngineContext, 0);
        11T.A0F(str, 1);
        11T.A0F(notificationEngineValueProviderGetterCompletionCallback, 2);
        java.util.Map notificationContextDict = mSGNotificationEngineContext.getNotificationContextDict();
        Number number = (Number) notificationContextDict.get("appSelectorSetting");
        Integer num = (Integer) notificationContextDict.get("notification.channelType");
        Boolean bool = (Boolean) notificationContextDict.get("notification.is_secure_message");
        Number number2 = (Number) notificationContextDict.get("notification.thread_type");
        long j = 5;
        if (number2 == null || j != number2.longValue() || !1Br.A07(((C5Z) 1Br.A0B(this.A01)).A01).AZk(2342162386541885426L)) {
            FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
            if (11T.A0O(bool, true)) {
                String A0b = AnonymousClass001.A0b("notification.message_id", notificationContextDict);
                String A0b2 = AnonymousClass001.A0b("notification.notificationId", notificationContextDict);
                notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, true);
                ((C45o) 1Br.A0B(this.A03)).A04(A0b, A0b2, null, "SuppressedE2eeNotificationsAsItIsNotSupportedByEngine");
                ((5Jh) 1Lm.A06(A04, 68577)).A01((String) null, (String) null, (String) null, "SuppressedE2eeNotificationsAsItIsNotSupportedByEngine", false);
                return;
            }
            if (!11T.A0O(bool, true)) {
                C5Z c5z = (C5Z) this.A01.A00.get();
                if (!((2yD) c5z.A01.A00.get()).AZk(36317745241992874L) || !c5z.A00()) {
                    str2 = "user not eligible for policy";
                    0fH.A0j("fb4a_msys_integration_client_dudup_policy", str2);
                }
            }
            if (11T.A0O(bool, true)) {
                C5Z c5z2 = (C5Z) 1Br.A0B(this.A01);
                if (!c5z2.A00() || !1Br.A07(c5z2.A01).AZk(36319377327536106L) || number == null) {
                    number = 2;
                }
                if (num == null) {
                    num = 2;
                }
            } else if (number == null || num == null) {
                str2 = "app selector or channel type null";
                0fH.A0j("fb4a_msys_integration_client_dudup_policy", str2);
            }
            String A0b3 = AnonymousClass001.A0b("notification.message_id", notificationContextDict);
            String A0b4 = AnonymousClass001.A0b("notification.notificationId", notificationContextDict);
            Pair pair = new Pair(false, AbE.A00(259));
            int intValue = num.intValue();
            if (intValue == 2) {
                pair = ((CPW) 1Br.A0B(this.A00)).A03(A04, num, A0b3, A0b4, number.intValue(), bool != null ? bool.booleanValue() : false);
            } else if (intValue == 0) {
                pair = ((CPW) 1Br.A0B(this.A00)).A04(A04, num, A0b3, A0b4, number.intValue(), true, bool != null ? bool.booleanValue() : false);
            }
            Object obj = pair.first;
            11T.A09(obj);
            if (AnonymousClass001.A1V(obj)) {
                if (11T.A0O(bool, true)) {
                    ((C45o) 1Br.A0B(this.A03)).A04(A0b3, A0b4, null, (String) pair.second);
                    ((5Jh) 1Lm.A06(A04, 68577)).A01((String) null, (String) null, (String) null, (String) pair.second, false);
                    str3 = "secure_message";
                } else {
                    str3 = "open_message";
                }
                ((C21p) 1Br.A0B(this.A02)).A02(5bI.A01(num), str3, 1BJ.A00(1843), A0b3, A0b4, (String) pair.second);
            }
            notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, pair.first);
            return;
        }
        notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, false);
    }
}

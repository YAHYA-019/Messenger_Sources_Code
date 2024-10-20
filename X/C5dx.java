package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.notify.MessengerMessageReminderNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5dx, reason: invalid class name */
/* loaded from: 5dx.class */
public final class C5dx {
    public final C00i A04 = new 1BQ(83168);
    public final C00i A03 = new 1BV(66423);
    public final C00i A06 = new 1BV(49805);
    public final C00i A08 = new 1BV(83835);
    public final C00i A09 = new 1BV(98666);
    public final C00i A01 = new 1BQ(49806);
    public C00i A00 = new 1BV(83267);
    public final C00i A02 = new 1BV(83330);
    public final C00i A05 = new 1BV(82311);
    public final C00i A0A = new 1BV(84854);
    public final C00i A07 = new 1BQ(66351);

    public void A00(Intent intent, String str, Bundle bundle) {
        String str2;
        Uri data;
        List<String> pathSegments;
        java.util.Map map = null;
        String action = intent != null ? intent.getAction() : null;
        if (bundle != null) {
            map = (java.util.Map) bundle.get("event_params");
            str2 = bundle.getString("notif_android_tag");
            if (intent != null && (data = intent.getData()) != null && (pathSegments = data.getPathSegments()) != null && pathSegments.size() == 1 && map != null) {
                String str3 = pathSegments.get(0);
                if (TextUtils.isDigitsOnly(str3)) {
                    map.put("thread_key", str3);
                }
            }
        } else {
            str2 = null;
        }
        A03(action, str, str2, map);
    }

    public void A01(MessagingNotification messagingNotification) {
        ((C45d) this.A04.get()).A0N(messagingNotification, null, 0);
        this.A03.get();
        C5dz c5dz = (C5dz) this.A06.get();
        if (messagingNotification.A01 == C5ap.A1r) {
            C5dz.A03(((MessengerMessageReminderNotification) messagingNotification).A01, c5dz, "notification_shown", messagingNotification.A03());
        }
        ((C5e0) this.A01.get()).A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), messagingNotification.A02);
        ((C5a9) this.A08.get()).A00(messagingNotification).A00.A06((short) 2);
        ((C5e2) this.A02.get()).A01(messagingNotification);
        C5e4 c5e4 = (C5e4) this.A05.get();
        HashMap A03 = messagingNotification.A03();
        11T.A0A(A03);
        String str = (String) A03.get("thread_key");
        Long A0e = str != null ? 0CW.A0e(str) : null;
        String str2 = (String) A03.get("client_notif_type");
        if (A0e == null || str2 == null) {
            return;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        11T.A0A(upperCase);
        if (c5e4.A00.contains(C5ap.A00(upperCase))) {
            C5e4.A00(BOn.A0J, c5e4, str2, ActionId.NEW_START_FOUND, 2, 67, A0e.longValue());
        }
    }

    public void A02(MessagingNotification messagingNotification, String str, int i) {
        ((C45d) this.A04.get()).A0N(messagingNotification, str, i);
        this.A03.get();
        C5dz c5dz = (C5dz) this.A06.get();
        if (messagingNotification.A01 == C5ap.A1r) {
            C5dz.A03(((MessengerMessageReminderNotification) messagingNotification).A01, c5dz, "notification_shown", messagingNotification.A03());
        }
        ((C5e0) this.A01.get()).A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), messagingNotification.A02);
        ((C5a9) this.A08.get()).A00(messagingNotification).A00.A06((short) 2);
        ((C5e2) this.A02.get()).A01(messagingNotification);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x08b6, code lost:
    
        if (r321.equals(r0) != false) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.String r302, java.lang.String r303, java.lang.String r304, java.util.Map r305) {
        /*
            Method dump skipped, instructions count: 2350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5dx.A03(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }
}

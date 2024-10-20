package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.3TS, reason: invalid class name */
/* loaded from: 3TS.class */
public final class C3TS {
    public static String A00;
    public static final C3TS A02 = new Object();
    public static final 1Br A01 = 1BK.A0D();

    public static final void A00(3yM r301, Long l) {
        1UG A08 = 1BK.A08(1Br.A02(A01), "messenger_jewel_notification_event");
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            r0.A01(3yU.A06, "major_surface");
            r0.A01(3yV.A0H, "minor_surface");
            r0.A01((C07n) null, "entry_point");
            0DA r02 = new 0DA();
            r02.A06("count", l);
            0DA r03 = new 0DA();
            r03.A01(BOo.A0H, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            0DA r04 = new 0DA();
            r04.A01(3yQ.A02, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            r04.A02(r02, "badging");
            r04.A02(r03, "button");
            r04.A06("num_items", (Long) null);
            1UG.A00(r301, r0, r04, A08);
        }
    }

    public static final void A01(Long l, String str, String str2, String str3, String str4) {
        1UG A08 = 1BK.A08(1Br.A02(A01), "messenger_jewel_notification_client_events");
        if (A08.isSampled()) {
            String str5 = str2 == null ? OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS : OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            A08.A7R("event", str);
            A08.A7R(AbE.A00(20), str2);
            A08.A7R(DKB.A00(98), str3);
            A08.A7R("exception_type", str4);
            A08.A6H("reason_code", l);
            A08.A7R("status", str5);
            A08.BZL();
        }
    }
}

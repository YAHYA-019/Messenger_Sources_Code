package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.notifications.constants.push.NotificationType;

/* renamed from: X.5e0, reason: invalid class name */
/* loaded from: 5e0.class */
public final class C5e0 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final C00i A07 = new 1BQ(17077);
    public final C00i A06 = new 1BQ(16634);
    public final C00i A08 = new 1BQ(16705);

    public C5e0() {
        C4Dx c4Dx = (C4Dx) 1Bi.A03(65900);
        ((C4E0) c4Dx.A00.A00.get()).A0E.add(new C5e1(1Fw.A04((1EZ) 1Bn.A0A(16428)), this));
    }

    public static Long A00(FbUserSession fbUserSession) {
        Long l = null;
        if (((Boolean) 1Bn.A0A(33058)).booleanValue()) {
            1G1 r0 = (1G1) fbUserSession;
            String str = r0.A02;
            if (!r0.A07) {
                l = 1BK.A0n(str);
            }
        }
        return l;
    }

    public static String A01(java.util.Map map) {
        return map.containsKey("notif_type") ? (String) map.get("notif_type") : "";
    }

    public static void A02(0DA r301, 1UG r302, FbUserSession fbUserSession) {
        r302.A7T(r301, "event_data");
        r302.A6H("page_id", A00(fbUserSession));
        r302.BZL();
    }

    public static void A03(0DA r301, C5e0 c5e0, String str) {
        r301.A07("notification_tray_action", str);
        r301.A07("notification_state", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
        r301.A03("notification_has_quick_action", Boolean.valueOf(((C2ib) c5e0.A07.get()).A0D()));
    }

    public static boolean A04(C5e0 c5e0) {
        return ((C2ib) c5e0.A07.get()).A09();
    }

    public static boolean A05(C5e0 c5e0, String str) {
        Boolean bool = (Boolean) 1Bn.A0A(33058);
        if (NotificationType.A4W.A00(str)) {
            return true;
        }
        return NotificationType.A4O.A00(str) && bool.booleanValue() && 1BK.A0N(((C2ib) c5e0.A07.get()).A01).AZk(18299249331936065L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r305 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (r305 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r305 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r308 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(com.facebook.auth.usersession.FbUserSession r302, com.facebook.push.constants.PushProperty r303) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5e0.A06(com.facebook.auth.usersession.FbUserSession, com.facebook.push.constants.PushProperty):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r303 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r303 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r304 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(com.facebook.push.constants.PushProperty r302) {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A06
            X.04J r0 = X.1BK.A07(r0)
            r303 = r0
            java.lang.String r0 = "messenger_business_sync_notification_impression"
            r304 = r0
            r0 = r303
            r1 = r304
            X.1UG r0 = X.1BK.A08(r0, r1)
            r305 = r0
            r0 = r301
            boolean r0 = A04(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L90
            r0 = r302
            if (r0 == 0) goto L9d
            r0 = r302
            java.lang.String r0 = r0.A0B
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L9d
        L2b:
            r0 = r301
            r1 = r304
            boolean r0 = A05(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L90
            r0 = r305
            boolean r0 = r0.isSampled()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L90
            java.lang.String r0 = "business_inbox_notification"
            r304 = r0
            r0 = r305
            r1 = r304
            X.1UG.A02(r0, r1)
            X.7cT r0 = new X.7cT
            r307 = r0
            r0 = r307
            r0.<init>()
            r0 = r302
            if (r0 == 0) goto L97
            r0 = r302
            java.lang.String r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L97
        L63:
            java.lang.String r0 = "notification_message_id"
            r304 = r0
            r0 = r307
            r1 = r304
            r2 = r303
            r0.A07(r1, r2)
            r0 = r302
            if (r0 == 0) goto L91
            r0 = r302
            java.lang.String r0 = r0.A0B
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L91
        L7a:
            java.lang.String r0 = "notification_type"
            r304 = r0
            r0 = r307
            r1 = r304
            r2 = r303
            r0.A07(r1, r2)
            r0 = r307
            r1 = r305
            X.1UG.A01(r0, r1)
            r0 = r305
            r0.BZL()
        L90:
            return
        L91:
            java.lang.String r0 = ""
            r303 = r0
            goto L7a
        L97:
            java.lang.String r0 = ""
            r303 = r0
            goto L63
        L9d:
            java.lang.String r0 = ""
            r304 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5e0.A07(com.facebook.push.constants.PushProperty):void");
    }
}

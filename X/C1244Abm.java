package X;

/* renamed from: X.Abm, reason: case insensitive filesystem */
/* loaded from: Abm.class */
public final class C1244Abm {
    public final C00i A00 = 1Bi.A02(04J.class, (Class) null);
    public final C00i A01 = 1Bn.A09(5Zt.class, (Class) null);

    public static String A00(C1244Abm c1244Abm, String str) {
        if (AbK.A0n(c1244Abm.A01).AZk(36313939898670356L)) {
            str = null;
        }
        return str;
    }

    public static boolean A01(C1244Abm c1244Abm) {
        return AbK.A0n(c1244Abm.A01).AZk(36313939898408209L);
    }

    public void A02(String str, Integer num, String str2) {
        String str3;
        if (A01(this)) {
            1UG A08 = 1BK.A08(1BK.A07(this.A00), "page_rtc_notification_interactions");
            if (A08.isSampled()) {
                if (str == null) {
                    str = "";
                }
                A08.A7R("page_id", str);
                A08.A7R("call_id", A00(this, str2));
                switch (num.intValue()) {
                    case 0:
                        str3 = "BODY_TAP";
                        break;
                    case 1:
                        str3 = "ACCEPT_TAP";
                        break;
                    default:
                        str3 = "DECLINE_TAP";
                        break;
                }
                AbF.A1M(A08, str3);
                A08.A6J("extra_info", (java.util.Map) null);
                A08.BZL();
            }
        }
    }
}

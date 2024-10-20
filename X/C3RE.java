package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3RE, reason: invalid class name */
/* loaded from: 3RE.class */
public final class C3RE {
    public final 1Br A00 = 1BK.A0D();

    public static final String A00(1Hb r301) {
        switch (r301.ordinal()) {
            case 0:
                return "all";
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                return null;
            case 5:
                return "reengagement";
            case 6:
                return "from_ads";
            case 7:
                return "priority";
            case 8:
                return "high_intent";
            case 9:
                return "unread";
            case 10:
                return "unanswered";
        }
    }

    public final void A01(FbUserSession fbUserSession, String str, String str2, String str3) {
        11T.A0F(fbUserSession, 0);
        2Ra r0 = (2Ra) 1Bn.A0A(66610);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "messenger_business_filter_tabs_account_switch_failure");
        String str4 = !2Ra.A00(r0).AZk(36317118174407665L) ? null : 2Ra.A00(r0).AZk(36317118173817836L) ? "test" : "control";
        String str5 = ((1G1) fbUserSession).A02;
        if (!1BL.A1R()) {
            str5 = null;
        }
        if (str4 == null || !A08.isSampled()) {
            return;
        }
        A08.A7R("entry_point", String.valueOf(str));
        A08.A7R("page_id", str5);
        A08.A7R(JQw.A00(81), str4);
        A08.A7R("exception_type", str2);
        A08.A7R(AbE.A00(20), str3);
        A08.BZL();
    }

    public final void A02(1Hb r302, String str) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "messenger_business_inbox_filter_row_click");
        String A00 = A00(r302);
        if (A00 == null || !A08.isSampled()) {
            return;
        }
        1UG.A02(A08, "business_inbox_filter");
        0DA r0 = new 0DA();
        r0.A07("filter_type", A00);
        1UG.A01(r0, A08);
        1UG.A03(A08, str);
    }

    public final void A03(1Hb r302, String str, String str2, long j) {
        11T.A0F(str2, 2);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "messenger_business_inbox_filter_thread_impression");
        String A00 = A00(r302);
        if (A00 == null || !A08.isSampled()) {
            return;
        }
        1UG.A02(A08, "business_inbox_filter");
        0DA r0 = new 0DA();
        r0.A07("filter_type", A00);
        r0.A07("thread_id", str2);
        r0.A06("thread_position", Long.valueOf(j));
        1UG.A01(r0, A08);
        1UG.A03(A08, str);
    }
}

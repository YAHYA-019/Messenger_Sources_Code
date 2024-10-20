package X;

/* renamed from: X.1f0, reason: invalid class name */
/* loaded from: 1f0.class */
public final class C1f0 {
    public static final 1G2 A01;
    public static final 1G2 A02;
    public static final 1G2 A03;
    public static final 1G2 A04;
    public static final 1G2 A05;
    public static final 1G2 A06;
    public static final 1G2 A07;
    public static final 1G2 A08;
    public static final 1G2 A09;
    public static final 1G2 A0A;
    public static final 1G2 A0B;
    public static final 1G2 A0C;
    public static final 1G2 A0D;
    public static final 1G2 A0E;
    public static final 1G2 A0F;
    public static final 1G2 A0G;
    public static final 1G9 A0H;
    public final C00i A00 = new 1BQ(100239);

    static {
        1G2 A0D2 = 1G0.A04.A0D("orca_accounts/");
        A01 = A0D2;
        A0H = 1G0.A0B.A0F("orca_accounts/");
        A0A = A0D2.A0D("override_gating");
        A06 = A0D2.A0D("accountswich_visited");
        A05 = A0D2.A0D("ACCOUNT_SWITCH_SHOULD_SEND_ACCOUNT_STATUS_TO_SERVER");
        A04 = A0D2.A0D("ACCOUNT_SWITCH_LOGOUT_USER_ID");
        A0B = A0D2.A0D("saved_account/");
        A0C = A0D2.A0D("saved_page_account/");
        A0D = A0D2.A0D("saved_soap_account/");
        A08 = A0D2.A0D("logged_in_as_soap/");
        A0E = A0D2.A0D("soap_account_last_logout_time/");
        A0F = A0D2.A0D("unseen_for_tab");
        A0G = A0D2.A0D("unseen_threads/");
        A03 = A0D2.A0D("get_dbl_nonce");
        A02 = A0D2.A0D("entering_source");
        A09 = A0D2.A0D("logged_in_profiles/");
        A07 = A0D2.A0D("decrypted_dek/");
    }

    public 1G2 A00() {
        return ((1LF) this.A00.get()).A03(1G0.A0B, "orca_accounts/account_switch_nux_flow_type", true);
    }

    public 1G2 A01() {
        return ((1LF) this.A00.get()).A03(1G0.A0B, "orca_accounts/short_nux_needed", true);
    }
}

package X;

/* loaded from: C11.class */
public final class C11 {
    public final C00i A00 = AbH.A0N();

    public void A00(long j, long j2, String str) {
        String str2;
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "profile_badging_consistency_check");
        if (str.equals("PendingChatsSetting")) {
            str2 = "message_requests";
        } else if (!str.equals("AccountSwitchSetting")) {
            return;
        } else {
            str2 = "switch_account";
        }
        if (A08.isSampled()) {
            A08.A7R("profile_badge_type", str2);
            A08.A6H("server_count", Long.valueOf(j2));
            A08.A6H("client_count", Long.valueOf(j));
            A08.BZL();
        }
    }
}

package X;

/* loaded from: C1s.class */
public final class C1s {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(String str, String str2, boolean z) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "profile_engagement");
        if (A08.isSampled()) {
            AbK.A1I(A08, "click");
            A08.A7R("profile_id", str);
            A08.A7R("profile_product_bucket", "messenger_profile_account_switcher");
            A08.A7R("profile_subsurface", "switch_account_continue_page");
            A08.A7R("profile_item_type", z ? 7zK.A00(88) : "now_now");
            A08.A6J("event_metadata", AbL.A0g("profile_id", str2));
            A08.BZL();
        }
    }
}

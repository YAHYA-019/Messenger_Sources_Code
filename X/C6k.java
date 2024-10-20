package X;

/* loaded from: C6k.class */
public final class C6k {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(String str, String str2, long j) {
        11T.A0F(str, 0);
        if (str2 == null) {
            str2 = "Unknown Error";
        }
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "msgr_sinbox_item_detail_render_failed");
        if (A08.isSampled()) {
            A08.A7R("item_id", str);
            A08.A7R("exception_message", str2);
            A08.A6H("exception_code", Long.valueOf(j));
            A08.BZL();
        }
    }

    public final void A01(String str, String str2, String str3) {
        11T.A0F(str2, 1);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "msgr_sinbox_item_action_tap");
        if (A08.isSampled()) {
            A08.A7R("action_name_id", str);
            A08.A7R("item_id", str2);
            A08.A7R("responsible_id", str3);
            A08.BZL();
        }
    }
}

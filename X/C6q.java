package X;

/* loaded from: C6q.class */
public final class C6q {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(String str) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "messenger_account_settings_event");
        if (A08.isSampled()) {
            AbF.A1L(A08, "item_click");
            A08.A7R("setting_type", str);
            A08.BZL();
        }
    }

    public final void A01(String str, int i) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1551));
        if (A08.isSampled()) {
            A08.A7R("me_setting_row_type", str);
            A08.A6H("count", 1BK.A0l(i));
            A08.BZL();
        }
    }
}

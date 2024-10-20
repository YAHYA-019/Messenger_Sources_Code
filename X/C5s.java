package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: C5s.class */
public final class C5s {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;
    public final 1Br A07;

    public C5s(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A07 = 1Bu.A03(r0, 16428);
        this.A04 = 1Bq.A00(49282);
        this.A05 = 1Bu.A03(r0, 83673);
        this.A03 = 7zM.A0M();
        this.A02 = 1Bq.A00(66417);
        this.A01 = 1Bu.A03(r0, 148078);
        this.A00 = 1Bu.A03(r0, 84006);
    }

    public final void A00(Context context, 4IB r303, int i) {
        11T.A0F(r303, 2);
        1G1 A0E = 4YV.A0E(context);
        1Br.A0C(this.A01);
        4IA r0 = r303.A01;
        String str = A0E.A02;
        if (((C09474qD) 1Br.A0B(this.A04)).Azj() > 0) {
            1UG A08 = 1BK.A08(1Br.A02(((C1s) 1Br.A0B(this.A05)).A00), "profile_engagement");
            if (A08.isSampled()) {
                AbK.A1I(A08, "click");
                A08.A7R("profile_id", str);
                A08.A7R("profile_product_bucket", "messenger_profile_account_switcher");
                A08.A7R("profile_subsurface", "messenger_options");
                A08.A6J("event_metadata", AbL.A0g("notification_num", String.valueOf(i)));
                A08.BZL();
            }
        }
        Intent A09 = C3o5.A09(context);
        A09.putExtra("extra_account_switch_redirect_source", r0.sourceName);
        7zT.A12(context, A09, this.A03);
    }
}

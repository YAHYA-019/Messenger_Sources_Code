package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: Dpj.class */
public final class Dpj extends FAG {
    public final Evr A00;
    public final 2BQ A01;
    public final EgS A02;
    public final EgU A03;
    public final C15h A04;

    public Dpj() {
        EgS egS = (EgS) 1Bi.A03(98826);
        Evr A0X = DKG.A0X();
        2BQ r0 = (2BQ) 1Bi.A03(16964);
        EgU egU = (EgU) 1Bi.A03(98827);
        G7K A01 = G7K.A01(this, 29);
        this.A02 = egS;
        this.A00 = A0X;
        this.A01 = r0;
        this.A03 = egU;
        this.A04 = A01;
    }

    public View A03(Context context, ViewGroup viewGroup) {
        this.A00.A01(FES.A0C, A04());
        DQU dqu = new DQU(context);
        dqu.A02.setVisibility(0);
        2BQ r0 = this.A01;
        if (r0.A05("native_url_interstitial") || r0.A05("ussd_upsell")) {
            Dpo dpo = ((FAG) this).A01;
            if (dpo != null) {
                C67K c67k = ((Dpp) dpo).A01;
                String str = ((Dpp) dpo).A03;
                c67k.A01(new C7v4(((Dpp) dpo).A00, QoF.A03, ((Dpp) dpo).A02, str));
                dpo.A16();
                return dqu;
            }
        } else {
            ((FAG) this).A01.A19(EM6.A0A);
        }
        return dqu;
    }
}

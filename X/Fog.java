package X;

import android.content.Context;
import com.facebook.payments.checkout.model.SimpleCheckoutData;

/* loaded from: Fog.class */
public final class Fog implements GJZ {
    public final /* synthetic */ DZe A00;

    public Fog(DZe dZe) {
        this.A00 = dZe;
    }

    public void Byq() {
        DZe dZe = this.A00;
        if (dZe.A05.A06(dZe.A0B).A03(dZe.A0A).contains(((SimpleCheckoutData) dZe.A0A).A08)) {
            return;
        }
        EXB exb = dZe.A06;
        Context context = dZe.A01;
        FK6 A00 = FK6.A00(dZe, 60);
        C2121Dea A03 = C2121Dea.A03(context);
        A03.A06(2131956622);
        A03.A05(2131956623);
        A03.A0E(A00, 2131956624);
        A03.A07(FK6.A00(exb, 57));
        A03.A0C(false);
        A03.A04();
    }

    public void CN0() {
    }

    public void CSl(CharSequence charSequence) {
    }
}

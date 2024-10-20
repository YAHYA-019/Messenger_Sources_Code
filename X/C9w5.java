package X;

import android.content.Context;

/* renamed from: X.9w5, reason: invalid class name */
/* loaded from: 9w5.class */
public final class C9w5 implements 2Ws {
    public final /* synthetic */ 9Ub A00;

    public C9w5(9Ub r302) {
        this.A00 = r302;
    }

    public void Bks(String str) {
        9Ub r0 = this.A00;
        if (0CV.A0a(r0.A01, str, false)) {
            r0.A03.A00(null);
        }
    }

    public void Ch8(String str) {
        9Ub r0 = this.A00;
        Context context = r0.A02.getContext();
        if (context != null) {
            C2X0 c2x0 = r0.A00;
            if (c2x0 == null) {
                11T.A0L("promotionBannerInterface");
                throw 0Q8.createAndThrow();
            }
            1LI AYr = c2x0.A00.A00.AYr(7zL.A0W(context), r0.A04, str);
            if (AYr != null) {
                r0.A01 = str;
            }
            7zQ.A0Q().Ciz(new SBE(AYr, r0));
        }
    }
}

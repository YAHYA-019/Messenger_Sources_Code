package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;

/* loaded from: Dpa.class */
public final class Dpa extends 2vU implements C7y4 {
    public final 1Br A01 = 1Bq.A00(98758);
    public final 1Br A00 = 1BK.A0E();

    public String Arn() {
        return "5131";
    }

    public C4Hx BC9(InterstitialTrigger interstitialTrigger) {
        return !1Br.A07(((EgC) 1Br.A0B(this.A01)).A00).AZk(36310972076263024L) ? C4Hx.A03 : C4Hx.A02;
    }

    public ImmutableList BHB() {
        return 7zN.A0e(new InterstitialTrigger(312, (String) null));
    }

    @Override // X.C7y4
    public void CX6(Context context, InterstitialTrigger interstitialTrigger, Object obj) {
        11T.A0F(context, 0);
        if (obj == null) {
            throw 1BK.A0h();
        }
        EgC egC = (EgC) 1Br.A0B(this.A01);
        String A0u = 4YU.A0u(context.getResources(), context.getString(2131956666), 2131968021);
        11T.A0A(A0u);
        String A0r = DKD.A0r(1Br.A07(egC.A00), A0u, 36873922029617379L);
        RbC rbC = new RbC(context);
        rbC.A02();
        rbC.A04(QqV.A02);
        rbC.A05(A0r);
        rbC.A06(0S2.A0C);
        rbC.A01(CallerContext.A0B(Dpa.class.toString())).A01((View) obj);
        C00i c00i = this.A00.A00;
        FbSharedPreferences A0S = 1BK.A0S(c00i);
        1G2 r0 = RDR.A02;
        if (A0S.AZn(r0, false)) {
            return;
        }
        1Ql.A03(r0, c00i.get(), true);
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Kqf.class */
public final class Kqf {
    public final int A00;
    public final MLg A01;
    public final Fik A02;
    public final 1Br A03;
    public final 1Br A04;
    public final java.util.Map A05;
    public final boolean A06;
    public final Intent A07;

    public Kqf(Context context, Intent intent, MLg mLg, boolean z) {
        11T.A0F(context, 1);
        this.A06 = z;
        this.A01 = mLg;
        this.A07 = intent;
        this.A04 = 1Bq.A00(131203);
        1Br A00 = 1HG.A00(context, 82045);
        this.A03 = A00;
        1Br.A0C(A00);
        this.A05 = L0h.A00(intent);
        RbC rbC = new RbC(context);
        rbC.A02();
        rbC.A04(QqV.A02);
        rbC.A06(0S2.A01);
        rbC.A05(1BK.A0u(context, 2131951937));
        String string = context.getString(2131951695);
        RP5 rp5 = rbC.A00;
        rp5.A06 = string;
        rp5.A01 = new LuW(this);
        this.A02 = rbC.A01(CallerContext.A0B("SearchToolTip"));
        this.A00 = (int) context.getResources().getDimension(2132279332);
    }

    public final void A00(View view) {
        C00i c00i = this.A03.A00;
        c00i.get();
        11T.A0F("search", 1);
        C00i c00i2 = this.A04.A00;
        Kh6 kh6 = (Kh6) c00i2.get();
        if (1Br.A07(kh6.A00).AZk(36325961512211577L)) {
            Kh7 kh7 = (Kh7) 1Br.A0B(kh6.A01);
            FbSharedPreferences A09 = 1Br.A09(kh7.A00);
            1LF r0 = (1LF) 1Br.A0B(kh7.A01);
            1G2 r02 = R4S.A00;
            if (A09.AZn(r0.A02(1G3.A00(r02, "search_tooltip/"), "has_accessed_browser_search_tooltip"), false)) {
                return;
            }
            Fik fik = this.A02;
            boolean z = this.A06;
            int i = this.A00;
            if (!z) {
                i = -i;
            }
            fik.A02(view, 0, i);
            MLg mLg = this.A01;
            if (mLg != null) {
                mLg.BZU(KOr.A1Z, 0S2.A01);
            }
            Kh7 kh72 = (Kh7) 1Br.A0B(((Kh6) c00i2.get()).A01);
            1Ql.A01(1Br.A08(kh72.A00), ((1LF) 1Br.A0B(kh72.A01)).A03(1G3.A00(r02, "search_tooltip/"), "has_accessed_browser_search_tooltip", true), true);
            c00i.get();
            11T.A0F("search", 1);
        }
    }
}

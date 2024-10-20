package X;

import android.content.res.Resources;
import android.view.View;

/* loaded from: Fky.class */
public final class Fky implements GI5 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CfG A01;
    public final /* synthetic */ E4v A02;
    public final /* synthetic */ E4t A03;
    public final /* synthetic */ String A04;

    public Fky(View view, CfG cfG, E4v e4v, E4t e4t, String str) {
        this.A02 = e4v;
        this.A01 = cfG;
        this.A04 = str;
        this.A00 = view;
        this.A03 = e4t;
    }

    @Override // X.GI5
    public void CHD(DkY dkY, Integer num, String str) {
        this.A01.D2v();
        if (num == 0S2.A01) {
            Ra6.A00().A01(Qoq.A02);
            return;
        }
        if (dkY == null || num != 0S2.A00) {
            this.A03.A1a();
            return;
        }
        int intValue = dkY.getIntValue(2009177097);
        boolean equalsIgnoreCase = this.A04.equalsIgnoreCase(((F9s) this.A02).A01.A0C);
        Resources resources = this.A00.getResources();
        int i = 2131820622;
        if (equalsIgnoreCase) {
            i = 2131820623;
        }
        this.A03.A1b(resources.getQuantityString(i, intValue, AnonymousClass001.A1a(intValue)));
    }

    @Override // X.GI5
    public void CHE(DkY dkY) {
        this.A01.D2v();
        Ra6.A00().A01(Qoq.A02);
    }
}

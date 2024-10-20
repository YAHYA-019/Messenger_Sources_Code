package X;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: D77.class */
public final class D77 implements Runnable {
    public static final String __redex_internal_original_name = "OpenIDAuth$5$1";
    public final /* synthetic */ D47 A00;
    public final /* synthetic */ String A01;

    public D77(D47 d47, String str) {
        this.A00 = d47;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        DJV djv;
        D47 d47 = this.A00;
        boolean z = d47.A02;
        CPg cPg = (CPg) d47.A01;
        if (z) {
            AbM.A0P(cPg).A0E(BMG.A1i, cPg.A0C);
            ArrayList A17 = 1BK.A17(Collections.singleton(this.A01));
            djv = cPg.A09;
            if (djv.AGw(CPg.A01(cPg, A17))) {
                return;
            }
        } else {
            ArrayList A172 = 1BK.A17(Collections.singleton(this.A01));
            djv = cPg.A09;
            if (djv.AGw(CPg.A01(cPg, A172))) {
                return;
            }
        }
        djv.C9k(2131958798);
    }
}

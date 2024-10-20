package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;

/* loaded from: Hif.class */
public final class Hif {
    public final int A00;
    public final Intent A01;
    public final IRm A02;
    public final 1Br A03;
    public final 1Br A04;
    public final HVe A05;
    public final JI5 A06;

    public Hif(Context context, Intent intent, HVe hVe, int i) {
        this.A00 = i;
        this.A01 = intent;
        this.A05 = hVe;
        IRE ire = new IRE(this);
        this.A06 = ire;
        1Br A01 = 1Bu.A01(context, 753);
        this.A04 = A01;
        this.A03 = 1Bu.A00(115782);
        C1F6 A0I = GOp.A0I(A01);
        IlF ilF = (IlF) 1Br.A0B(this.A03);
        Context A012 = FbInjector.A01();
        AbL.A0y(A0I);
        try {
            IRm iRm = new IRm(ire, 7zQ.A0S(A0I), ilF);
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A02 = iRm;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A012);
            throw th;
        }
    }
}

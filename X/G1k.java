package X;

import android.content.Context;

/* loaded from: G1k.class */
public final class G1k implements Runnable {
    public static final String __redex_internal_original_name = "AutofillDataProvider$fetchAutofillDataForLoggedInUser$1";
    public final /* synthetic */ Kk3 A00;
    public final /* synthetic */ MC4 A01;

    public G1k(Kk3 kk3, MC4 mc4) {
        this.A00 = kk3;
        this.A01 = mc4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Eog eog = this.A00.A00;
        C30G A0H = AbF.A0H(27);
        Context context = eog.A01;
        DKG.A1D(context);
        C3sa A00 = C3sa.A00(A0H);
        A00.A0A(172800L);
        A00.A09(172800L);
        1Vd A0K = 7zM.A0K(context);
        4YV.A1B(A00);
        1Kd.A0D(eog.A02, (1K9) null, AeR.A01(A0K.A04(A00)));
    }
}

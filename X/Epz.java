package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Epz.class */
public final class Epz {
    public final Context A00;
    public final Resources A01;
    public final C0dp A02;
    public final C63n A03;
    public final FbSharedPreferences A04;
    public final 6HM A05;
    public final DNz A06;

    public Epz() {
        DNz dNz = (DNz) 1Bi.A03(99649);
        C0dp A0G = 7zR.A0G();
        Context context = (Context) 1Bn.A0B(83719);
        1HH A0Q = AbF.A0Q(DKC.A08(), 50020);
        FbSharedPreferences A0W = 1BL.A0W();
        C63n c63n = (C63n) 1Bi.A03(49944);
        this.A06 = dNz;
        this.A02 = A0G;
        this.A00 = context;
        this.A05 = (6HM) A0Q.get();
        this.A04 = A0W;
        this.A03 = c63n;
        this.A01 = context.getResources();
    }
}

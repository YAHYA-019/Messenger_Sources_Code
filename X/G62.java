package X;

import androidx.lifecycle.LiveData;

/* loaded from: G62.class */
public final class G62 implements Runnable {
    public static final String __redex_internal_original_name = "AuthByBioViewModel$3";
    public final /* synthetic */ LA1 A00;
    public final /* synthetic */ F49 A01;
    public final /* synthetic */ DSM A02;
    public final /* synthetic */ GIx A03;
    public final /* synthetic */ Ek0 A04;
    public final /* synthetic */ FGo A05;

    public G62(LA1 la1, F49 f49, DSM dsm, GIx gIx, Ek0 ek0, FGo fGo) {
        this.A02 = dsm;
        this.A01 = f49;
        this.A04 = ek0;
        this.A03 = gIx;
        this.A00 = la1;
        this.A05 = fGo;
    }

    @Override // java.lang.Runnable
    public void run() {
        DSM dsm = this.A02;
        LiveData A00 = G7P.A00(dsm.A05.A04(this.A01, FAt.A00(this.A04.A01)), dsm, 12);
        A00.observeForever(new FZ9(A00, this, 5));
    }
}

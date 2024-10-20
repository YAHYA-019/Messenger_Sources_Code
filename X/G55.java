package X;

import java.lang.ref.WeakReference;

/* loaded from: G55.class */
public final class G55 implements Runnable {
    public static final String __redex_internal_original_name = "NTDelayActionController$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ FIJ A01;
    public final /* synthetic */ Eni A02;
    public final /* synthetic */ WeakReference A03;

    public G55(FIJ fij, Eni eni, WeakReference weakReference, int i) {
        this.A02 = eni;
        this.A03 = weakReference;
        this.A00 = i;
        this.A01 = fij;
    }

    @Override // java.lang.Runnable
    public void run() {
        FyG fyG = (FyG) this.A03.get();
        if (fyG == null) {
            0fH.A0A(E3P.class, "Not firing delay action callback because it was cancelled");
            this.A02.A03.removeCallbacks(null);
            return;
        }
        try {
            int i = this.A00;
            Eni eni = this.A02;
            if (i < eni.A00 || eni.A02) {
                return;
            }
            this.A01.A07();
        } catch (Exception e) {
            FAo.A00(fyG, e);
        }
    }
}

package X;

import android.view.ViewGroup;

/* loaded from: Iyc.class */
public final class Iyc implements Runnable {
    public static final String __redex_internal_original_name = "FbGrootPlayer$detachPlayerViewInternal$1";
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ 6UP A01;

    public Iyc(ViewGroup viewGroup, 6UP r303) {
        this.A01 = r303;
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6UP r0 = this.A01;
        if (r0 != null) {
            r0.AN7(this.A00);
        }
    }
}

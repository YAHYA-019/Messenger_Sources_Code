package X;

import android.view.View;

/* loaded from: Iyh.class */
public final class Iyh implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$maybeSetKeepScreenOn$1";
    public final /* synthetic */ IhE A00;
    public final /* synthetic */ boolean A01;

    public Iyh(IhE ihE, boolean z) {
        this.A00 = ihE;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00.A05;
        if (view != null) {
            view.setKeepScreenOn(this.A01);
        }
    }
}

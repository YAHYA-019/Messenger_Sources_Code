package X;

import android.view.View;

/* loaded from: Irf.class */
public final class Irf implements Runnable {
    public static final String __redex_internal_original_name = "RedialFragment$fadeOut$1";
    public final /* synthetic */ View A00;

    public Irf(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setVisibility(8);
    }
}

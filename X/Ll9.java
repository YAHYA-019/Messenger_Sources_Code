package X;

import android.widget.TextView;

/* loaded from: Ll9.class */
public final class Ll9 implements Runnable {
    public static final String __redex_internal_original_name = "PhotoCompressionOverlayController$4";
    public final /* synthetic */ 5Hb A00;

    public Ll9(5Hb r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        5Hb r0 = this.A00;
        r0.A02();
        C00j.A05("PhotoCompressionOverlayController.maybeStart", 1195750042);
        try {
            if (r0.A06 && !r0.A04 && r0.A03) {
                r0.A01();
            } else {
                TextView textView = r0.A00;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            }
            C00j.A01(1821466206);
        } catch (Throwable th) {
            C00j.A01(-1844923306);
            throw th;
        }
    }
}

package X;

import android.graphics.Typeface;

/* loaded from: Lp4.class */
public final class Lp4 implements Runnable {
    public static final String __redex_internal_original_name = "CallbackWithHandler$1";
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ Kds A01;
    public final /* synthetic */ Kp8 A02;

    public Lp4(Typeface typeface, Kds kds, Kp8 kp8) {
        this.A02 = kp8;
        this.A01 = kds;
        this.A00 = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        Kds kds = this.A01;
        Typeface typeface = this.A00;
        0Qs r0 = kds.A00;
        if (r0 != null) {
            r0.A03(typeface);
        }
    }
}

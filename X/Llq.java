package X;

import android.os.Handler;

/* loaded from: Llq.class */
public final class Llq implements Runnable {
    public static final String __redex_internal_original_name = "DashMediaSource$3";
    public final /* synthetic */ 6ZY A00;

    public Llq(6ZY r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        6ZY r0 = this.A00;
        6ZY r02 = 6ZY.$redex_init_class;
        Handler handler = r0.A08;
        if (handler != null) {
            handler.removeCallbacks(r0.A0S);
        }
    }
}

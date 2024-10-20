package X;

import android.os.Handler;

/* loaded from: Hz4.class */
public final class Hz4 {
    public Handler A02;
    public RDp A03;
    public long A00 = 0;
    public long A01 = 0;
    public final Runnable A04 = new S6j(this);

    public static void A00(Hz4 hz4) {
        synchronized (hz4) {
            Handler handler = hz4.A02;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            IA4.A01(hz4.A02, false, true);
            hz4.A02 = null;
        }
    }
}

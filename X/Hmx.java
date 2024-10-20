package X;

import java.util.concurrent.Future;

/* loaded from: Hmx.class */
public abstract class Hmx {
    public Future A00;

    public static void A00(Hmx hmx) {
        Future future = hmx.A00;
        if (future != null) {
            future.cancel(false);
            hmx.A00 = null;
        }
    }

    public void A01(int i) {
        H1X h1x = (H1X) this;
        if (h1x.A00 != i) {
            h1x.A00 = i;
            H2X h2x = h1x.A01;
            if (h2x.A00 == null) {
                A00(h2x.A02);
            }
            h2x.A00.post(new IvB(h1x, i));
        }
    }
}

package X;

import android.graphics.Typeface;
import android.os.Handler;

/* loaded from: Kp8.class */
public final class Kp8 {
    public final Handler A00;
    public final Kds A01;

    public Kp8(Handler handler, Kds kds) {
        this.A01 = kds;
        this.A00 = handler;
    }

    public void A00(Kze kze) {
        Handler handler;
        Runnable lp5;
        int i = kze.A00;
        if (i == 0) {
            Typeface typeface = kze.A01;
            Kds kds = this.A01;
            handler = this.A00;
            lp5 = new Lp4(typeface, kds, this);
        } else {
            Kds kds2 = this.A01;
            handler = this.A00;
            lp5 = new Lp5(kds2, this, i);
        }
        handler.post(lp5);
    }
}

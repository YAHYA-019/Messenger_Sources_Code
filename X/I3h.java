package X;

import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: I3h.class */
public final class I3h {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(-1, -1);
    public View A01;
    public boolean A02;
    public final JQ7 A03;
    public final Runnable A04 = new Ioh(this);
    public int A00 = 0;

    public I3h(JQ7 jq7) {
        this.A03 = jq7;
    }

    public void A00() {
        GuB guB = this.A03;
        Runnable runnable = this.A04;
        Handler handler = guB.A00;
        handler.removeCallbacks(runnable);
        Ioi ioi = new Ioi(this);
        if (AnonymousClass001.A1W(Thread.currentThread(), DKD.A10())) {
            ioi.run();
        } else {
            handler.post(ioi);
        }
    }

    public void A01(HdA hdA, long j) {
        GuB guB = this.A03;
        Runnable runnable = this.A04;
        Handler handler = guB.A00;
        handler.removeCallbacks(runnable);
        Izl izl = new Izl(this, hdA, j);
        if (AnonymousClass001.A1W(Thread.currentThread(), DKD.A10())) {
            izl.run();
        } else {
            handler.post(izl);
        }
    }
}

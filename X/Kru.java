package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Kru.class */
public final class Kru {
    public Interpolator A01;
    public 0Sl A02;
    public boolean A03;
    public long A00 = -1;
    public final 0xW A05 = new C2963Jes(this);
    public final ArrayList A04 = AnonymousClass001.A0s();

    public void A00() {
        if (this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((0Sk) it.next()).A01();
            }
            this.A03 = false;
        }
    }

    public void A01() {
        if (this.A03) {
            return;
        }
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            0Sk r0 = (0Sk) it.next();
            long j = this.A00;
            if (j >= 0) {
                r0.A05(j);
            }
            Interpolator interpolator = this.A01;
            if (interpolator != null) {
                r0.A07(interpolator);
            }
            if (this.A02 != null) {
                r0.A08(this.A05);
            }
            r0.A02();
        }
        this.A03 = true;
    }
}

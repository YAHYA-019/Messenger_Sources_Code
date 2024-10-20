package X;

import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ks5.class */
public final class Ks5 {
    public boolean A02;
    public KmC A03;
    public 6Yl A04;
    public boolean A05;
    public final VpsEventCallback A06;
    public final 5LX A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final AtomicInteger A0B;
    public L4x A01 = null;
    public int A00 = -1;

    public Ks5(VpsEventCallback vpsEventCallback, 5LX r303, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A08 = str;
        this.A07 = r303;
        this.A06 = vpsEventCallback;
        this.A0A = z;
        this.A09 = z2;
        this.A0B = GOn.A1K(i);
        this.A05 = z3;
        this.A02 = z4;
    }

    public void A00() {
        synchronized (this) {
            if (this.A05) {
                KmC kmC = this.A03;
                if (kmC != null) {
                    6Yl r0 = kmC.A01;
                    VpsEventCallback vpsEventCallback = this.A06;
                    if (vpsEventCallback != null) {
                        L4x l4x = this.A01;
                        if (l4x != null) {
                            KWS.A00(l4x, vpsEventCallback, r0, this.A08, this.A00, 1L, this.A0A, this.A09, false, true, this.A02);
                            this.A01 = null;
                        }
                    }
                }
            }
        }
    }

    public void A01(KmC kmC, 6Yl r303) {
        synchronized (this) {
            SystemClock.elapsedRealtime();
            this.A04 = r303;
            this.A03 = kmC;
        }
    }
}

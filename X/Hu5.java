package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Hu5.class */
public final class Hu5 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public final AtomicReference A08;
    public final AtomicReference A09;
    public final C0dr A0A;

    public Hu5(C0dr c0dr) {
        11T.A0F(c0dr, 1);
        this.A0A = c0dr;
        this.A09 = GOn.A1L((Object) null);
        this.A08 = GOn.A1L((Object) null);
    }

    public final void A00(int i) {
        6U2 r0;
        if (i < 0) {
            i = 0;
        }
        long j = this.A03;
        long j2 = i + j;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Init: %.2f s, Total: %.2f s, Count: %d, Rate: %.4f", Double.valueOf(this.A04 * 0.001d), Double.valueOf(j * 0.001d), Long.valueOf(this.A01), Double.valueOf(j2 == 0 ? 0.0d : j / j2));
        AtomicReference atomicReference = this.A08;
        if (atomicReference.get() != null) {
            GRJ grj = (GRJ) atomicReference.get();
            if (grj != null) {
                grj.CUO("Stalls", formatStrLocaleSafe);
                return;
            }
            return;
        }
        AtomicReference atomicReference2 = this.A09;
        if (atomicReference2.get() == null || (r0 = (6U2) atomicReference2.get()) == null) {
            return;
        }
        H2S.A00(r0, "Stalls", formatStrLocaleSafe);
    }

    public final void A01(boolean z, int i) {
        if (z) {
            this.A03 = 0L;
            this.A00 = i;
            this.A01 = 0L;
            this.A02 = 0L;
            this.A04 = 0L;
        } else if (this.A07) {
            return;
        }
        this.A05 = this.A0A.now();
        this.A07 = true;
        this.A06 = z;
    }

    public final void A02(boolean z, int i) {
        if (this.A07 && this.A06 == z) {
            if (this.A05 > 0) {
                long now = this.A0A.now() - this.A05;
                this.A03 += now;
                if (now > 200) {
                    this.A02++;
                }
                if (z) {
                    this.A04 = now;
                }
                this.A01++;
                A00(i);
            }
            this.A07 = false;
            this.A05 = 0L;
            this.A06 = false;
        }
    }
}

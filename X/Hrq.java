package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* loaded from: Hrq.class */
public final class Hrq {
    public final Hh0 A00;
    public final HZc A01;
    public final Hh1 A02;

    public Hrq(Hh1 hh1) {
        this.A02 = hh1;
        Hh0 hh0 = new Hh0();
        this.A00 = hh0;
        HZc hZc = new HZc();
        this.A01 = hZc;
        hh0.A04 = (short) 0;
        hh0.A03 = (short) 0;
        hh0.A00 = 0;
        hh0.A02 = 0;
        hh0.A01 = 0;
        hZc.A00 = false;
        hZc.A01 = false;
    }

    public void A00() {
        Hh1 hh1 = this.A02;
        hh1.A01 = 0;
        hh1.A04 = 0;
        hh1.A02 = 0;
        hh1.A03 = 0;
        hh1.A00 = 0;
        Hh0 hh0 = this.A00;
        hh0.A04 = (short) 0;
        hh0.A03 = (short) 0;
        hh0.A00 = 0;
        hh0.A02 = 0;
        hh0.A01 = 0;
        HZc hZc = this.A01;
        hZc.A00 = false;
        hZc.A01 = false;
    }

    public void A01(byte[] bArr, int i) {
        short s;
        if (bArr == null || i == 0) {
            return;
        }
        ShortBuffer asShortBuffer = ByteBuffer.wrap(bArr).asShortBuffer();
        int min = Math.min(i, bArr.length) / 2;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= min) {
                break;
            }
            short s2 = asShortBuffer.get(i3);
            HZc hZc = this.A01;
            Hh0 hh0 = this.A00;
            short abs = (short) Math.abs((int) s2);
            if (!hZc.A01 && s2 != 0) {
                hZc.A01 = true;
            }
            if (!hZc.A00 && abs > 184) {
                hZc.A00 = true;
            }
            short s3 = hh0.A03;
            if (s3 <= 32440 || ((s = hh0.A04) <= 32440 ? s >= -32440 || s2 >= -32440 : s2 <= 32440)) {
                int i4 = hh0.A00;
                if (i4 > 0) {
                    hh0.A02 += i4 + 1;
                    hh0.A00 = 0;
                }
            } else {
                hh0.A00++;
            }
            if ((hh0.A04 == 0 && abs > 2048) || (s2 == 0 && s3 > 2048)) {
                hh0.A01++;
            }
            hh0.A04 = s2;
            hh0.A03 = abs;
            i2 = i3 + 1;
        }
        Hh1 hh1 = this.A02;
        hh1.A01++;
        HZc hZc2 = this.A01;
        if (!hZc2.A01) {
            hh1.A04++;
        }
        if (!hZc2.A00) {
            hh1.A02++;
        }
        hZc2.A00 = false;
        hZc2.A01 = false;
    }
}

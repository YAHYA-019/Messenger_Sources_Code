package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* loaded from: Htc.class */
public final class Htc {
    public static final ByteBuffer A02 = GOq.A17(0);
    public RhL A00;
    public ByteBuffer A01;

    public ByteBuffer A00() {
        RhL rhL = this.A00;
        int i = rhL.A05 * rhL.A0F * 2;
        if (i <= 0) {
            return A02;
        }
        if (this.A01.capacity() < i) {
            this.A01 = GOq.A17(i);
        } else {
            this.A01.clear();
        }
        rhL.A05(this.A01.asShortBuffer());
        this.A01.limit(i);
        return this.A01;
    }

    public void A01() {
        RhL rhL = this.A00;
        int i = rhL.A00;
        int i2 = rhL.A05 + ((int) ((((i / (rhL.A0E / 1.0f)) + rhL.A06) / (rhL.A0D * 1.0f)) + 0.5f));
        short[] sArr = rhL.A0A;
        int i3 = rhL.A0I * 2;
        short[] A04 = RhL.A04(rhL, sArr, i, i3 + i);
        rhL.A0A = A04;
        int i4 = 0;
        while (true) {
            int i5 = rhL.A0F;
            if (i4 >= i3 * i5) {
                break;
            }
            A04[(i5 * i) + i4] = 0;
            i4++;
        }
        rhL.A00 += i3;
        RhL.A01(rhL);
        if (rhL.A05 > i2) {
            rhL.A05 = i2;
        }
        rhL.A00 = 0;
        rhL.A09 = 0;
        rhL.A06 = 0;
    }

    public void A02(ByteBuffer byteBuffer) {
        RhL rhL = this.A00;
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = asShortBuffer.remaining();
        int i = rhL.A0F;
        int i2 = remaining / i;
        int i3 = i * i2 * 2;
        short[] A04 = RhL.A04(rhL, rhL.A0A, rhL.A00, i2);
        rhL.A0A = A04;
        asShortBuffer.get(A04, rhL.A00 * i, i3 / 2);
        rhL.A00 += i2;
        RhL.A01(rhL);
    }
}

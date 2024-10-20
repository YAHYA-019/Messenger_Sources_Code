package X;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: X.076, reason: invalid class name */
/* loaded from: 076.class */
public final class AnonymousClass076 {
    public static final int[] A02 = new int[3];
    public final int A00;
    public final IntBuffer A01;

    public AnonymousClass076(ByteBuffer byteBuffer) {
        int limit = ((byteBuffer.limit() / 4) / 3) / 2;
        this.A01 = byteBuffer.asIntBuffer();
        this.A00 = limit;
    }

    private int A00(int i, int i2, int i3, int i4, int i5) {
        int i6;
        IntBuffer intBuffer;
        int i7 = i;
        if (i5 < 5) {
            int i8 = 0;
            do {
                int A01 = A01(this, i7, i2, i8);
                i6 = this.A00;
                int i9 = ((i8 * i6) + A01) * 3;
                intBuffer = this.A01;
                intBuffer.position(i9);
                int i10 = intBuffer.get();
                int i11 = intBuffer.get();
                if (i10 == i7 && i11 == i2) {
                    intBuffer.put(i3);
                    return 0;
                }
                i8++;
            } while (i8 < 2);
            int A012 = ((i4 * i6) + A01(this, i7, i2, i4)) * 3;
            intBuffer.position(A012);
            int i12 = intBuffer.get();
            int i13 = intBuffer.get();
            int i14 = intBuffer.get();
            intBuffer.position(A012);
            intBuffer.put(i7);
            intBuffer.put(i2);
            intBuffer.put(i3);
            if (i12 == 0 && i13 == 0) {
                return 0;
            }
            i7 = A00(i12, i13, i14, (i4 + 1) % 2, i5 + 1);
        }
        return i7;
    }

    public static int A01(AnonymousClass076 anonymousClass076, int i, int i2, int i3) {
        int abs;
        int i4;
        if (i3 == 0) {
            abs = Math.abs(i + (i2 * 31));
            i4 = anonymousClass076.A00;
        } else {
            if (i3 != 1) {
                throw AnonymousClass001.A0L("Supporting only 2 hashes at the moment");
            }
            i4 = anonymousClass076.A00;
            abs = Math.abs((i + (i2 * 31)) / i4);
        }
        return abs % i4;
    }

    public int A02(int i, int i2) {
        int i3 = 0;
        do {
            int A01 = ((this.A00 * i3) + A01(this, i, i2, i3)) * 3;
            IntBuffer intBuffer = this.A01;
            intBuffer.position(A01);
            int i4 = intBuffer.get();
            int i5 = intBuffer.get();
            int i6 = intBuffer.get();
            if (i == i4 && i2 == i5) {
                intBuffer.position(A01);
                intBuffer.put(A02);
                return i6;
            }
            i3++;
        } while (i3 < 2);
        return 0;
    }

    public int A03(int i, int i2, int i3) {
        if (i3 != 0) {
            return A00(i, i2, i3, 0, 0);
        }
        throw AnonymousClass001.A0L("Value 0 is reserved and can't be put into the map");
    }
}

package org.tukaani.xz.rangecoder;

import X.AnonymousClass002;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.acra.constants.ActionId;

/* loaded from: RangeEncoder.class */
public final class RangeEncoder {
    public static final int[] A06;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final byte[] A05;

    static {
        try {
            Class.forName("org.tukaani.xz.rangecoder.RangeEncoder");
            int[] iArr = new int[128];
            A06 = iArr;
            int i = 8;
            while (true) {
                int i2 = i;
                if (i2 >= 2048) {
                    return;
                }
                int i3 = 0;
                int i4 = i2;
                int i5 = 0;
                do {
                    i4 *= i4;
                    int i6 = i5 << 1;
                    while (true) {
                        i5 = i6;
                        if (((-65536) & i4) == 0) {
                            break;
                        }
                        i4 >>>= 1;
                        i6 = i5 + 1;
                    }
                    i3++;
                } while (i3 < 4);
                iArr[i2 >> 4] = ActionId.ASNYC_FAILED - i5;
                i = i2 + 16;
            }
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass002.A0N("org.tukaani.xz.rangecoder.RangeEncoder");
        }
    }

    public RangeEncoder() {
    }

    public RangeEncoder(int i) {
        this.A05 = new byte[65536];
        this.A04 = 0L;
        this.A03 = -1;
        this.A00 = (byte) 0;
        this.A02 = 1;
        this.A01 = 0;
    }

    public static int A00(short[] sArr, int i) {
        int length = i | sArr.length;
        int i2 = 0;
        do {
            int i3 = length & 1;
            length >>>= 1;
            i2 = AnonymousClass002.A08(A06, sArr[length], (-i3) & 2047, i2);
        } while (length != 1);
        return i2;
    }

    public static void A01(RangeEncoder rangeEncoder) {
        int i;
        long j = rangeEncoder.A04;
        int i2 = (int) (j >>> 32);
        if (i2 != 0 || j < 4278190080L) {
            byte b = rangeEncoder.A00;
            do {
                byte[] bArr = rangeEncoder.A05;
                int i3 = rangeEncoder.A01;
                rangeEncoder.A01 = i3 + 1;
                bArr[i3] = (byte) (b + i2);
                b = 255;
                i = rangeEncoder.A02 - 1;
                rangeEncoder.A02 = i;
            } while (i != 0);
            rangeEncoder.A00 = (byte) (j >>> 24);
        }
        rangeEncoder.A02++;
        rangeEncoder.A04 = (j & 16777215) << 8;
    }

    public void A02(short[] sArr, int i) {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            A03(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    public void A03(short[] sArr, int i, int i2) {
        int i3;
        short s = sArr[i];
        int i4 = this.A03;
        int i5 = (i4 >>> 11) * s;
        if (i2 == 0) {
            this.A03 = i5;
            i3 = s + ((EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH - s) >>> 5);
        } else {
            this.A04 += i5 & 4294967295L;
            int i6 = i4 - i5;
            this.A03 = i6;
            i5 = i6;
            i3 = s - (s >>> 5);
        }
        sArr[i] = (short) i3;
        if (((-16777216) & i5) == 0) {
            this.A03 = i5 << 8;
            A01(this);
        }
    }
}

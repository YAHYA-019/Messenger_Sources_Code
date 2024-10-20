package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.tukaani.xz.lzma.LZMAEncoder;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* renamed from: X.12z, reason: invalid class name */
/* loaded from: 12z.class */
public final class C12z {
    public final short[] A00 = new short[2];
    public final short[] A01;
    public final int[][] A02;
    public final short[][] A03;
    public final short[][] A04;
    public final int[] A05;
    public final /* synthetic */ C0yj A06;
    public final /* synthetic */ LZMAEncoder A07;

    public C12z(LZMAEncoder lZMAEncoder, int i, int i2) {
        this.A07 = lZMAEncoder;
        this.A06 = lZMAEncoder;
        Class cls = Short.TYPE;
        this.A03 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.A04 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.A01 = new short[256];
        int i3 = 1 << i;
        this.A05 = new int[i3];
        this.A02 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, Math.max((i2 - 2) + 1, 16));
    }

    public void A00() {
        int length;
        short[] sArr = this.A00;
        int[] iArr = RangeEncoder.A06;
        Arrays.fill(sArr, (short) 1024);
        int i = 0;
        while (true) {
            int i2 = i;
            short[][] sArr2 = this.A03;
            length = sArr2.length;
            if (i2 >= length) {
                break;
            }
            Arrays.fill(sArr2[i2], (short) 1024);
            i = i2 + 1;
        }
        for (int i3 = 0; i3 < length; i3++) {
            Arrays.fill(this.A04[i3], (short) 1024);
        }
        Arrays.fill(this.A01, (short) 1024);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            int[] iArr2 = this.A05;
            if (i5 >= iArr2.length) {
                return;
            }
            iArr2[i5] = 0;
            i4 = i5 + 1;
        }
    }

    public void A01() {
        int[] iArr;
        int i = 0;
        while (true) {
            int i2 = i;
            int[] iArr2 = this.A05;
            if (i2 >= iArr2.length) {
                return;
            }
            if (iArr2[i2] <= 0) {
                iArr2[i2] = 32;
                short[] sArr = this.A00;
                short s = sArr[0];
                int[] iArr3 = RangeEncoder.A06;
                int i3 = iArr3[s >>> 4];
                int i4 = 0;
                do {
                    iArr = this.A02[i2];
                    iArr[i4] = RangeEncoder.A00(this.A03[i2], i4) + i3;
                    i4++;
                } while (i4 < 8);
                int i5 = iArr3[(s ^ 2047) >>> 4];
                short s2 = sArr[1];
                int i6 = iArr3[s2 >>> 4];
                while (i4 < 16) {
                    iArr[i4] = i5 + i6 + RangeEncoder.A00(this.A04[i2], i4 - 8);
                    i4++;
                }
                int i7 = iArr3[(s2 ^ 2047) >>> 4];
                while (i4 < iArr.length) {
                    iArr[i4] = i5 + i7 + RangeEncoder.A00(this.A01, (i4 - 8) - 8);
                    i4++;
                }
            }
            i = i2 + 1;
        }
    }

    public void A02(int i, int i2) {
        short[] sArr;
        short[][] sArr2;
        int i3 = i - 2;
        LZMAEncoder lZMAEncoder = this.A07;
        Class cls = LZMAEncoder.A0F;
        RangeEncoder rangeEncoder = lZMAEncoder.A0B;
        short[] sArr3 = this.A00;
        if (i3 < 8) {
            rangeEncoder.A03(sArr3, 0, 0);
            sArr2 = this.A03;
        } else {
            rangeEncoder.A03(sArr3, 0, 1);
            i3 -= 8;
            if (i3 >= 8) {
                rangeEncoder.A03(sArr3, 1, 1);
                sArr = this.A01;
                i3 -= 8;
                rangeEncoder.A02(sArr, i3);
                int[] iArr = this.A05;
                iArr[i2] = iArr[i2] - 1;
            }
            rangeEncoder.A03(sArr3, 1, 0);
            sArr2 = this.A04;
        }
        sArr = sArr2[i2];
        rangeEncoder.A02(sArr, i3);
        int[] iArr2 = this.A05;
        iArr2[i2] = iArr2[i2] - 1;
    }
}

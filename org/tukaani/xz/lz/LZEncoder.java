package org.tukaani.xz.lz;

import X.AnonymousClass002;
import X.C0yk;
import com.facebook.common.dextricks.Constants;

/* loaded from: LZEncoder.class */
public abstract class LZEncoder {
    public static final LZEncoder $redex_init_class = null;
    public final int A05;
    public final int A06;
    public final int A07;
    public final byte[] A08;
    public int A02 = -1;
    public int A01 = -1;
    public boolean A04 = false;
    public int A03 = 0;
    public int A00 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Class] */
    static {
        ?? r0 = "org.tukaani.xz.lz.LZEncoder";
        try {
            r0 = Class.forName("org.tukaani.xz.lz.LZEncoder");
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass002.A0N(r0);
        }
    }

    public LZEncoder(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        int i6 = i3 + 273;
        this.A08 = new byte[i5 + i6 + Math.min((i / 2) + Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 536870912)];
        this.A06 = i5;
        this.A05 = i6;
        this.A07 = i4;
    }

    public static void A00(LZEncoder lZEncoder) {
        int i;
        int i2 = lZEncoder.A00;
        if (i2 <= 0 || (i = lZEncoder.A02) >= lZEncoder.A01) {
            return;
        }
        lZEncoder.A02 = i - i2;
        lZEncoder.A00 = 0;
        lZEncoder.A06(i2);
    }

    public static void A01(int[] iArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= iArr.length) {
                return;
            }
            int i4 = iArr[i3];
            if (i4 <= i) {
                iArr[i3] = 0;
            } else {
                iArr[i3] = i4 - i;
            }
            i2 = i3 + 1;
        }
    }

    public int A04(int i, int i2) {
        int i3;
        int i4 = this.A02;
        int i5 = (i4 - i) - 1;
        int i6 = 0;
        while (true) {
            i3 = i6;
            if (i3 >= i2) {
                break;
            }
            byte[] bArr = this.A08;
            if (bArr[i4 + i3] != bArr[i5 + i3]) {
                break;
            }
            i6 = i3 + 1;
        }
        return i3;
    }

    public abstract C0yk A05();

    public abstract void A06(int i);
}

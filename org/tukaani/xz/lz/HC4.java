package org.tukaani.xz.lz;

import X.AnonymousClass002;
import X.C0yk;
import X.C12y;

/* loaded from: HC4.class */
public final class HC4 extends LZEncoder {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C12y A04;
    public final C0yk A05;
    public final int[] A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Class] */
    static {
        ?? r0 = "org.tukaani.xz.lz.HC4";
        try {
            r0 = Class.forName("org.tukaani.xz.lz.HC4");
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass002.A0N(r0);
        }
    }

    public HC4(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4);
        this.A00 = -1;
        this.A04 = new C12y(i);
        int i6 = i + 1;
        this.A02 = i6;
        this.A06 = new int[i6];
        this.A01 = i6;
        this.A05 = new C0yk(i4 - 1);
        this.A03 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    private int A02() {
        int i = super.A02 + 1;
        super.A02 = i;
        int i2 = super.A03 - i;
        if (i2 < 4) {
            super.A00++;
            i2 = 0;
        } else {
            int i3 = this.A01 + 1;
            this.A01 = i3;
            int i4 = (-1) >>> 1;
            if (i3 == i4) {
                int i5 = i4 - this.A02;
                C12y c12y = this.A04;
                LZEncoder.A01(c12y.A03, i5);
                LZEncoder.A01(c12y.A04, i5);
                LZEncoder.A01(c12y.A05, i5);
                LZEncoder.A01(this.A06, i5);
                this.A01 = i3 - i5;
            }
            int i6 = this.A00 + 1;
            this.A00 = i6;
            if (i6 == this.A02) {
                this.A00 = 0;
                return i2;
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.tukaani.xz.lz.LZEncoder
    public C0yk A05() {
        int i;
        C0yk c0yk = this.A05;
        c0yk.A00 = 0;
        int i2 = 0;
        byte b = false;
        int i3 = 273;
        int i4 = this.A07;
        int A02 = A02();
        if (A02 < 273) {
            if (A02 != 0) {
                i3 = A02;
                if (i4 > A02) {
                    i4 = A02;
                }
            }
            return c0yk;
        }
        C12y c12y = this.A04;
        byte[] bArr = this.A08;
        int i5 = super.A02;
        c12y.A01(bArr, i5);
        int i6 = this.A01;
        int i7 = i6 - c12y.A03[c12y.A00];
        int i8 = i6 - c12y.A04[c12y.A01];
        int i9 = c12y.A05[c12y.A02];
        c12y.A00(i6);
        int[] iArr = this.A06;
        int i10 = this.A00;
        iArr[i10] = i9;
        int i11 = this.A02;
        int i12 = 2;
        if (i7 >= i11 || bArr[i5 - i7] != bArr[i5]) {
            i12 = 0;
        } else {
            c0yk.A02[0] = 2;
            c0yk.A01[0] = i7 - 1;
            c0yk.A00 = 1;
            i2 = 1;
            b = true;
        }
        int i13 = 3;
        if (i7 != i8 && i8 < i11 && bArr[i5 - i8] == bArr[i5]) {
            int[] iArr2 = c0yk.A01;
            i2++;
            c0yk.A00 = i2;
            iArr2[b == true ? 1 : 0] = i8 - 1;
            i7 = i8;
            i12 = 3;
        }
        if (i2 > 0) {
            while (i12 < i3) {
                int i14 = i5 + i12;
                if (bArr[i14 - i7] != bArr[i14]) {
                    break;
                }
                i12++;
            }
            c0yk.A02[i2 - 1] = i12;
            if (i12 >= i4) {
                return c0yk;
            }
        }
        if (i12 >= 3) {
            i13 = i12;
        }
        int i15 = this.A03;
        while (true) {
            int i16 = i15;
            int i17 = i6 - i9;
            int i18 = i16 - 1;
            if (i16 == 0) {
                break;
            }
            int i19 = i11;
            if (i17 >= i11) {
                break;
            }
            int i20 = i10 - i17;
            if (i17 <= i10) {
                i19 = 0;
            }
            i9 = iArr[i20 + i19];
            int i21 = i5 + i13;
            if (bArr[i21 - i17] == bArr[i21] && bArr[i5 - i17] == bArr[i5]) {
                int i22 = 0;
                do {
                    i22++;
                    if (i22 >= i3) {
                        break;
                    }
                    i = i5 + i22;
                } while (bArr[i - i17] == bArr[i]);
                if (i22 > i13) {
                    c0yk.A02[i2] = i22;
                    c0yk.A01[i2] = i17 - 1;
                    i2++;
                    c0yk.A00 = i2;
                    if (i22 >= i4) {
                        break;
                    }
                    i13 = i22;
                } else {
                    continue;
                }
            }
            i15 = i18;
        }
        return c0yk;
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public void A06(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            if (A02() != 0) {
                C12y c12y = this.A04;
                c12y.A01(this.A08, super.A02);
                this.A06[this.A00] = c12y.A05[c12y.A02];
                c12y.A00(this.A01);
            }
            i = i2;
        }
    }
}

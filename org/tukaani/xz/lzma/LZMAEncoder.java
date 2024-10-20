package org.tukaani.xz.lzma;

import X.AnonymousClass002;
import X.AnonymousClass130;
import X.AnonymousClass134;
import X.C0ye;
import X.C0yj;
import X.C12z;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.tukaani.xz.lz.LZEncoder;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* loaded from: LZMAEncoder.class */
public abstract class LZMAEncoder extends C0yj {
    public static /* synthetic */ Class A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final LZEncoder A07;
    public final C12z A08;
    public final C12z A09;
    public final AnonymousClass134 A0A;
    public final RangeEncoder A0B;
    public final int[] A0C;
    public final int[][] A0D;
    public final int[][] A0E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Class] */
    static {
        ?? r0 = "org.tukaani.xz.lzma.LZMAEncoder";
        try {
            r0 = Class.forName("org.tukaani.xz.lzma.LZMAEncoder");
            A0F = r0;
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass002.A0N(r0);
        }
    }

    public LZMAEncoder(LZEncoder lZEncoder, RangeEncoder rangeEncoder, int i, int i2, int i3, int i4) {
        super(i2);
        this.A02 = 0;
        this.A00 = 0;
        Class cls = Integer.TYPE;
        this.A0E = (int[][]) Array.newInstance((Class<?>) cls, 4, 128);
        this.A0C = new int[16];
        this.A01 = 0;
        this.A03 = -1;
        this.A04 = 0;
        this.A0B = rangeEncoder;
        this.A07 = lZEncoder;
        this.A06 = i4;
        this.A0A = new AnonymousClass134(this, i);
        this.A08 = new C12z(this, i2, i4);
        this.A09 = new C12z(this, i2, i4);
        int A00 = A00(i3 - 1) + 1;
        this.A05 = A00;
        this.A0D = (int[][]) Array.newInstance((Class<?>) cls, 4, A00);
        A05();
    }

    public static int A00(int i) {
        if (i <= 4) {
            return i;
        }
        int i2 = 31;
        int i3 = i;
        if (((-65536) & i) == 0) {
            i3 = i << 16;
            i2 = 15;
        }
        if (((-16777216) & i3) == 0) {
            i3 <<= 8;
            i2 -= 8;
        }
        if (((-268435456) & i3) == 0) {
            i3 <<= 4;
            i2 -= 4;
        }
        if (((-1073741824) & i3) == 0) {
            i3 <<= 2;
            i2 -= 2;
        }
        if ((i3 & ((-1) << (-1))) == 0) {
            i2--;
        }
        return (i2 << 1) + ((i >>> (i2 - 1)) & 1);
    }

    public abstract int A01();

    public int A02(int i, int i2, int i3, int i4) {
        int i5 = i3 - 2;
        int i6 = i + this.A08.A02[i4][i5];
        int i7 = 3;
        if (i3 < 6) {
            i7 = i5;
        }
        if (i2 < 128) {
            return i6 + this.A0E[i7][i2];
        }
        return i6 + this.A0D[i7][A00(i2)] + this.A0C[i2 & 15];
    }

    public int A03(C0ye c0ye, int i, int i2) {
        short[][] sArr = super.A0A;
        int i3 = c0ye.A00;
        short s = sArr[i3][i2];
        int[] iArr = RangeEncoder.A06;
        return A04(c0ye, AnonymousClass002.A08(iArr, super.A04[i3], 2047, iArr[(s ^ 2047) >>> 4]), 0, i2) + this.A09.A02[i2][i - 2];
    }

    public int A04(C0ye c0ye, int i, int i2, int i3) {
        int i4;
        short[] sArr = super.A05;
        if (i2 == 0) {
            int i5 = c0ye.A00;
            short s = sArr[i5];
            int[] iArr = RangeEncoder.A06;
            i4 = AnonymousClass002.A08(iArr, super.A0B[i5][i3], 2047, iArr[s >>> 4]);
        } else {
            int i6 = c0ye.A00;
            short s2 = sArr[i6];
            int[] iArr2 = RangeEncoder.A06;
            i = AnonymousClass002.A08(iArr2, s2, 2047, i);
            short s3 = super.A06[i6];
            if (i2 != 1) {
                return i + AnonymousClass002.A08(iArr2, super.A07[i6], (-(i2 - 2)) & 2047, iArr2[(s3 ^ 2047) >>> 4]);
            }
            i4 = iArr2[s3 >>> 4];
        }
        return i + i4;
    }

    public void A05() {
        int[] iArr = super.A02;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        super.A01.A00 = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            short[][] sArr = super.A0A;
            if (i3 >= sArr.length) {
                break;
            }
            short[] sArr2 = sArr[i3];
            int[] iArr2 = RangeEncoder.A06;
            Arrays.fill(sArr2, (short) 1024);
            i2 = i3 + 1;
        }
        short[] sArr3 = super.A04;
        int[] iArr3 = RangeEncoder.A06;
        Arrays.fill(sArr3, (short) 1024);
        Arrays.fill(super.A05, (short) 1024);
        Arrays.fill(super.A06, (short) 1024);
        Arrays.fill(super.A07, (short) 1024);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            short[][] sArr4 = super.A0B;
            if (i5 >= sArr4.length) {
                break;
            }
            Arrays.fill(sArr4[i5], (short) 1024);
            i4 = i5 + 1;
        }
        int i6 = 0;
        while (true) {
            int i7 = i6;
            short[][] sArr5 = super.A08;
            if (i7 >= sArr5.length) {
                break;
            }
            Arrays.fill(sArr5[i7], (short) 1024);
            i6 = i7 + 1;
        }
        while (true) {
            short[][] sArr6 = super.A09;
            if (i >= 10) {
                break;
            }
            Arrays.fill(sArr6[i], (short) 1024);
            i++;
        }
        Arrays.fill(super.A03, (short) 1024);
        AnonymousClass134 anonymousClass134 = this.A0A;
        int i8 = 0;
        while (true) {
            int i9 = i8;
            AnonymousClass130[] anonymousClass130Arr = anonymousClass134.A00;
            if (i9 >= anonymousClass130Arr.length) {
                this.A08.A00();
                this.A09.A00();
                this.A02 = 0;
                this.A00 = 0;
                this.A04 += this.A03 + 1;
                this.A03 = -1;
                return;
            }
            Arrays.fill(anonymousClass130Arr[i9].A00, (short) 1024);
            i8 = i9 + 1;
        }
    }

    public void A06(int i) {
        this.A03 += i;
        this.A07.A06(i);
    }

    public boolean A07() {
        LZEncoder lZEncoder = this.A07;
        int i = lZEncoder.A02;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        boolean z2 = false;
        if (!z) {
            if (i < lZEncoder.A01) {
                A06(1);
                this.A0B.A03(super.A0A[super.A01.A00], 0, 0);
                this.A0A.A00[0].A00();
                this.A03--;
                this.A04++;
            }
            return z2;
        }
        while (this.A04 <= 2096879) {
            RangeEncoder rangeEncoder = this.A0B;
            if (((rangeEncoder.A01 + rangeEncoder.A02) + 5) - 1 > ((char) (-26))) {
                break;
            }
            if (lZEncoder.A02 - (this.A03 + 1) >= lZEncoder.A01) {
                break;
            }
            int A01 = A01();
            int i2 = lZEncoder.A02;
            int i3 = this.A03;
            int i4 = (i2 - i3) & super.A00;
            int i5 = this.A01;
            if (i5 == -1) {
                rangeEncoder.A03(super.A0A[super.A01.A00], i4, 0);
                AnonymousClass134 anonymousClass134 = this.A0A;
                LZMAEncoder lZMAEncoder = anonymousClass134.A04;
                LZEncoder lZEncoder2 = lZMAEncoder.A07;
                int i6 = lZMAEncoder.A03;
                int i7 = i6 + 1;
                byte[] bArr = lZEncoder2.A08;
                int i8 = lZEncoder2.A02;
                int i9 = bArr[i8 - i7] & 255;
                int i10 = i8 - i6;
                int i11 = anonymousClass134.A01;
                anonymousClass134.A00[(i9 >> (8 - i11)) + ((i10 & anonymousClass134.A02) << i11)].A00();
            } else {
                short[][] sArr = super.A0A;
                C0ye c0ye = super.A01;
                int i12 = c0ye.A00;
                rangeEncoder.A03(sArr[i12], i4, 1);
                short[] sArr2 = super.A04;
                if (i5 < 4) {
                    rangeEncoder.A03(sArr2, i12, 1);
                    int i13 = 0;
                    if (i5 == 0) {
                        rangeEncoder.A03(super.A05, i12, 0);
                        short[] sArr3 = super.A0B[i12];
                        if (A01 != 1) {
                            i13 = 1;
                        }
                        rangeEncoder.A03(sArr3, i4, i13);
                    } else {
                        int[] iArr = super.A02;
                        int i14 = iArr[i5];
                        rangeEncoder.A03(super.A05, i12, 1);
                        short[] sArr4 = super.A06;
                        if (i5 == 1) {
                            rangeEncoder.A03(sArr4, i12, 0);
                        } else {
                            rangeEncoder.A03(sArr4, i12, 1);
                            rangeEncoder.A03(super.A07, i12, i5 - 2);
                            if (i5 == 3) {
                                iArr[3] = iArr[2];
                            }
                            iArr[2] = iArr[1];
                        }
                        iArr[1] = iArr[0];
                        iArr[0] = i14;
                    }
                    if (A01 == 1) {
                        int i15 = 11;
                        if (i12 < 7) {
                            i15 = 9;
                        }
                        c0ye.A00 = i15;
                    } else {
                        this.A09.A02(A01, i4);
                        c0ye.A01();
                    }
                } else {
                    rangeEncoder.A03(sArr2, i12, 0);
                    int i16 = i5 - 4;
                    int i17 = 7;
                    if (i12 >= 7) {
                        i17 = 10;
                    }
                    c0ye.A00 = i17;
                    this.A08.A02(A01, i4);
                    int A00 = A00(i16);
                    short[][] sArr5 = super.A08;
                    int i18 = 3;
                    if (A01 < 6) {
                        i18 = A01 - 2;
                    }
                    rangeEncoder.A02(sArr5[i18], A00);
                    if (A00 >= 4) {
                        int i19 = (A00 >>> 1) - 1;
                        int i20 = i16 - (((A00 & 1) | 2) << i19);
                        if (A00 < 14) {
                            short[] sArr6 = super.A09[A00 - 4];
                            int length = i20 | sArr6.length;
                            int i21 = 1;
                            do {
                                int i22 = length & 1;
                                length >>>= 1;
                                rangeEncoder.A03(sArr6, i21, i22);
                                i21 = (i21 << 1) | i22;
                            } while (length != 1);
                        } else {
                            int i23 = i20 >>> 4;
                            int i24 = i19 - 4;
                            do {
                                int i25 = rangeEncoder.A03 >>> 1;
                                rangeEncoder.A03 = i25;
                                i24--;
                                rangeEncoder.A04 += (-((i23 >>> i24) & 1)) & i25;
                                if (((-16777216) & i25) == 0) {
                                    rangeEncoder.A03 = i25 << 8;
                                    RangeEncoder.A01(rangeEncoder);
                                }
                            } while (i24 != 0);
                            short[] sArr7 = super.A03;
                            int i26 = (i20 & 15) | 16;
                            int i27 = 1;
                            do {
                                int i28 = i26 & 1;
                                i26 >>>= 1;
                                rangeEncoder.A03(sArr7, i27, i28);
                                i27 = (i27 << 1) | i28;
                            } while (i26 != 1);
                            this.A00--;
                        }
                    }
                    int[] iArr2 = super.A02;
                    iArr2[3] = iArr2[2];
                    iArr2[2] = iArr2[1];
                    iArr2[1] = iArr2[0];
                    iArr2[0] = i16;
                    this.A02--;
                }
            }
            this.A03 = i3 - A01;
            this.A04 += A01;
        }
        z2 = true;
        return z2;
    }
}

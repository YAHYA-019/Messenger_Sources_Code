package X;

import java.util.Arrays;

/* loaded from: L57.class */
public final class L57 {
    public static final L57 A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.L57, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A01 = -1;
        obj.A00 = 0;
        obj.A03 = new int[0];
        obj.A04 = new Object[0];
        obj.A02 = false;
        A05 = obj;
    }

    public int A00() {
        int A06;
        int A04;
        int i;
        int i2;
        int i3 = this.A01;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A00; i5++) {
            int i6 = this.A03[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    i = Kwg.A06(i7);
                    i2 = 8;
                } else if (i8 == 2) {
                    Lj5 lj5 = (Lj5) this.A04[i5];
                    boolean z = KEH.A02;
                    A06 = Kwg.A06(i7);
                    int A02 = lj5.A02();
                    A04 = JR2.A04(A02) + A02;
                } else if (i8 == 3) {
                    A06 = Kwg.A06(i7) * 2;
                    A04 = ((L57) this.A04[i5]).A00();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException((Throwable) KLt.A00());
                    }
                    i = Kwg.A06(i7);
                    i2 = 4;
                }
                i4 += i + i2;
            } else {
                long A052 = AnonymousClass001.A05(this.A04[i5]);
                A06 = Kwg.A06(i7);
                A04 = KEH.A04(A052);
            }
            i = A06;
            i2 = A04;
            i4 += i + i2;
        }
        this.A01 = i4;
        return i4;
    }

    public void A01(int i, Object obj) {
        if (!this.A02) {
            throw AnonymousClass001.A0p();
        }
        int i2 = this.A00;
        int[] iArr = this.A03;
        if (i2 == iArr.length) {
            int i3 = i2 >> 1;
            if (i2 < 4) {
                i3 = 8;
            }
            int i4 = i2 + i3;
            this.A03 = Arrays.copyOf(iArr, i4);
            this.A04 = Arrays.copyOf(this.A04, i4);
        }
        int[] iArr2 = this.A03;
        int i5 = this.A00;
        iArr2[i5] = i;
        this.A04[i5] = obj;
        this.A00 = i5 + 1;
    }

    public void A02(Kg7 kg7) {
        if (this.A00 == 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A00) {
                return;
            }
            int i3 = this.A03[i2];
            Object obj = this.A04[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                kg7.A00.A0D(i4, AnonymousClass001.A05(obj));
            } else if (i5 == 1) {
                kg7.A00.A0C(i4, AnonymousClass001.A05(obj));
            } else if (i5 == 2) {
                Lj5 lj5 = (Lj5) obj;
                KEH keh = kg7.A00;
                Kwg.A07(keh, i4);
                keh.A0H(lj5);
            } else if (i5 == 3) {
                KEH keh2 = kg7.A00;
                int i6 = i4 << 3;
                keh2.A08(i6 | 3);
                ((L57) obj).A02(kg7);
                keh2.A08(i6 | 4);
            } else {
                if (i5 != 5) {
                    throw AnonymousClass001.A0U(KLt.A00());
                }
                kg7.A00.A09(i4, AnonymousClass001.A03(obj));
            }
            i = i2 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof L57)) {
                return false;
            }
            L57 l57 = (L57) obj;
            int i = this.A00;
            if (i != l57.A00) {
                return false;
            }
            int[] iArr = this.A03;
            int[] iArr2 = l57.A03;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= i) {
                    Object[] objArr = this.A04;
                    Object[] objArr2 = l57.A04;
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        if (i5 >= i) {
                            break;
                        }
                        if (!objArr[i5].equals(objArr2[i5])) {
                            return false;
                        }
                        i4 = i5 + 1;
                    }
                } else {
                    if (iArr[i3] != iArr2[i3]) {
                        return false;
                    }
                    i2 = i3 + 1;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        int A03 = AbstractC2326GOr.A03(i);
        int[] iArr = this.A03;
        int i2 = 17;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i) {
                break;
            }
            i2 = (i2 * 31) + iArr[i4];
            i3 = i4 + 1;
        }
        int i5 = (A03 + i2) * 31;
        Object[] objArr = this.A04;
        int i6 = 17;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= i) {
                return i5 + i6;
            }
            i6 = 1BK.A03(objArr[i8], i6 * 31);
            i7 = i8 + 1;
        }
    }
}

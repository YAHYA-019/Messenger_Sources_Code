package X;

import java.util.Arrays;

/* loaded from: L8w.class */
public final class L8w {
    public static final L8w A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.L8w] */
    static {
        ?? obj = new Object();
        obj.A01 = -1;
        obj.A00 = 0;
        obj.A03 = new int[0];
        obj.A04 = new Object[0];
        obj.A02 = false;
        A05 = obj;
    }

    public static void A00(L8w l8w, int i) {
        int[] iArr = l8w.A03;
        if (i > iArr.length) {
            int i2 = l8w.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            l8w.A03 = Arrays.copyOf(iArr, i);
            l8w.A04 = Arrays.copyOf(l8w.A04, i);
        }
    }

    public int A01() {
        int A02;
        int A01;
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
                    i = LCa.A02(i7);
                    i2 = 8;
                } else if (i8 == 2) {
                    Lj4 lj4 = (Lj4) this.A04[i5];
                    A02 = LCa.A02(i7);
                    A01 = LCa.A03(lj4);
                } else if (i8 == 3) {
                    A02 = LCa.A02(i7) * 2;
                    A01 = ((L8w) this.A04[i5]).A01();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException((Throwable) KLr.A00());
                    }
                    i = LCa.A02(i7);
                    i2 = 4;
                }
                i4 += i + i2;
            } else {
                long A052 = AnonymousClass001.A05(this.A04[i5]);
                A02 = LCa.A02(i7);
                A01 = KBw.A01(A052);
            }
            i = A02;
            i2 = A01;
            i4 += i + i2;
        }
        this.A01 = i4;
        return i4;
    }

    public void A02(int i, Object obj) {
        if (!this.A02) {
            throw AnonymousClass001.A0p();
        }
        A00(this, this.A00 + 1);
        int[] iArr = this.A03;
        int i2 = this.A00;
        iArr[i2] = i;
        this.A04[i2] = obj;
        this.A00 = i2 + 1;
    }

    public void A03(Kp1 kp1) {
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
                LCa.A07(kp1.A00, i4, AnonymousClass001.A05(obj));
            } else if (i5 == 1) {
                LCa.A06(kp1.A00, i4, AnonymousClass001.A05(obj));
            } else if (i5 == 2) {
                kp1.A00.A09((Lj4) obj, i4);
            } else if (i5 == 3) {
                KBw kBw = kp1.A00;
                int i6 = i4 << 3;
                kBw.A04(i6 | 3);
                ((L8w) obj).A03(kp1);
                kBw.A04(i6 | 4);
            } else {
                if (i5 != 5) {
                    throw AnonymousClass001.A0U(KLr.A00());
                }
                LCa.A05(kp1.A00, i4, AnonymousClass001.A03(obj));
            }
            i = i2 + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof L8w)) {
                return false;
            }
            L8w l8w = (L8w) obj;
            int i = this.A00;
            if (i != l8w.A00) {
                return false;
            }
            int[] iArr = this.A03;
            int[] iArr2 = l8w.A03;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= i) {
                    Object[] objArr = this.A04;
                    Object[] objArr2 = l8w.A04;
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

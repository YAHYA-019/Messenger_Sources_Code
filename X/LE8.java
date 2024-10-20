package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multisets$ImmutableEntry;
import java.util.Comparator;

/* loaded from: LE8.class */
public final class LE8 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public LE8 A04;
    public LE8 A05;
    public LE8 A06;
    public LE8 A07;
    public final Object A08;

    public LE8() {
        this.A08 = null;
        this.A01 = 1;
    }

    public LE8(Object obj, int i) {
        Preconditions.checkArgument(AnonymousClass001.A1P(i));
        this.A08 = obj;
        this.A01 = i;
        this.A03 = i;
        this.A00 = 1;
        this.A02 = 1;
        this.A04 = null;
        this.A06 = null;
    }

    private LE8 A00() {
        LE8 le8;
        int i = this.A01;
        this.A01 = 0;
        LE8 le82 = this.A05;
        le82.getClass();
        LE8 le83 = this.A07;
        le83.getClass();
        le82.A07 = le83;
        le83.A05 = le82;
        LE8 le84 = this.A04;
        LE8 le85 = this.A06;
        if (le84 == null) {
            return le85;
        }
        if (le85 == null) {
            return le84;
        }
        if (le84.A02 >= le85.A02) {
            le8 = this.A05;
            le8.getClass();
            le8.A04 = this.A04.A02(le8);
            le8.A06 = this.A06;
        } else {
            le8 = this.A07;
            le8.getClass();
            le8.A06 = this.A06.A03(le8);
            le8.A04 = this.A04;
        }
        le8.A00 = this.A00 - 1;
        le8.A03 = this.A03 - i;
        return le8.A01();
    }

    private LE8 A01() {
        LE8 le8;
        LE8 le82 = this.A04;
        int i = le82 == null ? 0 : le82.A02;
        LE8 le83 = this.A06;
        int i2 = i - (le83 == null ? 0 : le83.A02);
        if (i2 == -2) {
            le83.getClass();
            le8 = this.A06;
            LE8 le84 = le8.A04;
            int i3 = le84 == null ? 0 : le84.A02;
            LE8 le85 = le8.A06;
            if (i3 - (le85 == null ? 0 : le85.A02) > 0) {
                Preconditions.checkState(AnonymousClass001.A1T(le84));
                le8.A04 = le84.A06;
                le84.A06 = le8;
                le84.A03 = le8.A03;
                le84.A00 = le8.A00;
                le8.A06();
                le84.A07();
                this.A06 = le84;
                le8 = le84;
            }
            Preconditions.checkState(AnonymousClass001.A1T(le8));
            this.A06 = le8.A04;
            le8.A04 = this;
        } else {
            if (i2 != 2) {
                A07();
                return this;
            }
            le82.getClass();
            le8 = this.A04;
            LE8 le86 = le8.A04;
            int i4 = le86 == null ? 0 : le86.A02;
            LE8 le87 = le8.A06;
            if (i4 - (le87 == null ? 0 : le87.A02) < 0) {
                Preconditions.checkState(AnonymousClass001.A1T(le87));
                le8.A06 = le87.A04;
                le87.A04 = le8;
                le87.A03 = le8.A03;
                le87.A00 = le8.A00;
                le8.A06();
                le87.A07();
                this.A04 = le87;
                le8 = le87;
            }
            Preconditions.checkState(AnonymousClass001.A1T(le8));
            this.A04 = le8.A06;
            le8.A06 = this;
        }
        le8.A03 = this.A03;
        le8.A00 = this.A00;
        A06();
        le8.A07();
        return le8;
    }

    private LE8 A02(LE8 le8) {
        LE8 le82 = this.A06;
        if (le82 == null) {
            return this.A04;
        }
        this.A06 = le82.A02(le8);
        this.A00--;
        this.A03 -= le8.A01;
        return A01();
    }

    private LE8 A03(LE8 le8) {
        LE8 le82 = this.A04;
        if (le82 == null) {
            return this.A06;
        }
        this.A04 = le82.A03(le8);
        this.A00--;
        this.A03 -= le8.A01;
        return A01();
    }

    public static LE8 A04(LE8 le8, Object obj, Comparator comparator) {
        int compare = comparator.compare(obj, le8.A08);
        if (compare < 0) {
            LE8 le82 = le8.A04;
            if (le82 != null) {
                LE8 A04 = A04(le82, obj, comparator);
                return A04 == null ? le8 : A04;
            }
        } else if (compare != 0) {
            LE8 le83 = le8.A06;
            if (le83 == null) {
                return null;
            }
            return A04(le83, obj, comparator);
        }
        return le8;
    }

    public static LE8 A05(LE8 le8, Object obj, Comparator comparator) {
        int compare = comparator.compare(obj, le8.A08);
        if (compare > 0) {
            LE8 le82 = le8.A06;
            if (le82 != null) {
                LE8 A05 = A05(le82, obj, comparator);
                return A05 == null ? le8 : A05;
            }
        } else if (compare != 0) {
            LE8 le83 = le8.A04;
            if (le83 == null) {
                return null;
            }
            return A05(le83, obj, comparator);
        }
        return le8;
    }

    private void A06() {
        LE8 le8 = this.A04;
        int i = (le8 == null ? 0 : le8.A00) + 1;
        LE8 le82 = this.A06;
        this.A00 = i + (le82 == null ? 0 : le82.A00);
        this.A03 = this.A01 + (le8 == null ? 0L : le8.A03) + (le82 == null ? 0L : le82.A03);
        A07();
    }

    private void A07() {
        LE8 le8 = this.A04;
        int i = le8 == null ? 0 : le8.A02;
        LE8 le82 = this.A06;
        this.A02 = Math.max(i, le82 == null ? 0 : le82.A02) + 1;
    }

    private void A08(Object obj, int i) {
        this.A04 = new LE8(obj, i);
        LE8 le8 = this.A05;
        le8.getClass();
        LE8 le82 = this.A04;
        le8.A07 = le82;
        le82.A05 = le8;
        le82.A07 = this;
        this.A05 = le82;
        this.A02 = Math.max(2, this.A02);
        this.A00++;
        this.A03 += i;
    }

    private void A09(Object obj, int i) {
        LE8 le8 = new LE8(obj, i);
        this.A06 = le8;
        LE8 le82 = this.A07;
        le82.getClass();
        this.A07 = le8;
        le8.A05 = this;
        le8.A07 = le82;
        le82.A05 = le8;
        this.A02 = Math.max(2, this.A02);
        this.A00++;
        this.A03 += i;
    }

    public int A0A(Object obj, Comparator comparator) {
        LE8 le8;
        int compare = comparator.compare(obj, this.A08);
        int i = 0;
        if (compare < 0) {
            le8 = this.A04;
        } else {
            if (compare <= 0) {
                return this.A01;
            }
            le8 = this.A06;
        }
        if (le8 != null) {
            i = le8.A0A(obj, comparator);
        }
        return i;
    }

    public LE8 A0B(Object obj, Comparator comparator, int[] iArr, int i) {
        int i2;
        LE8 A0B;
        int compare = comparator.compare(obj, this.A08);
        boolean z = true;
        if (compare < 0) {
            LE8 le8 = this.A04;
            if (le8 == null) {
                iArr[0] = 0;
                A08(obj, i);
                return this;
            }
            i2 = le8.A02;
            A0B = le8.A0B(obj, comparator, iArr, i);
            this.A04 = A0B;
        } else {
            if (compare <= 0) {
                int i3 = this.A01;
                iArr[0] = i3;
                long j = i3;
                long j2 = i;
                if (j + j2 > 2147483647L) {
                    z = false;
                }
                Preconditions.checkArgument(z);
                this.A01 += i;
                this.A03 += j2;
                return this;
            }
            LE8 le82 = this.A06;
            if (le82 == null) {
                iArr[0] = 0;
                A09(obj, i);
                return this;
            }
            i2 = le82.A02;
            A0B = le82.A0B(obj, comparator, iArr, i);
            this.A06 = A0B;
        }
        if (iArr[0] == 0) {
            this.A00++;
        }
        this.A03 += i;
        if (A0B.A02 != i2) {
            return A01();
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r308 > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.LE8 A0C(java.lang.Object r302, java.util.Comparator r303, int[] r304, int r305) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE8.A0C(java.lang.Object, java.util.Comparator, int[], int):X.LE8");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.LE8 A0D(java.lang.Object r302, java.util.Comparator r303, int[] r304, int r305) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE8.A0D(java.lang.Object, java.util.Comparator, int[], int):X.LE8");
    }

    public LE8 A0E(Object obj, Comparator comparator, int[] iArr, int i, int i2) {
        int compare = comparator.compare(obj, this.A08);
        if (compare < 0) {
            LE8 le8 = this.A04;
            if (le8 == null) {
                iArr[0] = 0;
                if (i == 0 && i2 > 0) {
                    A08(obj, i2);
                    return this;
                }
                return this;
            }
            this.A04 = le8.A0E(obj, comparator, iArr, i, i2);
            int i3 = iArr[0];
            if (i3 == i) {
                if (i2 == 0) {
                    if (i3 != 0) {
                        this.A00--;
                    }
                } else if (i2 > 0 && i3 == 0) {
                    this.A00++;
                }
                this.A03 += i2 - i3;
            }
            return A01();
        }
        if (compare > 0) {
            LE8 le82 = this.A06;
            if (le82 != null) {
                this.A06 = le82.A0E(obj, comparator, iArr, i, i2);
                int i4 = iArr[0];
                if (i4 == i) {
                    if (i2 == 0) {
                        if (i4 != 0) {
                            this.A00--;
                        }
                    } else if (i2 > 0 && i4 == 0) {
                        this.A00++;
                    }
                    this.A03 += i2 - i4;
                }
                return A01();
            }
            iArr[0] = 0;
            if (i == 0 && i2 > 0) {
                A09(obj, i2);
                return this;
            }
        } else {
            int i5 = this.A01;
            iArr[0] = i5;
            if (i == i5) {
                if (i2 == 0) {
                    return A00();
                }
                this.A03 += i2 - i5;
                this.A01 = i2;
            }
        }
        return this;
    }

    public String toString() {
        return new Multisets$ImmutableEntry(this.A08, this.A01).toString();
    }
}

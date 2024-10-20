package androidx.compose.ui.unit;

import X.07C;
import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.DKH;
import X.JR0;
import X.LCY;

/* loaded from: Constraints.class */
public final class Constraints {
    public final long A00;

    public static final int A00(long j) {
        int i = (int) (3 & j);
        int A0E = JR0.A0E(i & 1, i);
        int i2 = ((int) (j >> ((A0E + 15) + 31))) & ((1 << (18 - A0E)) - 1);
        int i3 = i2 - 1;
        if (i2 == 0) {
            i3 = (-1) >>> 1;
        }
        return i3;
    }

    public static final int A01(long j) {
        int i = (int) (3 & j);
        int A0E = ((int) (j >> 33)) & ((1 << (JR0.A0E(i & 1, i) + 13)) - 1);
        int i2 = A0E - 1;
        if (A0E == 0) {
            i2 = (-1) >>> 1;
        }
        return i2;
    }

    public static final int A02(long j) {
        int i = (int) (3 & j);
        int A0E = JR0.A0E(i & 1, i);
        return ((int) (j >> (A0E + 15))) & ((1 << (18 - A0E)) - 1);
    }

    public static final int A03(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int A04(long j, int i) {
        return 07C.A02(i, A02(j), A00(j));
    }

    public static int A05(long j, int i) {
        return 07C.A02(i, A03(j), A01(j));
    }

    public static final long A06(int i, int i2, int i3, int i4) {
        StringBuilder A0k;
        if (i3 < 0 || i < 0) {
            A0k = AnonymousClass001.A0k();
            A0k.append("minHeight(");
            A0k.append(i3);
            A0k.append(") and minWidth(");
            A0k.append(i);
            A0k.append(") must be >= 0");
        } else {
            if (!AbJ.A1U(i2, i)) {
                A0k = AnonymousClass001.A0k();
                A0k.append("maxWidth(");
                A0k.append(i2);
                A0k.append(") must be >= minWidth(");
                A0k.append(i);
            } else {
                if (i4 >= i3) {
                    return LCY.A03(i, i2, i3, i4);
                }
                A0k = AnonymousClass001.A0k();
                A0k.append("maxHeight(");
                A0k.append(i4);
                A0k.append(") must be >= minHeight(");
                A0k.append(i3);
            }
            A0k.append(')');
        }
        throw 1BL.A0d(A0k);
    }

    public static String A07(long j) {
        String str;
        int A01 = A01(j);
        str = "Infinity";
        int i = (-1) >>> 1;
        String valueOf = A01 == i ? str : String.valueOf(A01);
        int A00 = A00(j);
        str = A00 != i ? String.valueOf(A00) : "Infinity";
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Constraints(minWidth = ");
        A0k.append(A03(j));
        A0k.append(", maxWidth = ");
        A0k.append(valueOf);
        A0k.append(", minHeight = ");
        A0k.append(A02(j));
        A0k.append(", maxHeight = ");
        return DKH.A0o(str, A0k);
    }

    public static final boolean A08(long j) {
        int i = (int) (3 & j);
        boolean z = true;
        int A0E = JR0.A0E(i & 1, i);
        if ((((int) (j >> ((A0E + 15) + 31))) & ((1 << (18 - A0E)) - 1)) == 0) {
            z = false;
        }
        return z;
    }

    public static final boolean A09(long j) {
        int i = (int) (3 & j);
        boolean z = true;
        if ((((int) (j >> 33)) & ((1 << (JR0.A0E(i & 1, i) + 13)) - 1)) == 0) {
            z = false;
        }
        return z;
    }

    public static final boolean A0A(long j) {
        int i = (int) (3 & j);
        boolean z = true;
        int A0E = JR0.A0E(i & 1, i);
        int i2 = (1 << (18 - A0E)) - 1;
        int i3 = A0E + 15;
        int i4 = ((int) (j >> i3)) & i2;
        int i5 = ((int) (j >> (i3 + 31))) & i2;
        int i6 = i5 - 1;
        if (i5 == 0) {
            i6 = (-1) >>> 1;
        }
        if (i4 != i6) {
            z = false;
        }
        return z;
    }

    public static final boolean A0B(long j) {
        int i = (int) (3 & j);
        boolean z = true;
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        int i5 = i4 - 1;
        if (i4 == 0) {
            i5 = (-1) >>> 1;
        }
        if (i3 != i5) {
            z = false;
        }
        return z;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if ((obj instanceof Constraints) && j == ((Constraints) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }

    public String toString() {
        return A07(this.A00);
    }
}

package X;

/* renamed from: X.0A7, reason: invalid class name */
/* loaded from: 0A7.class */
public abstract class C0A7 {
    public static final int A00(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = 2147483639;
            if (i2 > 2147483639) {
                i3 = (-1) >>> 1;
            }
        }
        return i3;
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A1D = 0Pz.A1D("index: ", ", size: ", i);
            A1D.append(i2);
            throw new IndexOutOfBoundsException(A1D.toString());
        }
    }

    public static final void A02(int i, int i2) {
        if (i < 0 || i > i2) {
            StringBuilder A1D = 0Pz.A1D("index: ", ", size: ", i);
            A1D.append(i2);
            throw new IndexOutOfBoundsException(A1D.toString());
        }
    }

    public static final void A03(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder A1D = 0Pz.A1D("fromIndex: ", ", toIndex: ", i);
            A1D.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass001.A0e(", size: ", A1D, i3));
        }
        if (i <= i2) {
            return;
        }
        StringBuilder A1D2 = 0Pz.A1D("fromIndex: ", " > toIndex: ", i);
        A1D2.append(i2);
        throw AnonymousClass001.A0L(A1D2.toString());
    }
}

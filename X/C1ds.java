package X;

import android.util.SparseArray;

/* renamed from: X.1ds, reason: invalid class name */
/* loaded from: 1ds.class */
public abstract class C1ds {
    public C1e5 A00;
    public final SparseArray A01 = new SparseArray();
    public final C1dx A02 = C1dx.A01;
    public final C1dz A03 = C1dz.A00();
    public final C1dy A04;

    public C1ds(C1dy c1dy) {
        C1e5 c1e5 = C1e5.A04;
        if (c1e5 == null) {
            c1e5 = new C1e5(null);
            C1e5.A04 = c1e5;
        }
        this.A00 = c1e5;
        this.A04 = c1dy;
    }

    public static C1e9 A01(C1ds c1ds, int i) {
        SparseArray sparseArray = c1ds.A01;
        C1e9 c1e9 = (C1e9) sparseArray.get(i);
        if (c1e9 == null) {
            C1dy c1dy = c1ds.A04;
            1hU r0 = (1hU) c1dy.A02.get();
            C1e5 c1e5 = c1ds.A00;
            C1dz c1dz = c1ds.A03;
            C1f7 c1f7 = C1f7.A01;
            if (c1f7 == null) {
                c1f7 = new C1f7(c1dz);
                C1f7.A01 = c1f7;
            }
            c1e9 = new C1e9(c1dy, r0 != null ? r0.A01 : null, c1f7, c1e5, i);
            sparseArray.put(i, c1e9);
        }
        return c1e9;
    }

    public static void A02(C1ds c1ds, int i, int i2, int i3) {
        C1e9 A01 = A01(c1ds, i2);
        C1hi c1hi = new C1hi();
        c1hi.A02 = i3;
        A01.A02(new C1fq(c1hi, i, i2));
    }

    public void A03(int i, int i2) {
        A01(this, i2).A02(new C1fq(null, i, i2));
    }

    public void A04(int i, int i2) {
        C1e9 A01 = A01(this, i);
        C1fq c1fq = (C1fq) A01.A02.get(5);
        if (c1fq == null) {
            C1hi c1hi = new C1hi();
            c1hi.A02 = i2;
            A01.A02(new C1fq(c1hi, 5, A01.A01));
        } else {
            C1hi c1hi2 = c1fq.A05;
            if (c1hi2 != null) {
                c1hi2.A02 = i2 | c1hi2.A02;
            }
        }
    }
}

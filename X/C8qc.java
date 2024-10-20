package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.8qc, reason: invalid class name */
/* loaded from: 8qc.class */
public final class C8qc extends 2Yf {
    public C00m A00;
    public C00m A01;
    public Function1 A02;
    public C0Bf A03;
    public C0Bh A04;

    public C8qc() {
        super("CollectionGroupSection");
    }

    public void A0Q(C1qb c1qb) {
        C00m c00m = this.A01;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void A0T(C1qb c1qb) {
        C00m c00m = this.A00;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void A0Z(2Yy r302, C1qb c1qb, int i, int i2, int i3, long j, boolean z, boolean z2) {
        C0Bh c0Bh = this.A04;
        7zP.A1L(c1qb, 0, r302);
        if (c0Bh != null) {
            c0Bh.invoke(Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), r302, Integer.valueOf(i3));
        }
    }

    public void A0b(C1qb c1qb, int i, int i2, int i3, int i4, int i5) {
        C0Bf c0Bf = this.A03;
        if (c0Bf != null) {
            c0Bf.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    public 2Ys A0d(C1qb c1qb) {
        Function1 function1 = this.A02;
        11T.A0H(c1qb, function1);
        2Ys r0 = ((2Yr) function1.invoke(c1qb)).A00;
        11T.A0A(r0);
        return r0;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qc c8qc = (C8qc) r302;
            Function1 function1 = this.A02;
            Function1 function12 = c8qc.A02;
            if (function1 != null) {
                if (!function1.equals(function12)) {
                    return false;
                }
            } else if (function12 != null) {
                return false;
            }
            C00m c00m = this.A00;
            C00m c00m2 = c8qc.A00;
            if (c00m != null) {
                if (!c00m.equals(c00m2)) {
                    return false;
                }
            } else if (c00m2 != null) {
                return false;
            }
            C0Bh c0Bh = this.A04;
            C0Bh c0Bh2 = c8qc.A04;
            if (c0Bh != null) {
                if (!c0Bh.equals(c0Bh2)) {
                    return false;
                }
            } else if (c0Bh2 != null) {
                return false;
            }
            C00m c00m3 = this.A01;
            C00m c00m4 = c8qc.A01;
            if (c00m3 != null) {
                if (!c00m3.equals(c00m4)) {
                    return false;
                }
            } else if (c00m4 != null) {
                return false;
            }
            C0Bf c0Bf = this.A03;
            C0Bf c0Bf2 = c8qc.A03;
            if (c0Bf != null) {
                if (!c0Bf.equals(c0Bf2)) {
                    return false;
                }
            } else if (c0Bf2 != null) {
                return false;
            }
        }
        return true;
    }
}

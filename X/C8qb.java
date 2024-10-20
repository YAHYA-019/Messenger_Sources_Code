package X;

import java.util.List;

/* renamed from: X.8qb, reason: invalid class name */
/* loaded from: 8qb.class */
public final class C8qb extends 2Yf {
    public int A00;
    public 1Im A01;
    public 1Im A02;
    public 1Im A03;
    public List A04;

    public C8qb() {
        super("ViewPagerSection");
    }

    public void A0T(C1qb c1qb) {
        List list = this.A04;
        int i = this.A00;
        if (list == null || list.isEmpty()) {
            return;
        }
        2Yg.A0E(c1qb, i);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.9MV, java.lang.Object] */
    public void A0b(C1qb c1qb, int i, int i2, int i3, int i4, int i5) {
        1Im r0;
        if (i4 < 0 || c1qb.A0J() == null || (r0 = ((C8qb) c1qb.A0J()).A03) == null) {
            return;
        }
        ?? obj = new Object();
        ((9MV) obj).A00 = i4;
        r0.A00((Object) obj);
    }

    public 2Ys A0d(C1qb c1qb) {
        List list = this.A04;
        2Yr A0l = 7zL.A0l();
        C2he c2he = new C2he();
        c2he.A05 = list;
        c2he.A02 = 2Yg.A07(c1qb, C8qb.class, "ViewPagerSection");
        if (c1qb.A0J() != null) {
            c1qb.A0J();
        }
        c2he.A00 = null;
        c2he.A01 = c1qb.A0J() == null ? null : ((C8qb) c1qb.A0J()).A01;
        A0l.A01(c2he);
        return A0l.A00;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.9MU, java.lang.Object] */
    public Object A0e(1Im r302, Object obj) {
        if (r302.A01 != 239257522) {
            return null;
        }
        C1qb c1qb = (C1qb) r302.A00.A00;
        Object obj2 = ((C2i6) obj).A01;
        1Im r309 = c1qb.A0J() == null ? null : ((C8qb) c1qb.A0J()).A02;
        C2hj A0m = 7zL.A0m();
        ?? obj3 = new Object();
        ((9MU) obj3).A00 = obj2;
        return 7zM.A0t((1LI) r309.A00((Object) obj3), A0m);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qb c8qb = (C8qb) r302;
            List list = this.A04;
            List list2 = c8qb.A04;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            if (this.A00 != c8qb.A00) {
                return false;
            }
        }
        return true;
    }
}

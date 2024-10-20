package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3we, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3we.class */
public final class C02863we extends 2Yf {
    public 1Im A00;
    public ImmutableList A01;
    public List A02;

    public C02863we() {
        super("MigSegmentedControlSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        ImmutableList immutableList = this.A01;
        2Yr r0 = new 2Yr();
        C2he c2he = new C2he();
        c2he.A05 = immutableList;
        Integer num = 0S2.A00;
        c2he.A02 = 2Yg.A02(c1qb, C02863we.class, num, "MigSegmentedControlSection", (Object[]) null, 1808847616);
        c2he.A01 = 2Yg.A02(c1qb, C02863we.class, num, "MigSegmentedControlSection", (Object[]) null, 1171108835);
        c2he.A00 = 2Yg.A02(c1qb, C02863we.class, num, "MigSegmentedControlSection", (Object[]) null, -680621655);
        r0.A01(c2he);
        return r0.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if (r0.A03.BVj(r0.A03) == false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object, X.4Sx] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.2hj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02863we.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C02863we c02863we = (C02863we) r302;
            List list = this.A02;
            List list2 = c02863we.A02;
            if (list != null) {
                if (list2 == null || list.size() != c02863we.A02.size()) {
                    return false;
                }
                Iterator it = this.A02.iterator();
                Iterator it2 = c02863we.A02.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    if (!((1LI) it.next()).A0f((1LI) it2.next())) {
                        return false;
                    }
                }
            } else if (list2 != null) {
                return false;
            }
            ImmutableList immutableList = this.A01;
            ImmutableList immutableList2 = c02863we.A01;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
        }
        return true;
    }
}

package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: E0j.class */
public final class E0j extends 2Yf {
    public int A00;
    public EzJ A01;
    public List A02;

    public E0j() {
        super("FB4ACustomPivotLinkSectionImpl");
        this.A02 = Collections.emptyList();
    }

    public 2Ys A0d(C1qb c1qb) {
        EzJ ezJ = this.A01;
        List list = this.A02;
        boolean A1W = 1BL.A1W(c1qb, ezJ);
        2Yr r0 = new 2Yr();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1rs ACp = ((AbstractC2178Dg6) it.next()).ACp(ezJ);
                if (ACp != null) {
                    2hP A0I = 2hO.A0I(c1qb);
                    A0I.A04(ACp);
                    A0I.A01.A02 = Boolean.valueOf(A1W);
                    ((2hQ) A0I).A00.A0B = A1W;
                    r0.A01(A0I.A02());
                }
            }
        }
        2Ys r02 = r0.A00;
        11T.A0A(r02);
        return r02;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0j e0j = (E0j) r302;
            EzJ ezJ = this.A01;
            EzJ ezJ2 = e0j.A01;
            if (ezJ != null) {
                if (!ezJ.equals(ezJ2)) {
                    return false;
                }
            } else if (ezJ2 != null) {
                return false;
            }
            List list = this.A02;
            List list2 = e0j.A02;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            if (this.A00 != e0j.A00) {
                return false;
            }
        }
        return true;
    }
}

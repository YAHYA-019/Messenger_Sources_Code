package X;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: K7i.class */
public final class K7i extends LAE {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public K7i() {
    }

    public /* synthetic */ K7i(KRa kRa) {
    }

    public final void A02(Object obj, long j) {
        List unmodifiableList;
        List list = (List) LEl.A06(obj, j);
        if (list instanceof MRJ) {
            unmodifiableList = ((MRJ) list).DCe();
        } else {
            if (JR0.A1V(A00, list)) {
                return;
            }
            if ((list instanceof MD4) && (list instanceof MRS)) {
                MRS mrs = (MRS) list;
                if (mrs.DCS()) {
                    mrs.DCK();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        LEl.A0J(obj, j, unmodifiableList);
    }

    public final void A03(Object obj, long j, Object obj2) {
        K7F k7f;
        K7F k7f2 = (List) LEl.A06(obj2, j);
        int size = k7f2.size();
        K7F k7f3 = (List) LEl.A06(obj, j);
        if (k7f3.isEmpty()) {
            k7f3 = k7f3 instanceof MRJ ? new K7F(size) : ((k7f3 instanceof MD4) && (k7f3 instanceof MRS)) ? ((MRS) k7f3).DCY(size) : AnonymousClass001.A0t(size);
            LEl.A0J(obj, j, k7f3);
        } else {
            if (JR0.A1V(A00, k7f3)) {
                k7f = JR1.A12(k7f3, size);
                k7f.addAll(k7f3);
            } else if (k7f3 instanceof Ly9) {
                MRJ mrj = K7F.A01;
                k7f = new K7F(((List) k7f3).size() + size);
                k7f.addAll(k7f.size(), (Collection) k7f3);
            } else if ((k7f3 instanceof MD4) && (k7f3 instanceof MRS)) {
                MRS mrs = (MRS) k7f3;
                if (!mrs.DCS()) {
                    k7f3 = mrs.DCY(((List) k7f3).size() + size);
                    LEl.A0J(obj, j, k7f3);
                }
            }
            LEl.A0J(obj, j, k7f);
            k7f3 = k7f;
        }
        int size2 = ((List) k7f3).size();
        int size3 = k7f2.size();
        if (size2 > 0) {
            if (size3 > 0) {
                ((List) k7f3).addAll(k7f2);
            }
            k7f2 = k7f3;
        }
        LEl.A0J(obj, j, k7f2);
    }
}

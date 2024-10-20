package X;

import java.util.List;

/* loaded from: K7h.class */
public final class K7h extends LAE {
    public K7h() {
    }

    public /* synthetic */ K7h(KRb kRb) {
    }

    public final void A02(Object obj, long j) {
        ((MRS) LEl.A06(obj, j)).DCK();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final void A03(Object obj, long j, Object obj2) {
        MRS mrs = (MRS) LEl.A06(obj, j);
        MRS mrs2 = (List) LEl.A06(obj2, j);
        int size = mrs.size();
        int size2 = mrs2.size();
        if (size > 0) {
            if (size2 > 0) {
                if (!mrs.DCS()) {
                    mrs = mrs.DCY(size2 + size);
                }
                mrs.addAll(mrs2);
            }
            mrs2 = mrs;
        }
        LEl.A0J(obj, j, mrs2);
    }
}

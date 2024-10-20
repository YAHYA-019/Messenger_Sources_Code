package X;

import java.util.LinkedHashSet;

/* loaded from: F8i.class */
public final class F8i {
    public LinkedHashSet A00;

    public static long[] A00(F8i f8i) {
        LinkedHashSet linkedHashSet = f8i.A00;
        if (linkedHashSet != null) {
            return 0QD.A0o(linkedHashSet);
        }
        return null;
    }

    public final void A01(long j) {
        LinkedHashSet linkedHashSet = this.A00;
        if (linkedHashSet == null) {
            linkedHashSet = 7zL.A15();
        }
        this.A00 = linkedHashSet;
        linkedHashSet.add(Long.valueOf(j));
    }

    public final boolean A02() {
        LinkedHashSet linkedHashSet = this.A00;
        if (linkedHashSet != null) {
            return linkedHashSet.isEmpty();
        }
        return true;
    }
}

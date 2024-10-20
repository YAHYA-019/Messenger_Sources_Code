package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Hri.class */
public final class Hri {
    public final HsN A00;
    public final ImmutableList A01;

    public Hri(HsN hsN, ImmutableList immutableList) {
        this.A01 = immutableList;
        this.A00 = hsN;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hri)) {
                return false;
            }
            Hri hri = (Hri) obj;
            if (!11T.A0O(this.A01, hri.A01) || !11T.A0O(this.A00, hri.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }
}

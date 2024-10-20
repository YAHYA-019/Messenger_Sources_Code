package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Hrk.class */
public final class Hrk {
    public final int A00;
    public final ImmutableList A01;

    public Hrk(Ho1 ho1) {
        ImmutableList immutableList = ho1.A01;
        C1pq.A08("pageViewItems", immutableList);
        this.A01 = immutableList;
        this.A00 = ho1.A00;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hrk)) {
                return false;
            }
            Hrk hrk = (Hrk) obj;
            if (!11T.A0O(this.A01, hrk.A01) || this.A00 != hrk.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A03(this.A01) * 31) + this.A00;
    }
}

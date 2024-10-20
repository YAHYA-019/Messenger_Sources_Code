package X;

/* loaded from: L3w.class */
public final class L3w {
    public int A00;
    public final java.util.Map A01;

    public L3w() {
        this(1BK.A1C());
    }

    public L3w(java.util.Map map) {
        this.A01 = map;
        this.A00 = 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L3w)) {
                return false;
            }
            L3w l3w = (L3w) obj;
            if (!11T.A0O(this.A01, l3w.A01) || this.A00 != l3w.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AccordionGroup(indexMap=");
        A0k.append(this.A01);
        A0k.append(", visibleSize=");
        return DKH.A0p(A0k, this.A00);
    }
}

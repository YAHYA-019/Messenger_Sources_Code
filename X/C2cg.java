package X;

/* renamed from: X.2cg, reason: invalid class name */
/* loaded from: 2cg.class */
public final class C2cg {
    public final int A00;
    public final String A01;

    public C2cg(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2cg)) {
                return false;
            }
            C2cg c2cg = (C2cg) obj;
            if (!11T.A0O(this.A01, c2cg.A01) || this.A00 != c2cg.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        return 0Pz.A0n("CacheKey(globalKey=", this.A01, ", index=", ')', this.A00);
    }
}

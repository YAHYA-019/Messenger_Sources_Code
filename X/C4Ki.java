package X;

/* renamed from: X.4Ki, reason: invalid class name */
/* loaded from: 4Ki.class */
public final class C4Ki {
    public final int A00;
    public final String A01;

    public C4Ki(String str, int i) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4Ki)) {
                return false;
            }
            C4Ki c4Ki = (C4Ki) obj;
            if (!11T.A0O(this.A01, c4Ki.A01) || this.A00 != c4Ki.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        return 0Pz.A0n("WorkGenerationalId(workSpecId=", this.A01, ", generation=", ')', this.A00);
    }
}

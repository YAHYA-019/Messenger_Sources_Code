package X;

/* renamed from: X.66s, reason: invalid class name */
/* loaded from: 66s.class */
public final class C66s {
    public final String A00;
    public final int A01;

    public C66s(String str, int i) {
        this.A00 = str;
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C66s)) {
                return false;
            }
            C66s c66s = (C66s) obj;
            if (!11T.A0O(this.A00, c66s.A00) || this.A01 != c66s.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01;
    }

    public String toString() {
        return 0Pz.A0n("HookKey(globalKey=", this.A00, 1BJ.A00(63), ')', this.A01);
    }
}

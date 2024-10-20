package X;

/* renamed from: X.9ax, reason: invalid class name */
/* loaded from: 9ax.class */
public final class C9ax {
    public final int A00;
    public final String A01;

    public C9ax(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9ax)) {
                return false;
            }
            C9ax c9ax = (C9ax) obj;
            if (!11T.A0O(this.A01, c9ax.A01) || this.A00 != c9ax.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, Integer.valueOf(this.A00));
    }
}

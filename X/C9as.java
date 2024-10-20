package X;

/* renamed from: X.9as, reason: invalid class name */
/* loaded from: 9as.class */
public final class C9as {
    public final C6wl A00;
    public final String A01;

    public C9as(C6wl c6wl, String str) {
        this.A01 = str;
        this.A00 = c6wl;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9as)) {
                return false;
            }
            C9as c9as = (C9as) obj;
            if (!11T.A0O(this.A01, c9as.A01)) {
                return false;
            }
            C6wl c6wl = this.A00;
            C6wl c6wl2 = c9as.A00;
            if (c6wl != null) {
                if (!c6wl.equals(c6wl2)) {
                    return false;
                }
            } else if (c6wl2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, this.A00);
    }
}

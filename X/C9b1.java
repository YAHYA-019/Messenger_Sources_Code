package X;

/* renamed from: X.9b1, reason: invalid class name */
/* loaded from: 9b1.class */
public final class C9b1 {
    public final C2iw A00;
    public final String A01;

    public C9b1(C2iw c2iw, String str) {
        this.A01 = str;
        this.A00 = c2iw;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9b1)) {
                return false;
            }
            C9b1 c9b1 = (C9b1) obj;
            if (!11T.A0O(this.A01, c9b1.A01)) {
                return false;
            }
            C2iw c2iw = this.A00;
            C2iw c2iw2 = c9b1.A00;
            if (c2iw != null) {
                if (!c2iw.equals(c2iw2)) {
                    return false;
                }
            } else if (c2iw2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, this.A00);
    }
}

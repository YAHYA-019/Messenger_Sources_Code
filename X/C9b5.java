package X;

/* renamed from: X.9b5, reason: invalid class name */
/* loaded from: 9b5.class */
public final class C9b5 {
    public final 6yQ A00;
    public final String A01;

    public C9b5(6yQ r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9b5)) {
                return false;
            }
            C9b5 c9b5 = (C9b5) obj;
            if (!11T.A0O(this.A01, c9b5.A01)) {
                return false;
            }
            6yQ r0 = this.A00;
            6yQ r02 = c9b5.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, this.A00);
    }
}

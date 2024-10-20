package X;

/* renamed from: X.9b9, reason: invalid class name */
/* loaded from: 9b9.class */
public final class C9b9 {
    public final 9Q6 A00;
    public final String A01;

    public C9b9(9Q6 r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9b9)) {
                return false;
            }
            C9b9 c9b9 = (C9b9) obj;
            if (!11T.A0O(this.A01, c9b9.A01)) {
                return false;
            }
            9Q6 r0 = this.A00;
            9Q6 r02 = c9b9.A00;
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

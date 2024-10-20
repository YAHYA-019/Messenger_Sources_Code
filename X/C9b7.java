package X;

/* renamed from: X.9b7, reason: invalid class name */
/* loaded from: 9b7.class */
public final class C9b7 {
    public final 7HH A00;
    public final String A01;

    public C9b7(7HH r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9b7)) {
                return false;
            }
            C9b7 c9b7 = (C9b7) obj;
            if (!11T.A0O(this.A01, c9b7.A01)) {
                return false;
            }
            7HH r0 = this.A00;
            7HH r02 = c9b7.A00;
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

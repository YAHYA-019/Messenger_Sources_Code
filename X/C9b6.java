package X;

/* renamed from: X.9b6, reason: invalid class name */
/* loaded from: 9b6.class */
public final class C9b6 {
    public final Aad A00;
    public final String A01;

    public C9b6(Aad aad, String str) {
        this.A01 = str;
        this.A00 = aad;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9b6)) {
                return false;
            }
            C9b6 c9b6 = (C9b6) obj;
            if (!11T.A0O(this.A01, c9b6.A01)) {
                return false;
            }
            Aad aad = this.A00;
            Aad aad2 = c9b6.A00;
            if (aad != null) {
                if (!aad.equals(aad2)) {
                    return false;
                }
            } else if (aad2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, this.A00);
    }
}

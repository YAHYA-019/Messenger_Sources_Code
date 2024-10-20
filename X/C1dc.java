package X;

/* renamed from: X.1dc, reason: invalid class name */
/* loaded from: 1dc.class */
public final class C1dc extends C04v {
    public final String A00;
    public final String A01;
    public final int A02 = -16711936;

    public C1dc(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1dc)) {
                return false;
            }
            C1dc c1dc = (C1dc) obj;
            if (!11T.A0O(this.A01, c1dc.A01) || !11T.A0O(this.A00, c1dc.A00) || this.A02 != c1dc.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02;
    }
}

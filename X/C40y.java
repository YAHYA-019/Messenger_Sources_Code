package X;

/* renamed from: X.40y, reason: invalid class name */
/* loaded from: 40y.class */
public final class C40y extends C04v {
    public final byte A00;
    public final boolean A01;

    public C40y() {
        this((byte) 3, true);
    }

    public C40y(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C40y)) {
                return false;
            }
            C40y c40y = (C40y) obj;
            if (this.A00 != c40y.A00 || this.A01 != c40y.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}

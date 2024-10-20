package X;

/* renamed from: X.4Fr, reason: invalid class name */
/* loaded from: 4Fr.class */
public final class C4Fr extends C04v {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public C4Fr(String str, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4Fr)) {
                return false;
            }
            C4Fr c4Fr = (C4Fr) obj;
            if (this.A01 != c4Fr.A01 || this.A02 != c4Fr.A02 || !11T.A0O(this.A00, c4Fr.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + 1BL.A05(this.A00);
    }
}

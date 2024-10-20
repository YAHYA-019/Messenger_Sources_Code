package X;

/* renamed from: X.0r9, reason: invalid class name */
/* loaded from: 0r9.class */
public final class C0r9 extends C04v {
    public final String A00;
    public final boolean A01;

    public C0r9(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0r9)) {
                return false;
            }
            C0r9 c0r9 = (C0r9) obj;
            if (!11T.A0O(this.A00, c0r9.A00) || this.A01 != c0r9.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}

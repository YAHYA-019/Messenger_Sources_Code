package X;

/* renamed from: X.Gj0, reason: case insensitive filesystem */
/* loaded from: Gj0.class */
public final class C2611Gj0 extends C04v {
    public final long A00;
    public final String A01;
    public final boolean A02;

    public C2611Gj0(String str, long j, boolean z) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2611Gj0)) {
                return false;
            }
            C2611Gj0 c2611Gj0 = (C2611Gj0) obj;
            if (!11T.A0O(this.A01, c2611Gj0.A01) || this.A00 != c2611Gj0.A00 || this.A02 != c2611Gj0.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, 4YV.A02(this.A01)) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }
}

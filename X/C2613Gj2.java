package X;

/* renamed from: X.Gj2, reason: case insensitive filesystem */
/* loaded from: Gj2.class */
public final class C2613Gj2 extends C04v {
    public final String A00;
    public final String A01;
    public final C01i A02 = J9t.A00(this, C03i.A02, 43);
    public final boolean A03;
    public final boolean A04;

    public C2613Gj2(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A03 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2613Gj2)) {
                return false;
            }
            C2613Gj2 c2613Gj2 = (C2613Gj2) obj;
            if (!11T.A0O(this.A00, c2613Gj2.A00) || !11T.A0O(this.A01, c2613Gj2.A01) || this.A04 != c2613Gj2.A04 || this.A03 != c2613Gj2.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A01, 4YV.A02(this.A00)) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }
}

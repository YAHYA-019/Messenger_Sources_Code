package X;

/* loaded from: B5z.class */
public final class B5z extends 4MI {
    public final C1u3 A00;
    public final C1p8 A01;
    public final C1p8 A02;

    public /* synthetic */ B5z(C1u3 c1u3) {
        C1u7 c1u7 = C1u7.A08;
        C1p7 c1p7 = C1p7.A07;
        this.A00 = c1u3;
        this.A02 = c1u7;
        this.A01 = c1p7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof B5z)) {
                return false;
            }
            B5z b5z = (B5z) obj;
            if (this.A00 != b5z.A00 || !11T.A0O(this.A02, b5z.A02) || !11T.A0O(this.A01, b5z.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A05(this.A02, 1BL.A03(this.A00)));
    }
}

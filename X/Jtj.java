package X;

/* loaded from: Jtj.class */
public final class Jtj extends C04v implements MCJ {
    public final C1u3 A00;
    public final C00m A01;
    public final boolean A02;

    public Jtj(C1u3 c1u3, C00m c00m, boolean z) {
        11T.A0F(c00m, 5);
        this.A00 = c1u3;
        this.A02 = z;
        this.A01 = c00m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jtj)) {
                return false;
            }
            Jtj jtj = (Jtj) obj;
            if (this.A00 != jtj.A00 || this.A02 != jtj.A02 || !11T.A0O(this.A01, jtj.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, ((1BL.A03(this.A00) * 31 * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31);
    }
}

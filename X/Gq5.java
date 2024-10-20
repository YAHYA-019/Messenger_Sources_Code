package X;

/* loaded from: Gq5.class */
public final class Gq5 extends HDc {
    public final C00m A00;
    public final boolean A01;

    public Gq5(C00m c00m, boolean z) {
        this.A01 = z;
        this.A00 = c00m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Gq5)) {
                return false;
            }
            Gq5 gq5 = (Gq5) obj;
            if (this.A01 != gq5.A01 || !11T.A0O(this.A00, gq5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A00(this.A01 ? 1 : 0) * 31);
    }
}

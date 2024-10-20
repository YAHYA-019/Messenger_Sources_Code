package X;

/* loaded from: Jtk.class */
public final class Jtk extends C04v implements MCJ {
    public final String A00;
    public final C00m A01;
    public final boolean A02;

    public Jtk(String str, C00m c00m, boolean z) {
        11T.A0F(c00m, 4);
        this.A00 = str;
        this.A02 = z;
        this.A01 = c00m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jtk)) {
                return false;
            }
            Jtk jtk = (Jtk) obj;
            if (!11T.A0O(this.A00, jtk.A00) || this.A02 != jtk.A02 || !11T.A0O(this.A01, jtk.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, ((4YV.A02(this.A00) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31);
    }
}

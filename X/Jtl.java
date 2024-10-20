package X;

/* loaded from: Jtl.class */
public final class Jtl extends C04v implements MCK {
    public final 3Dz A00;
    public final C00m A01;

    public Jtl(3Dz r302, C00m c00m) {
        7zR.A1N(r302, c00m);
        this.A00 = r302;
        this.A01 = c00m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jtl)) {
                return false;
            }
            Jtl jtl = (Jtl) obj;
            if (this.A00 != jtl.A00 || !11T.A0O(this.A01, jtl.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00) * 31);
    }
}

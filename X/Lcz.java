package X;

/* loaded from: Lcz.class */
public final class Lcz implements MGF {
    public static final MGF A02 = Ld0.A00;
    public Object A00;
    public volatile MGF A01;

    public final Object DCA() {
        MGF mgf = this.A01;
        MGF mgf2 = A02;
        if (mgf != mgf2) {
            synchronized (this) {
                if (this.A01 != mgf2) {
                    Object DCA = this.A01.DCA();
                    this.A00 = DCA;
                    this.A01 = mgf2;
                    return DCA;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        String str = this.A01;
        if (str == A02) {
            str = 0Pz.A0j(1BJ.A00(634), String.valueOf(this.A00), ">");
        }
        return 0Pz.A0j(1BJ.A00(871), String.valueOf(str), ")");
    }
}

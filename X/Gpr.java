package X;

/* loaded from: Gpr.class */
public final class Gpr extends ETl {
    public final int A00;
    public final Object A01;

    public Gpr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01() {
        switch (this.A00) {
            case 0:
                GrD.A0A(this.A01);
                return;
            case 1:
                Gr6 gr6 = (Gr6) this.A01;
                Gr6.A00(gr6, GOq.A0p(gr6.A0M));
                return;
            case 2:
                ILS.A00((ILS) this.A01);
                return;
            case 3:
                C2476GeX c2476GeX = (C2476GeX) this.A01;
                C2476GeX.A01(c2476GeX, c2476GeX.A02);
                JNE jne = ((I2h) 1Br.A0B(c2476GeX.A0F)).A01;
                if (jne != null) {
                    jne.AEp();
                    return;
                }
                return;
            default:
                GrR.A09((GrR) this.A01);
                return;
        }
    }
}

package X;

/* loaded from: C6x.class */
public final class C6x {
    public String A00;
    public final 1Br A01 = 1BK.A0D();

    public final void A00() {
        if (this.A00 != null) {
            1UG A08 = 1BK.A08(1Br.A02(this.A01), 1BJ.A00(1396));
            if (A08.isSampled()) {
                AbF.A1N(A08, String.valueOf(this.A00));
                A08.BZL();
            }
            this.A00 = null;
        }
    }

    public final void A01(int i) {
        if (this.A00 != null) {
            1UG A08 = 1BK.A08(1Br.A02(this.A01), 1BJ.A00(1395));
            if (A08.isSampled()) {
                AbF.A1N(A08, String.valueOf(this.A00));
                4YU.A1I(A08, "action", i);
                A08.BZL();
            }
        }
    }
}

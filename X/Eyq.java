package X;

/* loaded from: Eyq.class */
public final class Eyq {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final RRB A03;

    public Eyq(String str) {
        this.A03 = new RRB(EQG.A01, str);
    }

    public final void A00() {
        if (this.A00 || this.A01) {
            return;
        }
        this.A03.A00(EQZ.A05, "auto_dismiss");
        this.A00 = true;
    }

    public final void A01() {
        if (this.A01) {
            return;
        }
        this.A03.A00(EQZ.A05, "click");
        this.A01 = true;
    }

    public final void A02() {
        if (this.A02) {
            return;
        }
        this.A03.A00(EQZ.A05, "impression");
        this.A02 = true;
    }
}

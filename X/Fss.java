package X;

/* loaded from: Fss.class */
public abstract class Fss implements GIk {
    public GGi A00;
    public boolean A01;
    public boolean A02;

    public Ejp A00() {
        Fu7 fu7;
        int i;
        if (this instanceof EEl) {
            fu7 = new Fu7((GGl) new FuD(this, 2));
            i = 7;
        } else if (this instanceof EEk) {
            fu7 = new Fu7((GGl) new FuD(this, 1));
            i = 4;
        } else if (this instanceof EEj) {
            fu7 = new Fu7(EDw.class);
            i = 3;
        } else {
            fu7 = new Fu7(EDR.class);
            i = 1;
        }
        return new Ejp(new Fta(this, i), fu7);
    }

    @Override // X.GIk
    public final Exz BfN(Object obj) {
        if (this.A01) {
            return new Exz(true, null);
        }
        GGi gGi = this.A00;
        Ejp A00 = gGi == null ? A00() : gGi.AHx(obj);
        GGi gGi2 = A00.A00;
        if (gGi2 != Ftc.A00) {
            this.A00 = gGi2;
            return new Exz(false, A00.A01);
        }
        if (!this.A02) {
            return CiY();
        }
        this.A01 = true;
        this.A00 = null;
        return new Exz(true, null);
    }

    @Override // X.GIk
    public final Exz CiY() {
        if (this.A02) {
            this.A01 = true;
        } else {
            this.A02 = true;
            this.A00 = new FtZ(this);
        }
        return BfN(null);
    }
}

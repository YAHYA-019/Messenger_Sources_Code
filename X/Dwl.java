package X;

/* loaded from: Dwl.class */
public final class Dwl extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dwl() {
        super("LazyComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        if (gl7 == null) {
            return null;
        }
        return FJ9.A01(r302, gl7, fyG);
    }
}

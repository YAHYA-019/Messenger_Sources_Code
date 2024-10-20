package X;

/* loaded from: Dwh.class */
public final class Dwh extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dwh() {
        super("NTActivityIndicatorComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        C53p A01 = C53o.A01(r302, 0);
        A01.A01.A00 = gl7.Ad0(fyG, 55, 85, 0);
        int i = 48;
        if (gl7.BCx(56, "SMALL").equals("SMALL")) {
            i = 16;
        }
        float f = i;
        A01.A0z(f);
        A01.A0l(f);
        A01.A0J();
        return A01.A01;
    }
}

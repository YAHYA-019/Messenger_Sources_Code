package X;

/* loaded from: D22.class */
public final class D22 implements 4kV {
    public final int A00;
    public final Object A01;

    public D22(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void C9B(Object obj) {
        if (this.A00 != 0) {
            5Sc r0 = (5Sc) obj;
            BJO bjo = (BJO) this.A01;
            11T.A0D(r0);
            7zP.A0N(bjo.A01).Ciz(new D8d(r0, bjo));
            return;
        }
        CLu cLu = (CLu) obj;
        BBc bBc = (BBc) this.A01;
        int i = BBc.A09;
        DHf dHf = bBc.A02;
        if (dHf == null) {
            11T.A0L("renderer");
            throw 0Q8.createAndThrow();
        }
        11T.A0D(cLu);
        dHf.CfR(cLu);
    }
}

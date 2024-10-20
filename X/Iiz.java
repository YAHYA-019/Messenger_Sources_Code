package X;

/* loaded from: Iiz.class */
public final class Iiz implements JJE {
    public final /* synthetic */ Gtj A00;

    public Iiz(Gtj gtj) {
        this.A00 = gtj;
    }

    public void CGa(JJD jjd) {
        if (jjd.BHT() == HC9.A06) {
            Iip iip = (Iip) jjd;
            Gtj gtj = this.A00;
            synchronized (gtj) {
                if (gtj.A05) {
                    gtj.A01 = iip.A00;
                }
            }
        }
    }

    public void Ctv(JLR jlr) {
    }
}

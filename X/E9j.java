package X;

/* loaded from: E9j.class */
public final class E9j extends C66m {
    public final /* synthetic */ FFe A00;

    public E9j(FFe fFe) {
        this.A00 = fFe;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        11T.A0F(c66i, 0);
        if (c66i.A09.A00 == 0.0d) {
            this.A00.A01 = 0;
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        11T.A0F(c66i, 0);
        FFe fFe = this.A00;
        fFe.A00 = (float) c66i.A09.A00;
        fFe.A0B.CMT();
    }
}

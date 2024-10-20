package X;

/* loaded from: H08.class */
public final class H08 extends C66m {
    public boolean A00;
    public final C66m A01;
    public final C66m A02;
    public final /* synthetic */ H4C A03;

    public H08(H4C h4c) {
        this.A03 = h4c;
        this.A02 = new H07(h4c);
        this.A01 = new H06(h4c);
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        11T.A0F(c66i, 0);
        (this.A00 ? this.A01 : this.A02).CMR(c66i);
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        11T.A0F(c66i, 0);
        (this.A00 ? this.A01 : this.A02).CMV(c66i);
    }
}

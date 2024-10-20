package X;

/* loaded from: Iep.class */
public final class Iep implements InterfaceC01073pn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RQJ A01;
    public final /* synthetic */ Hjy A02;

    public Iep(RQJ rqj, Hjy hjy, int i) {
        this.A02 = hjy;
        this.A00 = i;
        this.A01 = rqj;
    }

    @Override // X.InterfaceC01073pn
    public void BxV() {
        RQJ rqj = this.A01;
        if (rqj != null) {
            1BK.A1E(this.A02.A01).execute(new IuP(rqj));
        }
    }

    @Override // X.InterfaceC01073pn
    public void COO(long j) {
        Hjy hjy = this.A02;
        1BK.A1E(hjy.A01).execute(new J2P(this.A01, hjy, this.A00, j));
    }
}

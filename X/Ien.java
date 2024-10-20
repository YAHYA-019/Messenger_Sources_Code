package X;

/* loaded from: Ien.class */
public final class Ien implements InterfaceC01073pn {
    public final /* synthetic */ JDg A00;

    public Ien(JDg jDg) {
        this.A00 = jDg;
    }

    @Override // X.InterfaceC01073pn
    public void BxV() {
        IlH ilH = this.A00;
        ilH.A01.sendFailureCallback();
        1hD r0 = (1hD) 1Br.A0B(ilH.A00.A02);
        1hD.A01(r0, new C2xl(r0, 48));
    }

    @Override // X.InterfaceC01073pn
    public void COO(long j) {
        IlH ilH = this.A00;
        ilH.A01.sendSuccessCallback();
        1hD r0 = (1hD) 1Br.A0B(ilH.A00.A02);
        1hD.A01(r0, new C2xl(r0, 49));
    }
}

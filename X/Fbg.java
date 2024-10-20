package X;

/* loaded from: Fbg.class */
public final class Fbg implements GHb {
    public final /* synthetic */ EzC A00;
    public final /* synthetic */ GHc A01;

    public Fbg(EzC ezC, GHc gHc) {
        this.A00 = ezC;
        this.A01 = gHc;
    }

    @Override // X.GHb
    public void COR(EOp eOp) {
        this.A00.A02(eOp);
        this.A01.COR(eOp);
    }

    @Override // X.GHb
    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        this.A01.onFailure(th);
    }
}

package X;

/* loaded from: Fbh.class */
public final class Fbh implements GHc {
    public final /* synthetic */ ExQ A00;

    public Fbh(ExQ exQ) {
        this.A00 = exQ;
    }

    @Override // X.GHc
    public void COR(EOp eOp) {
        ExQ exQ = this.A00;
        synchronized (this) {
            exQ.A00(eOp);
        }
    }

    @Override // X.GHc
    public void onFailure(Throwable th) {
    }
}

package X;

/* loaded from: Fx5.class */
public final class Fx5 implements GH6 {
    public DLQ A00;
    public final GHC A01;

    public Fx5(GHC ghc) {
        this.A01 = ghc;
    }

    @Override // X.GH6
    public boolean DA1(DLQ dlq) {
        if (!this.A01.D49(dlq)) {
            return false;
        }
        this.A00 = dlq;
        return true;
    }
}

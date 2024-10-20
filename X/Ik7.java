package X;

/* loaded from: Ik7.class */
public final class Ik7 implements JH6 {
    public IEP A00;
    public JJI A01;

    public Ik7(IEP iep, JJI jji) {
        this.A00 = iep;
        this.A01 = jji;
    }

    @Override // X.JH6
    public JJJ AIw(I9d i9d, boolean z) {
        return z ? new Ik3() : new Ik2(i9d, this.A00, this.A01);
    }
}

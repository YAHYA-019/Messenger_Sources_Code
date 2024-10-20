package X;

/* loaded from: Ik2.class */
public final class Ik2 implements JJJ {
    public Hcf A00 = new Object();
    public final I9d A01;
    public final IEP A02;
    public final JJI A03;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Hcf] */
    public Ik2(I9d i9d, IEP iep, JJI jji) {
        this.A02 = iep;
        this.A03 = jji;
        this.A01 = i9d;
        HAy hAy = HAy.A03;
        if (i9d != null && i9d.A08(hAy) != null && i9d.A08(hAy).size() > 1 && !jji.BND()) {
            throw new IllegalArgumentException("FrameRender should have media graph support for MediaComposition", new Throwable());
        }
    }

    @Override // X.JJJ
    public JN9 AJT() {
        return new Ijy(this);
    }

    @Override // X.JJJ
    public JNR AJi() {
        return new Ik1(this);
    }
}

package X;

/* loaded from: Dxp.class */
public final class Dxp extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxp() {
        super("NativeTemplatesForEachChildComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QNx A0P = 4YU.A0P(r302);
        FyG fyG = this.A01;
        GL7 gl7 = A0P.A01;
        A0P.A00.A00 = r302;
        return FJ9.A01(r302, gl7, fyG);
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.Rsy, X.GFF] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNx qNx = (QNx) r303;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        ?? obj = new Object();
        ((Rsy) obj).A00 = r302;
        FJ3.A02(fyG).A00 = obj;
        qNx.A01 = gl7;
        qNx.A00 = obj;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

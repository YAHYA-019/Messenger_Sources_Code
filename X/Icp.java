package X;

/* loaded from: Icp.class */
public final class Icp implements JIm {
    public static final HJR A02 = new Object();
    public final I1d A00;
    public final boolean A01;

    public Icp(I1d i1d, boolean z) {
        this.A00 = i1d;
        this.A01 = z;
    }

    @Override // X.JIm
    public /* bridge */ /* synthetic */ JQ5 AKi() {
        return new Gu4(this.A00, this.A01);
    }

    @Override // X.JIm
    public HJR Asf() {
        return A02;
    }
}

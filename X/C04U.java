package X;

/* renamed from: X.04U, reason: invalid class name */
/* loaded from: 04U.class */
public final class C04U implements C0gi {
    public C0gi A00;
    public final 0gK A01;
    public final /* synthetic */ C0hg A02;
    public final /* synthetic */ 0pJ A03;

    public C04U(C0hg c0hg, 0pJ r303) {
        this.A03 = r303;
        this.A02 = c0hg;
        this.A01 = c0hg.A06();
    }

    private C0gi A00() {
        C0gi c0gi;
        synchronized (this) {
            if (this.A00 == null) {
                C0hr c0hr = (C0hr) this.A01.A07(C0hr.class);
                if (c0hr != null) {
                    this.A00 = c0hr.A0A;
                }
            }
            c0gi = this.A00;
        }
        return c0gi;
    }

    @Override // X.C0gi
    public void CDz() {
        C0gi A00 = A00();
        if (A00 != null) {
            A00.CDz();
        }
    }

    @Override // X.C0gi
    public void CE0() {
        C0gi A00 = A00();
        if (A00 != null) {
            A00.CE0();
        }
    }

    @Override // X.C0gi
    public void CLa() {
        C0gi A00 = A00();
        if (A00 != null) {
            A00.CLa();
        }
    }

    @Override // X.C0gi
    public void onSigquit() {
        C0gi A00 = A00();
        if (A00 != null) {
            A00.onSigquit();
        }
    }
}

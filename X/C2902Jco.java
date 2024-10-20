package X;

/* renamed from: X.Jco, reason: case insensitive filesystem */
/* loaded from: Jco.class */
public final class C2902Jco extends LPR implements MNa, MNS {
    public static final KTx A02 = new Object();
    public boolean A00;
    public MKq A01;

    public static final void A00(C2902Jco c2902Jco) {
        C2901Jcm c2901Jcm;
        MKq mKq = c2902Jco.A01;
        if (mKq != null && mKq.BQl() && ((LPR) c2902Jco).A08) {
            MNa A00 = L5f.A00(c2902Jco, C2901Jcm.A02);
            if (!(A00 instanceof C2901Jcm) || (c2901Jcm = (C2901Jcm) A00) == null) {
                return;
            }
            c2901Jcm.A0H(c2902Jco.A01);
        }
    }

    @Override // X.MNa
    public Object BGy() {
        return A02;
    }

    public void C0m(MKq mKq) {
        C2901Jcm c2901Jcm;
        this.A01 = mKq;
        if (this.A00) {
            if (mKq.BQl()) {
                A00(this);
                return;
            }
            if (((LPR) this).A08) {
                MNa A00 = L5f.A00(this, C2901Jcm.A02);
                if (!(A00 instanceof C2901Jcm) || (c2901Jcm = (C2901Jcm) A00) == null) {
                    return;
                }
                c2901Jcm.A0H(null);
            }
        }
    }
}

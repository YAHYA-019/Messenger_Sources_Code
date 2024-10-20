package X;

/* loaded from: Bzy.class */
public final class Bzy {
    public final /* synthetic */ B2q A00;

    public Bzy(B2q b2q) {
        this.A00 = b2q;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.B2q, androidx.fragment.app.Fragment, X.B2z] */
    public void A00() {
        Qtg qtg;
        ?? r0 = this.A00;
        1G2 r02 = B2q.A0x;
        C00i c00i = r0.A0j;
        String A0A = AbM.A0n(c00i).A0A();
        if (A0A == null) {
            qtg = Qtg.A03;
        } else {
            qtg = Qtg.A03;
            Qtg A00 = C0e1.A00(Qtg.class, A0A);
            if (A00 != null) {
                qtg = A00;
            }
        }
        if (!r0.isAdded()) {
            AbM.A0n(c00i).A0C(r0.A0m);
            r0.A0K = false;
        } else {
            if (qtg != Qtg.A02 || r0.A0K) {
                return;
            }
            r0.A1d();
        }
    }
}

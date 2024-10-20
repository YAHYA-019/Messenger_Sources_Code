package X;

/* loaded from: Cpn.class */
public final class Cpn implements DFd {
    public final /* synthetic */ AcQ A00;

    public Cpn(AcQ acQ) {
        this.A00 = acQ;
    }

    @Override // X.DFd
    public /* bridge */ /* synthetic */ void C4p(Object obj, boolean z) {
        boolean z2;
        AcQ acQ = this.A00;
        if (1JF.A0A(acQ.A0f)) {
            return;
        }
        acQ.A0m = !z;
        AcQ.A0L(acQ);
        if (acQ.A1Z() != null) {
            C1320Ady c1320Ady = acQ.A1Z().A01;
            synchronized (c1320Ady) {
                z2 = c1320Ady.A07;
            }
            acQ.A0n = z2;
        }
    }
}

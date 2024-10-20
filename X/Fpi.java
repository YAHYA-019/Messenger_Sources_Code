package X;

/* loaded from: Fpi.class */
public final class Fpi implements DGN {
    public final /* synthetic */ FpI A00;

    public Fpi(FpI fpI) {
        this.A00 = fpI;
    }

    public void CGq(boolean z) {
        FpI fpI = this.A00;
        if (!z) {
            fpI.A03.Ccf(fpI.A04, "bot subscription query failed", "NETWORK_FAILURE");
            return;
        }
        GKb gKb = fpI.A03;
        String str = fpI.A04;
        fpI.A01.A03.get();
        gKb.Ci7(str, AnonymousClass001.A12());
    }
}

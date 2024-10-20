package X;

/* loaded from: Lqs.class */
public final class Lqs implements Runnable {
    public static final String __redex_internal_original_name = "ConnectionControllerImpl$11";
    public final /* synthetic */ LVb A00;
    public final /* synthetic */ KlR A01;
    public final /* synthetic */ L4I A02;
    public final /* synthetic */ Qnp A03;
    public final /* synthetic */ boolean A04;

    public Lqs(LVb lVb, KlR klR, L4I l4i, Qnp qnp, boolean z) {
        this.A00 = lVb;
        this.A02 = l4i;
        this.A03 = qnp;
        this.A01 = klR;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        L4I l4i;
        LVb lVb = this.A00;
        synchronized (lVb.A0P) {
            LVZ lvz = lVb.A0H;
            l4i = this.A02;
            Qnp qnp = this.A03;
            KlR klR = this.A01;
            lvz.C4a(l4i, qnp, klR != null ? klR.A03 : null, this.A04);
        }
        lVb.A0M.markerEnd(8716324, AbM.A05(Integer.valueOf(lVb.A0C), l4i), (short) 2);
    }
}

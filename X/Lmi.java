package X;

/* loaded from: Lmi.class */
public final class Lmi implements Runnable {
    public static final String __redex_internal_original_name = "WorkForegroundRunnable$1";
    public final /* synthetic */ JRq A00;
    public final /* synthetic */ C4Ks A01;

    public Lmi(JRq jRq, C4Ks c4Ks) {
        this.A00 = jRq;
        this.A01 = c4Ks;
    }

    @Override // java.lang.Runnable
    public void run() {
        JRq jRq = this.A00;
        C4Ks c4Ks = jRq.A04;
        if (c4Ks.isCancelled()) {
            return;
        }
        try {
            KtB ktB = (KtB) this.A01.get();
            if (ktB == null) {
                throw 0Pz.A07("Worker was marked important (", jRq.A03.A0I, ") but did not provide ForegroundInfo");
            }
            4IS.A00().A02(JRq.A06, 0Pz.A0W("Updating notification for ", jRq.A03.A0I));
            c4Ks.A05(jRq.A01.Cp2(jRq.A00, ktB, jRq.A02.mWorkerParams.A09));
        } catch (Throwable th) {
            c4Ks.A07(th);
        }
    }
}

package X;

/* loaded from: Ipl.class */
public final class Ipl implements Runnable {
    public static final String __redex_internal_original_name = "SubmitAllPrefetchExecutor$clearQueue$1";
    public final /* synthetic */ Ha4 A00;

    public Ipl(Ha4 ha4) {
        this.A00 = ha4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5L4 r0 = (5L4) this.A00.A01.get();
        if (r0 != null) {
            5NA.A03("cancelPrefetchForTag: %s", new Object[]{"GlobalPrefetch"});
            5Mo r02 = r0.A07;
            r02.A03.A01(new HrP(r02), "CANCELED_FOR_TAG");
            0fH.A0j("GlobalPrefetchExecutor", "clearQueue");
        }
    }
}

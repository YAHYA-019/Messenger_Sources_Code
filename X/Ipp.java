package X;

/* loaded from: Ipp.class */
public final class Ipp implements Runnable {
    public static final String __redex_internal_original_name = "LocationSharingPresenter$3";
    public final /* synthetic */ C2375GbC A00;

    public Ipp(C2375GbC c2375GbC) {
        this.A00 = c2375GbC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.JOe, java.lang.Object] */
    @Override // java.lang.Runnable
    public void run() {
        C2375GbC c2375GbC = this.A00;
        if (((HZX) c2375GbC).A00) {
            c2375GbC.A01.CXQ(new Object(), c2375GbC.A0C);
            c2375GbC.A00.postDelayed(this, 5000L);
        }
    }
}

package X;

/* loaded from: D7l.class */
public final class D7l implements Runnable {
    public static final String __redex_internal_original_name = "MessengerPointOfInterestRepository$2";
    public final /* synthetic */ JOe A00;
    public final /* synthetic */ ChJ A01;

    public D7l(JOe jOe, ChJ chJ) {
        this.A01 = chJ;
        this.A00 = jOe;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.onSuccess();
    }
}

package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* loaded from: Ipn.class */
public final class Ipn implements Runnable {
    public static final String __redex_internal_original_name = "LocationSharingPresenter$1";
    public final /* synthetic */ C2375GbC A00;

    public Ipn(C2375GbC c2375GbC) {
        this.A00 = c2375GbC;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2375GbC c2375GbC = this.A00;
        if (((HZX) c2375GbC).A00) {
            AbstractC2376GbD.A06(c2375GbC, Long.valueOf(System.currentTimeMillis()), "CURRENT_TIME_UPDATED");
            LiveLocationSession liveLocationSession = C2375GbC.A00(c2375GbC).A03;
            if (liveLocationSession != null && !HHd.A00(liveLocationSession)) {
                C2375GbC.A02(c2375GbC, liveLocationSession, false);
            }
            c2375GbC.A00.postDelayed(this, 10000L);
        }
    }
}

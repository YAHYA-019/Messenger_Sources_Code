package X;

import com.facebook.locationsharing.core.models.LocationSharingPresenterState;

/* loaded from: Ipq.class */
public final class Ipq implements Runnable {
    public static final String __redex_internal_original_name = "LocationSharingPresenter$4";
    public final /* synthetic */ C2375GbC A00;

    public Ipq(C2375GbC c2375GbC) {
        this.A00 = c2375GbC;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2375GbC c2375GbC = this.A00;
        if (((HZX) c2375GbC).A00) {
            LocationSharingPresenterState A00 = C2375GbC.A00(c2375GbC);
            ((AbstractC2370Gb7) ((AbstractC2376GbD) c2375GbC).A02).A0C(A00.A03, A00.A09, c2375GbC.A0C);
            c2375GbC.A00.postDelayed(this, 10000L);
        }
    }
}

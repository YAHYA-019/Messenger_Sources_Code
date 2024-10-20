package X;

import com.facebook.locationsharing.core.models.Location;

/* loaded from: Ipo.class */
public final class Ipo implements Runnable {
    public static final String __redex_internal_original_name = "LocationSharingPresenter$2";
    public final /* synthetic */ C2375GbC A00;

    public Ipo(C2375GbC c2375GbC) {
        this.A00 = c2375GbC;
    }

    @Override // java.lang.Runnable
    public void run() {
        Location location;
        C2375GbC c2375GbC = this.A00;
        if (!((HZX) c2375GbC).A00 || (location = C2375GbC.A00(c2375GbC).A05) == null) {
            return;
        }
        c2375GbC.A07.AVw(new IM6(this, 0), location.A00, location.A01);
    }
}

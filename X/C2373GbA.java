package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.GbA, reason: case insensitive filesystem */
/* loaded from: GbA.class */
public final class C2373GbA extends 7VY {
    public final /* synthetic */ C2375GbC A00;

    public C2373GbA(C2375GbC c2375GbC) {
        this.A00 = c2375GbC;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
        C2375GbC c2375GbC = this.A00;
        if (((HZX) c2375GbC).A00) {
            if (liveLocationSession != null) {
                AbstractC2376GbD.A06(c2375GbC, liveLocationSession, "LIVE_LOCATION_STARTED");
                ((AbstractC2370Gb7) ((AbstractC2376GbD) c2375GbC).A02).A0A(liveLocationSession);
            } else {
                LiveLocationSession liveLocationSession2 = C2375GbC.A00(c2375GbC).A03;
                if (liveLocationSession2 == null) {
                    AbstractC2376GbD.A06(c2375GbC, null, "LIVE_LOCATION_STOPPED");
                } else {
                    C2375GbC.A02(c2375GbC, liveLocationSession2, false);
                }
            }
            ((AbstractC2370Gb7) ((AbstractC2376GbD) c2375GbC).A02).A0C(liveLocationSession, C2375GbC.A00(c2375GbC).A09, c2375GbC.A0C);
        }
    }

    public void onError(Throwable th) {
        C2375GbC.A03(this.A00, th);
    }
}

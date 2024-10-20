package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.livelocation.bindings.LiveLocationForegroundService;

/* loaded from: HrX.class */
public final class HrX {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ LiveLocationForegroundService A01;

    public HrX(FbUserSession fbUserSession, LiveLocationForegroundService liveLocationForegroundService) {
        this.A01 = liveLocationForegroundService;
        this.A00 = fbUserSession;
    }

    public void A00() {
        0fH.A0j("LiveLocationForegroundService", "onStarted");
        5HS r0 = (5HS) 4YU.A0p(this.A01.A00);
        1Bn.A0E((Context) null, r0.A00, 85096);
        5HS.A00(r0, 0S2.A01);
    }

    public void A01() {
        0fH.A0j("LiveLocationForegroundService", "onStopped");
        0Df r0 = this.A01;
        0fH.A0j("LiveLocationForegroundService", "stop service");
        try {
            try {
                C08o.A05(r0);
            } catch (Exception e) {
                0fH.A0s("LiveLocationForegroundService", "Failed to stop service.", e);
            }
        } finally {
            r0.stopSelf();
        }
    }
}

package X;

import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;

/* loaded from: Hyb.class */
public final class Hyb {
    public final BroadcastFlowIntentModel A00;
    public final String A01;
    public final Throwable A02;

    public Hyb(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        this.A00 = broadcastFlowIntentModel;
        this.A01 = null;
        this.A02 = null;
    }

    public Hyb(String str, Throwable th) {
        this.A01 = str;
        this.A02 = th;
        this.A00 = null;
    }
}

package X;

import com.facebook.messaging.sharing.broadcastflow.BroadcastFlowActivity;

/* loaded from: Ct6.class */
public final class Ct6 implements DHW {
    public final /* synthetic */ BroadcastFlowActivity A00;

    public Ct6(BroadcastFlowActivity broadcastFlowActivity) {
        this.A00 = broadcastFlowActivity;
    }

    public void BO7() {
        C5fi.A00(this.A00);
    }

    public void close() {
        BroadcastFlowActivity broadcastFlowActivity = this.A00;
        C5fi.A00(broadcastFlowActivity);
        broadcastFlowActivity.finishAffinity();
    }
}

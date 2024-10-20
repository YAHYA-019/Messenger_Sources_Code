package X;

import android.os.BaseBundle;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* loaded from: Csd.class */
public final class Csd implements DFq {
    public static final NavigationTrigger A01 = NavigationTrigger.A03("send_as_message");
    public final C00i A00 = 1BQ.A00();

    public static String A00(BaseBundle baseBundle, String str) {
        return baseBundle.getString(0Pz.A0j("share_tam_xma_meta", "_", str));
    }

    public static String A01(BaseBundle baseBundle, String str) {
        if (baseBundle.containsKey(str)) {
            return baseBundle.getString(str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (r316 == null) goto L25;
     */
    @Override // X.DFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel AHz(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Csd.AHz(android.os.Bundle):com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel");
    }
}

package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.210, reason: invalid class name */
/* loaded from: 210.class */
public final class AnonymousClass210 implements 1Uc {
    public final C20w A00;

    public AnonymousClass210(C20w c20w) {
        this.A00 = c20w;
    }

    public void onNewNotification(String str, 1Xv r303, java.util.Map map) {
        C20p c20p = this.A00.A00;
        C29y c29y = (C29y) c20p.A08.A00.get();
        if (C29y.A00(c29y)) {
            for (1Tw r0 : c29y.A02) {
                0fH.A0j("MessengerColdStartThreadViewTTRCTracker", "onArmadilloACTSyncComplete");
                r0.A00("on_armadillo_act_sync_complete");
            }
        }
        List list = ((C29u) c20p.A05.A00.get()).A00;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1gp) it.next()).BhB();
            }
        }
    }
}

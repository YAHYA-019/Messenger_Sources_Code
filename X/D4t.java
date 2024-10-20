package X;

import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;

/* loaded from: D4t.class */
public final class D4t implements GHF {
    public final C0dr A00;
    public final CJ8 A01;

    public D4t(C0dr c0dr, CJ8 cj8) {
        this.A01 = cj8;
        this.A00 = c0dr;
    }

    public void ARF(FFD ffd, DLG dlg) {
        int intValue = dlg.A02(ffd).intValue();
        if (intValue != 0) {
            if (intValue == 2) {
                Object obj = ffd.A02;
                BroadcastFlowMnetItem broadcastFlowMnetItem = (BroadcastFlowMnetItem) obj;
                0fH.A0g(broadcastFlowMnetItem.toString(), "BroadcastFlowViewpointAction", "log impression ends: %s");
                this.A01.A01(AbH.A13(this.A00), obj, BWE.A00(broadcastFlowMnetItem));
                return;
            }
            return;
        }
        Object obj2 = ffd.A02;
        BroadcastFlowMnetItem broadcastFlowMnetItem2 = (BroadcastFlowMnetItem) obj2;
        0fH.A0g(broadcastFlowMnetItem2.toString(), "BroadcastFlowViewpointAction", "log impression starts: %s");
        CJ8 cj8 = this.A01;
        String A00 = BWE.A00(broadcastFlowMnetItem2);
        Long A13 = AbH.A13(this.A00);
        Integer A0h = 7zN.A0h();
        cj8.A04(A0h, A0h, A13, obj2, A00);
    }
}

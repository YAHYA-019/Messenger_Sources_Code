package X;

import android.view.View;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: D07.class */
public final class D07 implements AZg {
    public D4t A00;
    public FFj A01;
    public WeakHashMap A02;

    @Override // X.AZg
    public /* bridge */ /* synthetic */ void Ccd(View view, Object obj) {
        BHe bHe = (BHe) obj;
        FFj fFj = this.A01;
        if (fFj == null || bHe == null) {
            return;
        }
        WeakHashMap weakHashMap = this.A02;
        FFD ffd = (FFD) weakHashMap.get(BWE.A00(bHe.A00));
        if (ffd == null) {
            BroadcastFlowMnetItem broadcastFlowMnetItem = bHe.A00;
            if (broadcastFlowMnetItem == null || BWE.A00(broadcastFlowMnetItem) == null) {
                ffd = FFD.A05;
            } else {
                BroadcastFlowMnetItem broadcastFlowMnetItem2 = bHe.A00;
                String A00 = BWE.A00(broadcastFlowMnetItem2);
                FFD ffd2 = FFD.A05;
                D4t d4t = this.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add(d4t);
                ffd = new FFD(ffd2, broadcastFlowMnetItem2, (Object) null, A00, A0s);
            }
            weakHashMap.put(BWE.A00(bHe.A00), ffd);
        }
        fFj.A03(view, ffd);
    }

    @Override // X.AZg
    public void D69(View view) {
        FFj fFj = this.A01;
        if (fFj != null) {
            fFj.A02(view);
        }
    }
}

package X;

import java.util.Iterator;

/* loaded from: G0d.class */
public final class G0d implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverSDKController$1$2";
    public final /* synthetic */ Efs A00;

    public G0d(Efs efs) {
        this.A00 = efs;
    }

    @Override // java.lang.Runnable
    public void run() {
        FJB fjb = this.A00.A00;
        FJB.A00(fjb).A0C("sdk_info_failed");
        fjb.A05 = 0S2.A0N;
        Iterator it = fjb.A0C.iterator();
        while (it.hasNext()) {
            FJB.A06(fjb, AnonymousClass001.A0i(it), "Failed to fetch required information for sdk initialization.", "NETWORK_FAILURE");
        }
        fjb.A0C.clear();
        GIU giu = fjb.A00;
        if (giu != null) {
            giu.CIW();
        }
    }
}

package X;

import android.util.Pair;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Iterator;
import java.util.List;

/* loaded from: G0i.class */
public final class G0i implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverSDKController$5";
    public final /* synthetic */ FJB A00;

    public G0i(FJB fjb) {
        this.A00 = fjb;
    }

    @Override // java.lang.Runnable
    public void run() {
        FJB fjb = this.A00;
        List list = fjb.A0B;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FJB.A06(fjb, (String) ((Pair) it.next()).first, "Failed to fetch player data", "NETWORK_FAILURE");
        }
        list.clear();
        List list2 = fjb.A0A;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            FJB.A06(fjb, (String) ((Pair) it2.next()).first, "Failed to fetch player data", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        }
        list2.clear();
    }
}

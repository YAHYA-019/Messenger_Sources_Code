package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;

/* loaded from: A1o.class */
public final class A1o implements 7yG {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ List A01;

    public A1o(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = list;
    }

    public final void CHG(L1w l1w, ENg eNg, java.util.Map map) {
        int i = l1w.A00;
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        if (i != 0) {
            inAppPurchaseControllerCoro.A0P(ENg.A0B, this.A01, C50m.A00(l1w));
        } else {
            inAppPurchaseControllerCoro.A0L(l1w, this.A01);
        }
    }
}

package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: A1p.class */
public final class A1p implements AZc {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ java.util.Map A02;
    public final /* synthetic */ boolean A03;

    public A1p(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, java.util.Map map, boolean z) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = list;
        this.A02 = map;
        this.A03 = z;
    }

    @Override // X.AZc
    public void Bxp(Throwable th, List list) {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        inAppPurchaseControllerCoro.A09.A0D(th, this.A01, null);
        InAppPurchaseControllerCoro.A0J(inAppPurchaseControllerCoro, ENg.A0E);
    }

    @Override // X.AZc
    public void COz(8JE r302, List list, List list2) {
        if (list.isEmpty() || !list2.isEmpty()) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            inAppPurchaseControllerCoro.A09.A0D(null, this.A01, list2);
            InAppPurchaseControllerCoro.A0J(inAppPurchaseControllerCoro, ENg.A0I);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A00;
        C50m c50m = inAppPurchaseControllerCoro2.A09;
        List list3 = this.A01;
        java.util.Map map = this.A02;
        11T.A0F(map, 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            8Lq r0 = (8Lq) it.next();
            03W r312 = (java.util.Map) map.get(r0.A04);
            if (r312 == null) {
                r312 = 7zM.A1F();
            }
            LinkedHashMap A06 = 04R.A06(r312);
            A06.put("dcp_order_id", r0.A02);
            c50m.A00.BZX(A06, null, "client_verify_dcppayment_success");
        }
        if (!this.A03) {
            inAppPurchaseControllerCoro2.A0N(new 9YI(inAppPurchaseControllerCoro2, map), list3, list, map);
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            8Lq r02 = (8Lq) it2.next();
            AZb aZb = inAppPurchaseControllerCoro2.A01;
            if (aZb != null) {
                aZb.CEv(r02);
            }
        }
        C7Zk c7Zk = inAppPurchaseControllerCoro2.A06;
        c7Zk.A02.flowEndSuccess(c7Zk.A00);
    }
}

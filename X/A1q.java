package X;

import com.android.billingclient.api.Purchase;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: A1q.class */
public final class A1q implements AZc {
    public final /* synthetic */ L1w A00;
    public final /* synthetic */ InAppPurchaseControllerCoro A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ java.util.Map A04;

    public A1q(L1w l1w, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2, java.util.Map map) {
        this.A01 = inAppPurchaseControllerCoro;
        this.A04 = map;
        this.A02 = list;
        this.A03 = list2;
        this.A00 = l1w;
    }

    @Override // X.AZc
    public void Bxp(Throwable th, List list) {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A01;
        ENg eNg = ENg.A08;
        List list2 = this.A02;
        LinkedHashMap A1C = 1BK.A1C();
        FHZ.A03(th, A1C);
        inAppPurchaseControllerCoro.A0P(eNg, list2, A1C);
    }

    @Override // X.AZc
    public void COz(8JE r302, List list, List list2) {
        if (list2.isEmpty()) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A01;
            C50m c50m = inAppPurchaseControllerCoro.A09;
            java.util.Map map = this.A04;
            11T.A0F(map, 0);
            Iterator A1A = 1BK.A1A(map);
            while (A1A.hasNext()) {
                c50m.A00.BZX((java.util.Map) A1A.next(), null, "client_verify_dcppayment_success");
            }
            List list3 = this.A02;
            11T.A0F(list3, 0);
            inAppPurchaseControllerCoro.A0N(null, list3, list, map);
            inAppPurchaseControllerCoro.A0P(ENg.A0J, list3, null);
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list2) {
            String str = ((8Ju) obj).A01;
            if (str != null && str.length() != 0) {
                A0s.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(A0s));
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((8Ju) next).A01, next);
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A01;
        java.util.Map map2 = this.A04;
        Iterator A0x = AnonymousClass001.A0x(linkedHashMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            C50m c50m2 = inAppPurchaseControllerCoro2.A09;
            Object key = A0z.getKey();
            11T.A0F(map2, 1);
            c50m2.A00.BZX((java.util.Map) map2.get(key), null, 4YT.A00(970));
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            A0s2.add(it2.next());
        }
        List list4 = this.A02;
        ArrayList A0s3 = AnonymousClass001.A0s();
        for (Object obj2 : list4) {
            if (!linkedHashMap.containsKey(((Purchase) obj2).A01())) {
                A0s3.add(obj2);
            }
        }
        Iterator it3 = A0s3.iterator();
        while (it3.hasNext()) {
            Purchase purchase = (Purchase) it3.next();
            C50m c50m3 = inAppPurchaseControllerCoro2.A09;
            String A01 = purchase.A01();
            11T.A0F(map2, 1);
            c50m3.A00.BZX((java.util.Map) map2.get(A01), null, "client_verify_dcppayment_success");
        }
        LinkedHashMap A1C = 1BK.A1C();
        Iterator A0x2 = AnonymousClass001.A0x(linkedHashMap);
        while (A0x2.hasNext()) {
            AnonymousClass001.A0z(A0x2).getValue();
        }
        Set keySet = A1C.keySet();
        ArrayList A0s4 = AnonymousClass001.A0s();
        for (Object obj3 : list4) {
            if (keySet.contains(((Purchase) obj3).A01())) {
                A0s4.add(obj3);
            }
        }
        if (A0s3.size() == this.A03.size() || A0s4.size() == list2.size()) {
            11T.A0F(map2, 2);
            inAppPurchaseControllerCoro2.A0N(null, list4, list, map2);
            inAppPurchaseControllerCoro2.A0P(ENg.A0J, list4, null);
            return;
        }
        if (7zM.A1b(A0s4)) {
            inAppPurchaseControllerCoro2.A0N(null, A0s4, list, map2);
        }
        inAppPurchaseControllerCoro2.A0N(null, A0s3, list, map2);
        ENg eNg = ENg.A0I;
        L1w l1w = this.A00;
        LinkedHashMap A1C2 = 1BK.A1C();
        FHZ.A02("Server verification returned failed purchases", A1C2);
        LinkedHashMap A06 = 04R.A06(A1C2);
        LinkedHashMap A1C3 = 1BK.A1C();
        JSONObject A12 = AnonymousClass001.A12();
        int i = 0;
        for (Object obj4 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            try {
                A12.put(String.valueOf(i), obj4);
            } catch (JSONException e) {
                0fH.A0r("DCP", "Failed writing Purchase Error to JSON", e);
            }
            i = i2;
        }
        A1C3.put("purchase_errors", 11T.A02(A12));
        A06.putAll(A1C3);
        if (l1w != null) {
            A06.putAll(C50m.A01(l1w, list4));
        }
        inAppPurchaseControllerCoro2.A0P(eNg, list4, A06);
    }
}

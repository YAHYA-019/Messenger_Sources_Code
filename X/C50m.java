package X;

import com.android.billingclient.api.Purchase;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* renamed from: X.50m, reason: invalid class name */
/* loaded from: 50m.class */
public final class C50m {
    public final C50k A00;

    public C50m(C50k c50k) {
        11T.A0F(c50k, 1);
        this.A00 = c50k;
    }

    public static final LinkedHashMap A00(L1w l1w) {
        String str = l1w.A01;
        11T.A0A(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FHZ.A02(str, linkedHashMap);
        FHZ.A00(l1w, linkedHashMap);
        return linkedHashMap;
    }

    public static final LinkedHashMap A01(L1w l1w, Collection collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("item_count", String.valueOf(collection.size()));
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            if (i < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            Purchase purchase = (Purchase) obj;
            linkedHashMap.put(0Pz.A0d("item_", "_external_transaction_id", i), purchase.A01());
            linkedHashMap.put(0Pz.A0d("item_", "_external_product_id", i), C7lg.A00(purchase));
            String A0d = 0Pz.A0d("item_", "_external_purchase_time", i);
            JSONObject jSONObject = purchase.A02;
            linkedHashMap.put(A0d, 0Pz.A0U("", jSONObject.optLong("purchaseTime")));
            linkedHashMap.put(0Pz.A0d("item_", "_external_purchase_signature", i), purchase.A01);
            linkedHashMap.put(0Pz.A0d("item_", "_developer_payload", i), jSONObject.optString("developerPayload"));
            linkedHashMap.put(0Pz.A0d("item_", "_external_purchase_token", i), purchase.A02());
            linkedHashMap.put(0Pz.A0d("item_", "_request_id", i), purchase.A01());
            i = i2;
        }
        FHZ.A00(l1w, linkedHashMap);
        return linkedHashMap;
    }

    public static final LinkedHashMap A02(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            String str = EPP.A0V.value;
            ArrayList arrayList = new ArrayList(C1A3.A1D(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A02 = ((Purchase) it.next()).A02();
                11T.A0A(A02);
                arrayList.add(A02);
            }
            linkedHashMap.put(str, arrayList);
        }
        return linkedHashMap;
    }

    public LinkedHashMap A03(C50q c50q, String str, List list, boolean z) {
        11T.A0F(str, 0);
        LinkedHashMap A1C = 1BK.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            LinkedHashMap A06 = 04R.A06(this.A00.B5U(null, purchase, z));
            A06.put("product_type", str);
            String A00 = C7lg.A00(purchase);
            11T.A0F(A00, 0);
            Object obj = c50q.A00.get(A00);
            if (obj != null) {
                A06.put(C7lg.A00(purchase), obj.toString());
            }
            String A02 = purchase.A02();
            11T.A0A(A02);
            A1C.put(A02, A06);
        }
        return A1C;
    }

    public LinkedHashMap A04(String str, String str2, String str3, java.util.Map map, boolean z) {
        11T.A0H(str, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(EPP.A0T.value, str);
        linkedHashMap.put(EPP.A0m.value, str2);
        if (str3 != null) {
            linkedHashMap.put(EPP.A0j.value, str3);
        }
        linkedHashMap.put(EPP.A0b.value, String.valueOf(z));
        return linkedHashMap;
    }

    public void A05(L1w l1w, String str, String str2, java.util.Map map) {
        if (map == null) {
            map = 04R.A0G();
        }
        LinkedHashMap A06 = 04R.A06(map);
        A06.put(EPP.A0P.value, str);
        if (l1w != null) {
            FHZ.A00(l1w, A06);
        } else {
            FHZ.A02("Server verification failed", A06);
        }
        if (str2 != null) {
            A06.put(EPP.A0U.value, str2);
        }
        this.A00.BZX(A06, null, "client_create_dcp_external_confirm_fail");
    }

    public void A06(L1w l1w, java.util.Map map) {
        11T.A0F(map, 1);
        if (map.isEmpty()) {
            map = 1BK.A1C();
            FHZ.A00(l1w, map);
        }
        this.A00.BZX(map, null, l1w.A00 == 1 ? "user_create_dcppayment_cancel" : "client_create_dcppayment_fail");
    }

    public void A07(L1w l1w, java.util.Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("extra_error_message", 0Pz.A0W("Unable to fetch SKU: ", AnonymousClass001.A0b(EPP.A0T.value, map)));
        FHZ.A00(l1w, linkedHashMap);
        this.A00.BZX(linkedHashMap, null, "client_create_dcppayment_fail");
    }

    public void A08(ENg eNg, String str, java.util.Map map) {
        if (map == null) {
            map = 04R.A0G();
        }
        LinkedHashMap A06 = 04R.A06(map);
        FHZ.A02(eNg.resultMessage, A06);
        A06.put("DcpResultCode", eNg.name());
        A06.put(EPP.A0U.value, str);
        this.A00.BZX(A06, null, "client_create_iap_external_confirm_warning");
    }

    public void A09(String str, String str2, List list) {
        11T.A0F(str, 1);
        this.A00.BZX(04R.A09(new 03Y[]{1BK.A1G(EPP.A0m.value, str), 1BK.A1G(EPP.A0T.value, 4YV.A0t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, (Function1) null)), 1BK.A1G(EPP.A0R.value, str2)}), null, "client_fetch_dcpcatalog_fail");
    }

    public void A0A(String str, List list) {
        11T.A0F(str, 1);
        this.A00.BZX(4YW.A0A(EPP.A0T.value, 4YV.A0t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, (Function1) null), 1BK.A1G(EPP.A0m.value, str)), null, "client_fetch_dcpcatalog_init");
    }

    public void A0B(String str, List list) {
        11T.A0F(str, 1);
        this.A00.BZX(4YW.A0A(EPP.A0T.value, 4YV.A0t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, (Function1) null), 1BK.A1G(EPP.A0m.value, str)), null, "client_fetch_dcpcatalog_success");
    }

    public void A0C(String str, java.util.Map map) {
        11T.A0F(str, 0);
        C50k c50k = this.A00;
        C50j c50j = (C50j) c50k;
        c50j.A00 = AbstractC11504wo.A01();
        c50j.A01 = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EPP.A0m.value, str);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((EPP) entry.getKey()).value, entry.getValue());
        }
        c50k.BZX(linkedHashMap, null, "client_load_dcpiap_init");
    }

    public void A0D(Throwable th, List list, List list2) {
        if (list2 == null || list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                LinkedHashMap A1C = 1BK.A1C();
                FHZ.A03(th, A1C);
                A1C.put(EPP.A0U.value, purchase.A01());
                this.A00.BZX(A1C, null, "client_verify_dcppayment_fail");
            }
            return;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            8Ju r0 = (8Ju) it2.next();
            LinkedHashMap A1C2 = 1BK.A1C();
            FHZ.A03(th, A1C2);
            A1C2.put(EPP.A0U.value, r0.A01);
            A1C2.put(EPP.A0Q.value, String.valueOf(r0.A00));
            A1C2.put(EPP.A0R.value, r0.A02);
            this.A00.BZX(A1C2, null, "client_verify_dcppayment_fail");
        }
    }
}

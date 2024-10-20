package X;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Lta.class */
public final class Lta implements Callable {
    public final /* synthetic */ LDG A00;
    public final /* synthetic */ MEq A01;
    public final /* synthetic */ String A02;

    public Lta(LDG ldg, MEq mEq, String str) {
        this.A02 = str;
        this.A01 = mEq;
        this.A00 = ldg;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Kgq kgq;
        LDG ldg = this.A00;
        String str = this.A02;
        LEC.A09("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList A0s = AnonymousClass001.A0s();
        Bundle A03 = LEC.A03(ldg.A0G, ldg.A06);
        String str2 = null;
        while (true) {
            if (!ldg.A05) {
                LEC.A0A("BillingClient", "getPurchaseHistory is not supported on current device");
                kgq = new Kgq(KdR.A0G, null);
                break;
            }
            try {
                Bundle DD2 = ldg.A0K.DD2(A03, ldg.A01.getPackageName(), str, str2, 6);
                Kgs A00 = KVV.A00(DD2, "getPurchaseHistory()");
                L1w l1w = A00.A01;
                L1w l1w2 = KdR.A0C;
                if (l1w != l1w2) {
                    JQx.A1C(l1w, ldg.A02, A00.A00, 11);
                    kgq = new Kgq(l1w, null);
                    break;
                }
                ArrayList<String> stringArrayList = DD2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = DD2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = DD2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    LEC.A09("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        JSONObject jSONObject = purchaseHistoryRecord.A02;
                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                            LEC.A0A("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        A0s.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        LEC.A0B("BillingClient", "Got an exception trying to decode the purchase!", e);
                        MLk mLk = ldg.A02;
                        L1w l1w3 = KdR.A0B;
                        JQx.A1C(l1w3, mLk, 51, 11);
                        kgq = new Kgq(l1w3, null);
                    }
                }
                if (z) {
                    JQx.A1C(KdR.A0B, ldg.A02, 26, 11);
                }
                str2 = DD2.getString("INAPP_CONTINUATION_TOKEN");
                LEC.A09("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    kgq = new Kgq(l1w2, A0s);
                    break;
                }
            } catch (RemoteException e2) {
                LEC.A0B("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                MLk mLk2 = ldg.A02;
                L1w l1w4 = KdR.A0D;
                JQx.A1C(l1w4, mLk2, 59, 11);
                kgq = new Kgq(l1w4, null);
            }
        }
        this.A01.CEr(kgq.A00, kgq.A01);
        return null;
    }
}

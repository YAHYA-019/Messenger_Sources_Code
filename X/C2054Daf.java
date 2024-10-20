package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Daf, reason: case insensitive filesystem */
/* loaded from: Daf.class */
public final class C2054Daf extends AbstractC2060Dal {
    public void Bhr(Activity activity, Intent intent, int i, int i2) {
        if (i2 == -1) {
            String str = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString("invoice_id") : null;
                Bundle extras2 = intent.getExtras();
                String string2 = extras2 != null ? extras2.getString(AbE.A00(772)) : null;
                Bundle extras3 = intent.getExtras();
                if (extras3 != null) {
                    str = extras3.getString("payment_status");
                }
                if (string != null) {
                    JSONObject A12 = AnonymousClass001.A12();
                    A12.put("order_id", string);
                    A12.put("payment_product_id", "1219923672082963");
                    if (string2 != null) {
                        A12.put("session_id", string2);
                    }
                    Erb erb = Eb3.A00;
                    if (erb == null) {
                        11T.A0L("checkoutPaymentActionHandler");
                        throw 0Q8.createAndThrow();
                    }
                    erb.A00(G6P.A00, G6Q.A00, "com.bloks.www.bloks.ecp.checkout.cds.fetch_order_purchase_status", 11T.A02(A12));
                    return;
                }
                if (str == null || str.length() == 0) {
                    return;
                }
                try {
                    JSONObject A122 = AnonymousClass001.A12();
                    A122.put("payment_product_id", "1219923672082963");
                    A122.put("payment_status", str);
                    Erb erb2 = Eb3.A00;
                    if (erb2 == null) {
                        11T.A0L("checkoutPaymentActionHandler");
                        throw 0Q8.createAndThrow();
                    }
                    erb2.A00(G6R.A00, G6S.A00, "com.bloks.www.bloks.ecp.checkout.cds.finalize_payment", 11T.A02(A122));
                } catch (JSONException unused) {
                }
            }
        }
    }
}

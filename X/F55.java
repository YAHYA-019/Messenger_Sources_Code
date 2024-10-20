package X;

import com.facebook.payments.checkout.configuration.model.CheckoutOption;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* loaded from: F55.class */
public final class F55 {
    public Een A00;
    public ETu A01;

    public static void A00(F55 f55, CheckoutData checkoutData, ImmutableList immutableList, String str) {
        ImmutableList immutableList2 = (ImmutableList) ((SimpleCheckoutData) checkoutData).A0T.get(str);
        if (immutableList == null) {
            if (immutableList2 == null) {
                return;
            }
        } else if (immutableList2 != null && immutableList.size() == immutableList2.size()) {
            for (int i = 0; i < immutableList.size(); i++) {
                if (((CheckoutOption) immutableList.get(i)).A01.equals(((CheckoutOption) immutableList2.get(i)).A01)) {
                }
            }
            return;
        }
        DZz dZz = f55.A00.A00;
        FIS A07 = DZz.A07(dZz);
        SimpleCheckoutData simpleCheckoutData = (SimpleCheckoutData) dZz.A0A;
        HashMap A1C = DKC.A1C(simpleCheckoutData.A0T);
        A1C.put(str, immutableList);
        RTg rTg = new RTg();
        rTg.A00(simpleCheckoutData);
        rTg.A0T = ImmutableMap.copyOf((java.util.Map) A1C);
        FIS.A03(A07, new SimpleCheckoutData(rTg));
    }
}

package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: L68.class */
public abstract class L68 {
    public static final FJC A00(FJC fjc, Integer num) {
        TransactionInfo transactionInfo = (TransactionInfo) fjc.A01;
        Integer num2 = null;
        if (transactionInfo != null) {
            ArrayList arrayList = transactionInfo.A08;
            num2 = transactionInfo.A04;
            if (arrayList != null) {
                return FJC.A04(new PuxPriceTableItem(KP0.A0h, num2, num, arrayList));
            }
        }
        return FJC.A02(fjc, new PuxPriceTableItem(KP0.A0h, num2, num, AnonymousClass001.A0s()));
    }

    public static final List A01(String str, java.util.Map map) {
        PuxEntityItem puxEntityItem;
        String str2;
        Collection values = map.values();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object obj = ((FJC) it.next()).A01;
            if ((obj instanceof PuxEntityItem) && (puxEntityItem = (PuxEntityItem) obj) != null && (str2 = puxEntityItem.A03) != null) {
                A0s.add(str2);
            }
        }
        ArrayList A10 = 7zO.A10(A0s, 0);
        if (A10.isEmpty() && str != null) {
            A10.add(str);
        }
        return 0QD.A0V(A10);
    }

    public static final java.util.Map A02(ECPPaymentRequest eCPPaymentRequest, List list) {
        11T.A0F(eCPPaymentRequest, 1);
        ArrayList A0z = 1BL.A0z(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            PriceInfo priceInfo = (PriceInfo) obj;
            String A0T = 0Pz.A0T("ITEM_LIST", i);
            String str = priceInfo.A04;
            String str2 = priceInfo.A05;
            ItemDetails itemDetails = eCPPaymentRequest.A04.A09;
            7zU.A1Y(A0T, FJC.A04(new PuxEntityItem(priceInfo.A00, KP0.A0c, itemDetails, null, str, str2, 4YV.A0u(priceInfo.A02), priceInfo.A03)), A0z);
            i = i2;
        }
        return 04R.A0B(A0z);
    }
}

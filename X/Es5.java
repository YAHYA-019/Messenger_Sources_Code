package X;

import com.facebook.payments.cart.model.SimpleCartItem;
import com.facebook.payments.currency.CurrencyAmount;
import java.util.ArrayList;

/* loaded from: Es5.class */
public final class Es5 {
    public final ArrayList A00 = AnonymousClass001.A0s();

    public void A00(SimpleCartItem simpleCartItem) {
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A00;
            if (i2 >= arrayList.size()) {
                arrayList.add(simpleCartItem);
                return;
            }
            SimpleCartItem simpleCartItem2 = (SimpleCartItem) arrayList.get(i2);
            String str = simpleCartItem2.A04;
            if (str.equals(simpleCartItem.A04)) {
                EMq eMq = simpleCartItem2.A02;
                String str2 = simpleCartItem2.A08;
                CurrencyAmount currencyAmount = simpleCartItem2.A03;
                String str3 = simpleCartItem2.A07;
                String str4 = simpleCartItem2.A06;
                int i3 = simpleCartItem2.A00;
                arrayList.set(i2, new SimpleCartItem(eMq, currencyAmount, str, simpleCartItem2.A05, str4, str3, str2, i3 + simpleCartItem.A00, simpleCartItem2.A01));
                return;
            }
            i = i2 + 1;
        }
    }
}

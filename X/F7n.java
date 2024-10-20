package X;

import com.facebook.inject.FbInjector;
import com.facebook.payments.checkout.configuration.model.CheckoutConfigPrice;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.CheckoutItem;
import com.facebook.payments.checkout.configuration.model.PriceListItem;
import com.facebook.payments.checkout.configuration.model.PriceSubTable;
import com.facebook.payments.checkout.configuration.model.PriceTableScreenComponent;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.PaymentsPriceTableParams;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.google.common.collect.ImmutableList;

/* loaded from: F7n.class */
public final class F7n {
    public final C00i A01 = FbInjector.A00;
    public final FIQ A02 = DKG.A0i();
    public final C6oh A00 = DKG.A0g();

    private RvK A00(CheckoutConfigPrice checkoutConfigPrice, CheckoutData checkoutData, ImmutableList immutableList, boolean z) {
        String str;
        String A00;
        RZO rzo;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            CheckoutConfigPrice checkoutConfigPrice2 = (CheckoutConfigPrice) it.next();
            if (AnonymousClass001.A1T(checkoutConfigPrice2.A01) || checkoutConfigPrice2.A02 != null) {
                CurrencyAmount A02 = checkoutConfigPrice2.A02();
                A02.getClass();
                CheckoutItem checkoutItem = checkoutConfigPrice2.A00;
                if (checkoutItem != null) {
                    rzo = new RZO((GMA) null, checkoutConfigPrice2.A03, this.A00.A00(A02), checkoutItem.A02, checkoutItem.A00, false, false, true);
                    A0h.m11011add((Object) rzo);
                } else {
                    str = checkoutConfigPrice2.A03;
                    A00 = this.A00.A00(A02);
                }
            } else {
                A00 = checkoutConfigPrice2.A04;
                if (A00 == null) {
                    throw 1BL.A0h(checkoutConfigPrice2, "Unable to generate rowData for ", AnonymousClass001.A0k());
                }
                str = checkoutConfigPrice2.A03;
            }
            rzo = new RZO(str, A00, false);
            A0h.m11011add((Object) rzo);
        }
        if (!z) {
            CurrencyAmount A002 = RVQ.A00(checkoutData);
            String str2 = null;
            if (checkoutConfigPrice != null) {
                str2 = checkoutConfigPrice.A03;
            }
            if (1JF.A0B(str2)) {
                str2 = 1BL.A0B(this.A01).getString(2131954180);
            }
            if (A002 != null) {
                FIQ fiq = this.A02;
                PaymentsLoggingSessionData A0j = DKG.A0j(checkoutData);
                String A0t = DKF.A0t(A002);
                String str3 = A002.A00;
                fiq.A09(A0j, A0t, "raw_amount");
                fiq.A09(A0j, str3, "currency");
                if (!A002.A08()) {
                    A0h.m11011add((Object) new RZO(str2, this.A00.A00(A002), true));
                }
            }
        }
        return new RvK(A0h.build());
    }

    public RvK A01(CheckoutData checkoutData) {
        RvK rvK;
        CheckoutCommonParamsCore A0X = DKF.A0X(checkoutData);
        CheckoutInformation checkoutInformation = A0X.A06;
        RvK rvK2 = null;
        if (checkoutInformation != null) {
            PriceTableScreenComponent priceTableScreenComponent = checkoutInformation.A0B;
            if (priceTableScreenComponent != null) {
                ImmutableList immutableList = priceTableScreenComponent.A03;
                ImmutableList.Builder A0h = 4YU.A0h();
                immutableList.getClass();
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    1Du it2 = ((PriceSubTable) it.next()).A00.iterator();
                    while (it2.hasNext()) {
                        PriceListItem priceListItem = (PriceListItem) it2.next();
                        CheckoutItem checkoutItem = priceListItem.A00;
                        A0h.m11011add((Object) (checkoutItem != null ? new RZO((GMA) null, checkoutItem.A04, priceListItem.A02, checkoutItem.A02, checkoutItem.A00, false, false, true) : new RZO(priceListItem.A03, priceListItem.A02, false)));
                    }
                }
                PriceListItem priceListItem2 = priceTableScreenComponent.A02;
                priceListItem2.getClass();
                String str = priceListItem2.A03;
                str.getClass();
                priceListItem2.A01.getClass();
                rvK = new RvK(AbG.A0z(A0h, new RZO(str, priceListItem2.A02, true)));
            }
            return rvK2;
        }
        ImmutableList A01 = RVQ.A01(checkoutData);
        PaymentsPriceTableParams B2J = A0X.B2J();
        CheckoutConfigPrice checkoutConfigPrice = A0X.A03;
        if (09K.A01(A01)) {
            rvK = null;
        } else {
            ImmutableList immutableList2 = ((CheckoutConfigPrice) A01.get(0)).A02;
            if (immutableList2 != null) {
                rvK = new RvJ(ImmutableList.of((Object) A00(checkoutConfigPrice, checkoutData, immutableList2, true), (Object) A00(checkoutConfigPrice, checkoutData, A01, false)));
            } else {
                rvK = A00(checkoutConfigPrice, checkoutData, A01, false);
                boolean z = B2J.A01;
                boolean z2 = B2J.A00;
                rvK.A01 = z;
                rvK.A00 = z2;
            }
        }
        if (rvK instanceof RvK) {
            rvK2 = rvK;
        } else if (rvK instanceof RvJ) {
            ImmutableList.Builder builder = ImmutableList.builder();
            ImmutableList immutableList3 = ((RvJ) rvK).A00;
            for (int i = 0; i < immutableList3.size(); i++) {
                builder.addAll(((RvK) immutableList3.get(i)).A02);
            }
            return new RvK(builder.build());
        }
        return rvK2;
    }
}

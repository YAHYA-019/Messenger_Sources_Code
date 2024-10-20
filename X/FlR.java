package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.payments.checkout.configuration.model.CheckoutConfigPrice;
import com.facebook.payments.currency.CurrencyAmount;
import com.google.common.collect.ImmutableList;

/* loaded from: FlR.class */
public final class FlR implements GKs {
    public final Er4 A00 = DKG.A0e();

    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        DKF.A1T(r302, "label");
        String A0H = JSONUtil.A0H(r302.A0D("label"), null);
        CurrencyAmount currencyAmount = null;
        ImmutableList immutableList = r302.A0Z("price_list") ? (ImmutableList) GKs.A00(this.A00.A02, r302, "price_list", str) : null;
        if (r302.A0Z("currency_amount")) {
            currencyAmount = (CurrencyAmount) GKs.A00(this.A00.A04, r302, "currency_amount", str);
        }
        String A0P = C3o5.A0P(r302, "user_facing_reason", null);
        if (immutableList != null) {
            return new CheckoutConfigPrice(null, immutableList, A0H, null);
        }
        if (currencyAmount != null) {
            return new CheckoutConfigPrice(currencyAmount, null, A0H, null);
        }
        if (A0P != null) {
            return new CheckoutConfigPrice(null, null, A0H, A0P);
        }
        throw 1BK.A0i("Invalid price price provided: ", A0H);
    }
}

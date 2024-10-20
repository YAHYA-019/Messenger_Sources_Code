package X;

import android.os.Parcelable;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.paymentmethods.model.AltPayPaymentMethod;
import com.facebook.payments.paymentmethods.model.AltPayPricepoint;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.google.common.collect.ImmutableList;

/* loaded from: Fnm.class */
public final class Fnm implements GIH {
    public /* bridge */ /* synthetic */ PaymentMethod B20(24X r302) {
        24X A0e = 4YU.A0e(r302, "pricepoint");
        String A0H = JSONUtil.A0H(4YU.A0e(A0e, "altpay_id"), null);
        String A0m = DKH.A0m(A0e, "pricepoint_id");
        String A0m2 = DKH.A0m(A0e, "title");
        String A0m3 = DKH.A0m(A0e, "description");
        String A0P = C3o5.A0P(A0e, "icon_url", null);
        ImmutableList A0C = JSONUtil.A0C(A0e, "logo_urls");
        String A0m4 = DKH.A0m(A0e, "payment_provider");
        24X A0e2 = 4YU.A0e(A0e, "fee");
        boolean A0J = JSONUtil.A0J(4YU.A0e(A0e, "should_collect_msisdn"), false);
        ImmutableList A0C2 = JSONUtil.A0C(A0e, "supported_countries");
        Parcelable.Creator creator = CurrencyAmount.CREATOR;
        CurrencyAmount A0f = DKG.A0f(DKH.A0m(A0e2, "amount"), DKH.A0m(A0e2, "currency"));
        ImmutableList.of();
        ImmutableList.of();
        C1pq.A08("altpayId", A0H);
        C1pq.A08("description", A0m3);
        C1pq.A08("logoUrls", A0C);
        C1pq.A08("paymentProvider", A0m4);
        C1pq.A08("pricepointId", A0m);
        C1pq.A08("supportedCountries", A0C2);
        C1pq.A08("title", A0m2);
        return new AltPayPaymentMethod(new AltPayPricepoint(A0f, A0C, A0C2, A0H, A0m3, A0P, A0m4, A0m, A0m2, A0J));
    }

    public ERI B22() {
        return ERI.A01;
    }
}

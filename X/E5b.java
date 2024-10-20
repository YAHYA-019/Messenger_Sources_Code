package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.checkout.model.CheckoutAdditionalPaymentMethod;
import com.facebook.payments.checkout.protocol.model.CheckoutChargeParams;
import com.facebook.payments.checkout.protocol.model.CheckoutChargeResult;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethodWithBalance;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.google.common.collect.ImmutableList;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: E5b.class */
public final class E5b extends E5c {
    public static final String __redex_internal_original_name = "CheckoutChargeMethod";
    public final 1H2 A00;
    public final Eet A01;
    public final FIQ A02;
    public final C3T3 A03;
    public final AnonymousClass244 A04;

    public E5b() {
        super((CbI) 1Bn.A0B(82307), CheckoutChargeResult.class);
        FIQ A0i = DKG.A0i();
        1H2 A0R = DKE.A0R();
        C3T3 c3t3 = (C3T3) 1Bn.A0B(100167);
        AnonymousClass244 A0s = AbI.A0s();
        this.A02 = A0i;
        this.A00 = A0R;
        this.A03 = c3t3;
        this.A04 = A0s;
        this.A01 = (Eet) 1Hv.A02(7zP.A0J(), 99141);
    }

    public static void A00(CheckoutAdditionalPaymentMethod checkoutAdditionalPaymentMethod, CurrencyAmount currencyAmount, C03353xs c03353xs) {
        2DM A0f = 4YU.A0f();
        String lowerCase = "CREDENTIAL_ID".toLowerCase();
        PaymentMethod paymentMethod = checkoutAdditionalPaymentMethod.A01;
        A0f.A0o(lowerCase, paymentMethod.getId());
        CurrencyAmount currencyAmount2 = checkoutAdditionalPaymentMethod.A00;
        if (currencyAmount2.compareTo(currencyAmount) <= 0) {
            currencyAmount = currencyAmount2;
        }
        A0f.A0o("AMOUNT".toLowerCase(), DKF.A0t(currencyAmount));
        if (paymentMethod instanceof PaymentMethodWithBalance) {
            A0f.A0o("WALLET_BALANCE".toLowerCase(), DKF.A0t(((PaymentMethodWithBalance) paymentMethod).AYl()));
        }
        c03353xs.A0d(A0f);
    }

    public String A02() {
        return 1BJ.A00(1118);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C04083zw A0T;
        CheckoutChargeParams checkoutChargeParams = (CheckoutChargeParams) obj;
        FIQ fiq = this.A02;
        PaymentsLoggingSessionData paymentsLoggingSessionData = checkoutChargeParams.A02;
        String str = checkoutChargeParams.A0J;
        fiq.A09(paymentsLoggingSessionData, str, TraceFieldType.RequestID);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        String lowerCase = "PAYMENT_TYPE".toLowerCase();
        PaymentItemType paymentItemType = checkoutChargeParams.A03;
        A0s.add(new BasicNameValuePair(lowerCase, paymentItemType.mValue));
        A0s.add(new BasicNameValuePair("ORDER_ID".toLowerCase(), checkoutChargeParams.A0H));
        2DM r0 = checkoutChargeParams.A05;
        if (r0 != null) {
            A0s.add(new BasicNameValuePair("EXTRA_DATA".toLowerCase(), r0.toString()));
        }
        A0s.add(new BasicNameValuePair("MAILING_ADDRESS_ID".toLowerCase(), checkoutChargeParams.A0E));
        A0s.add(new BasicNameValuePair(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID.toLowerCase(), checkoutChargeParams.A0L));
        A0s.add(new BasicNameValuePair("RECEIVER_ID".toLowerCase(), checkoutChargeParams.A0I));
        A0s.add(new BasicNameValuePair("SESSION_ID".toLowerCase(), checkoutChargeParams.A0K));
        CurrencyAmount currencyAmount = checkoutChargeParams.A01;
        if (currencyAmount != null) {
            A0s.add(new BasicNameValuePair("CURRENCY".toLowerCase(), currencyAmount.A00));
            A0s.add(new BasicNameValuePair("AMOUNT".toLowerCase(), DKF.A0t(currencyAmount)));
        }
        A0s.add(new BasicNameValuePair("REQUEST_ID".toLowerCase(), str));
        A0s.add(new BasicNameValuePair("MERCHANT_DESCRIPTOR".toLowerCase(), checkoutChargeParams.A0G));
        PaymentMethod paymentMethod = checkoutChargeParams.A04;
        if (paymentMethod != null) {
            Eet eet = this.A01;
            ERI BHR = paymentMethod.BHR();
            for (GI8 gi8 : eet.A00) {
                if (gi8.BHR() == BHR) {
                    A0s.addAll(gi8.AU0(paymentMethod));
                }
            }
            throw AnonymousClass001.A0q(AnonymousClass001.A0Z(BHR, "Unsupported paymentMethodType seen: ", AnonymousClass001.A0k()));
        }
        C03353xs A0k = DKC.A0k(C26T.A00);
        if (currencyAmount != null && paymentMethod != null) {
            CurrencyAmount currencyAmount2 = currencyAmount;
            1Du it = checkoutChargeParams.A06.iterator();
            while (it.hasNext()) {
                CurrencyAmount currencyAmount3 = ((CheckoutAdditionalPaymentMethod) it.next()).A00;
                CurrencyAmount.A01(currencyAmount2, currencyAmount3);
                currencyAmount2 = new CurrencyAmount(currencyAmount2.A00, currencyAmount2.A01.subtract(currencyAmount3.A01));
            }
            BigDecimal bigDecimal = currencyAmount2.A01;
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal2) < 0) {
                currencyAmount2 = new CurrencyAmount(currencyAmount.A00, bigDecimal2);
            }
            A00(new CheckoutAdditionalPaymentMethod(currencyAmount2, paymentMethod), currencyAmount, A0k);
        }
        1Du it2 = checkoutChargeParams.A06.iterator();
        while (it2.hasNext()) {
            A00((CheckoutAdditionalPaymentMethod) it2.next(), currencyAmount, A0k);
        }
        if (A0k._children.size() > 0) {
            A0s.add(new BasicNameValuePair("CREDENTIALS".toLowerCase(), A0k.toString()));
        }
        CurrencyAmount currencyAmount4 = checkoutChargeParams.A00;
        if (currencyAmount4 != null) {
            A0s.add(new BasicNameValuePair("TAX_CURRENCY".toLowerCase(), currencyAmount4.A00));
            A0s.add(new BasicNameValuePair("TAX_AMOUNT".toLowerCase(), DKF.A0t(currencyAmount4)));
        }
        A0s.add(new BasicNameValuePair("EMAIL_ADDRESS_ID".toLowerCase(), checkoutChargeParams.A0C));
        A0s.add(new BasicNameValuePair("CONTACT_NAME".toLowerCase(), checkoutChargeParams.A08));
        A0s.add(new BasicNameValuePair("CONTACT_NUMBER_ID".toLowerCase(), checkoutChargeParams.A09));
        String lowerCase2 = "CSC".toLowerCase();
        String str2 = checkoutChargeParams.A0B;
        A0s.add(new BasicNameValuePair(lowerCase2, str2));
        A0s.add(new BasicNameValuePair("SECURITY_PIN".toLowerCase(), checkoutChargeParams.A0M));
        String str3 = checkoutChargeParams.A0D;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair("SECURITY_BIOMETRIC_NONCE".toLowerCase(), str3));
            A0s.add(new BasicNameValuePair("SECURITY_DEVICE_ID".toLowerCase(), this.A00.A02()));
        }
        String str4 = checkoutChargeParams.A0F;
        if (str4 != null) {
            A0s.add(new BasicNameValuePair("MEMO".toLowerCase(), str4));
        }
        String str5 = checkoutChargeParams.A0A;
        if (str5 != null) {
            A0s.add(new BasicNameValuePair("COUPON_CODE".toLowerCase(), str5));
        }
        if (str2 == null) {
            A0s.add(new BasicNameValuePair("RISK_FEATURES".toLowerCase(), this.A03.A02()));
        }
        if (str2 != null) {
            Object[] A1Z = AnonymousClass001.A1Z();
            A0T = DKC.A0T();
            A0T.A0F = StringFormatUtil.formatStrLocaleSafe(0Pz.A0W("ajax/payment/token_proxy.php?tpe=", "/me/payments"), A1Z);
            A0T.A0P = true;
        } else {
            A0T = DKC.A0T();
            A0T.A0F = "/me/payments";
        }
        if (paymentItemType == PaymentItemType.A0K) {
            A0T.A04(ImmutableList.of((Object) new BasicHeader("X-FB-CXO-Web-Pay-Req", "basic-card")));
        }
        AbF.A1Q(A0T, __redex_internal_original_name);
        return DKE.A0W(A0T, A0s);
    }
}

package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.locale.Country;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.BillingAddress;
import com.facebook.payments.paymentmethods.model.CreditCard;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.VerifyField;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Fno.class */
public final class Fno implements GIH {
    public /* bridge */ /* synthetic */ PaymentMethod B20(24X r302) {
        BillingAddress billingAddress;
        DKF.A1T(r302, "cc");
        24X A0e = 4YU.A0e(r302, "cc");
        boolean A1a = DKE.A1a(A0e, "is_soft_disabled");
        String A0H = JSONUtil.A0H(A0e.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_ID), null);
        String A0P = C3o5.A0P(A0e, "expiry_month", null);
        String A0P2 = C3o5.A0P(A0e, "expiry_year", null);
        String A0P3 = C3o5.A0P(A0e, "last4", null);
        FbPaymentCardType forValue = FbPaymentCardType.forValue(C3o5.A0P(A0e, "card_type", null));
        ImmutableList.Builder A0h = 4YU.A0h();
        boolean z = false;
        if (r302.A0Z("verify_fields")) {
            Iterator it = JSONUtil.A07(r302, "verify_fields").iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    VerifyField forValue2 = VerifyField.forValue(JSONUtil.A0H(DKC.A0j(it), null));
                    A0h.m11011add((Object) forValue2);
                    if (z || forValue2 == VerifyField.CSC) {
                        z = true;
                    }
                }
            }
        }
        if (A1a && !z) {
            A0h.m11011add((Object) VerifyField.CSC);
        }
        ImmutableList build = A0h.build();
        String A0P4 = C3o5.A0P(A0e, "credential_id", null);
        String A0P5 = C3o5.A0P(A0e, "card_association_image_url", null);
        Country country = null;
        if (A0e.A0Z("billing_address")) {
            24X A0D = A0e.A0D("billing_address");
            String A0P6 = C3o5.A0P(A0D, ServerW3CShippingAddressConstants.POSTAL_CODE, null);
            String A0P7 = C3o5.A0P(A0D, "country_code", null);
            if (A0P7 != null) {
                country = Country.A00(null, A0P7);
            }
            billingAddress = new BillingAddress(country, A0P6);
        } else {
            billingAddress = null;
        }
        return new CreditCard(billingAddress, forValue, build, A0P5, null, A0P4, A0P, A0P2, A0H, A0P3, JSONUtil.A0J(A0e.A0D("is_money_transfer_enabled"), true), A1a);
    }

    public ERI B22() {
        return ERI.A03;
    }
}

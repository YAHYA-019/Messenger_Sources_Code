package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.paymentmethods.model.PaymentMethod;

/* loaded from: Fnp.class */
public final class Fnp implements GIH {
    public /* bridge */ /* synthetic */ PaymentMethod B20(24X r302) {
        DKF.A1T(r302, "paypal_ba");
        24X A0e = 4YU.A0e(r302, "paypal_ba");
        String A0H = JSONUtil.A0H(A0e.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_ID), null);
        String A0P = C3o5.A0P(A0e, "email", null);
        PayPalBillingAgreement.Type forValue = PayPalBillingAgreement.Type.forValue(C3o5.A0P(A0e, "ba_type", null));
        String A0P2 = C3o5.A0P(A0e, "credential_id", null);
        boolean A0J = JSONUtil.A0J(A0e.A0D("is_soft_disabled"), false);
        return new PayPalBillingAgreement(forValue, null, C3o5.A0P(r302, "cib_consent_text", null), C3o5.A0P(r302, "cib_terms_url", null), C3o5.A0P(r302, "connect_with_paypal_url", null), A0P2, null, A0P, A0H, 4YU.A1Z(r302, "cib_conversion_needed"), false, A0J);
    }

    public ERI B22() {
        return ERI.A05;
    }
}

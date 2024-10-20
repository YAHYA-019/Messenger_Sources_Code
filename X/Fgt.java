package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.payments.auth.pin.model.PaymentPin;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgt.class */
public final class Fgt implements 1Ro {
    public static final String __redex_internal_original_name = "FetchPaymentPinMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("q", "viewer(){peer_to_peer_payment_pin.disabled_status_supported(true){id, fbpay_pin_status}}"), A0s);
        AbF.A1P(A0C, "fetchPaymentPin");
        return AbK.A0M(A0C, "graphql", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0D = AbH.A0w(anonymousClass439).A0D("viewer").A0D("peer_to_peer_payment_pin");
        if (A0D.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            return new PaymentPin(A0D.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_ID).A07(), A0D.A0Z("fbpay_pin_status") ? AbH.A1A(A0D, "fbpay_pin_status") : null);
        }
        return PaymentPin.A00;
    }
}

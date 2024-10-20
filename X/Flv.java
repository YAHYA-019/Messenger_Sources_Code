package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.QRCodeMethod;
import com.google.common.collect.ImmutableList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Flv.class */
public final class Flv implements GI8 {
    @Override // X.GI8
    public /* bridge */ /* synthetic */ ImmutableList AU0(PaymentMethod paymentMethod) {
        C26T c26t = C26T.A00;
        2DM A0g = 4YU.A0g(c26t);
        A0g.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, ERI.A08.mValue);
        2DM A0g2 = 4YU.A0g(c26t);
        A0g2.A0o("qr_type", ((QRCodeMethod) paymentMethod).A02);
        A0g.A0e(A0g2, "data");
        return ImmutableList.of((Object) new BasicNameValuePair("NMOR_PAYMENT_METHOD".toLowerCase(), A0g.toString()));
    }

    @Override // X.GI8
    public ERI BHR() {
        return ERI.A08;
    }
}

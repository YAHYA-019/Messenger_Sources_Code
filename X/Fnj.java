package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.NewPayPalOption;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.google.common.base.Preconditions;

/* loaded from: Fnj.class */
public final class Fnj implements GIG {
    public /* bridge */ /* synthetic */ NewPaymentOption Az1(24X r302) {
        Preconditions.checkArgument(AnonymousClass001.A1W(ERH.A00(JSONUtil.A0H(r302.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), null)), ERH.A06));
        String A0P = C3o5.A0P(r302, "url", null);
        Preconditions.checkArgument(69J.A00(C0A2.A03(A0P)));
        return new NewPayPalOption(C3o5.A0P(r302, "title", null), A0P, C3o5.A0P(r302, "login_ref_id", null));
    }

    public ERH Az2() {
        return ERH.A06;
    }
}

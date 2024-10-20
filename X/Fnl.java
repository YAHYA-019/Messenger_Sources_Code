package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.facebook.payments.paymentmethods.model.NewTopLevelNetBankingOption;
import com.facebook.payments.paymentmethods.model.SendPaymentBankDetails;
import com.google.common.base.Preconditions;

/* loaded from: Fnl.class */
public final class Fnl implements GIG {
    public final EfU A00 = (EfU) 1Bn.A0A(98960);

    public /* bridge */ /* synthetic */ NewPaymentOption Az1(24X r302) {
        DKF.A1T(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        Preconditions.checkArgument(AnonymousClass001.A1W(ERH.A00(JSONUtil.A0H(r302.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), null)), ERH.A08));
        String A0P = C3o5.A0P(r302, "provider", null);
        return new NewTopLevelNetBankingOption((SendPaymentBankDetails) this.A00.A00.A0T(SendPaymentBankDetails.class, 4YU.A0e(r302, "bank_info")), C3o5.A0P(r302, "title", null), A0P);
    }

    public ERH Az2() {
        return ERH.A08;
    }
}

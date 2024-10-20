package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.NewNetBankingOption;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.facebook.payments.paymentmethods.model.SendPaymentBankDetails;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Fnk.class */
public final class Fnk implements GIG {
    public final EfU A00 = (EfU) 1Bn.A0A(98960);

    public /* bridge */ /* synthetic */ NewPaymentOption Az1(24X r302) {
        DKF.A1T(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        boolean z = true;
        Preconditions.checkArgument(AnonymousClass001.A1W(ERH.A00(JSONUtil.A0H(r302.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), null)), ERH.A05));
        String A0P = C3o5.A0P(r302, "provider", null);
        String A0P2 = C3o5.A0P(r302, "title", null);
        ImmutableList.Builder A0h = 4YU.A0h();
        if (r302.A0Z("bank_info")) {
            24X A0e = 4YU.A0e(r302, "bank_info");
            Preconditions.checkArgument(A0e.A0R());
            if (A0e.A05() == 0) {
                z = false;
            }
            Preconditions.checkArgument(z);
            Iterator it = A0e.iterator();
            while (it.hasNext()) {
                A0h.m11011add(this.A00.A00.A0T(SendPaymentBankDetails.class, it.next()));
            }
        }
        return new NewNetBankingOption(A0h.build(), A0P2, A0P);
    }

    public ERH Az2() {
        return ERH.A05;
    }
}

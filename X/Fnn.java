package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.BankAccount;
import com.facebook.payments.paymentmethods.model.PaymentMethod;

/* loaded from: Fnn.class */
public final class Fnn implements GIH {
    public /* bridge */ /* synthetic */ PaymentMethod B20(24X r302) {
        DKF.A1T(r302, "bank_account");
        24X A0e = 4YU.A0e(r302, "bank_account");
        return new BankAccount(JSONUtil.A0H(4YU.A0e(A0e, PublicKeyCredentialControllerUtility.JSON_KEY_ID), null), DKH.A0m(A0e, "bank_name"), DKH.A0m(A0e, "bank_account_last_4"), DKH.A0m(A0e, "bank_code_last_4"));
    }

    public ERI B22() {
        return ERI.A02;
    }
}

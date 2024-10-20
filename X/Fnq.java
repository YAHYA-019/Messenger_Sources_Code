package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.StoredValueAccountPaymentMethod;
import com.facebook.payments.paymentmethods.model.WalletPaymentMethod;

/* loaded from: Fnq.class */
public final class Fnq implements GIH {
    public final 1GS A00 = DKG.A0J();

    public /* bridge */ /* synthetic */ PaymentMethod B20(24X r302) {
        24X A0e = 4YU.A0e(r302, "wallet");
        24X A0e2 = 4YU.A0e(A0e, "balance");
        Parcelable.Creator creator = CurrencyAmount.CREATOR;
        CurrencyAmount currencyAmount = new CurrencyAmount(JSONUtil.A0H(4YU.A0e(A0e2, "currency"), null), A0e2.A0D(4YT.A00(844)).A07());
        String A0m = DKH.A0m(r302, "title");
        return new WalletPaymentMethod(new StoredValueAccountPaymentMethod(currencyAmount, DKH.A0m(A0e, PublicKeyCredentialControllerUtility.JSON_KEY_ID), A0m, currencyAmount.A06(0S2.A00, this.A00.A05())), A0m);
    }

    public ERI B22() {
        return ERI.A0B;
    }
}

package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.payments.checkout.protocol.model.CheckoutChargeResult;

/* loaded from: E5c.class */
public abstract class E5c extends 45O {
    public static final String __redex_internal_original_name = "PaymentsNetworkOperation";

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        if (this instanceof E5a) {
            return ((E5a) this).A01.A00(anonymousClass439.A01());
        }
        if (!(this instanceof E5b)) {
            return (Parcelable) anonymousClass439.A00().A1W(((45O) this).A00);
        }
        24X A01 = anonymousClass439.A01();
        DKF.A1T(A01, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        return new CheckoutChargeResult(A01.A0D("extra_data"), AbK.A18(A01, PublicKeyCredentialControllerUtility.JSON_KEY_ID));
    }
}

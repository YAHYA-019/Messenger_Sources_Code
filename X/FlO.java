package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.checkout.configuration.model.MemoCheckoutPurchaseInfoExtension;
import com.facebook.payments.form.model.FormFieldAttributes;
import com.facebook.payments.model.FormFieldProperty;
import com.google.common.base.Preconditions;

/* loaded from: FlO.class */
public final class FlO implements GKs {
    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        Preconditions.checkArgument(AnonymousClass001.A1W(Quq.A00(JSONUtil.A0H(r302.A0D("identifier"), null)), Quq.A08));
        Quo quo = Quo.A02;
        String A0P = C3o5.A0P(r302, "placeholder_text", null);
        return new MemoCheckoutPurchaseInfoExtension(new FormFieldAttributes(quo, Qup.A00(C3o5.A0P(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, null)), JSONUtil.A0J(r302.A0D("optional"), false) ? FormFieldProperty.A02 : FormFieldProperty.A03, null, A0P, C3o5.A0P(r302, "prefilled_content", null), null, null, 4YU.A01(r302, "length", 0)));
    }
}

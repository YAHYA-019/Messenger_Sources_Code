package X;

import android.net.Uri;
import com.facebook.payments.p2p.service.model.cards.EditPaymentCardParams;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgx.class */
public final class Fgx implements 1Ro {
    public static final String __redex_internal_original_name = "EditPaymentCardMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        EditPaymentCardParams editPaymentCardParams = (EditPaymentCardParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("month", String.valueOf(editPaymentCardParams.A00)));
        A0s.add(new BasicNameValuePair("year", String.valueOf(editPaymentCardParams.A01)));
        A0s.add(new BasicNameValuePair("csc", editPaymentCardParams.A05));
        A0s.add(new BasicNameValuePair("platform_trust_token", editPaymentCardParams.A04));
        String str = editPaymentCardParams.A02;
        if (str != null) {
            A0s.add(new BasicNameValuePair(ServerW3CShippingAddressConstants.POSTAL_CODE, str));
        }
        A0s.add(new BasicNameValuePair("mobile_eligibility", ConstantsKt.CAMERA_ID_FRONT));
        0fH.A0A(Fgx.class, "Requesting edit payment card");
        Uri.Builder buildUpon = C0A2.A03(0Pz.A0W("/p2p_", editPaymentCardParams.A03)).buildUpon();
        C04083zw A0T = DKC.A0T();
        A0T.A0F = buildUpon.toString();
        AbF.A1Q(A0T, "p2p_edit_cards");
        return DKE.A0W(A0T, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return AbK.A18(AbH.A0w(anonymousClass439), "credential_id");
    }
}

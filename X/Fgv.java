package X;

import android.net.Uri;
import com.facebook.payments.p2p.service.model.cards.AddPaymentCardParams;
import com.facebook.payments.p2p.service.model.cards.AddPaymentCardResult;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgv.class */
public final class Fgv implements 1Ro {
    public static final String __redex_internal_original_name = "AddPaymentCardMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        AddPaymentCardParams addPaymentCardParams = (AddPaymentCardParams) obj;
        String str = addPaymentCardParams.A07;
        Preconditions.checkNotNull(str, "null ptt when attempting to add a card");
        String str2 = addPaymentCardParams.A05;
        Preconditions.checkNotNull(str2, "null creditCardNumber_first6 when attempting to add a card");
        String str3 = addPaymentCardParams.A06;
        Preconditions.checkNotNull(str3, "null creditCardNumber_last4 when attempting to add a card");
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("creditCardNumber", addPaymentCardParams.A04));
        A0s.add(new BasicNameValuePair("month", String.valueOf(addPaymentCardParams.A00)));
        A0s.add(new BasicNameValuePair("year", String.valueOf(addPaymentCardParams.A01)));
        A0s.add(new BasicNameValuePair("csc", addPaymentCardParams.A0A));
        A0s.add(new BasicNameValuePair(ServerW3CShippingAddressConstants.POSTAL_CODE, addPaymentCardParams.A03));
        A0s.add(new BasicNameValuePair("country", addPaymentCardParams.A02));
        A0s.add(new BasicNameValuePair("product_type", addPaymentCardParams.A09));
        A0s.add(new BasicNameValuePair("platform_trust_token", str));
        A0s.add(new BasicNameValuePair("creditCardNumber_token", "$e2ee"));
        A0s.add(new BasicNameValuePair("csc_token", "$e2ee"));
        A0s.add(new BasicNameValuePair("creditCardNumber_first6", str2));
        A0s.add(new BasicNameValuePair("creditCardNumber_last4", str3));
        String str4 = addPaymentCardParams.A08;
        if (!1JF.A0B(str4)) {
            A0s.add(new BasicNameValuePair("product_id", str4));
        }
        0fH.A0A(Fgv.class, "Requesting add payment card");
        Uri.Builder buildUpon = C0A2.A03(0Pz.A0W("/", addPaymentCardParams.A0B)).buildUpon();
        buildUpon.appendEncodedPath("p2p_credit_cards");
        C04083zw A0T = DKC.A0T();
        A0T.A0F = buildUpon.toString();
        AbF.A1Q(A0T, "p2p_credit_cards");
        return DKE.A0X(A0T, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(AddPaymentCardResult.class);
    }
}

package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.p2p.service.model.transactions.DeclinePaymentParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fh0.class */
public final class Fh0 implements 1Ro {
    public static final String __redex_internal_original_name = "DeclinePaymentMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        DeclinePaymentParams declinePaymentParams = (DeclinePaymentParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("transfer_id", declinePaymentParams.A00));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("format", "json"), A0s);
        AbF.A1Q(A0C, "decline_payment");
        return AbK.A0M(A0C, StringFormatUtil.formatStrLocaleSafe("%s/p2p_declined_transfers", declinePaymentParams.A01), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return DKH.A0i(anonymousClass439);
    }
}

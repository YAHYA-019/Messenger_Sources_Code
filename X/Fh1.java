package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.p2p.model.Address;
import com.facebook.payments.p2p.model.P2pCreditCard;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.p2p.service.model.transactions.FetchTransactionPaymentCardParams;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fh1.class */
public final class Fh1 implements 1Ro {
    public static final String __redex_internal_original_name = "FetchTransactionPaymentCardMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("node(%s) { payment_method { credential_id, number, first_name, last_name, expire_month, expire_year, association, address { postal_code } } }", ((FetchTransactionPaymentCardParams) obj).A00);
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("q", formatStrLocaleSafe), A0s);
        AbF.A1P(A0C, "fetchTransactionPaymentCard");
        A0C.A0F = "graphql";
        return DKE.A0X(A0C, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        AbstractC01033pi A00 = anonymousClass439.A00();
        do {
            A00.A1K();
            if (!A00.A1m()) {
                return null;
            }
        } while (A00.A1Y() != "payment_method");
        A00.A1K();
        P2pCreditCard p2pCreditCard = (P2pCreditCard) A00.A1W(P2pCreditCard.class);
        if (p2pCreditCard == null) {
            return null;
        }
        Address address = p2pCreditCard.mAddress;
        String str = FbPaymentCardType.forValue(p2pCreditCard.mAssociation).mPaymentCardType.humanReadableName;
        String str2 = p2pCreditCard.mCredentialId;
        int i = p2pCreditCard.mExpirationMonth;
        return new PaymentCard(address, null, null, str, null, str2, p2pCreditCard.mLastFourDigits, i, i, false, false, false);
    }
}

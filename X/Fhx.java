package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.endtoend.EndToEnd;
import com.facebook.payments.p2p.model.P2pCreditCardWrapper;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.p2p.service.model.cards.FetchPaymentCardsResult;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhx.class */
public final class Fhx implements 1Ro {
    public static final String A01 = StringFormatUtil.formatStrLocaleSafe("id, mobile_csc_verified, zip_verified, web_csc_verified, method_category, commerce_payment_eligible, personal_transfer_eligible, is_default_receiving, %s", "credit_card { credential_id, number, first_name, last_name, expire_month, expire_year, association, address { postal_code }}");
    public static final String __redex_internal_original_name = "FetchPaymentCardsMethod";
    public String A00;

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("viewer() { peer_to_peer_payments { peer_to_peer_payment_methods { %s } } }", A01);
        this.A00 = formatStrLocaleSafe;
        A0s.add(new BasicNameValuePair("q", formatStrLocaleSafe));
        if (EndToEnd.isRunningEndToEndTest()) {
            A0s.add(new BasicNameValuePair("payment_dev_cycle", "test"));
        }
        0fH.A07(Fhx.class, this.A00, "Requesting payment cards info with query: %s");
        C04083zw A0T = DKC.A0T();
        AbF.A1P(A0T, "fetchPaymentCards");
        A0T.A0F = "graphql";
        return DKE.A0X(A0T, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        AbstractC01033pi A00 = anonymousClass439.A00();
        while (A00.A1J() != C42h.A05) {
            A00.A1K();
        }
        ImmutableCollection immutableCollection = (ImmutableCollection) A00.A1V(new EEy(this));
        ImmutableList.Builder A0h = 4YU.A0h();
        PaymentCard paymentCard = null;
        1Du it = immutableCollection.iterator();
        while (it.hasNext()) {
            P2pCreditCardWrapper p2pCreditCardWrapper = (P2pCreditCardWrapper) it.next();
            if (p2pCreditCardWrapper.mP2pCreditCard != null) {
                PaymentCard paymentCard2 = new PaymentCard(p2pCreditCardWrapper);
                A0h.m11011add((Object) paymentCard2);
                if (paymentCard2.A00()) {
                    paymentCard = paymentCard2;
                }
            }
        }
        return new FetchPaymentCardsResult(paymentCard, A0h.build());
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.payments.receipt.PaymentsReceiptActivity;
import com.facebook.payments.receipt.model.ReceiptCommonParams;
import com.facebook.payments.receipt.model.ReceiptComponentControllerParams;
import java.util.HashSet;

/* loaded from: Exx.class */
public final class Exx {
    public final Context A00;
    public final ViewerContext A01;

    public Exx() {
        Context A0J = 7zP.A0J();
        ViewerContext viewerContext = (ViewerContext) 1Bn.A0B(83431);
        this.A00 = A0J;
        this.A01 = viewerContext;
    }

    public Intent A00(ER6 er6, ELR elr, String str) {
        HashSet A0v = AnonymousClass001.A0v();
        C1pq.A08("paymentModulesClient", er6);
        C1pq.A08("productId", str);
        return PaymentsReceiptActivity.A12(this.A00, this.A01, new ReceiptCommonParams(PaymentsDecoratorParams.A03(), new ReceiptComponentControllerParams(er6, elr, str, 4YV.A0z("receiptStyle", A0v, A0v)), null));
    }

    public void A01(ER6 er6, ELR elr, String str) {
        0LS.A0A(this.A00, A00(er6, elr, str));
    }

    public void A02(PaymentTransaction paymentTransaction) {
        ER6 er6;
        ELR elr;
        if (!paymentTransaction.A04.equals(ENJ.A08)) {
            er6 = ER6.A0K;
            elr = ELR.A02;
        } else {
            if (!paymentTransaction.A0D) {
                0LS.A0C(this.A00, AbG.A05().setData(Uri.parse(StringFormatUtil.formatStrLocaleSafe("https://facebook.com/settings?tab=payments&id=%s", paymentTransaction.A0E))));
                return;
            }
            er6 = ER6.A0L;
            elr = ELR.A03;
        }
        String str = paymentTransaction.A0B;
        if (str == null) {
            str = paymentTransaction.A0E;
        }
        A01(er6, elr, str);
    }
}

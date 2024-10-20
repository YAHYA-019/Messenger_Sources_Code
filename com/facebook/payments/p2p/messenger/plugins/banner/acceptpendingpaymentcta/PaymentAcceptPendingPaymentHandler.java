package com.facebook.payments.p2p.messenger.plugins.banner.acceptpendingpaymentcta;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.7gY;
import X.A1b;
import X.AnonymousClass224;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PaymentAcceptPendingPaymentHandler.class */
public final class PaymentAcceptPendingPaymentHandler {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final FbUserSession A03;

    public PaymentAcceptPendingPaymentHandler(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A03 = fbUserSession;
        this.A01 = 1Bq.A00(49965);
        this.A02 = 1Bq.A00(66774);
    }

    public final void A00(Long l) {
        1Br A00 = 1Lm.A00(this.A00, this.A03, 68289);
        if (l != null) {
            7gY r0 = (7gY) 1Br.A0B(A00);
            long longValue = l.longValue();
            r0.A01(new A1b(this, 36), ((AnonymousClass224) 1Br.A0B(this.A02)).A00("299099118739086"), longValue);
        }
    }
}

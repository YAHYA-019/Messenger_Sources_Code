package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.util.TriState;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.payments.p2p.protocol.theme.Themeable;
import com.facebook.payments.p2p.service.model.eligibility.FetchP2PSendEligibilityParams;
import com.facebook.payments.p2p.service.model.eligibility.FetchP2PSendEligibilityResult;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsParams;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsResult;
import com.facebook.payments.p2p.service.model.transactions.FetchPaymentTransactionParams;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: E6L.class */
public final class E6L extends 3XG {
    public 1BY A00;
    public final F7L A01;
    public final C15h A02;

    public E6L(1BO r302) {
        super("PaymentCacheServiceHandler");
        this.A00 = 7zL.A0Q(r302);
        this.A02 = G7K.A01(this, ActionId.DATA_LOAD_START);
        this.A01 = DKD.A0c();
    }

    public OperationResult A0D(1Tu r302, 1TC r303) {
        Themeable themeable;
        Themeable themeable2;
        1BY r0 = this.A00;
        Object A04 = 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 98934);
        EfD efD = (EfD) A04;
        synchronized (A04) {
            themeable = efD.A00;
        }
        if (themeable != null) {
            synchronized (A04) {
                themeable2 = efD.A00;
            }
            return OperationResult.A04(themeable2);
        }
        OperationResult BMQ = r302.BMQ(r303);
        Themeable themeable3 = (Themeable) BMQ.A07();
        synchronized (A04) {
            efD.A00 = themeable3;
        }
        return BMQ;
    }

    public OperationResult A0M(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        2JY r0 = (GNv) BMQ.A07();
        1BY r02 = this.A00;
        ((C7t) 1Lo.A04((Context) null, 1Fw.A05(r02), r02, 83078)).A00(r0);
        F7L f7l = this.A01;
        String A0k = r0.A0k();
        Intent A05 = AbF.A05();
        A05.putExtra("extra_payment_request_id", A0k);
        F7L.A00(A05, f7l, "com.facebook.messaging.payment.ACTION_PAYMENT_REQUEST_CACHE_UPDATED");
        return BMQ;
    }

    public OperationResult A0N(1Tu r302, 1TC r303) {
        OperationResult BMQ;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        FetchPaymentRequestsParams fetchPaymentRequestsParams = (FetchPaymentRequestsParams) r303.A00.getParcelable("FetchPaymentRequestsParams");
        1BY r0 = this.A00;
        Object A04 = 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 83078);
        C7t c7t = (C7t) A04;
        C15h c15h = this.A02;
        if (1BL.A1a(c15h) && fetchPaymentRequestsParams.A00 == EKm.A01) {
            synchronized (A04) {
                immutableList = c7t.A00;
            }
            if (immutableList != null) {
                synchronized (A04) {
                    immutableList2 = c7t.A00;
                }
                BMQ = OperationResult.A04(new FetchPaymentRequestsResult(1BK.A17(immutableList2)));
                return BMQ;
            }
        }
        BMQ = r302.BMQ(r303);
        if (1BL.A1a(c15h) && fetchPaymentRequestsParams.A00 == EKm.A01) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) ((FetchPaymentRequestsResult) BMQ.A07()).A00);
            c7t.A01(copyOf);
            if (!copyOf.isEmpty()) {
                F7L.A00(AbF.A05(), this.A01, "com.facebook.messaging.payment.ACTION_PAYMENT_REQUEST_CACHE_UPDATED");
                return BMQ;
            }
        }
        return BMQ;
    }

    public OperationResult A0O(1Tu r302, 1TC r303) {
        PaymentTransaction paymentTransaction;
        1BY r0 = this.A00;
        EtG etG = (EtG) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 98932);
        if (1BL.A1a(this.A02)) {
            FetchPaymentTransactionParams fetchPaymentTransactionParams = (FetchPaymentTransactionParams) r303.A00.getParcelable("fetchPaymentTransactionParams");
            String str = fetchPaymentTransactionParams.A01;
            synchronized (etG) {
                paymentTransaction = (PaymentTransaction) etG.A01.get(str);
            }
            if (paymentTransaction != null && (fetchPaymentTransactionParams.A00 == 1He.A05 || paymentTransaction.A07.isTerminalStatus)) {
                return OperationResult.A04(paymentTransaction);
            }
        }
        OperationResult BMQ = r302.BMQ(r303);
        PaymentTransaction paymentTransaction2 = (PaymentTransaction) BMQ.A07();
        etG.A00(paymentTransaction2);
        this.A01.A01(paymentTransaction2.A07, Long.parseLong(paymentTransaction2.A0E));
        return BMQ;
    }

    public OperationResult A0P(1Tu r302, 1TC r303) {
        TriState valueOf;
        FetchP2PSendEligibilityParams fetchP2PSendEligibilityParams = (FetchP2PSendEligibilityParams) r303.A00.getParcelable("P2PSendEligibilityParams");
        1BY r0 = this.A00;
        Object A04 = 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 98933);
        EfC efC = (EfC) A04;
        if (fetchP2PSendEligibilityParams.A00 == 1He.A04) {
            String str = fetchP2PSendEligibilityParams.A01;
            synchronized (A04) {
                valueOf = TriState.valueOf((Boolean) efC.A00.get(str));
            }
            if (valueOf.isSet()) {
                return OperationResult.A04(new FetchP2PSendEligibilityResult(Boolean.valueOf(valueOf.asBoolean())));
            }
        }
        OperationResult BMQ = r302.BMQ(r303);
        FetchP2PSendEligibilityResult fetchP2PSendEligibilityResult = (FetchP2PSendEligibilityResult) BMQ.A07();
        String str2 = fetchP2PSendEligibilityParams.A01;
        boolean z = fetchP2PSendEligibilityResult.mCanSend;
        synchronized (A04) {
            efC.A00.put(str2, Boolean.valueOf(z));
        }
        return BMQ;
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.cardform.CardFormCommonParams;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;
import java.lang.ref.Reference;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* renamed from: X.Db7, reason: case insensitive filesystem */
/* loaded from: Db7.class */
public final class C2082Db7 extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C2082Db7(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj4;
        this.A02 = obj3;
        this.A04 = obj;
    }

    public static void A00(C2082Db7 c2082Db7, 2JX r302) {
        FnU fnU = (FnU) c2082Db7.A01;
        ETu eTu = fnU.A01;
        Ex2 ex2 = fnU.A06;
        CardFormCommonParams Abq = ((CardFormParams) c2082Db7.A03).Abq();
        eTu.A09(ex2.A00(r302, Abq.cardFormAnalyticsParams.paymentsLoggingSessionData, Abq.paymentItemType));
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_failure", new Throwable(r302.A0r(-481040315)));
        fnU.A01.A08(new FHd(bundle, 0S2.A0u));
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x03d9, code lost:
    
        if (r310 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r305 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r305 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2082Db7.A02(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void A03(Throwable th) {
        FnU fnU;
        CardFormCommonParams Abq;
        switch (this.A00) {
            case 0:
                LVb.A03((LVb) this.A01, new LnL(this, th));
                return;
            case 1:
                ((CbS) this.A01).A01((Set) this.A04, (Future) this.A02);
                DH9 dh9 = (DH9) ((Reference) this.A03).get();
                if (dh9 != null) {
                    dh9.BxR(th);
                    return;
                }
                return;
            case 2:
                E5E e5e = (E5E) this.A01;
                e5e.A09.A08((PaymentsFlowStep) this.A03, e5e.A00, e5e.A01, th);
                ((GL5) this.A04).BMd(ServiceException.A00(th), (GKX) this.A02, false);
                return;
            case 3:
                FnS fnS = (FnS) this.A01;
                FI9.A04(fnS.A02, new QQx(fnS, th), th);
                fnU = fnS.A04;
                Abq = ((CardFormParams) this.A03).Abq();
                fnU.A01(Abq.cardFormAnalyticsParams, th);
                return;
            default:
                fnU = (FnU) this.A01;
                Abq = ((CardFormParams) this.A03).Abq();
                PaymentItemType paymentItemType = Abq.paymentItemType;
                PaymentsLoggingSessionData paymentsLoggingSessionData = Abq.cardFormAnalyticsParams.paymentsLoggingSessionData;
                Context context = fnU.A02;
                if (new G8K(context.getResources(), context.getString(2131952325), (String) null, th).mPaymentsApiException != null) {
                    fnU.A01.A09(fnU.A06.A01(paymentsLoggingSessionData, paymentItemType, th));
                } else {
                    ServiceException serviceException = (ServiceException) 0G8.A02(ServiceException.class, th);
                    if (serviceException != null) {
                        FI9.A01(context, serviceException, FI9.A00);
                    }
                }
                fnU.A01(Abq.cardFormAnalyticsParams, th);
                return;
        }
    }

    public void A04(CancellationException cancellationException) {
        switch (this.A00) {
            case 0:
                LVb.A03((LVb) this.A01, new LnL(this, cancellationException));
                return;
            case 1:
                ((CbS) this.A01).A01((Set) this.A04, (Future) this.A02);
                return;
            default:
                super.A04(cancellationException);
                return;
        }
    }
}

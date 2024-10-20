package X;

import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;

/* renamed from: X.Db1, reason: case insensitive filesystem */
/* loaded from: Db1.class */
public final class C2076Db1 extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C2076Db1(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj2;
        this.A05 = obj5;
        this.A03 = obj;
        this.A02 = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c4, code lost:
    
        if (r308.A0L(-860066186, r307, 662969481) == null) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2076Db1.A02(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void A03(Throwable th) {
        PaymentsLoggingSessionData paymentsLoggingSessionData;
        PaymentItemType paymentItemType;
        ETu eTu;
        Ex2 ex2;
        switch (this.A00) {
            case 0:
                FnT fnT = (FnT) this.A01;
                FI9.A04(fnT.A02, new QQz(fnT, th), th);
                fnT.A05.A01(((CardFormParams) this.A04).Abq().cardFormAnalyticsParams, th);
                return;
            case 1:
                FEe fEe = (FEe) this.A01;
                paymentsLoggingSessionData = (PaymentsLoggingSessionData) this.A04;
                fEe.A02.getString(2131965906);
                paymentItemType = (PaymentItemType) this.A02;
                fEe.A05.A08((PaymentsFlowStep) this.A03, paymentsLoggingSessionData, th);
                eTu = fEe.A00;
                ex2 = fEe.A04;
                eTu.A09(ex2.A01(paymentsLoggingSessionData, paymentItemType, th));
                return;
            default:
                ((QRF) this.A02).A0W();
                Foc foc = (Foc) this.A01;
                paymentsLoggingSessionData = (PaymentsLoggingSessionData) this.A05;
                paymentItemType = (PaymentItemType) this.A04;
                foc.A04.A07(PaymentsFlowStep.A1e, paymentsLoggingSessionData, "payflows_fail");
                eTu = foc.A00;
                ex2 = foc.A03;
                eTu.A09(ex2.A01(paymentsLoggingSessionData, paymentItemType, th));
                return;
        }
    }
}

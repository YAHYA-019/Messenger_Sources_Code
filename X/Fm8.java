package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.auth.pin.newpin.PaymentPinParams;
import com.facebook.payments.auth.pin.newpinv2.PaymentPinV2Activity;
import com.facebook.payments.confirmation.ConfirmationCommonParamsCore;
import com.facebook.payments.confirmation.SimpleConfirmationData;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.receipt.PaymentsReceiptActivity;
import com.facebook.payments.receipt.model.ReceiptCommonParams;
import com.facebook.payments.receipt.model.ReceiptComponentControllerParams;
import com.facebook.smartcapture.logging.MC;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.HashSet;

/* loaded from: Fm8.class */
public final class Fm8 implements GJR {
    public ETu A00;
    public 1BY A01;
    public final Context A02 = AbF.A04((1BY) null);
    public final ViewerContext A03 = (ViewerContext) 1Bn.A0E((Context) null, (1BY) null, 83431);
    public final EX8 A0B = (EX8) 1Bi.A03(99003);
    public final C00i A06 = 1BQ.A00();
    public final C00i A05 = 1BQ.A02(84955);
    public final FI2 A09 = (FI2) 1Bn.A0E((Context) null, (1BY) null, 99119);
    public final C00i A08 = 1BQ.A02(84011);
    public final C00i A07 = 1BQ.A02(99089);
    public final C00i A0A = 1BV.A01((1BY) null, 99025);
    public final C00i A04 = 1BQ.A01();

    public Fm8(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public void BoW(GOK gok, SimpleConfirmationData simpleConfirmationData) {
        ETu eTu;
        Intent A12;
        String str;
        QpY Ado = gok.Ado();
        int ordinal = Ado.ordinal();
        if (ordinal == 5) {
            RuC ruC = (RuC) gok;
            PaymentItemType paymentItemType = ruC.A00;
            if (paymentItemType == PaymentItemType.A0B && ((str = ruC.A01) == null || str.equals(ConstantsKt.CAMERA_ID_FRONT))) {
                ((CPc) this.A05.get()).A05(this.A02, C1ic.A0v);
                return;
            }
            if (R35.A00(1BK.A0N(this.A06).BCy(MC.android_payment.payment_item_types_that_support_rn_receipts)).contains(paymentItemType.mValue)) {
                String str2 = ruC.A03;
                str2.getClass();
                ((CPc) this.A05.get()).A05(this.A02, str2);
                return;
            }
            if (!(!R35.A00(1BK.A0N(r0).BCy(MC.android_payment.payment_item_types_doesnt_support_in_app_receipt)).contains(paymentItemType.mValue))) {
                Uri A0A = DKH.A0A(this.A04, StringFormatUtil.formatStrLocaleSafe("https://facebook.com/settings?tab=payments&id=%s", ruC.A01));
                if (A0A != null) {
                    this.A00.A05(AbG.A05().setData(A0A.buildUpon().build()));
                    return;
                }
                return;
            }
            HashSet A0v = AnonymousClass001.A0v();
            ER6 A00 = paymentItemType.A00();
            C1pq.A08("paymentModulesClient", A00);
            String str3 = ruC.A01;
            C1pq.A08("productId", str3);
            ReceiptComponentControllerParams receiptComponentControllerParams = new ReceiptComponentControllerParams(A00, null, str3, A0v);
            PaymentsDecoratorParams.A03();
            ReceiptCommonParams receiptCommonParams = new ReceiptCommonParams(PaymentsDecoratorParams.A01(), receiptComponentControllerParams, null);
            eTu = this.A00;
            A12 = PaymentsReceiptActivity.A12(this.A02, this.A03, receiptCommonParams);
        } else {
            if (ordinal == 0) {
                ConfirmationCommonParamsCore confirmationCommonParamsCore = simpleConfirmationData.A00.A02;
                PaymentsLoggingSessionData paymentsLoggingSessionData = confirmationCommonParamsCore.A05;
                PaymentItemType paymentItemType2 = confirmationCommonParamsCore.A06;
                if (!this.A09.A04()) {
                    PaymentsFlowStep paymentsFlowStep = PaymentsFlowStep.A0a;
                    if (paymentsLoggingSessionData != null) {
                        FIQ.A00(paymentsFlowStep, DKF.A0Z(this.A07), paymentsLoggingSessionData);
                    }
                    this.A00.A06(PaymentPinV2Activity.A12(this.A02, new PaymentPinParams(null, null, null, null, null, EO0.A06, null, PaymentsDecoratorParams.A02(), paymentsLoggingSessionData, paymentItemType2, null, "PIN", null, null, -1.0f, true, true)), 1);
                    return;
                }
                PaymentsFlowStep paymentsFlowStep2 = PaymentsFlowStep.A1P;
                if (paymentsLoggingSessionData != null) {
                    FIQ.A00(paymentsFlowStep2, DKF.A0Z(this.A07), paymentsLoggingSessionData);
                    1Br.A0C(C06014fk.A07().A02);
                    11T.A0F(this.A02, 0);
                } else {
                    1Br.A0C(C06014fk.A07().A02);
                }
                Intent A06 = DKG.A06(AbG.A05(), "fb-messenger://payments/settings");
                if (A06 != null) {
                    this.A00.A04(A06);
                    return;
                }
                return;
            }
            if (ordinal != 1) {
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(Ado, "Unsupported ", AnonymousClass001.A0k()));
            }
            eTu = this.A00;
            A12 = ((GJL) this.A08.get()).Arj(this.A02, ((RuB) gok).A00);
        }
        eTu.A04(A12);
    }

    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public void BLh(SimpleConfirmationData simpleConfirmationData) {
        ConfirmationCommonParamsCore confirmationCommonParamsCore = simpleConfirmationData.A00.A02;
        PaymentItemType paymentItemType = confirmationCommonParamsCore.A06;
        if (confirmationCommonParamsCore.A0A) {
            if (simpleConfirmationData.A01.contains(QpY.A01)) {
                return;
            }
            Eu5 eu5 = (Eu5) this.A0A.get();
            Context context = this.A02;
            PaymentsLoggingSessionData paymentsLoggingSessionData = confirmationCommonParamsCore.A05;
            Intent A00 = eu5.A00(context, paymentsLoggingSessionData, paymentItemType, false, false);
            if (A00 != null) {
                PaymentsFlowStep paymentsFlowStep = PaymentsFlowStep.A0Z;
                if (paymentsLoggingSessionData != null) {
                    FIQ.A00(paymentsFlowStep, DKF.A0Z(this.A07), paymentsLoggingSessionData);
                }
                0LS.A0A(context, A00);
            }
        }
    }

    public void CsR(ETu eTu) {
        this.A00 = eTu;
    }
}

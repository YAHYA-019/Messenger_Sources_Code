package com.facebook.payments.paymentmethods.cardform;

import X.0FI;
import X.0S2;
import X.1BK;
import X.1BQ;
import X.1iF;
import X.7zO;
import X.BxS;
import X.C00i;
import X.DKF;
import X.DKG;
import X.ETu;
import X.EuD;
import X.FHd;
import X.FIQ;
import X.GFn;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.dialog.ConfirmActionParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.paymentmethods.model.FbPaymentCard;

/* loaded from: DeleteFbPaymentCardDialogFragment.class */
public class DeleteFbPaymentCardDialogFragment extends ConfirmActionDialogFragment implements GFn {
    public CardFormParams A00;
    public ETu A01;
    public EuD A02;
    public final C00i A03 = 1BQ.A02(99089);

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, com.facebook.payments.paymentmethods.cardform.DeleteFbPaymentCardDialogFragment] */
    public static DeleteFbPaymentCardDialogFragment A05(CardFormParams cardFormParams, FbPaymentCard fbPaymentCard, int i, int i2) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("extra_fb_payment_card", fbPaymentCard);
        A05.putParcelable("extra_card_form_style", cardFormParams);
        A05.putInt("extra_message_res_id", i);
        A05.putInt("extra_remove_message_res_id", i2);
        ?? deleteFbPaymentCardDialogFragment = new DeleteFbPaymentCardDialogFragment();
        deleteFbPaymentCardDialogFragment.setArguments(A05);
        return deleteFbPaymentCardDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public Dialog A0n(Bundle bundle) {
        BxS bxS = new BxS(getString(requireArguments().getInt("extra_remove_message_res_id")), getString(2131953849));
        bxS.A03 = getString(requireArguments().getInt("extra_message_res_id"));
        bxS.A05 = false;
        super.A00 = new ConfirmActionParams(bxS);
        FIQ A0Z = DKF.A0Z(this.A03);
        CardFormCommonParams Abq = this.A00.Abq();
        A0Z.A05((Bundle) null, PaymentsFlowStep.A1p, Abq.cardFormAnalyticsParams.paymentsLoggingSessionData, Abq.paymentItemType);
        return super.A0n(bundle);
    }

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public 1iF A17() {
        return DKG.A0I();
    }

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1C() {
        super.A1C();
        DKF.A0Z(this.A03).A07(PaymentsFlowStep.A1p, this.A00.Abq().cardFormAnalyticsParams.paymentsLoggingSessionData, "payflows_cancel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1E() {
        DKF.A0Z(this.A03).A07(PaymentsFlowStep.A1p, this.A00.Abq().cardFormAnalyticsParams.paymentsLoggingSessionData, "payflows_click");
        Parcelable parcelable = requireArguments().getParcelable("extra_fb_payment_card");
        Bundle A05 = 1BK.A05();
        A05.putString("extra_mutation", "action_delete_payment_card");
        A05.putParcelable("extra_fb_payment_card", parcelable);
        this.A01.A08(new FHd(A05, 0S2.A0C));
    }

    @Override // X.GFn
    public void CsR(ETu eTu) {
        this.A01 = eTu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-679870932);
        super.onCreate(bundle);
        this.A02 = (EuD) 7zO.A0l(this, 99225);
        this.A00 = (CardFormParams) requireArguments().getParcelable("extra_card_form_style");
        0FI.A08(-1461445917, A02);
    }
}

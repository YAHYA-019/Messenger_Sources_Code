package com.facebook.payments.dialog;

import X.0FI;
import X.1AI;
import X.1BJ;
import X.1BK;
import X.1Ho;
import X.1iF;
import X.2Ov;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AnonymousClass002;
import X.BxS;
import X.C3o5;
import X.DKC;
import X.DKF;
import X.DKG;
import X.DYh;
import X.DZG;
import X.DZy;
import X.ELR;
import X.ER6;
import X.Ej8;
import X.Exx;
import X.FIQ;
import X.FIk;
import X.FKF;
import X.Fch;
import X.FmR;
import X.GFW;
import X.GK6;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.dialog.ConfirmActionParams;
import com.facebook.payments.p2p.messenger.core.prefs.PaymentsPreferenceActivity;
import com.facebook.payments.p2p.messenger.core.prefs.method.verification.PaymentMethodVerificationHostActivity;
import com.facebook.payments.p2p.messenger.core.share.PaymentEligibleShareExtras;
import com.facebook.payments.p2p.service.model.transactions.CancelPaymentTransactionParams;
import com.facebook.payments.p2p.verification.PaymentRiskVerificationActivity;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;
import com.facebook.payments.shipping.model.ShippingCommonParams;
import com.facebook.smartcapture.logging.SCEventNames;

/* loaded from: PaymentsConfirmDialogFragment.class */
public class PaymentsConfirmDialogFragment extends ConfirmActionDialogFragment {
    public GFW A00;

    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.fragment.app.Fragment, X.2Ov, com.facebook.payments.dialog.PaymentsConfirmDialogFragment] */
    public static PaymentsConfirmDialogFragment A05(String str, String str2, String str3, String str4) {
        BxS bxS = new BxS(str, str3);
        bxS.A03 = str2;
        bxS.A04 = str4;
        bxS.A05 = true;
        ConfirmActionParams confirmActionParams = new ConfirmActionParams(bxS);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("confirm_action_params", confirmActionParams);
        A05.putBoolean("is_cancelable_extra", true);
        ?? r0 = new 2Ov();
        r0.setArguments(A05);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        boolean z = requireArguments().getBoolean("is_cancelable_extra");
        A0n.setCanceledOnTouchOutside(z);
        A0n.setCancelable(z);
        if (!z) {
            A0n.setOnKeyListener(new FKF(this, 5));
        }
        return A0n;
    }

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public 1iF A17() {
        return DKG.A0I();
    }

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1C() {
        super.A1C();
        GFW gfw = this.A00;
        if (gfw != null) {
            gfw.Bmz();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r306v4, types: [com.facebook.payments.p2p.verification.PaymentRiskVerificationActivity] */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1D() {
        PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity;
        PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity2;
        FragmentActivity activity;
        FmR fmR = this.A00;
        if (fmR != null) {
            FmR fmR2 = fmR;
            switch (fmR2.A00) {
                case 1:
                    PaymentMethodVerificationHostActivity.A1G((PaymentMethodVerificationHostActivity) fmR2.A01);
                    return;
                case 2:
                case 3:
                    PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity3 = (PaymentMethodVerificationHostActivity) fmR2.A01;
                    PaymentMethodVerificationHostActivity.A16(paymentMethodVerificationHostActivity3);
                    paymentMethodVerificationHostActivity = paymentMethodVerificationHostActivity3;
                    paymentMethodVerificationHostActivity.setResult(-1);
                    paymentMethodVerificationHostActivity2 = paymentMethodVerificationHostActivity;
                    paymentMethodVerificationHostActivity2.finish();
                    return;
                case 4:
                    PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity4 = (PaymentMethodVerificationHostActivity) fmR2.A01;
                    PaymentEligibleShareExtras paymentEligibleShareExtras = paymentMethodVerificationHostActivity4.A06;
                    if (paymentEligibleShareExtras == null || paymentEligibleShareExtras.A02 == -1) {
                        AbK.A0q(paymentMethodVerificationHostActivity4.A0F).A0A(paymentMethodVerificationHostActivity4, C3o5.A0D(paymentMethodVerificationHostActivity4, PaymentsPreferenceActivity.class));
                        paymentMethodVerificationHostActivity = paymentMethodVerificationHostActivity4;
                    } else {
                        ((Exx) paymentMethodVerificationHostActivity4.A03.get()).A01(ER6.A0K, ELR.A02, Long.toString(paymentMethodVerificationHostActivity4.A06.A02));
                        paymentMethodVerificationHostActivity = paymentMethodVerificationHostActivity4;
                    }
                    paymentMethodVerificationHostActivity.setResult(-1);
                    paymentMethodVerificationHostActivity2 = paymentMethodVerificationHostActivity;
                    paymentMethodVerificationHostActivity2.finish();
                    return;
                case 5:
                    ?? r306 = (PaymentRiskVerificationActivity) fmR2.A01;
                    Fch fch = r306.A05;
                    String str = r306.A03;
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable("CancelPaymentTransactionParams", new CancelPaymentTransactionParams(str));
                    1Ho newInstance_DEPRECATED = fch.A08.newInstance_DEPRECATED(1BJ.A00(349), A05, 0, AbH.A0B(fch));
                    newInstance_DEPRECATED.A0A = true;
                    1Ho.A00(newInstance_DEPRECATED, true);
                    paymentMethodVerificationHostActivity2 = r306;
                    paymentMethodVerificationHostActivity2.finish();
                    return;
                case 6:
                    fmR2.Bmz();
                    return;
                case 7:
                case 9:
                default:
                    return;
                case 8:
                    Intent A052 = AbG.A05();
                    DKF.A16(A052, "https://m.facebook.com/help/contact/370238886476028");
                    DYh dYh = (DYh) fmR2.A01;
                    DKF.A15(A052, dYh, DKC.A0f(dYh.A00).A03());
                    activity = dYh.getActivity();
                    activity.finish();
                    return;
                case 10:
                    FIk fIk = (FIk) fmR2.A01;
                    fIk.A05 = false;
                    fIk.A03.A1b();
                    if (fIk.A04 != null) {
                        CardFormParams.A01(fIk).getClass();
                        Intent Arb = CardFormParams.A03(fIk.A00, fIk).Arb(fIk.A02);
                        if (Arb != null) {
                            fIk.A04.A05(Arb);
                            return;
                        }
                        return;
                    }
                    return;
                case 11:
                    DZy dZy = (DZy) fmR2.A01;
                    FIQ fiq = dZy.A0b;
                    fiq.A0A(dZy.A0C.paymentsLoggingSessionData, "do_not_save", SCEventNames.Params.BUTTON_NAME);
                    ShippingCommonParams shippingCommonParams = dZy.A0C;
                    FIQ.A00(shippingCommonParams.paymentsFlowStep, fiq, shippingCommonParams.paymentsLoggingSessionData);
                    activity = dZy.A1P();
                    activity.finish();
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.facebook.base.activity.FbFragmentActivity] */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1E() {
        PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity;
        DZG dzg;
        FmR fmR = this.A00;
        if (fmR != null) {
            FmR fmR2 = fmR;
            switch (fmR2.A00) {
                case 0:
                    PaymentMethodVerificationHostActivity.A1F((PaymentMethodVerificationHostActivity) fmR2.A01);
                    return;
                case 1:
                    PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity2 = (PaymentMethodVerificationHostActivity) fmR2.A01;
                    paymentMethodVerificationHostActivity2.A0E.get();
                    AbK.A0q(paymentMethodVerificationHostActivity2.A0F).A09(paymentMethodVerificationHostActivity2, DKF.A07(paymentMethodVerificationHostActivity2), 1002);
                    return;
                case 2:
                    paymentMethodVerificationHostActivity = (PaymentMethodVerificationHostActivity) fmR2.A01;
                    Intent A12 = PaymentMethodVerificationHostActivity.A12(paymentMethodVerificationHostActivity);
                    PaymentMethodVerificationHostActivity.A1D(paymentMethodVerificationHostActivity);
                    AbK.A0q(paymentMethodVerificationHostActivity.A0F).A0A(paymentMethodVerificationHostActivity, A12);
                    DKG.A1M(paymentMethodVerificationHostActivity);
                    return;
                case 3:
                    PaymentMethodVerificationHostActivity.A15((PaymentMethodVerificationHostActivity) fmR2.A01);
                    return;
                case 4:
                    paymentMethodVerificationHostActivity = (FbFragmentActivity) fmR2.A01;
                    DKG.A1M(paymentMethodVerificationHostActivity);
                    return;
                case 5:
                    return;
                case 6:
                    dzg = (DZG) fmR2.A01;
                    String str = dzg.A05;
                    if (str == null) {
                        Ej8 ej8 = dzg.A03;
                        String str2 = dzg.A07;
                        Long A0H = AnonymousClass002.A0H(ej8.A00.now());
                        StringBuilder sb = new StringBuilder(10);
                        int i = 0;
                        do {
                            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(ej8.A01.nextInt(62)));
                            i++;
                        } while (i < 10);
                        str = StringFormatUtil.formatStrLocaleSafe("https://m.facebook.com/p2p/verify/?id=%s&source=orca_android&ts=%d&seed=%s", str2, A0H, sb.toString());
                    }
                    new 1AI().BXk(dzg.getContext(), Uri.parse(str).buildUpon().build());
                    dzg.getActivity().finish();
                    return;
                case 7:
                case 8:
                case 9:
                default:
                    dzg = (Fragment) fmR2.A01;
                    dzg.getActivity().finish();
                    return;
                case 10:
                    FIk fIk = (FIk) fmR2.A01;
                    fIk.A05 = false;
                    fIk.A03.A1b();
                    return;
                case 11:
                    DZy dZy = (DZy) fmR2.A01;
                    FIQ fiq = dZy.A0b;
                    fiq.A0A(dZy.A0C.paymentsLoggingSessionData, "save", SCEventNames.Params.BUTTON_NAME);
                    ShippingCommonParams shippingCommonParams = dZy.A0C;
                    FIQ.A00(shippingCommonParams.paymentsFlowStep, fiq, shippingCommonParams.paymentsLoggingSessionData);
                    GK6 gk6 = dZy.A09;
                    if (gk6 != null) {
                        gk6.CIZ();
                        return;
                    }
                    return;
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        GFW gfw = this.A00;
        if (gfw != null) {
            gfw.Bmz();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1231048786);
        super.onCreate(bundle);
        super.A00 = (ConfirmActionParams) requireArguments().getParcelable("confirm_action_params");
        0FI.A08(216511596, A02);
    }
}

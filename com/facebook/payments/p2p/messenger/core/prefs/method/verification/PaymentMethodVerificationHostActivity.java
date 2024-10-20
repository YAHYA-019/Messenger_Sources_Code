package com.facebook.payments.p2p.messenger.core.prefs.method.verification;

import X.0S2;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Ho;
import X.1Kd;
import X.2FP;
import X.2FT;
import X.4DQ;
import X.4YU;
import X.7zL;
import X.7zU;
import X.AbE;
import X.AbF;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AbstractC00603o4;
import X.C00i;
import X.C06c;
import X.C6oh;
import X.DKF;
import X.DKG;
import X.DM3;
import X.DU7;
import X.DUD;
import X.EMQ;
import X.Ej7;
import X.EqP;
import X.F9R;
import X.Fch;
import X.FmR;
import X.FnB;
import X.Fvf;
import X.FwK;
import X.GFW;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.locale.Country;
import com.facebook.payments.auth.model.NuxFollowUpAction;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.dialog.PaymentsConfirmDialogFragment;
import com.facebook.payments.p2p.messenger.core.share.PaymentEligibleShareExtras;
import com.facebook.payments.p2p.model.PaymentCard;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: PaymentMethodVerificationHostActivity.class */
public final class PaymentMethodVerificationHostActivity extends FbFragmentActivity {
    public FrameLayout A00;
    public ProgressBar A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public NuxFollowUpAction A05;
    public PaymentEligibleShareExtras A06;
    public ImmutableList A07;
    public FbUserSession A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public final C00i A0F = AbH.A0D();
    public final C00i A0D = 1BQ.A01();
    public final C00i A0C = 1BQ.A02(50145);
    public final C00i A0E = 1BQ.A02(99003);
    public final GFW A0G = new FmR(this, 0);
    public final GFW A0H = new FmR(this, 1);
    public final GFW A0I = new FmR(this, 2);
    public final GFW A0K = new FmR(this, 3);
    public final GFW A0J = new FmR(this, 4);

    public static Intent A12(PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity) {
        if (paymentMethodVerificationHostActivity.A06 == null) {
            return null;
        }
        Intent A0A = 4YU.A0A(AbstractC00603o4.A00(1));
        DKF.A16(A0A, AbE.A00(9));
        A0A.putExtra("ShareType", "ShareType.paymentEligible");
        A0A.putExtra("trigger", "payment_eligible");
        A0A.putExtra("max_recipients", paymentMethodVerificationHostActivity.A06.A01);
        A0A.putExtra("share_caption", paymentMethodVerificationHostActivity.A06.A06);
        A0A.putExtra(AbstractC00603o4.A00(20), paymentMethodVerificationHostActivity.A06.A05);
        A0A.putExtra(AbE.A00(12), paymentMethodVerificationHostActivity.A06);
        return A0A;
    }

    public static void A15(PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity) {
        FnB fnB = new FnB(paymentMethodVerificationHostActivity, 1);
        ImmutableList.of();
        ImmutableList immutableList = paymentMethodVerificationHostActivity.A07;
        DM3 serializableExtra = paymentMethodVerificationHostActivity.getIntent().getSerializableExtra("payment_flow_type");
        paymentMethodVerificationHostActivity.getIntent().getStringExtra("sender_name");
        String stringExtra = paymentMethodVerificationHostActivity.getIntent().getStringExtra("transaction_id");
        EMQ serializableExtra2 = paymentMethodVerificationHostActivity.getIntent().getSerializableExtra("launch_mode");
        PaymentEligibleShareExtras paymentEligibleShareExtras = paymentMethodVerificationHostActivity.A06;
        if (paymentEligibleShareExtras != null) {
            if ("adcampaign".equals(paymentEligibleShareExtras.A05)) {
                paymentMethodVerificationHostActivity.getResources().getString(2131963018);
                paymentMethodVerificationHostActivity.getResources().getString(2131963019);
            }
            DU7 A00 = DU7.A00(1BK.A06(paymentMethodVerificationHostActivity.A04));
            DUD A05 = DUD.A05("p2p_incentives_initiate_add_card", "p2p_incentives");
            A05.A0D("campaign_name", paymentMethodVerificationHostActivity.A06.A04);
            A05.A0D(Property.SYMBOL_Z_ORDER_SOURCE, paymentMethodVerificationHostActivity.A06.A05);
            A00.A03(A05);
        }
        F9R f9r = (F9R) paymentMethodVerificationHostActivity.A0A.get();
        FbUserSession fbUserSession = paymentMethodVerificationHostActivity.A08;
        fbUserSession.getClass();
        f9r.A02(fbUserSession, fnB, new EqP((Fragment) null, (Country) null, serializableExtra, (PaymentCard) null, serializableExtra2, immutableList, stringExtra, false));
    }

    public static void A16(PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity) {
        if (paymentMethodVerificationHostActivity.A06 != null) {
            DU7 A00 = DU7.A00(1BK.A06(paymentMethodVerificationHostActivity.A04));
            DUD A05 = DUD.A05("p2p_incentives_cancel_pressed", "p2p_incentives");
            A05.A0D("campaign_name", paymentMethodVerificationHostActivity.A06.A04);
            A00.A03(A05);
        }
    }

    public static void A1D(PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity) {
        if (paymentMethodVerificationHostActivity.A06 != null) {
            DU7 A00 = DU7.A00(1BK.A06(paymentMethodVerificationHostActivity.A04));
            DUD A05 = DUD.A05("p2p_incentives_initiate_picker", "p2p_incentives");
            A05.A0D("campaign_name", paymentMethodVerificationHostActivity.A06.A04);
            A05.A0D(Property.SYMBOL_Z_ORDER_SOURCE, paymentMethodVerificationHostActivity.A06.A05);
            A00.A03(A05);
        }
    }

    public static void A1F(PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity) {
        if (!paymentMethodVerificationHostActivity.A05.A03) {
            A1G(paymentMethodVerificationHostActivity);
            return;
        }
        PaymentsConfirmDialogFragment A05 = PaymentsConfirmDialogFragment.A05(paymentMethodVerificationHostActivity.getString(2131962353), paymentMethodVerificationHostActivity.getString(2131962351), paymentMethodVerificationHostActivity.getString(2131962349), paymentMethodVerificationHostActivity.getString(2131955718));
        A05.A00 = paymentMethodVerificationHostActivity.A0H;
        A05.A0m(paymentMethodVerificationHostActivity.BDe(), "create_pin_confirm_dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.fragment.app.Fragment, com.facebook.payments.dialog.PaymentsConfirmDialogFragment] */
    public static void A1G(PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity) {
        PaymentEligibleShareExtras paymentEligibleShareExtras;
        if (paymentMethodVerificationHostActivity.getIntent().getSerializableExtra("payment_flow_type") == DM3.A0N) {
            PaymentEligibleShareExtras paymentEligibleShareExtras2 = paymentMethodVerificationHostActivity.A06;
            if (paymentEligibleShareExtras2 != null) {
                PaymentsConfirmDialogFragment A05 = PaymentsConfirmDialogFragment.A05(1BK.A0v(paymentMethodVerificationHostActivity, ((C6oh) paymentMethodVerificationHostActivity.A0C.get()).A01(new CurrencyAmount(paymentEligibleShareExtras2.A03.mCurrency, r0.mAmountWithOffset), 0S2.A0C), 2131963110), paymentMethodVerificationHostActivity.getString(2131963108), paymentMethodVerificationHostActivity.getString(2131955719), paymentMethodVerificationHostActivity.getString(2131963109));
                A05.A00 = paymentMethodVerificationHostActivity.A0J;
                A05.A0m(paymentMethodVerificationHostActivity.BDe(), "sender_incentives_redeemed_dialog");
                return;
            }
        } else if (paymentMethodVerificationHostActivity.getIntent().getSerializableExtra("payment_flow_type") == DM3.A07 && ((paymentEligibleShareExtras = paymentMethodVerificationHostActivity.A06) == null || 2 != paymentEligibleShareExtras.A00)) {
            ?? A052 = PaymentsConfirmDialogFragment.A05(paymentMethodVerificationHostActivity.getString(2131963054), 1BK.A0v(paymentMethodVerificationHostActivity, Integer.valueOf(paymentMethodVerificationHostActivity.A06.A01), 2131963053), paymentMethodVerificationHostActivity.getString(2131963055), paymentMethodVerificationHostActivity.getString(2131957334));
            A052.A00 = paymentMethodVerificationHostActivity.A0I;
            C06c A0D = 7zU.A0D(paymentMethodVerificationHostActivity);
            A0D.A0O(A052, "incentives_confirm_dialog");
            A0D.A05();
            return;
        }
        DKG.A1M(paymentMethodVerificationHostActivity);
    }

    public static void A1H(PaymentMethodVerificationHostActivity paymentMethodVerificationHostActivity) {
        PaymentEligibleShareExtras paymentEligibleShareExtras = paymentMethodVerificationHostActivity.A06;
        if (paymentEligibleShareExtras == null || paymentEligibleShareExtras.A00 != 2) {
            A15(paymentMethodVerificationHostActivity);
            return;
        }
        Intent A12 = A12(paymentMethodVerificationHostActivity);
        A1D(paymentMethodVerificationHostActivity);
        AbK.A0q(paymentMethodVerificationHostActivity.A0F).A09(paymentMethodVerificationHostActivity, A12, 1003);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        ListenableFuture A00;
        super.A2y(bundle);
        this.A08 = AbL.A08(this);
        setContentView(2132543058);
        setRequestedOrientation(1);
        if (bundle != null) {
            this.A05 = (NuxFollowUpAction) bundle.getParcelable("nux_follow_up_action");
            PaymentsConfirmDialogFragment paymentsConfirmDialogFragment = (PaymentsConfirmDialogFragment) BDe().A0b("card_added_confirm_dialog");
            if (paymentsConfirmDialogFragment != null) {
                paymentsConfirmDialogFragment.A00 = this.A0G;
            }
            PaymentsConfirmDialogFragment paymentsConfirmDialogFragment2 = (PaymentsConfirmDialogFragment) BDe().A0b("create_pin_confirm_dialog");
            if (paymentsConfirmDialogFragment2 != null) {
                paymentsConfirmDialogFragment2.A00 = this.A0H;
            }
            PaymentsConfirmDialogFragment paymentsConfirmDialogFragment3 = (PaymentsConfirmDialogFragment) BDe().A0b("incentives_confirm_dialog");
            if (paymentsConfirmDialogFragment3 != null) {
                paymentsConfirmDialogFragment3.A00 = this.A0I;
            }
            PaymentsConfirmDialogFragment paymentsConfirmDialogFragment4 = (PaymentsConfirmDialogFragment) BDe().A0b("setup_incentives_redeem_dialog");
            if (paymentsConfirmDialogFragment4 != null) {
                paymentsConfirmDialogFragment4.A00 = this.A0K;
                return;
            }
            return;
        }
        this.A00 = (FrameLayout) A2c(2131368326);
        this.A01 = (ProgressBar) A2c(2131368327);
        this.A00.setAlpha(0.0f);
        this.A06 = (PaymentEligibleShareExtras) getIntent().getParcelableExtra(AbE.A00(12));
        this.A01.setVisibility(0);
        this.A00.setAlpha(0.2f);
        this.A07 = ImmutableList.of();
        Ej7 ej7 = (Ej7) this.A09.get();
        if (!4DQ.A03(ej7.A00)) {
            Fch fch = ej7.A01;
            if (4DQ.A03(fch.A01)) {
                A00 = fch.A01;
            } else {
                Bundle A05 = 1BK.A05();
                A00 = Fvf.A00(1Ho.A00(fch.A08.newInstance_DEPRECATED(1BJ.A00(1310), A05, 0, AbH.A0B(fch)), true), fch, 29);
                fch.A01 = A00;
            }
            ej7.A00 = A00;
        }
        2FT A01 = 2FP.A01(new Fvf(ej7, 44), ej7.A00);
        1Kd.A0D(this.A0B, FwK.A01(this, 30), A01);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A04 = AbH.A0P();
        this.A0A = 7zL.A0R(this, 99164);
        this.A0B = AbH.A0F();
        this.A03 = 7zL.A0R(this, 99026);
        this.A02 = 1BV.A00(65587);
        this.A09 = AbF.A0Q(this, 99181);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        PaymentEligibleShareExtras paymentEligibleShareExtras;
        switch (i) {
            case 1000:
            case 1001:
                F9R f9r = (F9R) this.A0A.get();
                FbUserSession fbUserSession = this.A08;
                fbUserSession.getClass();
                f9r.A01(intent, fbUserSession, i, i2);
                break;
            case 1002:
                break;
            case 1003:
                if (i2 != -1 || (paymentEligibleShareExtras = this.A06) == null || paymentEligibleShareExtras.A00 == 0) {
                    setResult(-1);
                    finish();
                    return;
                } else {
                    PaymentsConfirmDialogFragment A05 = PaymentsConfirmDialogFragment.A05(getString(2131963114), getString(2131963113), getString(2131963111), getString(2131963112));
                    A05.A00 = this.A0K;
                    A05.A0m(BDe(), "setup_incentives_redeem_dialog");
                    return;
                }
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
        A1G(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("nux_follow_up_action", this.A05);
        super.onSaveInstanceState(bundle);
    }
}

package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.locale.Country;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.FbPaymentCard;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.NewCreditCardOption;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.facebook.payments.paymentmethods.model.PaymentMethodEligibleOffer;
import com.facebook.payments.paymentmethods.model.PaymentMethodGreyedOutOptionConfig;
import com.facebook.payments.paymentmethods.model.PaymentOption;
import com.facebook.payments.paymentmethods.paymentmethodcomponents.model.PaymentMethodComponentData;
import com.facebook.resources.ui.FbFrameLayout;

/* renamed from: X.Da4, reason: case insensitive filesystem */
/* loaded from: Da4.class */
public final class C2043Da4 extends 1pK implements GKS {
    public static final String __redex_internal_original_name = "CreditCardSelectablePaymentComponent";
    public LinearLayout A00;
    public Country A01;
    public RTn A02;
    public FI2 A03;
    public PaymentsLoggingSessionData A04;
    public PaymentItemType A05;
    public EsH A06;
    public FbPaymentCard A07;
    public FbPaymentCard A08;
    public FbPaymentCardType A09;
    public NewCreditCardOption A0A;
    public PaymentMethodComponentData A0B;
    public QRW A0C;
    public FbFrameLayout A0D;
    public Integer A0E;
    public DZd A0G;
    public final FIQ A0I = DKG.A0i();
    public final C00i A0H = DKC.A0W(this, 99111);
    public boolean A0F = false;

    /* JADX WARN: Multi-variable type inference failed */
    private void A03() {
        DZd dZd;
        LinearLayout linearLayout;
        if (this.A0G == null || !this.A0B.A04 || !A07(this) || this.A0A == null) {
            return;
        }
        PaymentItemType paymentItemType = this.A05;
        PaymentItemType paymentItemType2 = PaymentItemType.A0I;
        if (paymentItemType == paymentItemType2) {
            boolean z = requireArguments().getBoolean("is_nux_user", false);
            PaymentItemType paymentItemType3 = this.A05;
            11T.A0F(paymentItemType3, 0);
            boolean A1W = AnonymousClass001.A1W(paymentItemType3, paymentItemType2);
            0fH.A0k(__redex_internal_original_name, z ? "NUX Card scan User Exposed" : "PUX Card scan User Exposed");
            if (!A1W || (linearLayout = (dZd = this.A0G).A04) == null) {
                return;
            }
            linearLayout.setVisibility(0);
            ((ImageView) dZd.A04.requireViewById(2131362936)).setImageDrawable(C1uu.A00(7zO.A0D(dZd), ((Fcg) dZd.A0B.get()).A03(dZd.requireContext(), 3Eh.A4M), 7zM.A02(dZd.requireContext(), 2MR.A28)));
            dZd.A04.requireViewById(2131362938);
            FAF A04 = C06014fk.A04();
            dZd.requireContext();
            A04.A01(14);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0236, code lost:
    
        if (r0 != com.facebook.payments.model.PaymentItemType.A0R) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06() {
        /*
            Method dump skipped, instructions count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2043Da4.A06():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (X.C52z.A00(new X.Fvg(r301, 3), r0.BJ9()).isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A07(X.C2043Da4 r301) {
        /*
            r0 = r301
            com.facebook.payments.paymentmethods.model.FbPaymentCard r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2c
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.BJ9()
            r303 = r0
            X.Fvg r0 = new X.Fvg
            r302 = r0
            r0 = r302
            r1 = r301
            r2 = 3
            r0.<init>(r1, r2)
            r0 = r302
            r1 = r303
            X.1n5 r0 = X.C52z.A00(r0, r1)
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L2f
        L2c:
            r0 = 1
            r305 = r0
        L2f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2043Da4.A07(X.Da4):boolean");
    }

    public 1iF A1R() {
        return DKG.A0I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A06 = (EsH) 1Bn.A0A(99133);
        this.A03 = DKD.A0X();
        this.A05 = (PaymentItemType) requireArguments().getSerializable("payment_item_type");
        this.A0B = (PaymentMethodComponentData) requireArguments().getParcelable("payment_method_component_data");
        this.A04 = (PaymentsLoggingSessionData) requireArguments().getParcelable("payment_logging_session_data");
        this.A01 = (Country) requireArguments().getParcelable("default_country");
    }

    public String AdI() {
        return RVU.A01(this.A0B.A03);
    }

    public PaymentMethodEligibleOffer AjE() {
        return this.A0B.A01;
    }

    public PaymentMethodGreyedOutOptionConfig AoD() {
        return this.A0B.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.payments.paymentmethods.model.PaymentOption] */
    public PaymentOption B24() {
        FbPaymentCard fbPaymentCard = this.A08;
        if (fbPaymentCard == null) {
            fbPaymentCard = this.A0B.A03;
        }
        return fbPaymentCard;
    }

    public Integer BCC() {
        return this.A0E;
    }

    public void BMY(int i, Intent intent) {
    }

    public boolean BVy() {
        return this.A0B.A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bse(PaymentMethodComponentData paymentMethodComponentData) {
        if (isResumed()) {
            this.A0F = this.A0B.A04;
            this.A0B = paymentMethodComponentData;
            A06();
        }
    }

    public void CDw() {
        this.A0G.A1a();
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof DZd) {
            DZd dZd = (DZd) fragment;
            this.A0G = dZd;
            dZd.A0D = new FnQ(this);
            dZd.A0C = new FnO(this);
            A03();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1899045921);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543310);
        0FI.A08(-393322533, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = (LinearLayout) 7zL.A0F(this, 2131367269);
        CallerContext callerContext = QRW.A0F;
        View qrw = new QRW(getContext());
        this.A0C = qrw;
        this.A00.addView(qrw);
        FXq.A01(this.A00, this, 89);
        this.A0D = (FbFrameLayout) 7zL.A0F(this, 2131362887);
        PaymentOption paymentOption = this.A0B.A03;
        if (paymentOption instanceof NewPaymentOption) {
            this.A0A = (NewCreditCardOption) paymentOption;
        } else {
            this.A07 = (FbPaymentCard) paymentOption;
        }
        this.A0E = A07(this) ? 0S2.A00 : 0S2.A0C;
        RTn rTn = this.A02;
        if (rTn != null) {
            rTn.A02(AdI());
        }
        A06();
    }
}

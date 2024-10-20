package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.payments.checkout.configuration.model.CheckoutEntityScreenComponent;
import com.facebook.payments.checkout.configuration.model.CheckoutGreyedOutBanner;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.ui.PaymentsDividerView;
import com.facebook.payments.ui.PaymentsFragmentHeaderView;
import com.facebook.payments.ui.ctabutton.PaymentCtaButtonView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Da2, reason: case insensitive filesystem */
/* loaded from: Da2.class */
public final class C2041Da2 extends 1pK implements GKM, GFP {
    public static final String __redex_internal_original_name = "GreyedOutBannerFragment";
    public GK3 A00;
    public CheckoutData A01;
    public EMD A02;
    public final C00i A06 = DKC.A0W(this, 99010);
    public final C00i A03 = DKG.A0U(this);
    public final AtomicBoolean A05 = DKC.A1E(true);
    public final AtomicBoolean A04 = 7zO.A15();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(C2041Da2 c2041Da2) {
        DKF.A12(c2041Da2.requireContext(), DKG.A0D(c2041Da2, 2131368389), 2131965614);
        ((ImageView) 7zL.A0F(c2041Da2, 2131364519)).setImageResource(2132345265);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(C2041Da2 c2041Da2) {
        DKF.A12(c2041Da2.requireContext(), DKG.A0D(c2041Da2, 2131368389), 2131965615);
        ((ImageView) 7zL.A0F(c2041Da2, 2131364519)).setImageResource(2132345246);
    }

    public 1iF A1R() {
        return DKH.A0K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        1Bn.A0A(99119);
        int i = Build.VERSION.SDK_INT;
        Bundle requireArguments = requireArguments();
        this.A02 = (EMD) (i >= 33 ? requireArguments.getSerializable("checkout_style", EMD.class) : requireArguments.getSerializable("checkout_style"));
    }

    public String AnR() {
        return "greyed_out_banner_fragment_tag";
    }

    public boolean BTn() {
        return this.A05.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bfd(CheckoutData checkoutData) {
        GK3 gk3;
        CheckoutEntityScreenComponent checkoutEntityScreenComponent;
        CheckoutGreyedOutBanner checkoutGreyedOutBanner;
        String str;
        String str2;
        int i;
        String str3;
        if (checkoutData != null) {
            this.A01 = checkoutData;
            CheckoutCommonParamsCore A0X = DKF.A0X(checkoutData);
            if (!A0X.A0c) {
                GK3 gk32 = this.A00;
                if (gk32 != null) {
                    gk32.setVisibility(8);
                    return;
                }
                return;
            }
            int i2 = 8;
            CheckoutInformation checkoutInformation = A0X.A06;
            if (checkoutInformation == null || (checkoutEntityScreenComponent = checkoutInformation.A00) == null || (checkoutGreyedOutBanner = checkoutEntityScreenComponent.A00) == null || (str = checkoutGreyedOutBanner.A03) == null || str.length() == 0 || (str2 = checkoutGreyedOutBanner.A02) == null || str2.length() == 0) {
                gk3 = this.A00;
                if (gk3 == null) {
                    return;
                }
            } else {
                PaymentsFragmentHeaderView A0F = 7zL.A0F(this, 2131364443);
                A0F.A00.setText(str);
                A0F.setMaxLines(1);
                TextView A0D = DKG.A0D(this, 2131363599);
                C00i c00i = this.A03;
                FIR.A02(A0D, DKH.A0W(this, c00i));
                A0D.setText(str2);
                View A0F2 = 7zL.A0F(this, 2131363947);
                FIR.A03(DKG.A0D(this, 2131368389), DKH.A0W(this, c00i));
                if (this.A04.get()) {
                    A03(this);
                    i = 0;
                } else {
                    A06(this);
                    i = 8;
                }
                A0F2.setVisibility(i);
                FXq.A01(7zL.A0F(this, 2131368391), this, 41);
                String str4 = checkoutGreyedOutBanner.A01;
                if (str4 != null && str4.length() != 0 && (str3 = checkoutGreyedOutBanner.A00) != null && str3.length() != 0) {
                    PaymentCtaButtonView A0F3 = 7zL.A0F(this, 2131365187);
                    A0F3.A06(str4);
                    A0F3.setVisibility(0);
                    FXm.A00(A0F3, this, str3, 7);
                }
                View paymentsDividerView = new PaymentsDividerView(requireContext(), new int[]{7zO.A0D(this).getDimensionPixelOffset(2132279348), 0, 7zO.A0D(this).getDimensionPixelOffset(2132279327), 0});
                ViewGroup viewGroup = (ViewGroup) 7zL.A0F(this, 2131364370);
                viewGroup.addView(paymentsDividerView);
                FIR.A01(requireContext(), viewGroup, DKC.A0V(c00i));
                gk3 = this.A00;
                if (gk3 == null) {
                    return;
                } else {
                    i2 = 0;
                }
            }
            gk3.setVisibility(i2);
        }
    }

    public void Bsf(CheckoutData checkoutData) {
    }

    public void CE1() {
    }

    public void CsR(ETu eTu) {
    }

    public void CsS(GK3 gk3) {
        this.A00 = gk3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(1645315164);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        0FI.A08(1232440725, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1215125745);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542100);
        0FI.A08(-1913104666, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-786755812);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A04.set(false);
        0FI.A08(1756324736, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-702183214);
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (this.A02 != null) {
            ((FFx) this.A06.get()).A04(this.A02).A01(this);
        }
        0FI.A08(2050125067, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-655007187);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (this.A02 != null) {
            C00i c00i = this.A06;
            ((FFx) c00i.get()).A04(this.A02).A00(this);
            Bfd(((FFx) c00i.get()).A04(this.A02).A00);
        }
        0FI.A08(-1228009807, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AtomicBoolean atomicBoolean = this.A05;
        atomicBoolean.set(false);
        GK3 gk3 = this.A00;
        if (gk3 != null) {
            gk3.C4o(atomicBoolean.get());
        }
    }

    public void setVisibility(int i) {
    }
}

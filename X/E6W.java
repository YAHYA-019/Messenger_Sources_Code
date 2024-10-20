package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.locale.Country;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;
import com.facebook.payments.paymentmethods.model.FbPaymentCard;
import com.facebook.payments.paymentmethods.model.VerifyField;
import com.facebook.payments.ui.PaymentFormEditTextView;

/* loaded from: E6W.class */
public final class E6W extends DZd {
    public static final String __redex_internal_original_name = "CardFormWithBillingAddressFragment";
    public LinearLayout A00;
    public PaymentFormEditTextView A01;
    public PaymentFormEditTextView A02;
    public PaymentFormEditTextView A03;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(E6W e6w) {
        boolean A0A = ((DZd) e6w).A0F.A0A(((DZd) e6w).A09, VerifyField.ADDRESS);
        PaymentFormEditTextView paymentFormEditTextView = e6w.A03;
        int A00 = DKG.A00(A0A ? 1 : 0);
        paymentFormEditTextView.setVisibility(A00);
        e6w.A01.setVisibility(A00);
        e6w.A02.setVisibility(A00);
        boolean equals = Country.A01.equals(((DZd) e6w).A09);
        PaymentFormEditTextView paymentFormEditTextView2 = e6w.A02;
        Resources A0D = 7zO.A0D(e6w);
        if (equals) {
            DKF.A18(A0D, paymentFormEditTextView2, 2131957651);
            PaymentFormEditTextView paymentFormEditTextView3 = e6w.A02;
            int integer = 7zO.A0D(e6w).getInteger(2131427350);
            if (integer > 0) {
                AbN.A0v(paymentFormEditTextView3.A03, integer);
            }
            DKF.A1S(e6w.A02, 4097);
        } else {
            DKF.A18(A0D, paymentFormEditTextView2, 2131962162);
            AbN.A0v(e6w.A02.A03, (-1) >>> 1);
        }
        DKF.A18(7zO.A0D(e6w), e6w.A03, 2131957649);
        DKF.A18(7zO.A0D(e6w), e6w.A01, 2131957650);
        DKF.A1S(e6w.A03, 8193);
        DKF.A1S(e6w.A01, 8193);
    }

    public void A1X() {
        super.A1X();
        this.A03.setEnabled(true);
        this.A01.setEnabled(true);
        this.A02.setEnabled(true);
    }

    public void A1b() {
        super.A1b();
        this.A03.A0o("");
        this.A01.A0o("");
        this.A02.A0o("");
    }

    public void A1c() {
        super.A1c();
        this.A03.setEnabled(false);
        this.A01.setEnabled(false);
        this.A02.setEnabled(false);
    }

    public void A1d() {
        super.A1d();
        if (((DZd) this).A0i) {
            this.A03.A0n();
            this.A01.A0n();
            this.A02.A0n();
        }
    }

    public void A1e() {
        super.A1e();
        this.A00.setPadding(0, 0, 0, 0);
        this.A03.setPadding(0, 0, 0, 0);
        this.A01.setPadding(0, 0, 0, 0);
        this.A02.setPadding(0, 0, 0, 0);
    }

    public void A1g(Integer num) {
        PaymentFormEditTextView paymentFormEditTextView;
        int intValue = num.intValue();
        if (intValue != 4) {
            if (intValue != 5) {
                if (intValue != 6) {
                    super.A1g(num);
                    return;
                } else if (this.A02.getVisibility() != 0) {
                    return;
                } else {
                    paymentFormEditTextView = this.A02;
                }
            } else if (this.A01.getVisibility() != 0) {
                return;
            } else {
                paymentFormEditTextView = this.A01;
            }
        } else if (this.A03.getVisibility() != 0) {
            return;
        } else {
            paymentFormEditTextView = this.A03;
        }
        ((DZd) this).A0V.A04(paymentFormEditTextView);
    }

    public void A1h(Integer num) {
        super.A1h(num);
    }

    public void A1j(Integer num, String str, boolean z) {
        PaymentFormEditTextView paymentFormEditTextView;
        int intValue = num.intValue();
        if (intValue == 4) {
            paymentFormEditTextView = this.A03;
        } else if (intValue == 5) {
            paymentFormEditTextView = this.A01;
        } else {
            if (intValue != 6) {
                super.A1j(num, str, z);
                return;
            }
            paymentFormEditTextView = this.A02;
        }
        if (z) {
            DKH.A1Q(paymentFormEditTextView);
        } else {
            paymentFormEditTextView.A0p(str);
        }
    }

    public void A1k(boolean z, Integer num) {
        super.A1k(z, num);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1647906886);
        super.onDestroyView();
        this.A00 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        0FI.A08(2102776620, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        this.A00 = (LinearLayout) 7zL.A0F(this, 2131362402);
        this.A03 = (PaymentFormEditTextView) 7zL.A0F(this, 2131362407);
        this.A01 = (PaymentFormEditTextView) 7zL.A0F(this, 2131362404);
        this.A02 = (PaymentFormEditTextView) 7zL.A0F(this, 2131362406);
        A08(this);
        super.onViewCreated(view, bundle);
        TextView.OnEditorActionListener fYa = new FYa(this, 15);
        this.A03.A03.setOnEditorActionListener(fYa);
        this.A01.A03.setOnEditorActionListener(fYa);
        this.A02.A03.setOnEditorActionListener(fYa);
        FbPaymentCard fbPaymentCard = CardFormParams.A02(((DZd) this).A0F).fbPaymentCard;
        if (CardFormParams.A02(((DZd) this).A0F).showOnlyErroredFields && fbPaymentCard != null && !fbPaymentCard.BJ9().isEmpty()) {
            PaymentFormEditTextView paymentFormEditTextView = this.A03;
            if (paymentFormEditTextView != null) {
                paymentFormEditTextView.setVisibility(8);
            }
            PaymentFormEditTextView paymentFormEditTextView2 = this.A01;
            if (paymentFormEditTextView2 != null) {
                paymentFormEditTextView2.setVisibility(8);
            }
            PaymentFormEditTextView paymentFormEditTextView3 = this.A02;
            if (paymentFormEditTextView3 != null) {
                paymentFormEditTextView3.setVisibility(8);
            }
            1Du it = fbPaymentCard.BJ9().iterator();
            while (it.hasNext()) {
                if (it.next() == VerifyField.ADDRESS) {
                    this.A03.setVisibility(0);
                    this.A01.setVisibility(0);
                    this.A02.setVisibility(0);
                }
            }
            this.A03.A0m();
            this.A01.A0m();
            this.A02.A0m();
            this.A03.A0m();
            this.A01.A0m();
            this.A02.A0m();
        }
        DKF.A1G(new FWn(this, 28), this.A03);
        DKF.A1G(new FWn(this, 29), this.A01);
        DKF.A1G(new FWn(this, 30), this.A02);
    }
}

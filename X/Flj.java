package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.payments.checkout.configuration.model.CouponCodeCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.form.model.FormFieldAttributes;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import java.util.BitSet;

/* loaded from: Flj.class */
public final class Flj implements GJq {
    public CouponCodeCheckoutPurchaseInfoExtension A00;
    public ETu A01;
    public View.OnClickListener A02;
    public final Context A03;
    public final FIQ A04 = DKG.A0i();

    public Flj(Context context) {
        this.A03 = context;
    }

    public static void A00(Flj flj) {
        Intent A05 = AbF.A05();
        Bundle A052 = 1BK.A05();
        A052.putSerializable("extra_user_action_type", Qp9.A01);
        A052.putParcelable("extra_user_action", A05);
        flj.A01.A08(new FHd(A052, 0S2.A0j));
    }

    @Override // X.GJq
    public boolean AO9(CheckoutData checkoutData) {
        CouponCodeCheckoutPurchaseInfoExtension couponCodeCheckoutPurchaseInfoExtension;
        CouponCodeCheckoutPurchaseInfoExtension couponCodeCheckoutPurchaseInfoExtension2 = DKF.A0X(checkoutData).A07;
        if (couponCodeCheckoutPurchaseInfoExtension2 == null && this.A00 == null) {
            return false;
        }
        if (couponCodeCheckoutPurchaseInfoExtension2 != null && (couponCodeCheckoutPurchaseInfoExtension = this.A00) != null && 1JF.A0C(couponCodeCheckoutPurchaseInfoExtension2.A00.A06, couponCodeCheckoutPurchaseInfoExtension.A00.A06)) {
            return false;
        }
        this.A00 = couponCodeCheckoutPurchaseInfoExtension2;
        return true;
    }

    @Override // X.GJq
    public View.OnClickListener B08(CheckoutData checkoutData) {
        return FXs.A00(checkoutData, this, 40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.view.View$OnClickListener] */
    @Override // X.GJq
    public View BK0(CheckoutData checkoutData) {
        PaymentsLoggingSessionData paymentsLoggingSessionData;
        FIQ fiq;
        String str;
        String str2;
        CheckoutCommonParamsCore A0X = DKF.A0X(checkoutData);
        CouponCodeCheckoutPurchaseInfoExtension couponCodeCheckoutPurchaseInfoExtension = A0X.A07;
        LithoView lithoView = null;
        if (couponCodeCheckoutPurchaseInfoExtension != null) {
            this.A00 = couponCodeCheckoutPurchaseInfoExtension;
            FormFieldAttributes formFieldAttributes = couponCodeCheckoutPurchaseInfoExtension.A00;
            this.A02 = FXs.A00(checkoutData, this, 39);
            Context context = this.A03;
            1Iw A0W = 7zL.A0W(context);
            Boolean bool = couponCodeCheckoutPurchaseInfoExtension.A01;
            if (bool != null) {
                if (bool.booleanValue()) {
                    paymentsLoggingSessionData = A0X.A0D.A00;
                    String str3 = this.A00.A00.A06;
                    fiq = this.A04;
                    if (str3 == null) {
                        str3 = "";
                    }
                    fiq.A0A(paymentsLoggingSessionData, str3, "coupon");
                    str = this.A00.A02;
                    str2 = "discount";
                } else {
                    String str4 = couponCodeCheckoutPurchaseInfoExtension.A02;
                    if (str4 != null) {
                        C2121Dea A03 = C2121Dea.A03(context);
                        A03.A0A(str4);
                        A03.A08(FK6.A00(this, 61));
                        ((DKS) A03).A01.A01 = new FJm(this, 1);
                        A03.A04();
                        paymentsLoggingSessionData = A0X.A0D.A00;
                        String str5 = this.A00.A00.A06;
                        fiq = this.A04;
                        if (str5 == null) {
                            str5 = "";
                        }
                        fiq.A0A(paymentsLoggingSessionData, str5, "coupon");
                        str = this.A00.A02;
                        str2 = "error_message";
                    }
                }
                fiq.A0A(paymentsLoggingSessionData, str, str2);
                FIQ.A00(PaymentsFlowStep.A0S, fiq, paymentsLoggingSessionData);
            }
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            QDr qDr = new QDr(A0W, new QMG());
            QMG qmg = qDr.A01;
            qmg.A04 = booleanValue;
            BitSet bitSet = qDr.A02;
            bitSet.set(1);
            qmg.A01 = context.getString(2131963920);
            bitSet.set(0);
            String str6 = formFieldAttributes.A06;
            qmg.A02 = (!booleanValue || 1JF.A0B(str6)) ? context.getString(2131963922) : 0Pz.A0j(context.getString(2131963921), ": ", str6);
            bitSet.set(2);
            qmg.A03 = booleanValue ? couponCodeCheckoutPurchaseInfoExtension.A02 : null;
            if (booleanValue) {
                lithoView = this.A02;
            }
            qmg.A00 = lithoView;
            C1rs.A03(bitSet, qDr.A03);
            qDr.A0J();
            ComponentTree A0b = DKE.A0b(qmg, A0W);
            lithoView = new LithoView(context, (AttributeSet) null);
            lithoView.A10(A0b, true);
            this.A04.A05((Bundle) null, PaymentsFlowStep.A0S, A0X.A0D.A00, A0X.A0M);
        }
        return lithoView;
    }

    @Override // X.GJq
    public void CsR(ETu eTu) {
        this.A01 = eTu;
    }
}

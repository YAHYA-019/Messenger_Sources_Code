package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.facebook.litho.LithoView;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.AltPayPaymentMethod;
import com.facebook.payments.paymentmethods.model.AltPayPricepoint;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.PaymentMethodEligibleOffer;
import com.facebook.payments.paymentmethods.model.PaymentMethodGreyedOutOptionConfig;
import com.facebook.payments.paymentmethods.model.PaymentOption;
import com.facebook.payments.paymentmethods.paymentmethodcomponents.model.PaymentMethodComponentData;

/* loaded from: E79.class */
public final class E79 extends EBe implements GKS {
    public LinearLayout A00;
    public AbR A01;
    public C00i A02;
    public C1rn A03;
    public RTn A04;
    public PaymentsLoggingSessionData A05;
    public PaymentItemType A06;
    public PaymentMethodComponentData A07;
    public QRW A08;
    public C2134Den A09;
    public Fz7 A0A;
    public Integer A0B;

    public String AdI() {
        return RVU.A01(this.A07.A03);
    }

    public PaymentMethodEligibleOffer AjE() {
        return this.A07.A01;
    }

    public PaymentMethodGreyedOutOptionConfig AoD() {
        return this.A07.A02;
    }

    public PaymentOption B24() {
        return this.A07.A03;
    }

    public Integer BCC() {
        return this.A0B;
    }

    public void BMY(int i, Intent intent) {
    }

    public boolean BVy() {
        return this.A07.A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bse(PaymentMethodComponentData paymentMethodComponentData) {
        QEA qea;
        this.A07 = paymentMethodComponentData;
        AltPayPaymentMethod altPayPaymentMethod = paymentMethodComponentData.A03;
        QRW qrw = this.A08;
        Resources resources = getResources();
        AltPayPricepoint altPayPricepoint = altPayPaymentMethod.A00;
        qrw.A06.setText(altPayPricepoint.A06);
        PaymentMethodEligibleOffer paymentMethodEligibleOffer = paymentMethodComponentData.A01;
        if (paymentMethodEligibleOffer != null) {
            String str = paymentMethodEligibleOffer.A01;
            if (!TextUtils.isEmpty(str)) {
                this.A08.A0J(str);
            }
        }
        this.A08.A0I((FbPaymentCardType) null, altPayPaymentMethod);
        this.A08.A0F();
        this.A08.A0K(paymentMethodComponentData.A04);
        this.A00.removeAllViews();
        if (this.A07.A04) {
            Context context = getContext();
            LithoView lithoView = new LithoView(context, (AttributeSet) null);
            1Iw A0W = 7zL.A0W(context);
            if (altPayPricepoint.A07) {
                C2134Den A1F = this.A01.A1F(context, altPayPricepoint.A01, true);
                this.A09 = A1F;
                A1F.A04 = new FsK(this, 3);
                FXq A00 = FXq.A00(this, 88);
                qea = new QEA(A0W, new QK3());
                qea.A25(C26z.LEFT, 42.0f);
                QK3 qk3 = qea.A01;
                qk3.A02 = altPayPaymentMethod;
                qea.A02.set(0);
                qk3.A03 = resources.getString(2131955145);
                qk3.A04 = resources.getString(2131963221);
                qk3.A00 = A00;
                qk3.A01 = this.A03;
            } else {
                qea = new QEA(A0W, new QK3());
                qea.A25(C26z.LEFT, 42.0f);
                qea.A01.A02 = altPayPaymentMethod;
                qea.A02.set(0);
            }
            C1rs.A05(qea.A02, qea.A03, 1);
            qea.A0J();
            lithoView.A0x(qea.A01);
            this.A00.addView(lithoView);
        }
    }

    public void CDw() {
    }
}

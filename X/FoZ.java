package X;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import com.facebook.payments.shipping.model.MailingAddress;
import com.facebook.payments.shipping.model.ShippingCommonParams;
import com.facebook.payments.shipping.model.ShippingParams;
import com.facebook.payments.shipping.model.ShippingSource;
import com.facebook.payments.ui.PaymentsFormFooterView;

/* loaded from: FoZ.class */
public final class FoZ implements GIK {
    public ShippingCommonParams A00;
    public PaymentsFormFooterView A01;
    public ETu A02;
    public 1BY A03;
    public final C00i A04 = 1BV.A01((1BY) null, 83719);
    public final C00i A05 = DKD.A0S();

    public FoZ(1BO r302) {
        this.A03 = 7zL.A0Q(r302);
    }

    public GDA Amz(ViewGroup viewGroup, ShippingParams shippingParams) {
        int i;
        this.A01 = new PaymentsFormFooterView(viewGroup.getContext());
        this.A00 = (ShippingCommonParams) shippingParams;
        C00i c00i = this.A05;
        boolean A02 = FI2.A02(c00i);
        PaymentsFormFooterView paymentsFormFooterView = this.A01;
        if (A02) {
            paymentsFormFooterView.A02.A01.setMovementMethod(new LinkMovementMethod());
            PaymentsFormFooterView paymentsFormFooterView2 = this.A01;
            int i2 = 2131956890;
            if (DKC.A0Z(c00i).A08()) {
                i2 = 2131960351;
            }
            C00i c00i2 = this.A04;
            0Dc r0 = new 0Dc(1BL.A0B(c00i2));
            DKI.A0a(r0);
            SpannableString A0E = 7zM.A0E(r0);
            0Dc r02 = new 0Dc(1BL.A0B(c00i2));
            r02.A01(i2);
            r02.A06("[[payments_terms_token]]", A0E);
            paymentsFormFooterView2.A02.A01.setText(7zM.A0E(r02));
        } else {
            paymentsFormFooterView.A02.A01.setText(2131965932);
        }
        ShippingCommonParams shippingCommonParams = this.A00;
        if (shippingCommonParams.shippingSource == ShippingSource.OTHERS) {
            MailingAddress mailingAddress = shippingCommonParams.mailingAddress;
            PaymentsFormFooterView paymentsFormFooterView3 = this.A01;
            if (mailingAddress != null) {
                paymentsFormFooterView3.A01.A00.setText(2131965914);
                this.A01.A01.setOnClickListener(FXq.A00(this, 98));
                paymentsFormFooterView3 = this.A01;
                i = 0;
            } else {
                i = 8;
            }
            paymentsFormFooterView3.A01.setVisibility(i);
        }
        return this.A01;
    }

    public void CsR(ETu eTu) {
        this.A02 = eTu;
    }
}

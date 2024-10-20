package X;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import com.facebook.payments.shipping.model.MailingAddress;
import com.facebook.payments.shipping.model.ShippingCommonParams;
import com.facebook.payments.shipping.model.ShippingParams;
import com.facebook.payments.shipping.model.SimpleMailingAddress;

/* loaded from: Foa.class */
public final class Foa implements GIK {
    public ShippingCommonParams A00;
    public Q1x A01;
    public ETu A02;
    public 1BY A03;
    public final DialogInterface.OnClickListener A05 = FK6.A00(this, 80);
    public final DialogInterface.OnClickListener A04 = FK6.A00(this, 81);
    public final C00i A07 = 1BQ.A02(99089);
    public final C00i A06 = DKE.A0Z();

    public Foa(1BO r302) {
        this.A03 = 7zL.A0Q(r302);
    }

    public GDA Amz(ViewGroup viewGroup, ShippingParams shippingParams) {
        this.A00 = (ShippingCommonParams) shippingParams;
        Q1x q1x = new Q1x(viewGroup.getContext());
        this.A01 = q1x;
        q1x.A04.setText(2131957745);
        this.A01.A03.setMovementMethod(new LinkMovementMethod());
        Q1x q1x2 = this.A01;
        int i = 2131957743;
        if (DLb.A02()) {
            i = 2131960343;
        }
        0Dc r0 = new 0Dc(this.A01.getResources());
        r0.A04(new URLSpan("https://m.facebook.com/policy"), 17);
        r0.A01(2131955450);
        r0.A00();
        SpannableString A0E = 7zM.A0E(r0);
        A0E.setSpan(new DOB(this, 9), 0, A0E.length(), 17);
        0Dc r02 = new 0Dc(this.A01.getResources());
        r02.A01(i);
        r02.A06("[[payments_terms_token]]", A0E);
        q1x2.A03.setText(7zM.A0E(r02));
        this.A01.A01.A00.setText(2131957744);
        ShippingCommonParams shippingCommonParams = this.A00;
        MailingAddress mailingAddress = shippingCommonParams.mailingAddress;
        if (mailingAddress != null && ((SimpleMailingAddress) mailingAddress).mIsDefault && shippingCommonParams.numOfMailingAddresses >= 1) {
            this.A01.A02.setChecked(true);
            this.A01.A02.setEnabled(false);
        }
        this.A01.A02.setOnCheckedChangeListener(new FYT(this, 10));
        MailingAddress mailingAddress2 = this.A00.mailingAddress;
        Q1x q1x3 = this.A01;
        if (mailingAddress2 == null) {
            q1x3.A05();
        } else {
            FXq.A01(q1x3, this, 99);
        }
        return this.A01;
    }

    public void CsR(ETu eTu) {
        this.A02 = eTu;
    }
}

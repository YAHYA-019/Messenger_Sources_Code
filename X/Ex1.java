package X;

import android.view.ViewGroup;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;

/* loaded from: Ex1.class */
public final class Ex1 {
    public GI7 A00;
    public GL6 A01;
    public PaymentsTitleBarViewStub A02;
    public final F6h A03 = F6h.A00();

    public void A00(ViewGroup viewGroup, MigColorScheme migColorScheme, PaymentsTitleBarViewStub paymentsTitleBarViewStub) {
        this.A02 = paymentsTitleBarViewStub;
        paymentsTitleBarViewStub.A01(viewGroup, ELS.A02, migColorScheme.BDl() == -16777216 ? PaymentsTitleBarStyle.A03 : PaymentsTitleBarStyle.A05, new Fsa(this, 4));
        GL6 gl6 = this.A02.A06;
        this.A01 = gl6;
        if (gl6 != null) {
            ErO.A00(gl6, this, 1);
        }
    }

    public void A01(String str) {
        GL6 gl6 = this.A01;
        if (gl6 != null) {
            F6h f6h = this.A03;
            f6h.A08 = str;
            GL6.A01(gl6, f6h);
        }
    }
}

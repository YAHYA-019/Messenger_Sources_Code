package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;

/* loaded from: Es6.class */
public final class Es6 {
    public final C00i A00 = DKD.A0V();

    public void A00(ViewGroup viewGroup, PaymentsDecoratorParams paymentsDecoratorParams, F8H f8h, PaymentsTitleBarViewStub paymentsTitleBarViewStub, int i) {
        Context A00 = AnonymousClass016.A00(viewGroup.getContext(), Activity.class);
        A00.getClass();
        ELS els = paymentsDecoratorParams.paymentsDecoratorAnimation.mTitleBarNavIconStyle;
        PaymentsTitleBarStyle paymentsTitleBarStyle = paymentsDecoratorParams.paymentsTitleBarStyle;
        Resources resources = viewGroup.getResources();
        String string = resources.getString(i);
        C00i c00i = this.A00;
        if (FI2.A02(c00i) && !DKC.A0Z(c00i).A08()) {
            string = resources.getString(2131956888);
        }
        paymentsTitleBarViewStub.A01(viewGroup, els, paymentsTitleBarStyle, new FsZ(A00, this, 2));
        paymentsTitleBarViewStub.A03.A00(f8h, paymentsDecoratorParams.paymentsTitleBarTitleStyle, string, 0);
    }
}

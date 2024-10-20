package X;

import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.google.common.base.Function;

/* loaded from: Fvb.class */
public final class Fvb implements Function {
    public static final Fvb A00 = new Fvb();

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        CheckoutData checkoutData = (CheckoutData) obj;
        11T.A0D(checkoutData);
        return ((SimpleCheckoutData) checkoutData).A07;
    }
}

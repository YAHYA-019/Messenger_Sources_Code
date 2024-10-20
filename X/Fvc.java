package X;

import com.facebook.payments.checkout.model.CheckoutCommonParams;
import com.google.common.base.Function;

/* loaded from: Fvc.class */
public final class Fvc implements Function {
    public static final Fvc A00 = new Fvc();

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        CheckoutCommonParams checkoutCommonParams = (CheckoutCommonParams) obj;
        11T.A0D(checkoutCommonParams);
        return checkoutCommonParams.A02.A06;
    }
}

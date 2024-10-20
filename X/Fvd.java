package X;

import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.google.common.base.Function;

/* loaded from: Fvd.class */
public final class Fvd implements Function {
    public static final Fvd A00 = new Fvd();

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        CheckoutInformation checkoutInformation = (CheckoutInformation) obj;
        11T.A0D(checkoutInformation);
        return checkoutInformation.A00;
    }
}

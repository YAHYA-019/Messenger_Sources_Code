package X;

import com.facebookpay.shippingaddress.model.ShippingAddress;
import kotlin.jvm.functions.Function2;

/* loaded from: M8m.class */
public final class M8m extends C00q implements Function2 {
    public static final M8m A00 = new M8m();

    public M8m() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        11T.A0H(shippingAddress, obj2);
        return JR0.A0l(shippingAddress.A04, obj2);
    }
}

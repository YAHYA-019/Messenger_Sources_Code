package X;

import com.facebookpay.shippingaddress.model.ShippingAddress;
import kotlin.jvm.functions.Function2;

/* loaded from: M8n.class */
public final class M8n extends C00q implements Function2 {
    public static final M8n A00 = new M8n();

    public M8n() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        ShippingAddress shippingAddress2 = (ShippingAddress) obj2;
        11T.A0H(shippingAddress, shippingAddress2);
        return JR0.A0l(shippingAddress.A04, shippingAddress2.A04);
    }
}

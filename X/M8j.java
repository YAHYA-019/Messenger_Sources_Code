package X;

import com.facebookpay.paymentmethod.model.PaymentMethod;
import kotlin.jvm.functions.Function2;

/* loaded from: M8j.class */
public final class M8j extends C00q implements Function2 {
    public static final M8j A00 = new M8j();

    public M8j() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        FJC fjc = (FJC) obj;
        11T.A0H(fjc, obj2);
        Object obj3 = fjc.A01;
        obj3.getClass();
        return JR0.A0l(((PaymentMethod) obj3).Aez(), obj2);
    }
}

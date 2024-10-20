package X;

import com.facebookpay.paymentmethod.model.PaymentMethod;
import kotlin.jvm.functions.Function2;

/* loaded from: M8l.class */
public final class M8l extends C00q implements Function2 {
    public static final M8l A00 = new M8l();

    public M8l() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        FJC fjc = (FJC) obj;
        FJC fjc2 = (FJC) obj2;
        11T.A0H(fjc, fjc2);
        PaymentMethod paymentMethod = (PaymentMethod) fjc.A01;
        String str = null;
        String Aez = paymentMethod != null ? paymentMethod.Aez() : null;
        PaymentMethod paymentMethod2 = (PaymentMethod) fjc2.A01;
        if (paymentMethod2 != null) {
            str = paymentMethod2.Aez();
        }
        return JR0.A0l(Aez, str);
    }
}

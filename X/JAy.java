package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: JAy.class */
public final class JAy extends C00q implements Function1 {
    public static final JAy A00 = new JAy();

    public JAy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A31 A0a = 7zU.A0a(obj);
        C00j.A05("SubscriptionInitializerV3.selectModel", -1110869648);
        try {
            C00j.A05("SubscriptionInitializerV3.selectModel", -699339013);
            try {
                A0a.A02.put(State.class, null);
                C00j.A01(825918581);
                C00j.A01(1274891837);
                return 04S.A00;
            } catch (Throwable th) {
                C00j.A01(942282390);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(2062132096);
            throw th2;
        }
    }
}

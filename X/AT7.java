package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: AT7.class */
public final class AT7 extends C00q implements Function1 {
    public static final AT7 A00 = new AT7();

    public AT7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A31 A0a = 7zU.A0a(obj);
        C00j.A05("SubscriptionInitializerV3.selectModel", -616480811);
        try {
            C00j.A05("SubscriptionInitializerV3.selectModel", 1434009564);
            try {
                A0a.A02.put(State.class, null);
                C00j.A01(-1103205042);
                C00j.A01(403137718);
                return 04S.A00;
            } catch (Throwable th) {
                C00j.A01(1169241838);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-1487456671);
            throw th2;
        }
    }
}

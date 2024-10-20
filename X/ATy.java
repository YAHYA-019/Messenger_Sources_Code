package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: ATy.class */
public final class ATy extends C00q implements Function1 {
    public static final ATy A00 = new ATy();

    public ATy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A31 A0a = 7zU.A0a(obj);
        C00j.A05("SubscriptionInitializerV3.selectModel", -1479236117);
        try {
            C00j.A05("SubscriptionInitializerV3.selectModel", -58521512);
            try {
                A0a.A02.put(State.class, null);
                C00j.A01(53099782);
                C00j.A01(-1957342410);
                return 04S.A00;
            } catch (Throwable th) {
                C00j.A01(-412413409);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(240215274);
            throw th2;
        }
    }
}

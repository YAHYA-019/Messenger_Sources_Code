package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: ATw.class */
public final class ATw extends C00q implements Function1 {
    public static final ATw A00 = new ATw();

    public ATw() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A31 A0a = 7zU.A0a(obj);
        AWX awx = AWX.A00;
        C00j.A05("SubscriptionInitializerV3.selectProperty", 1700066710);
        try {
            C00j.A05("SubscriptionInitializerV3.selectProperty", -1515276624);
            try {
                A31.A01(A0a, 7zV.A0Y(State.class, A0a.A01), awx, null);
                C00j.A01(-2142870348);
                C00j.A01(-647768832);
                return 04S.A00;
            } catch (Throwable th) {
                C00j.A01(605420656);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(488702233);
            throw th2;
        }
    }
}

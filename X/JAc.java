package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: JAc.class */
public final class JAc extends C00q implements Function1 {
    public static final JAc A00 = new JAc();

    public JAc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A31 A0a = 7zU.A0a(obj);
        JBz jBz = new C06w() { // from class: X.JBz
            @Override // X.C06w, X.AnonymousClass070
            public Object get(Object obj2) {
                return ((State) obj2).localCallId;
            }
        };
        C00j.A05("SubscriptionInitializerV3.selectProperty", 196676529);
        try {
            C00j.A05("SubscriptionInitializerV3.selectProperty", 1997216164);
            try {
                A31.A01(A0a, 7zV.A0Y(State.class, A0a.A01), jBz, null);
                C00j.A01(-1940101318);
                C00j.A01(827579297);
                return 04S.A00;
            } catch (Throwable th) {
                C00j.A01(-956744027);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-1467258531);
            throw th2;
        }
    }
}

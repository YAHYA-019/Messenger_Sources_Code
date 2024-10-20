package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: JAh.class */
public final class JAh extends C00q implements Function1 {
    public static final JAh A00 = new JAh();

    public JAh() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        A31 A0a = 7zU.A0a(obj);
        JC2 jc2 = new C06w() { // from class: X.JC2
            @Override // X.C06w, X.AnonymousClass070
            public Object get(Object obj2) {
                return Integer.valueOf(((State) obj2).callState);
            }
        };
        C00j.A05("SubscriptionInitializerV3.selectProperty", -1565128343);
        try {
            C00j.A05("SubscriptionInitializerV3.selectProperty", -1539239342);
            try {
                C04r c04r = A0a.A01;
                C04r A0D = AbstractC2327GOs.A0D(A0a, jc2, null, (List) 7zV.A0Y(State.class, c04r));
                C00j.A01(-2116667022);
                C00j.A01(-1059089441);
                JC3 jc3 = new C06w() { // from class: X.JC3
                    @Override // X.C06w, X.AnonymousClass070
                    public Object get(Object obj2) {
                        return Integer.valueOf(((CallModel) obj2).inCallState);
                    }
                };
                C00j.A05("SubscriptionInitializerV3.selectProperty", -1097760814);
                try {
                    C00j.A05("SubscriptionInitializerV3.selectProperty", 1823437888);
                    try {
                        7zV.A15(7zV.A0Y(CallModel.class, c04r), jc3, (Object) null, A0D);
                        C00j.A01(-587587174);
                        C00j.A01(1870875991);
                        return 04S.A00;
                    } catch (Throwable th) {
                        C00j.A01(1121158251);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 2069966327;
                    C00j.A01(i);
                    throw th;
                }
            } catch (Throwable th3) {
                C00j.A01(203590776);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i = -1330666663;
        }
    }
}

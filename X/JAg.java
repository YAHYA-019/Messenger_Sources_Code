package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: JAg.class */
public final class JAg extends C00q implements Function1 {
    public static final JAg A00 = new JAg();

    public JAg() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        A31 A0a = 7zU.A0a(obj);
        JC0 jc0 = new C06w() { // from class: X.JC0
            @Override // X.C06w, X.AnonymousClass070
            public Object get(Object obj2) {
                return Integer.valueOf(((State) obj2).callState);
            }
        };
        C00j.A05("SubscriptionInitializerV3.selectProperty", 932448892);
        try {
            C00j.A05("SubscriptionInitializerV3.selectProperty", -1915440590);
            try {
                C04r c04r = A0a.A01;
                C04r A0D = AbstractC2327GOs.A0D(A0a, jc0, null, (List) 7zV.A0Y(State.class, c04r));
                C00j.A01(-1060234423);
                C00j.A01(990054985);
                JC1 jc1 = new C06w() { // from class: X.JC1
                    @Override // X.C06w, X.AnonymousClass070
                    public Object get(Object obj2) {
                        return Integer.valueOf(((CallModel) obj2).inCallState);
                    }
                };
                C00j.A05("SubscriptionInitializerV3.selectProperty", 1019921076);
                try {
                    C00j.A05("SubscriptionInitializerV3.selectProperty", 2078118868);
                    try {
                        7zV.A15(7zV.A0Y(CallModel.class, c04r), jc1, (Object) null, A0D);
                        C00j.A01(444353504);
                        C00j.A01(400310567);
                        return 04S.A00;
                    } catch (Throwable th) {
                        C00j.A01(-740207171);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 1179441242;
                    C00j.A01(i);
                    throw th;
                }
            } catch (Throwable th3) {
                C00j.A01(647433814);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i = -1621995436;
        }
    }
}

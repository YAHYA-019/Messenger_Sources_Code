package X;

import com.facebook.rsys.call.gen.CallModel;
import kotlin.jvm.functions.Function1;

/* loaded from: JAr.class */
public final class JAr extends C00q implements Function1 {
    public static final JAr A00 = new JAr();

    public JAr() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A31 A0a = 7zU.A0a(obj);
        JC7 jc7 = new C06w() { // from class: X.JC7
            @Override // X.C06w, X.AnonymousClass070
            public Object get(Object obj2) {
                return ((CallModel) obj2).remoteParticipants;
            }
        };
        C00j.A05("SubscriptionInitializerV3.selectProperty", -1455656415);
        try {
            C00j.A05("SubscriptionInitializerV3.selectProperty", 1947771470);
            try {
                A31.A01(A0a, 7zV.A0Y(CallModel.class, A0a.A01), jc7, null);
                C00j.A01(-1152715074);
                C00j.A01(-1521771642);
                return 04S.A00;
            } catch (Throwable th) {
                C00j.A01(2005465211);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-803286807);
            throw th2;
        }
    }
}

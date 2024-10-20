package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: ATu.class */
public final class ATu extends C00q implements Function1 {
    public static final ATu A00 = new ATu();

    public ATu() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A31 A0a = 7zU.A0a(obj);
        AWW aww = AWW.A00;
        C00j.A05("SubscriptionInitializerV3.selectProperty", -1468849419);
        try {
            C00j.A05("SubscriptionInitializerV3.selectProperty", 2057205858);
            try {
                A31.A01(A0a, 7zV.A0Y(State.class, A0a.A01), aww, null);
                C00j.A01(1620220025);
                C00j.A01(-919972863);
                return 04S.A00;
            } catch (Throwable th) {
                C00j.A01(25000223);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(1235612080);
            throw th2;
        }
    }
}

package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: JAv.class */
public final class JAv extends C00q implements Function1 {
    public static final JAv A00 = new JAv();

    public JAv() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        A31 A0a = 7zU.A0a(obj);
        C00j.A05("SubscriptionInitializerV3.selectModel", 467334614);
        try {
            C00j.A05("SubscriptionInitializerV3.selectModel", 2134717104);
            try {
                C04r c04r = A0a.A02;
                c04r.put(CallModel.class, null);
                C00j.A01(444634196);
                C00j.A01(-919769088);
                C00j.A05("SubscriptionInitializerV3.selectModel", 1633497293);
                try {
                    C00j.A05("SubscriptionInitializerV3.selectModel", -943662018);
                    try {
                        c04r.put(State.class, null);
                        C00j.A01(-400807117);
                        C00j.A01(1587356791);
                        return 04S.A00;
                    } catch (Throwable th) {
                        C00j.A01(663961102);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = -1350701575;
                    C00j.A01(i);
                    throw th;
                }
            } catch (Throwable th3) {
                C00j.A01(-330449479);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i = -1576901734;
        }
    }
}

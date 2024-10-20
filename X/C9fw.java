package X;

import com.facebook.rsys.call.gen.CallModel;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9fw, reason: invalid class name */
/* loaded from: 9fw.class */
public final class C9fw {
    public C2a2 A00;
    public final C01i A02 = C01g.A00(C03i.A02, ANf.A00);
    public final 9E1 A04 = (9E1) 1Bn.A0A(68761);
    public final 1Br A01 = 1Bu.A01(7zM.A0A(), 82763);
    public final Function1 A03 = new GBo(new GC5(this, 11), 38);

    public static final void A00(C9fw c9fw, 5Vt r302, CallModel callModel) {
        IDO.A00.A03("StoreScopedThreadInfoMiddleware", "Fetching thread summary", (Throwable) null);
        c9fw.A00 = 2aK.A04(new AJf(c9fw, r302, callModel, null, 7), (2aI) c9fw.A02.getValue());
    }
}

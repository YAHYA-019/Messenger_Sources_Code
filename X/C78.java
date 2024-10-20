package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C78.class */
public final class C78 {
    public Integer A00 = 0S2.A00;
    public final /* synthetic */ B9T A01;

    public C78(B9T b9t) {
        this.A01 = b9t;
    }

    public ThreadKey A00() {
        ThreadKey threadKey = this.A01.A02;
        if (threadKey != null) {
            return threadKey;
        }
        AbM.A17();
        throw 0Q8.createAndThrow();
    }

    public void A01(BLP blp) {
        B9T b9t = this.A01;
        ThreadSummary threadSummary = b9t.A03;
        1F9 r305 = null;
        if (threadSummary != null) {
            r305 = threadSummary.A0g;
        }
        2Pe r0 = (2Pe) 1Br.A0B(b9t.A0E);
        ThreadKey threadKey = b9t.A02;
        if (threadKey == null) {
            AbM.A17();
            throw 0Q8.createAndThrow();
        }
        BLc bLc = BLc.A07;
        C1758Ars c1758Ars = b9t.A01;
        r0.AL8(r305, threadKey, bLc, blp, ((BJB) b9t).A01, (c1758Ars == null || !c1758Ars.A01) ? null : BSo.A00(b9t.requireContext(), c1758Ars, threadKey, 2131954553, 2131954554), b9t.A06, b9t.A07).A0m(7zN.A08(b9t), 1BJ.A00(500));
    }
}

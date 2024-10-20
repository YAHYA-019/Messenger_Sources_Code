package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6tS, reason: invalid class name */
/* loaded from: 6tS.class */
public final class C6tS {
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ C6s5 A01;

    public C6tS(ThreadKey threadKey, C6s5 c6s5) {
        this.A01 = c6s5;
        this.A00 = threadKey;
    }

    public void A00() {
        C6s5 c6s5 = this.A01;
        int i = C6s5.A0g;
        C6tR c6tR = c6s5.A0C;
        if (c6tR != null) {
            c6tR.A01();
            9Z9 r0 = c6tR.A0E;
            if (r0 != null) {
                r0.A00 = null;
            }
        }
    }

    public void A01() {
        9Z9 r0;
        8CW r02;
        C6s5 c6s5 = this.A01;
        int i = C6s5.A0g;
        C9cp c9cp = c6s5.A0E;
        if (c9cp != null && (r02 = c9cp.A01) != null) {
            8CW.A03(r02, false, true, false);
        }
        C9ki c9ki = c6s5.A0D;
        if (c9ki != null) {
            C9ki.A00(c9ki, 500L);
            c9ki.A03 = false;
        }
        C6tR c6tR = c6s5.A0C;
        if (c6tR == null || (r0 = c6tR.A0E) == null || r0.A00 == null) {
            return;
        }
        ((9Xe) 1Br.A0B(c6tR.A0A)).A00(c6tR.A0B, c6tR.A0N);
    }
}

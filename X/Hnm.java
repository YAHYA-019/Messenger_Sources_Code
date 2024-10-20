package X;

import com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl;

/* loaded from: Hnm.class */
public final class Hnm {
    public final /* synthetic */ SUPVideoCallingImpl A00;
    public final /* synthetic */ C00m A01;

    public Hnm(SUPVideoCallingImpl sUPVideoCallingImpl, C00m c00m) {
        this.A00 = sUPVideoCallingImpl;
        this.A01 = c00m;
    }

    public void A00() {
        SUPVideoCallingImpl sUPVideoCallingImpl = this.A00;
        JNg A00 = Hn2.A00(sUPVideoCallingImpl.A03);
        if (A00 != null && !A00.BQq()) {
            this.A01.invoke();
        }
        sUPVideoCallingImpl.A02();
    }
}

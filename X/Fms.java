package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Fms.class */
public final class Fms implements GFd {
    public 1BY A00;
    public GFd A01;
    public final C00i A05 = 1BV.A01((1BY) null, 99119);
    public final C00i A03 = 1BV.A01((1BY) null, 85168);
    public final C00i A04 = 1BV.A01((1BY) null, 85167);
    public final C00i A02 = 1BV.A01((1BY) null, 98525);

    public Fms(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static final Fms A00(1BO r301) {
        return new Fms(r301);
    }

    @Override // X.GFd
    public GFc B1x(ThreadSummary threadSummary, EMw eMw) {
        C00i c00i = this.A05;
        GFd gFd = (GFd) (FI2.A02(c00i) ? this.A02 : 1Br.A06(DKC.A0Z(c00i).A01).AZk(36314992164872551L) ? this.A04 : this.A03).get();
        this.A01 = gFd;
        return gFd.B1x(threadSummary, eMw);
    }
}

package X;

import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Hnl.class */
public final class Hnl {
    public final 1De A00;
    public final 1Br A01;

    public Hnl(1De r302) {
        this.A00 = r302;
        this.A01 = 7zM.A0h(r302, 67603);
    }

    public final C1hn A00(FbUserSession fbUserSession) {
        ListenableFuture A00 = ((C3Nt) 1Br.A0B(this.A01)).A00(5000L);
        C5V0 c5v0 = (C5V0) 4YU.A0o(fbUserSession, this.A00, 115765);
        Hj4 hj4 = (Hj4) 1Br.A0B(c5v0.A0G);
        Intent A05 = AbF.A05();
        A05.setAction(AnonymousClass000.A00(184));
        ((1I7) hj4.A03.get()).CkS(A05);
        ((2JT) hj4.A04.get()).A00.A01();
        ((Hsf) 1Br.A0B(c5v0.A0E)).A01(fbUserSession, c5v0.A0O);
        ListenableFuture listenableFuture = 1hM.A01;
        11T.A0A(listenableFuture);
        1JU r0 = 1JU.A01;
        ListenableFuture A02 = 2FP.A02(new ImY(2), listenableFuture, r0);
        return 1Kd.A05(new ListenableFuture[]{A00, A02}).A01(new J5V(A02, A00, 16), r0);
    }
}

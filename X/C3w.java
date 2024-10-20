package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: C3w.class */
public final class C3w {
    public final 1Br A00 = AbG.A0J();
    public final 1Br A01;
    public final 1De A02;

    public C3w(1De r302) {
        this.A02 = r302;
        this.A01 = 7zM.A0h(r302, 68126);
    }

    public final SettableFuture A00(ThreadKey threadKey) {
        SettableFuture A0j = 4YU.A0j();
        D4p A00 = D4p.A00(this, A0j, 37);
        C30G A0H = AbF.A0H(61);
        long A0r = threadKey.A0r();
        A0H.A03(4YT.A00(ActionId.APPLY_FINISHED_LIST_AGAIN), String.valueOf(A0r));
        C3sa A002 = C3sa.A00(A0H);
        4fF r0 = (4fF) 1Br.A0B(this.A01);
        String A0U = 0Pz.A0U("thread:", A0r);
        4YU.A1J(A002, 267235184257586L);
        r0.A0I(A002, A00, A0U, 4YV.A11(this.A00));
        return A0j;
    }
}

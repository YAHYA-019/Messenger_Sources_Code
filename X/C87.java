package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: C87.class */
public final class C87 {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public C87(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A00 = fbUserSession;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 49711);
        this.A02 = 1Lm.A03(fbUserSession, r0, 67540);
        this.A03 = 1Bu.A03(r0, 67491);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public 2eH A00(long j) {
        ?? A0j = 4YU.A0j();
        ((5xU) 1Br.A0B(this.A02)).A02(new Czk((SettableFuture) A0j, ActionId.RTMP_CONNECTION_FAILED), j);
        return 2FP.A00(D3y.A00, (ListenableFuture) A0j, 1JU.A01);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public 2eH A01(long j) {
        ?? A0j = 4YU.A0j();
        ((5xU) 1Br.A0B(this.A02)).A02(new Czk((SettableFuture) A0j, ActionId.RTMP_CONNECTION_FAILED), j);
        return 2FP.A00(D3z.A00, (ListenableFuture) A0j, 1JU.A01);
    }
}

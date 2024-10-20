package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: C5M.class */
public final class C5M {
    public final 1De A00;
    public final 1Br A04;
    public final 1Br A01 = 7zM.A0Q();
    public final 1Br A03 = 7zM.A0S();
    public final 1Br A02 = 1Bq.A00(16469);
    public final 1Br A05 = 7zM.A0O();

    public C5M(1De r302) {
        this.A00 = r302;
        this.A04 = 7zM.A0h(r302, 83054);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public final void A00(FbUserSession fbUserSession, JIO jio, ImmutableList immutableList, int i) {
        11T.A0F(immutableList, 2);
        7zP.A0e(this.A03).markerStart(i);
        ?? A0j = 4YU.A0j();
        4YV.A11(this.A02).execute(new DAH(fbUserSession, 7zL.A0S(fbUserSession, this.A00, 33102), this, immutableList, (SettableFuture) A0j, i));
        1Br.A0D(this.A05, new InL(i, 0, this, jio), (ListenableFuture) A0j);
    }
}

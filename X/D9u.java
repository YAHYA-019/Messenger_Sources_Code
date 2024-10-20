package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: D9u.class */
public final class D9u implements Runnable {
    public static final String __redex_internal_original_name = "OrcaRtcThreadAndUserDataHandler$loadThreadTileDataFutureForUserKey$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C9V A01;
    public final /* synthetic */ UserKey A02;
    public final /* synthetic */ SettableFuture A03;

    public D9u(FbUserSession fbUserSession, C9V c9v, UserKey userKey, SettableFuture settableFuture) {
        this.A00 = fbUserSession;
        this.A02 = userKey;
        this.A01 = c9v;
        this.A03 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            FbUserSession fbUserSession = this.A00;
            C8b c8b = (C8b) 1Lm.A06(fbUserSession, 84457);
            UserKey userKey = this.A02;
            User A00 = c8b.A00(userKey);
            if (A00 == null) {
                CbR cbR = (CbR) 1Br.A0B(this.A01.A00);
                String str = userKey.id;
                11T.A0A(str);
                ImmutableList A002 = cbR.A00(11T.A03(str));
                A00 = A002.isEmpty() ? null : AbG.A0u(A002, 0);
            }
            this.A03.set(A00 == null ? null : ((2fZ) 1Lm.A06(fbUserSession, 17067)).A0R(A00, C2fd.A0T));
        } catch (InterruptedException | ExecutionException e) {
            this.A03.setException(e);
        }
    }
}

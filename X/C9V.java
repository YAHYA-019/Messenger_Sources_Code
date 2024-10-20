package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: C9V.class */
public final class C9V {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Context A04;

    public C9V() {
        Context A0A = 7zM.A0A();
        this.A04 = A0A;
        this.A03 = 1HG.A00(A0A, 49761);
        this.A00 = 1Bu.A00(83054);
        this.A01 = AbG.A0M();
        this.A02 = 1Bq.A00(16469);
    }

    public ThreadSummary A00(FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(fbUserSession, 0);
        if (threadKey == null) {
            return null;
        }
        return ((2fE) 1Lo.A08(fbUserSession, 17064)).A06(threadKey);
    }

    public User A01(FbUserSession fbUserSession, UserKey userKey) {
        11T.A0H(fbUserSession, userKey);
        User A01 = ((C8b) 1Lo.A08(fbUserSession, 84457)).A01(userKey);
        if (A01 == null) {
            BoF boF = (BoF) 1Lo.A08(fbUserSession, 84873);
            synchronized (boF) {
                A01 = (User) boF.A01.Apt(userKey);
                if (A01 == null) {
                    A01 = ((23F) boF.A00.get()).A00(userKey);
                }
            }
        }
        return A01;
    }

    public ListenableFuture A02(FbUserSession fbUserSession, ImmutableList immutableList) {
        11T.A0F(fbUserSession, 0);
        ListenableFuture D3C = AbJ.A0u(this.A02).D3C(new DBG(9, immutableList, this, fbUserSession));
        11T.A0A(D3C);
        return D3C;
    }

    public SettableFuture A03(FbUserSession fbUserSession, UserKey userKey) {
        11T.A0H(fbUserSession, userKey);
        SettableFuture A0j = 4YU.A0j();
        if (userKey.type != null && userKey.id != null) {
            4YV.A11(this.A02).execute(new D9u(fbUserSession, this, userKey, A0j));
            return A0j;
        }
        1Br.A04(this.A01).D0v("OrcaRtcThreadAndUserDataHandler", "InvalidUserKey");
        A0j.setException(AnonymousClass001.A0L("Attempted to fetch invalid user key"));
        return A0j;
    }

    public String A04(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        C2p1 A02 = threadSummary == null ? null : ((5Xu) 1Lo.A08(fbUserSession, 49772)).A02(threadSummary);
        String str = null;
        if (A02 != null) {
            String str2 = A02.A03;
            if (str2 != null) {
                return str2;
            }
            ImmutableList immutableList = A02.A02;
            if (!immutableList.isEmpty()) {
                str = ((5Ws) 1Br.A0B(this.A03)).A01(immutableList);
            }
        }
        return str;
    }
}

package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: C57.class */
public final class C57 {
    public 1BY A00;
    public final C00i A04 = 1BV.A01((1BY) null, 82566);
    public final C00i A03 = 1BV.A01((1BY) null, 82609);
    public final C00i A01 = 1BV.A01((1BY) null, 82027);
    public final C00i A02 = AbH.A0W();

    public C57(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public SettableFuture A00(FbUserSession fbUserSession, ThreadKey threadKey, int i) {
        SettableFuture A0j = 4YU.A0j();
        C1300Add c1300Add = (C1300Add) this.A03.get();
        ThreadKey threadKey2 = threadKey;
        if (ThreadKey.A0a(threadKey)) {
            threadKey2 = ThreadKey.A08(threadKey.A04);
        }
        1G2 r0 = 1NK.A06;
        1G2 A05 = AbstractC03303xn.A05(threadKey2);
        1Ql A0V = 1BL.A0V(c1300Add.A00);
        A0V.CaE(A05, i);
        A0V.commit();
        this.A02.get();
        BmD bmD = (BmD) 1Bn.A0E((Context) null, this.A00, 82610);
        long j = threadKey.A04;
        Czj A00 = Czj.A00(this, A0j, 63);
        11T.A0F(fbUserSession, 0);
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0o(fbUserSession, bmD.A00, 68338);
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, A00);
        1Um.A02(A0O, new CzV(i, 9, j, mailboxFeature, A0Q), A0Q, false);
        return A0j;
    }
}

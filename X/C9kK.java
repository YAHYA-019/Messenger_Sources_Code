package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.9kK, reason: invalid class name */
/* loaded from: 9kK.class */
public final class C9kK {
    public final C2cx A00;
    public final FbUserSession A01;

    public C9kK(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A00 = (C2cx) 1Lo.A08(fbUserSession, 33177);
    }

    public static final SettableFuture A00(C9kK c9kK, int i) {
        SettableFuture A0j = 4YU.A0j();
        A1f A00 = A1f.A00(A0j, c9kK, 67);
        C2cx c2cx = c9kK.A00;
        Integer valueOf = Integer.valueOf(i);
        1Um A0R = 1BL.A0R(c2cx);
        MailboxFutureImpl A0P = 1BK.A0P(A0R);
        1Um.A02(A0R, new A0Q(0, valueOf, c2cx, 0, A0P), A0P, false);
        A0P.addResultCallback(A00);
        return A0j;
    }

    public static final SettableFuture A01(C9kK c9kK, boolean z) {
        SettableFuture A0j = 4YU.A0j();
        A1f A00 = A1f.A00(A0j, c9kK, 66);
        C2cx c2cx = c9kK.A00;
        Integer valueOf = Integer.valueOf((-1) >>> 1);
        1Um A0R = 1BL.A0R(c2cx);
        MailboxFutureImpl A0P = 1BK.A0P(A0R);
        1Um.A02(A0R, new IbP(0, c2cx, A0P, valueOf, 0, z), A0P, false);
        A0P.addResultCallback(A00);
        return A0j;
    }
}

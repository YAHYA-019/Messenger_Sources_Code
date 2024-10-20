package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;

/* loaded from: C3t.class */
public final class C3t {
    public 1BY A00;
    public C1qM A01;
    public final C00i A02 = AbH.A0F();

    public C3t(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(FbUserSession fbUserSession, MailboxCallback mailboxCallback, MailboxCallback mailboxCallback2, ImmutableList immutableList, Long l, String str, String str2, int i, long j, long j2) {
        this.A01 = new CxU(fbUserSession, this, mailboxCallback2, str, j2);
        1BY r0 = this.A00;
        ((C21N) 1Lo.A04((Context) null, fbUserSession, r0, 33124)).A00(this.A01);
        BDH bdh = (BDH) 1Lo.A04((Context) null, fbUserSession, r0, 83076);
        1Um AQV = bdh.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new N7W(A0P, bdh, l, immutableList, str, str2, i, j, j2), A0P, false);
        A0P.A00(1BK.A1E(this.A02)).Cu4(mailboxCallback);
    }
}

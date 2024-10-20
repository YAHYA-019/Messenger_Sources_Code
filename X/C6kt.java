package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.6kt, reason: invalid class name */
/* loaded from: 6kt.class */
public final class C6kt {
    public final C6ku A00;
    public final 1Br A01;
    public final 1De A02;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.6ku, com.facebook.msys.mca.MailboxFeature] */
    public C6kt(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        1Br A03 = 1Lm.A03(fbUserSession, r303.A00, 16686);
        this.A01 = A03;
        C1qL c1qL = C6ku.A00;
        this.A00 = new MailboxFeature((1Uj) A03.A00.get());
    }
}

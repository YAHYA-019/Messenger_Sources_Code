package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.4lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4lp.class */
public final class C08044lp {
    public final 1Br A00;
    public final C1qM A01;
    public final Set A02;
    public final ReentrantReadWriteLock A03;
    public final FbUserSession A04;
    public final 1De A05;

    public C08044lp(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        this.A04 = fbUserSession;
        this.A00 = 1Lm.A03(fbUserSession, r303.A00, 67414);
        this.A03 = new ReentrantReadWriteLock();
        this.A02 = new LinkedHashSet();
        this.A01 = new C9zw(this, 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A00() {
        ?? obj = new Object();
        MailboxFeature mailboxFeature = (MailboxFeature) this.A00.A00.get();
        long parseLong = Long.parseLong(this.A04.A02);
        A1b a1b = new A1b((SettableFuture) obj, 37);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(a1b);
        if (!AQV.Cj2(new Cxl(1, parseLong, mailboxFeature, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        return obj;
    }
}

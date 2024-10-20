package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.concurrent.Executor;

/* renamed from: X.7PU, reason: invalid class name */
/* loaded from: 7PU.class */
public final class C7PU {
    public C7f3 A00;
    public Long A01;
    public 1X9 A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C21h A06;
    public final 1De A07;

    public C7PU(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A03 = 1Bq.A00(16477);
        1BY r0 = r303.A00;
        this.A05 = 1Lm.A03(fbUserSession, r0, 16686);
        this.A04 = 1Lm.A03(fbUserSession, r0, 33183);
        this.A06 = new C1242Abk(this);
    }

    public static final void A00(C7PU c7pu) {
        C7f3 c7f3 = c7pu.A00;
        if (c7f3 == null || c7f3.A01 == null) {
            return;
        }
        MailboxFeature mailboxFeature = (MailboxFeature) c7pu.A04.A00.get();
        Long valueOf = Long.valueOf(c7f3.A00);
        String str = c7f3.A02;
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Ib1(mailboxFeature, valueOf, mailboxFutureImpl, str, 0))) {
            mailboxFutureImpl.cancel(false);
        }
        synchronized (c7pu) {
            1X9 r0 = c7pu.A02;
            if (r0 != null) {
                r0.cancel();
            }
            c7pu.A02 = mailboxFutureImpl;
        }
        mailboxFutureImpl.A00((Executor) c7pu.A03.A00.get());
        mailboxFutureImpl.Cu4(new Iah(c7f3, c7pu, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r0.A00 != r304) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C7f5 A01(X.7P6 r302, java.lang.String r303, long r304) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7PU.A01(X.7P6, java.lang.String, long):X.7f5");
    }

    public final void A02(7P6 r302) {
        synchronized (this) {
            11T.A0F(r302, 0);
            C7f3 c7f3 = this.A00;
            if (11T.A0O(c7f3 != null ? c7f3.A01 : null, r302)) {
                C7f3 c7f32 = this.A00;
                if (c7f32 == null) {
                    throw 1BK.A0h();
                }
                long j = c7f32.A00;
                String str = c7f32.A02;
                11T.A0F(str, 1);
                this.A00 = new C7f3(null, str, j);
            }
        }
    }
}

package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.21d, reason: invalid class name */
/* loaded from: 21d.class */
public final class C21d {
    public C1252Abu A00;
    public 1BY A01;
    public final C00i A04;
    public final C00i A03 = new 1BV((1BY) null, 68439);
    public final C00i A0A = new 1BQ(16385);
    public final C00i A08 = new 1BQ(66485);
    public final C00i A09 = new 1BQ(66265);
    public final C00i A02 = new 1BQ(16456);
    public final C00i A0B = new 1BV((1BY) null, 66912);
    public final java.util.Map A06 = Collections.synchronizedMap(new HashMap());
    public final java.util.Map A07 = Collections.synchronizedMap(new HashMap());
    public final C1qM A05 = new CxN(this, 0);

    public C21d(1BO r302, FbUserSession fbUserSession) {
        this.A01 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A04 = new 1MV(fbUserSession, (1BY) null, 33102);
    }

    private void A00(Long l) {
        MailboxFeature mailboxFeature = (MailboxFeature) this.A03.get();
        long longValue = l.longValue();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new N6s(2, longValue, mailboxFeature, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new Cxe(this, l, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0184, code lost:
    
        if (r0.A01 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList A01(com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21d.A01(com.facebook.messaging.model.threadkey.ThreadKey):com.google.common.collect.ImmutableList");
    }

    public void A02() {
        if (((2yD) this.A0A.get()).AZk(36315683654477111L)) {
            return;
        }
        this.A08.get();
    }

    public boolean A03(ThreadKey threadKey) {
        long j = threadKey.A02;
        Long valueOf = Long.valueOf(j);
        A02();
        User A00 = ((23F) this.A04.get()).A00(new UserKey(1Js.A03, String.valueOf(j)));
        if (A00 != null && A00.A0E()) {
            if (((C02753w3) this.A07.get(valueOf)) != null) {
                return !r0.A01;
            }
            A00(valueOf);
        }
        return true;
    }
}

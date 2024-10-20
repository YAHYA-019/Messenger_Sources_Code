package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.6v3, reason: invalid class name */
/* loaded from: 6v3.class */
public final class C6v3 implements C6v4 {
    public final 1Br A00;
    public final Context A01;
    public final FbUserSession A02;
    public final ThreadKey A03;

    public C6v3(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A03 = threadKey;
        this.A00 = 1Lm.A00(context, fbUserSession, 65962);
    }

    @Override // X.C6v4
    public void BYv(long j) {
        22C r0 = (22C) 1Br.A0B(this.A00);
        long j2 = this.A03.A01;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        int A00 = 4uZ.A00(A0P, (1X9) null);
        TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientMessageRangeLoadMoreAfter");
        if (!AQV.Cj2(new IbI(A0P, r0, A00, 2, j2, j))) {
            A0P.cancel(false);
            4uZ.A03(A00);
            4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientMessageRangeLoadMoreAfter");
        }
        PlatformLogger.platformEventLog(5);
    }

    @Override // X.C6v4
    public void BYw(long j) {
        22C r0 = (22C) this.A00.A00.get();
        long j2 = this.A03.A01;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        int A00 = 4uZ.A00(mailboxFutureImpl, (1X9) null);
        TraceInfo A02 = 4uZ.A02(mailboxFutureImpl, (LoggingOption) null, "MailboxTam", "runTamClientMessageRangeLoadMoreBefore");
        if (!AQV.Cj2(new IbI(mailboxFutureImpl, r0, A00, 1, j2, j))) {
            mailboxFutureImpl.cancel(false);
            4uZ.A03(A00);
            4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientMessageRangeLoadMoreBefore");
        }
        PlatformLogger.platformEventLog(5);
    }
}

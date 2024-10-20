package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.6xj, reason: invalid class name */
/* loaded from: 6xj.class */
public final class C6xj implements C6xk {
    public final 1Br A01;
    public final 1Br A00 = 1Bq.A00(16511);
    public final 1Br A02 = 1Bq.A00(68077);

    public C6xj(Context context, FbUserSession fbUserSession) {
        this.A01 = 1Lm.A00(context, fbUserSession, 65961);
    }

    @Override // X.C6xk
    public void AGq(ThreadKey threadKey, CharSequence charSequence) {
        5P8 r0 = (5P8) this.A01.A00.get();
        this.A02.A00.get();
        String A00 = 5QA.A00(threadKey);
        String obj = charSequence != null ? charSequence.toString() : null;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        int A002 = 4uZ.A00(mailboxFutureImpl, (1X9) null);
        TraceInfo A02 = 4uZ.A02(mailboxFutureImpl, (LoggingOption) null, "MailboxSDK", "saveDraftMessage");
        if (!AQV.Cj2(new N7E(mailboxFutureImpl, r0, A00, obj, A002, 2))) {
            mailboxFutureImpl.cancel(false);
            4uZ.A03(A002);
            4uZ.A05((LoggingOption) null, A02, "MailboxSDK", "saveDraftMessage");
        }
        PlatformLogger.platformEventLog(5);
        mailboxFutureImpl.addResultCallback(new A1b(this, 39));
    }
}

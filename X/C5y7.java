package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.5y7, reason: invalid class name */
/* loaded from: 5y7.class */
public final class C5y7 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final C5y8 A03;
    public final Context A04;
    public final FbUserSession A05;

    /* JADX WARN: Type inference failed for: r0v18, types: [X.5y8, com.facebook.msys.mca.MailboxFeature] */
    public C5y7(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A01 = 1Lm.A00(context, fbUserSession, 65962);
        1Br A00 = 1Lm.A00(context, fbUserSession, 16686);
        this.A00 = A00;
        this.A02 = 1Bq.A00(66774);
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        this.A03 = new MailboxFeature((1Uj) A00.A00.get());
    }

    public final void A00(ThreadKey threadKey) {
        if (threadKey == null || !threadKey.A0x()) {
            return;
        }
        22C r0 = (22C) this.A01.A00.get();
        long j = threadKey.A01;
        PrivacyContext A00 = ((AnonymousClass224) this.A02.A00.get()).A00("529121621636450");
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        int A002 = 4uZ.A00(mailboxFutureImpl, (1X9) null);
        TraceInfo A02 = 4uZ.A02(mailboxFutureImpl, (LoggingOption) null, "MailboxTam", "runTamThreadBannerEnsureRestrictBottomBannerForCanonicalThread");
        if (!AQV.Cj2(new N83(mailboxFutureImpl, A00, r0, A002, 4, j))) {
            mailboxFutureImpl.cancel(false);
            4uZ.A03(A002);
            4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamThreadBannerEnsureRestrictBottomBannerForCanonicalThread");
        }
        PlatformLogger.platformEventLog(5);
    }
}

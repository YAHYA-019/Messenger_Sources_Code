package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wy.class */
public final class C03053wy implements InterfaceC03063wz {
    public static final String __redex_internal_original_name = "MsysMontageListLoader";
    public 2TV A00;
    public 1BY A01;
    public final ExecutorService A06 = (ExecutorService) 1Bi.A03(16457);
    public final C00i A03 = new 1BQ(46);
    public final Context A02 = FbInjector.A00();
    public final C00i A04 = new 1BV((1BY) null, 49793);
    public final C03073x0 A05 = (C03073x0) 1Bi.A03(68571);

    public C03053wy(1BO r302) {
        this.A01 = new 1BY(r302);
    }

    public void AEC() {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.5qp, com.facebook.msys.mca.MailboxFeature] */
    @Override // X.InterfaceC03063wz
    public void BYn(FbUserSession fbUserSession, C5qo c5qo, Executor executor) {
        C4W0 c4w0 = new C4W0(this, c5qo, 4);
        final ?? mailboxFeature = new MailboxFeature((1Uj) 1Lo.A09(fbUserSession, this.A01, 16686));
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        final MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new MailboxCallback() { // from class: X.5qq
            @Override // com.facebook.msys.mca.MailboxCallback
            public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, new MailboxNullable(null), 0, 0, "MCAMailboxFriendsTab", "OrcaFriendsTabStoryItems", new 30P(this, 0));
            }
        })) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(executor, c4w0);
    }

    public void CmR(2TV r302) {
        r302.getClass();
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        5rA r0 = (5rA) obj;
        BYn(r0.A00, new 5rB(r0, this), this.A06);
    }
}

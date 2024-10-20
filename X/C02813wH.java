package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3wH, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wH.class */
public final class C02813wH {
    public static final /* synthetic */ C06z[] A09 = {new C06w(C02813wH.class, "mailboxMarkInboxFolderSeen", "getMailboxMarkInboxFolderSeen()Lcom/facebook/markinboxfolderseen/mca/MailboxMarkInboxFolderSeen;", 0), new 0Fy(C02813wH.class, "threadFilterType", "getThreadFilterType()I", 0), new C06w(C02813wH.class, "backgroundExecutor", "getBackgroundExecutor()Ljava/util/concurrent/ScheduledExecutorService;", 0), new C06w(C02813wH.class, "subtabDebounceConfig", "getSubtabDebounceConfig()Lcom/facebook/messaging/inboxsubtabs/gating/MessengerInboxSubtabsGating;", 0)};
    public C00m A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final AtomicBoolean A04;
    public final AtomicReference A05;
    public final C01i A06;
    public final 0G2 A07;
    public final 1De A08;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0G2, java.lang.Object] */
    public C02813wH(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A02 = 1Lm.A03(fbUserSession, r303.A00, 68145);
        this.A05 = new AtomicReference(null);
        this.A07 = new Object();
        this.A01 = 1Bq.A00(16465);
        this.A03 = 1Bq.A00(68669);
        this.A06 = C01g.A01(new C4O0(this, 15));
        this.A04 = new AtomicBoolean(false);
    }
}

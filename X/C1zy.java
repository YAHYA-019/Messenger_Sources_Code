package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.msys.appstatecache.AppStateTracker;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NotificationCenter;

/* renamed from: X.1zy, reason: invalid class name */
/* loaded from: 1zy.class */
public abstract class C1zy {
    public static 20V A00(FbUserSession fbUserSession) {
        final 1Uj r0 = (1Uj) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 16686);
        final AnonymousClass206 anonymousClass206 = (AnonymousClass206) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 33176);
        final AnonymousClass209 anonymousClass209 = (AnonymousClass209) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 16893);
        final 1Ln r02 = (1Ln) 1Bi.A03(66191);
        final C0qy c0qy = (C0qy) 1Bi.A03(83603);
        final 20A r03 = (20A) 1Bi.A03(100043);
        final 1SI r04 = (1SI) 1Bn.A0E((Context) null, (1BY) null, 16671);
        final 1Yq r05 = (1Yq) 1Bi.A03(16708);
        final AppStateTracker appStateTracker = (AppStateTracker) 1Bi.A03(66588);
        final MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) 1Bi.A03(85048);
        final 1Tw r06 = (1Tw) 1Bi.A03(85050);
        final 20G r07 = (20G) 1Bn.A0E((Context) null, (1BY) null, 33178);
        final 1MV r08 = new 1MV(fbUserSession, (1BY) null, 16941);
        final C20J c20j = (C20J) 1Bn.A0E((Context) null, (1BY) null, 66496);
        final 3jD r09 = new 3jD(fbUserSession, 42);
        final 20L r010 = (20L) 1Bn.A0E((Context) null, (1BY) null, 66422);
        final FbNetworkManager fbNetworkManager = (FbNetworkManager) 1Bi.A03(16687);
        final 20N r011 = (20N) 1Bn.A0E((Context) null, (1BY) null, 99970);
        final C20Q c20q = (C20Q) 1Bn.A0E((Context) null, (1BY) null, 66222);
        final C20S c20s = (C20S) 1Bi.A03(66223);
        final C0dp c0dp = (C0dp) 1Bi.A03(99390);
        final C1gs c1gs = (C1gs) 1Bn.A0E((Context) null, (1BY) null, 66804);
        final C1ud c1ud = (C1ud) 1Bi.A03(65997);
        final 20U r012 = (20U) 1Bn.A0E((Context) null, (1BY) null, 66576);
        final 1fC r013 = (1fC) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 65779);
        final 20V r014 = new 20V();
        if (!r0.A06(new MailboxCallback() { // from class: X.20X
            @Override // com.facebook.msys.mca.MailboxCallback
            public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                Mailbox mailbox = (Mailbox) obj;
                mailbox.getClass();
                20V r015 = r014;
                AccountSession accountSession = r013.A03().A00.A02;
                1Uj r016 = r0;
                AnonymousClass206 anonymousClass2062 = anonymousClass206;
                AnonymousClass209 anonymousClass2092 = anonymousClass209;
                1Ln r017 = r02;
                C0qy c0qy2 = c0qy;
                20A r018 = r03;
                1SI r019 = r04;
                1Yq r020 = r05;
                AppStateTracker appStateTracker2 = appStateTracker;
                MessagingPerformanceLogger messagingPerformanceLogger2 = messagingPerformanceLogger;
                1Tw r021 = r06;
                20G r022 = r07;
                C00i c00i = r08;
                C20J c20j2 = c20j;
                C15h c15h = r09;
                NotificationCenter notificationCenter = mailbox.getSlimMailbox().getNotificationCenter();
                20L r023 = r010;
                FbNetworkManager fbNetworkManager2 = fbNetworkManager;
                20N r024 = r011;
                C20Q c20q2 = c20q;
                C20S c20s2 = c20s;
                r015.A00.set(new C25e(anonymousClass2062, anonymousClass2092, fbNetworkManager2, c0dp, c0qy2, r017, r018, c00i, r023, messagingPerformanceLogger2, r021, c20q2, c20s2, c1ud, r012, r022, appStateTracker2, r020, c20j2, r019, r024, r016, accountSession, notificationCenter, c1gs, c15h));
            }
        })) {
            r014.cancel(false);
        }
        return r014;
    }
}

package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.lockbox.LockBoxStorageManager;
import com.facebook.messaging.msys.appstatecache.AppStateTracker;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.mapbox.mapboxsdk.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.25e, reason: invalid class name */
/* loaded from: 25e.class */
public final class C25e {
    public AnonymousClass261 A00;
    public AnonymousClass209 A01;
    public final Handler A02;
    public final FbNetworkManager A03;
    public final C0dp A04;
    public final 20A A05;
    public final C00i A06;
    public final C00i A07;
    public final 20L A08;
    public final MessagingPerformanceLogger A09;
    public final 1Tw A0A;
    public final 1Uf A0B = 1Ud.A00();
    public final C20Q A0C;
    public final C20S A0D;
    public final 20U A0E;
    public final 20G A0F;
    public final 1SI A0G;
    public final C25f A0H;
    public final 20N A0I;
    public final C1qM A0J;
    public final 1Uj A0K;
    public final AccountSession A0L;
    public final 1Uc A0M;
    public final 1Uc A0N;
    public final 1Uc A0O;
    public final C25z A0P;
    public final AnonymousClass206 A0Q;
    public final C0qy A0R;
    public final 1Ln A0S;
    public final C00i A0T;
    public final C00i A0U;
    public final C1ud A0V;
    public final AppStateTracker A0W;
    public final C20J A0X;
    public final NotificationCenter A0Y;
    public final C1gs A0Z;
    public final C15h A0a;

    /* JADX WARN: Type inference failed for: r0v23, types: [X.25f] */
    public C25e(AnonymousClass206 anonymousClass206, AnonymousClass209 anonymousClass209, FbNetworkManager fbNetworkManager, C0dp c0dp, C0qy c0qy, 1Ln r307, 20A r308, C00i c00i, 20L r310, MessagingPerformanceLogger messagingPerformanceLogger, 1Tw r312, C20Q c20q, C20S c20s, C1ud c1ud, 20U r316, 20G r317, AppStateTracker appStateTracker, 1Yq r319, C20J c20j, 1SI r321, 20N r322, 1Uj r323, AccountSession accountSession, NotificationCenter notificationCenter, C1gs c1gs, C15h c15h) {
        1BQ r0 = new 1BQ(67262);
        this.A0T = r0;
        this.A07 = new 1BQ(32805);
        this.A0U = new 1BQ(83823);
        this.A0J = new CxN(this, 4);
        this.A0N = new 3bF(this, 6);
        this.A0M = new 3bF(this, 7);
        this.A0H = new Object() { // from class: X.25f
        };
        this.A0O = new 3bE(this, 1);
        this.A0L = accountSession;
        this.A0K = r323;
        this.A0Q = anonymousClass206;
        this.A01 = anonymousClass209;
        this.A0S = r307;
        this.A0R = c0qy;
        this.A05 = r308;
        this.A0G = r321;
        this.A0W = appStateTracker;
        this.A09 = messagingPerformanceLogger;
        this.A0C = c20q;
        this.A0D = c20s;
        this.A0A = r312;
        this.A0F = r317;
        this.A06 = c00i;
        this.A0X = c20j;
        this.A0a = c15h;
        notificationCenter.getClass();
        this.A0Y = notificationCenter;
        this.A08 = r310;
        this.A0I = r322;
        this.A03 = fbNetworkManager;
        this.A02 = new Handler(Looper.getMainLooper());
        this.A04 = c0dp;
        this.A0Z = c1gs;
        this.A0V = c1ud;
        this.A0E = r316;
        2yD r02 = (2yD) r321.A00.get();
        1GD r03 = 1GD.A05;
        if (r02.AZr(r03, 36315730900428185L) && ((1Rv) r0.get()).A09(48U.A00(C0f1.A00(), new String[]{AnonymousClass000.A00(7), AnonymousClass000.A00(4)}))) {
            0fH.A0l("SecureMessageOverWAMailboxImpl", "FBM/Messenger media bank sharing enabled");
            try {
                File A0D = AnonymousClass001.A0D(0LL.A00(Environment.DIRECTORY_DCIM), "Messenger");
                A0D.mkdirs();
                A0D.getCanonicalPath();
            } catch (IOException e) {
                0fH.A0r("SecureMessageOverWAMailboxImpl", "***** error getting the public directory", e);
            }
        }
        this.A0a.get();
        String A01 = r319.A01();
        String A012 = r319.A01();
        boolean AZr = ((2yD) this.A0G.A00.get()).AZr(r03, 36315610640229591L);
        String BDB = ((2yD) this.A0G.A00.get()).BDB(r03, 36878560593707885L);
        boolean AZr2 = ((2yD) this.A0G.A00.get()).AZr(r03, 2342157185335434806L);
        boolean AZr3 = ((2yD) this.A0G.A00.get()).AZr(r03, 36319600664656059L);
        this.A0G.A05();
        C25r c25r = new C25r(A01, A012, BDB, AZr, AZr2, ((2yD) this.A0G.A00.get()).AZk(36314176143564496L), AZr3, this.A0G.A01(), ((2yD) this.A0G.A00.get()).AZr(r03, 36314176134389388L), ((2yD) this.A0G.A00.get()).AZr(r03, 36314176136552093L), this.A0G.A06());
        String BCy = ((2yD) this.A0G.A00.get()).BCy(36879913508144074L);
        BCy = (BCy == null || BCy.isEmpty()) ? BuildConfig.VERSION_NAME : BCy;
        String obj = this.A0R.A00.toString();
        Application application = C0f1.A00;
        if (application == null) {
            throw AnonymousClass001.A0N(AnonymousClass000.A00(38));
        }
        C25w c25w = ((C25u) C1Y6.A00(application, "com_facebook_messaging_tincan_tincanoverwamsys_plugins_interfaces_appplatform_AppPlatformOverriderInterfaceSpec", "All", new Object[0])).A00;
        int andIncrement = C1Y6.A04.getAndIncrement();
        1YC r04 = c25w.A00;
        r04.A08("com.facebook.messaging.tincan.tincanoverwamsys.plugins.interfaces.appplatform.AppPlatformOverriderInterfaceSpec", "messaging.tincan.tincanoverwamsys.appplatform.AppPlatformOverriderInterfaceSpec", "getPlatform", andIncrement);
        r04.A02((Exception) null, "messaging.tincan.tincanoverwamsys.appplatform.AppPlatformOverriderInterfaceSpec", "getPlatform", andIncrement);
        C25z c25z = new C25z(BCy, 0S2.A00, obj);
        this.A0P = c25z;
        AnonymousClass261 anonymousClass261 = AnonymousClass261.$redex_init_class;
        this.A00 = new AnonymousClass261(C0f1.A00(), c25z, c25r, this.A0Q, this.A0H, this.A0L, this.A0Y, !BackgroundStartupDetector.A0D.A04() ? 1 : 0);
        LockBoxStorageManager.setEntryLogger((AnonymousClass297) 1Bn.A0A(66172), (AnonymousClass299) 1Bn.A0A(66173));
        AnonymousClass261 anonymousClass2612 = this.A00;
        HashSet hashSet = new HashSet();
        if (((2yD) this.A0G.A00.get()).AZk(36314176124886609L)) {
            hashSet.add(4);
        }
        anonymousClass2612.A05 = hashSet;
        if (((2yD) this.A0G.A00.get()).AZk(36310675734135704L)) {
            A02(this);
        }
    }

    public static void A00() {
        LruCache lruCache = C0A2.A00;
        1BK.A0W().A0A(C0f1.A00(), new Intent("android.intent.action.VIEW", Uri.parse("fb-messenger-secure://periodic_deprecation_hard_block")).addFlags(268435456));
    }

    public static void A01(C25e c25e) {
        if (((2yD) c25e.A0G.A00.get()).AZr(1GD.A07, 36317006505126797L)) {
            BwE bwE = (BwE) c25e.A0U.get();
            Context A00 = C0f1.A00();
            C6M c6m = bwE.A00;
            synchronized (c6m) {
                long j = c6m.A00;
                long j2 = -1;
                if (j == j2) {
                    0fH.A0n(4YT.A00(87), "Ignore service stop. Service not started.");
                } else {
                    long now = c6m.A01 - (c6m.A08.now() - j);
                    0fH.A17(4YT.A00(87), "wait %d ms to stop service.", new Object[]{Long.valueOf(now)});
                    c6m.A00 = j2;
                    if (now > 0) {
                        c6m.A06.postDelayed(c6m.A0B, now);
                    } else {
                        c6m.A00(A00);
                    }
                }
            }
            return;
        }
        Application application = C0f1.A00;
        if (application == null) {
            throw AnonymousClass001.A0N(AnonymousClass000.A00(38));
        }
        C01493rb c01493rb = 3rZ.A00(application).A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = c01493rb.A06;
        r0.A08("com.facebook.messaging.tincan.tincanoverwamsys.plugins.interfaces.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "notifyOfflineQueueCompletedWithWorkManager", andIncrement);
        try {
            C01493rb.A00(c01493rb);
            if (C01493rb.A01(c01493rb)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.tincan.tincanoverwamsys.plugins.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "com.facebook.messaging.tincan.tincanoverwamsys.plugins.interfaces.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", andIncrement2, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "com.facebook.messaging.tincan.tincanoverwamsys.plugins.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerKillSwitch", "notifyOfflineQueueCompletedWithWorkManager");
                    try {
                        synchronized (AbstractC01513re.A00) {
                            0fH.A0l("SecureMessageOverWANotificationWorkManager", "notifyOfflineQueueCompleted");
                            HashSet hashSet = AbstractC01513re.A01;
                            0fH.A0g(Integer.valueOf(hashSet.size()), "SecureMessageOverWANotificationWorkManager", "set futures success, size: %d");
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                ((SettableFuture) it.next()).set(new C4P3());
                            }
                            hashSet.clear();
                        }
                        r0.A04((Exception) null, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "notifyOfflineQueueCompletedWithWorkManager", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerImplementation", "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "notifyOfflineQueueCompletedWithWorkManager", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "notifyOfflineQueueCompletedWithWorkManager", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.tincan.tincanoverwamsys.pushnotificationhandler.SecureMessageOverWAPushNotificationHandlerInterfaceSpec", "notifyOfflineQueueCompletedWithWorkManager", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (r0.isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r308.isEmpty() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.C25e r301) {
        /*
            r0 = r301
            X.00i r0 = r0.A07
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.3rG r0 = (X.3rG) r0
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            r0 = r303
            java.util.List r0 = r0.A02     // Catch: java.lang.Throwable -> Lc5
            r304 = r0
            r0 = r304
            r1 = r301
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> Lc5
            r0 = r303
            monitor-exit(r0)
            r0 = r301
            X.1SI r0 = r0.A0G
            X.00i r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36886957255100103(0x830c7e000906c7, double:3.390798527755619E-306)
            r306 = r0
            java.lang.String r0 = ""
            r303 = r0
            r0 = r304
            r1 = r306
            r2 = r303
            java.lang.String r0 = r0.BCz(r1, r2)
            r308 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r1 = r306
            r2 = r303
            java.lang.String r0 = r0.BCz(r1, r2)
            r309 = r0
            r0 = 33096(0x8148, float:4.6377E-41)
            r310 = r0
            r0 = r310
            java.lang.Object r0 = X.1Bn.A0A(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r304 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.3rG r0 = (X.3rG) r0
            r311 = r0
            r0 = r311
            monitor-enter(r0)
            r0 = r311
            java.lang.String r0 = r0.A00     // Catch: java.lang.Throwable -> Lbf
            r303 = r0
            r0 = r311
            monitor-exit(r0)
            r0 = r304
            boolean r0 = r0.booleanValue()
            r310 = r0
            r0 = r310
            if (r0 == 0) goto Lab
            r0 = r309
            if (r0 == 0) goto La1
            r0 = r309
            boolean r0 = r0.isEmpty()
            r310 = r0
            r0 = r309
            r308 = r0
            r0 = r310
            if (r0 == 0) goto La4
        La1:
            r0 = r303
            r308 = r0
        La4:
            r0 = r301
            r1 = r308
            r0.A08(r1)
            return
        Lab:
            r0 = r308
            if (r0 == 0) goto La1
            r0 = r308
            boolean r0 = r0.isEmpty()
            r310 = r0
            r0 = r310
            if (r0 != 0) goto La1
            goto La4
        Lbf:
            r304 = move-exception
            r0 = r311
            monitor-exit(r0)
            r0 = r304
            throw r0
        Lc5:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25e.A02(X.25e):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public 2eH A03(PeerDevice peerDevice) {
        AnonymousClass261 anonymousClass261 = this.A00;
        String str = peerDevice.A05;
        String str2 = peerDevice.A06;
        ?? obj = new Object();
        AnonymousClass206 anonymousClass206 = anonymousClass261.A0A;
        C3b5 c3b5 = new C3b5(obj, anonymousClass261, 8);
        1Um A0R = 1BL.A0R(anonymousClass206);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0R, c3b5);
        1Um.A00(A0R, new C3ao(anonymousClass206, A0Q, str, str2), A0Q);
        return 2FP.A00(new D3a(this, 4), (ListenableFuture) obj, 2eQ.A01);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public SettableFuture A04() {
        AnonymousClass261 anonymousClass261 = this.A00;
        ?? obj = new Object();
        AnonymousClass206 anonymousClass206 = anonymousClass261.A0A;
        1Um AQV = anonymousClass206.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new C3b5(mailboxFutureImpl, anonymousClass206, 13))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.Cu4(new C3b5(obj, anonymousClass261, 6));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public SettableFuture A05(int i, long j) {
        AnonymousClass261 anonymousClass261 = this.A00;
        ?? obj = new Object();
        AnonymousClass206 anonymousClass206 = anonymousClass261.A0A;
        Cxe cxe = new Cxe(anonymousClass261, obj, 1);
        1Um AQV = anonymousClass206.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(cxe);
        if (!AQV.Cj2(new N70(i, 0, j, anonymousClass206, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public SettableFuture A06(long j) {
        AnonymousClass261 anonymousClass261 = this.A00;
        ?? obj = new Object();
        AnonymousClass206 anonymousClass206 = anonymousClass261.A0A;
        C3b5 c3b5 = new C3b5(obj, anonymousClass261, 7);
        1Um AQV = anonymousClass206.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(c3b5);
        if (!AQV.Cj2(new N6s(0, j, anonymousClass206, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        return obj;
    }

    public void A07() {
        AnonymousClass206 anonymousClass206 = this.A00.A0A;
        1Um A0R = 1BL.A0R(anonymousClass206);
        MailboxFutureImpl A0P = 1BK.A0P(A0R);
        1Um.A00(A0R, new C3b5(A0P, anonymousClass206, 10), A0P);
    }

    public void A08(String str) {
        AnonymousClass206 anonymousClass206 = this.A00.A0A;
        1Um AQV = anonymousClass206.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new C3b6(anonymousClass206, mailboxFutureImpl, str, 0))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public void A09(HashMap hashMap) {
        0fH.A0l("SecureMessageOverWAMailboxImpl", "start handle push notification");
        AnonymousClass206 anonymousClass206 = this.A00.A0A;
        1Um AQV = anonymousClass206.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new A0C(0, anonymousClass206, hashMap, mailboxFutureImpl))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}

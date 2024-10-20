package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.bubbles.settings.BubblesSettingsManager;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Abw, reason: case insensitive filesystem */
/* loaded from: Abw.class */
public final class C1254Abw {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final Context A0G;
    public final 1De A0H;

    public C1254Abw(1De r302) {
        this.A0H = r302;
        1BY r0 = r302.A00;
        this.A0B = 1Bu.A03(r0, 68463);
        Context A0I = 7zQ.A0I(r0);
        this.A0G = A0I;
        this.A0C = 1HG.A00(A0I, 100188);
        this.A0E = 1Bq.A00(83817);
        this.A01 = 1Bq.A00(83818);
        this.A02 = 1Bq.A00(83820);
        this.A08 = 1Bq.A00(49797);
        this.A05 = 1Bq.A00(32907);
        this.A00 = 1Bq.A00(83834);
        this.A0F = 1Bq.A00(83825);
        this.A04 = 1Bq.A00(68466);
        this.A0D = 1Bu.A03(r0, 82763);
        this.A09 = 1Bq.A00(17011);
        this.A07 = 7zM.A0c();
        this.A06 = 1Bq.A00(83826);
        this.A03 = 1Bu.A03(r0, 33230);
        this.A0A = 1BK.A0C();
    }

    private final NotificationChannel A00(ThreadKey threadKey) {
        String A06 = ((AnonymousClass463) 1Br.A0B(this.A05)).A06(NewMessageNotification.A0N.A00(threadKey));
        2Pj r0 = (2Pj) 1Br.A0B(this.A09);
        11T.A0D(A06);
        return r0.A09(A06);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettableFuture A03(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        SettableFuture A0j = 4YU.A0j();
        Context applicationContext = context.getApplicationContext();
        5bF r0 = (5bF) 1Br.A0B(this.A08);
        5bF.A03((ParticipantInfo) null, threadSummary.A0n, threadSummary, new Cnm(applicationContext, fbUserSession, this, threadSummary, A0j), r0, false);
        return A0j;
    }

    private final void A04(Notification.BubbleMetadata bubbleMetadata, Notification notification, Context context, String str, int i) {
        Notification build = Notification.Builder.recoverBuilder(context, notification).setBubbleMetadata(bubbleMetadata).setOnlyAlertOnce(true).build();
        11T.A0A(build);
        AbJ.A0T(this.A0B).A04(str, i, build);
        0fH.A0d(Integer.valueOf(i), str, "BubblesPresenter", "Bubble with id %d and tag %s was successfully reopened");
    }

    private final void A05(Context context, StatusBarNotification statusBarNotification) {
        int id = statusBarNotification.getId();
        String tag = statusBarNotification.getTag();
        11T.A0A(tag);
        Notification notification = statusBarNotification.getNotification();
        11T.A0A(notification);
        1Br.A0C(this.A00);
        Notification notification2 = statusBarNotification.getNotification();
        11T.A0A(notification2);
        A04(CPU.A00(notification2), notification, context, tag, id);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0117, code lost:
    
        if (r0.canBubble() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013f, code lost:
    
        if (r0.length() != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02dd, code lost:
    
        if (r0.A1I() != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ boolean A06(android.content.Context r301, android.graphics.Bitmap r302, com.facebook.auth.usersession.FbUserSession r303, X.C1254Abw r304, com.facebook.messaging.model.threads.ThreadSummary r305) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1254Abw.A06(android.content.Context, android.graphics.Bitmap, com.facebook.auth.usersession.FbUserSession, X.Abw, com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (((X.C2j5) X.1Br.A0B(r301.A03)).A02() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A07(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0.A2X
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2a
            r0 = r302
            java.lang.Long r0 = r0.A1f
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2a
            r0 = r301
            X.1Br r0 = r0.A03
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.2j5 r0 = (X.C2j5) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.A02()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L2e
        L2a:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L2e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1254Abw.A07(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.1FX, X.47H, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    public final ListenableFuture A08(Context context, ThreadKey threadKey) {
        11T.A0F(context, 0);
        if (ThreadKey.A0d(threadKey)) {
            threadKey = C2ga.A00(threadKey);
        }
        StatusBarNotification A00 = ((5HG) 1Br.A0B(this.A0F)).A00(threadKey);
        FbUserSession A0E = 4YV.A0E(context);
        if (A00 != null) {
            A05(context, A00);
            return C3o5.A0K(true);
        }
        Context applicationContext = context.getApplicationContext();
        5Vm A02 = ((5Vk) 1Br.A0B(this.A0D)).A02(threadKey);
        A02.A03 = true;
        A02.A01 = CallerContext.A0B("BubblesPresenter");
        2FR A01 = A02.A01();
        D3j d3j = new D3j(0, applicationContext, A0E, this);
        2eQ r0 = 2eQ.A01;
        2eH A002 = 2FP.A00(d3j, A01, r0);
        D3x d3x = D3x.A00;
        ?? obj = new Object();
        A002.getClass();
        ((47H) obj).A00 = A002;
        ((47H) obj).A01 = Throwable.class;
        d3x.getClass();
        ((47H) obj).A02 = d3x;
        A002.addListener(obj, new 2eJ((1FX) obj, r0));
        11T.A0D((Object) obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00bb, code lost:
    
        if (r309 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture A09(android.content.Context r302, com.facebook.messaging.model.threads.ThreadSummary r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r303
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r305 = r0
            r0 = r305
            X.11T.A0A(r0)
            r0 = r305
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0d(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L38
            r0 = r305
            com.facebook.messaging.model.threadkey.ThreadKey r0 = X.C2ga.A00(r0)
            r305 = r0
            r0 = r303
            X.1zm r0 = X.AbF.A0g(r0)
            r307 = r0
            r0 = r307
            r1 = r305
            r0.A03(r1)
            r0 = r307
            com.facebook.messaging.model.threads.ThreadSummary r0 = X.AbF.A0i(r0)
            r303 = r0
        L38:
            r0 = r301
            X.1Br r0 = r0.A0F
            X.00i r0 = r0.A00
            r308 = r0
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.5HG r0 = (X.5HG) r0
            r1 = r305
            android.service.notification.StatusBarNotification r0 = r0.A00(r1)
            r309 = r0
            r0 = r301
            X.1Br r0 = r0.A06
            r307 = r0
            r0 = r307
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.5Zj r0 = (X.5Zj) r0
            r310 = r0
            r0 = r305
            java.lang.String r0 = r0.toString()
            r311 = r0
            java.lang.String r0 = "tryOpenThreadAsBubble"
            r312 = r0
            r0 = r310
            r1 = 0
            r2 = r312
            r3 = 0
            r4 = 0
            r5 = r311
            r0.A02(r1, r2, r3, r4, r5)
            r0 = r309
            if (r0 != 0) goto Lbe
            r0 = r301
            r1 = r303
            boolean r0 = r0.A07(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lca
            r0 = r302
            X.1EZ r0 = X.7zQ.A0O(r0)
            com.facebook.auth.viewercontext.ViewerContext r0 = r0.Aue()
            java.lang.String r0 = r0.mUserId
            long r0 = X.AbG.A03(r0)
            r313 = r0
            r0 = r303
            r1 = r313
            com.facebook.messaging.model.threadkey.ThreadKey r0 = X.2Gt.A00(r0, r1)
            r309 = r0
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.5HG r0 = (X.5HG) r0
            r307 = r0
            r0 = r307
            r1 = r309
            android.service.notification.StatusBarNotification r0 = r0.A00(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Lca
        Lbe:
            r0 = r301
            r1 = r302
            r2 = r309
            r0.A05(r1, r2)
            r0 = r304
            X.1hM r0 = X.C3o5.A0K(r0)
            return r0
        Lca:
            r0 = r302
            com.facebook.auth.usersession.FbUserSession r0 = X.4YV.A0E(r0)
            r307 = r0
            r0 = r301
            r1 = r302
            r2 = r307
            r3 = r303
            com.google.common.util.concurrent.SettableFuture r0 = r0.A03(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1254Abw.A09(android.content.Context, com.facebook.messaging.model.threads.ThreadSummary):com.google.common.util.concurrent.ListenableFuture");
    }

    public final void A0A(ThreadKey threadKey) {
        AbJ.A0T(this.A0B).A03(threadKey.A0u(), NewMessageNotification.A0N.A00(threadKey));
    }

    public final boolean A0B(Context context, ThreadKey threadKey, ThreadKey threadKey2) {
        StatusBarNotification A00 = ((5HG) 1Br.A0B(this.A0F)).A00(threadKey2);
        A0A(threadKey2);
        if (A00 == null || !((C2j5) 1Br.A0B(this.A03)).A02()) {
            return false;
        }
        int A002 = NewMessageNotification.A0N.A00(threadKey);
        String A0u = threadKey.A0u();
        11T.A0A(A0u);
        Notification notification = A00.getNotification();
        11T.A0A(notification);
        CPU cpu = (CPU) 1Br.A0B(this.A00);
        Notification notification2 = A00.getNotification();
        11T.A0A(notification2);
        A04(cpu.A04(notification2, context, threadKey), notification, context, A0u, A002);
        return true;
    }

    public final boolean A0C(ThreadKey threadKey) {
        String id;
        String A0u;
        String str;
        String A0u2;
        String str2;
        int A00 = ((BubblesSettingsManager) 1Br.A0B(this.A04)).A00();
        if (A00 != 0) {
            if (((5HG) 1Br.A0B(this.A0F)).A03(threadKey)) {
                A0u2 = threadKey.A0u();
                str2 = "Thread %s can be opened as bubble because it's already bubbled.";
            } else {
                NotificationChannel A002 = A00(threadKey);
                if (A002 == null || (id = A002.getId()) == null || id.length() == 0) {
                    0fH.A17("BubblesPresenter", "Thread %s cannot be opened as bubble because notification channel couldn't be found.", new Object[]{threadKey.A0u()});
                    return false;
                }
                NotificationManager notificationManager = (NotificationManager) 1Br.A0B(this.A0C);
                String id2 = A002.getId();
                11T.A0F(threadKey, 0);
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(id2, AbK.A16(threadKey));
                if (notificationChannel == null || 11T.A0O(A002.getId(), notificationChannel.getId())) {
                    if (A00 == 1) {
                        A0u = threadKey.A0u();
                        str = "Thread %s cannot be opened as bubble because conversation channel for the thread does not exist.";
                    }
                    A0u2 = threadKey.A0u();
                    str2 = "Thread %s can be opened as bubble.";
                } else if (notificationChannel.canBubble()) {
                    if (Build.VERSION.SDK_INT >= 31 && notificationChannel.isDemoted()) {
                        A0u = threadKey.A0u();
                        str = "Thread %s cannot be opened as bubble because user has demoted the conversation.";
                    }
                    A0u2 = threadKey.A0u();
                    str2 = "Thread %s can be opened as bubble.";
                } else {
                    A0u = threadKey.A0u();
                    str = "Thread %s cannot be opened as bubble because user has disabled bubbles for that particular conversation.";
                }
            }
            0fH.A0g(A0u2, "BubblesPresenter", str2);
            return true;
        }
        A0u = threadKey.A0u();
        str = "Thread %s cannot be opened as bubble because bubbles are not allowed for the app.";
        0fH.A0g(A0u, "BubblesPresenter", str);
        return false;
    }
}

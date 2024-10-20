package X;

import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.facebook.messaging.business.bizrtc.model.PageMessageNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.rtc.callstatus.notification.MissedCallNotification;
import com.facebook.push.constants.PushProperty;

/* renamed from: X.4av, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4av.class */
public final class C04404av {
    public final 1Br A00;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A0A;
    public final 1Br A0C;
    public final Context A0H;
    public final 1PB A0I;
    public final C15h A0G = new DKZ(3);
    public final C15h A0J = new DKZ(4);
    public final C15h A0K = new DKZ(5);
    public final C15h A0F = new DKZ(2);
    public final 1Br A05 = 1Bq.A00(66351);
    public final 1Br A03 = 1Bq.A00(65849);
    public final 1Br A01 = 1Bu.A00(33230);
    public final 1Br A0E = 1Bq.A00(49233);
    public final 1Br A09 = 1Bq.A00(17011);
    public final 1Br A04 = 1Bq.A00(82979);
    public final 1Br A0D = 1Bq.A00(67262);
    public final 1Br A02 = 1Bu.A00(33153);
    public final 1Br A0B = 1Bu.A00(83000);

    public C04404av() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A0H = context;
        this.A06 = 1HG.A00(context, 100176);
        this.A00 = 1Bq.A00(16616);
        this.A08 = 1Bq.A00(66539);
        this.A0A = 1Bq.A00(66536);
        this.A07 = 1Bq.A00(82523);
        1Br A00 = 1Bq.A00(16626);
        this.A0C = A00;
        this.A0I = ((1P8) A00.A00.get()).A00("notification_instance");
    }

    private final C11314w5 A00() {
        return (C11314w5) 1Lm.A06(((1Fv) this.A05.A00.get()).A04(), 49366);
    }

    public static final Integer A01(C04404av c04404av, ThreadKey threadKey, MessagingNotification messagingNotification, PushProperty pushProperty, boolean z, boolean z2) {
        String str;
        5qC r317;
        1PB r319;
        StringBuilder sb;
        String str2 = pushProperty != null ? pushProperty.A08 : null;
        PushProperty pushProperty2 = messagingNotification.A02;
        String str3 = pushProperty2 == null ? null : pushProperty2.A0A;
        if (z2) {
            C45o.A01(threadKey, (C45o) ((5qC) c04404av.A03.A00.get()).A01.A00.get(), 0S2.A06, str2, str3, null);
        }
        String str4 = "";
        if (!((Boolean) c04404av.A0G.get()).booleanValue()) {
            str = "chat_heads_not_enabled";
        } else if (!((4aS) c04404av.A0B.A00.get()).A00.areNotificationsEnabled()) {
            str = "notifications_disabled";
        } else if (((C2j5) c04404av.A01.A00.get()).A01()) {
            str = "bubbles_supported";
        } else {
            if (!((1Rv) c04404av.A0D.A00.get()).A0B()) {
                str4 = "no_draw_overlay_permission";
            } else if (z) {
                str = "chat_heads_disabled";
            } else if (pushProperty == null) {
                str4 = "null_push_property";
            }
            str = str4;
        }
        boolean z3 = true;
        if (str.length() > 0) {
            if (z2) {
                int length = str4.length();
                r317 = (5qC) c04404av.A03.A00.get();
                if (length > 0) {
                    C45o.A01(threadKey, (C45o) r317.A01.A00.get(), 0S2.A0A, str3, str2, str);
                    r319 = r317.A02;
                    sb = new StringBuilder();
                    sb.append("Chat Heads failed to render (");
                    sb.append(str);
                    sb.append("), msgId: ");
                    sb.append(str3);
                }
                C45o.A01(threadKey, (C45o) r317.A01.A00.get(), 0S2.A08, str3, str2, str);
                r319 = r317.A02;
                sb = new StringBuilder();
                sb.append("Chat Heads suppressed (");
                sb.append(str);
                sb.append("), msgId: ");
                sb.append(str3);
                sb.append(", notifId: ");
                sb.append(str2);
            }
            return 0S2.A00;
        }
        11T.A0I(pushProperty, "null cannot be cast to non-null type com.facebook.push.constants.PushProperty");
        if (!((C12034yh) c04404av.A02.A00.get()).A00(threadKey) && (CQK.A04((NotificationManager) ((BmA) c04404av.A04.A00.get()).A00.A00.get()) || A02((2Pj) c04404av.A09.A00.get()))) {
            z3 = false;
        }
        Object obj = c04404av.A0J.get();
        11T.A0A(obj);
        if (((Boolean) obj).booleanValue() && (messagingNotification instanceof NewMessageNotification) && pushProperty.A04 != 4rH.A0L) {
            if (z2) {
                r317 = (5qC) 1Br.A0B(c04404av.A03);
                str = "page_admin_for_page_account";
                C45o.A01(threadKey, (C45o) r317.A01.A00.get(), 0S2.A08, str3, str2, str);
                r319 = r317.A02;
                sb = new StringBuilder();
                sb.append("Chat Heads suppressed (");
                sb.append(str);
                sb.append("), msgId: ");
                sb.append(str3);
                sb.append(", notifId: ");
                sb.append(str2);
            }
            return 0S2.A00;
        }
        Boolean bool = true;
        if (bool.equals(c04404av.A00().A03(4wA.A00)) && bool.equals(c04404av.A00().A03(4wA.A08))) {
            if (z2) {
                r317 = (5qC) 1Br.A0B(c04404av.A03);
                str = "chat_heads_hidden_intentionally";
                C45o.A01(threadKey, (C45o) r317.A01.A00.get(), 0S2.A08, str3, str2, str);
                r319 = r317.A02;
                sb = new StringBuilder();
                sb.append("Chat Heads suppressed (");
                sb.append(str);
                sb.append("), msgId: ");
                sb.append(str3);
                sb.append(", notifId: ");
                sb.append(str2);
            }
            return 0S2.A00;
        }
        if (!((KeyguardManager) c04404av.A06.A00.get()).inKeyguardRestrictedInputMode() || ((1Od) c04404av.A00.A00.get()).A08() == null) {
            if (!z3) {
                return 0S2.A0C;
            }
            c04404av.A0I.BZR("chat_head", 0Pz.A0v("Chat Heads suppressed (Thread muted or DND is on), msgId: ", str2, ", notifId: ", str3));
            return 0S2.A01;
        }
        if (z2) {
            r317 = (5qC) c04404av.A03.A00.get();
            str = "lock_screen_up";
            C45o.A01(threadKey, (C45o) r317.A01.A00.get(), 0S2.A08, str3, str2, str);
            r319 = r317.A02;
            sb = new StringBuilder();
            sb.append("Chat Heads suppressed (");
            sb.append(str);
            sb.append("), msgId: ");
            sb.append(str3);
            sb.append(", notifId: ");
            sb.append(str2);
        }
        return 0S2.A00;
        r319.BZR("chat_head", sb.toString());
        return 0S2.A00;
    }

    public static final boolean A02(2Pj r301) {
        boolean z = false;
        11T.A0F(r301, 0);
        NotificationChannel A0A = r301.A0A(AbstractC00603o4.A00(241));
        if (A0A != null) {
            z = A0A.canBypassDnd();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r0.equals(A00().A03(X.4wA.A08)) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r0.A00() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer A03(com.facebook.messaging.model.threads.ThreadSummary r302, com.facebook.messaging.notify.type.NewMessageNotification r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04404av.A03(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.messaging.notify.type.NewMessageNotification, boolean):java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if (X.1Wd.A00((X.1Wd) r301.A08.A00.get()).AZk(36314201891217156L) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A04() {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Od r0 = (X.1Od) r0
            android.app.Activity r0 = r0.A08()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L8d
            r0 = r301
            X.1Br r0 = r0.A0E
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.4lz r0 = (X.C08134lz) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A03()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8d
            r0 = r301
            X.1Br r0 = r0.A06
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.isKeyguardLocked()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L8d
            r0 = r301
            X.1Br r0 = r0.A0A
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.21W r0 = (X.21W) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A07()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8d
            r0 = r301
            X.1Br r0 = r0.A08
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Wd r0 = (X.1Wd) r0
            r302 = r0
            r0 = r302
            X.1CO r0 = X.1Wd.A00(r0)
            r304 = r0
            r0 = 36314201891217156(0x81039300071f04, double:3.02858572933531E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 != 0) goto L91
        L8d:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L91:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04404av.A04():boolean");
    }

    public final boolean A05(PageMessageNotification pageMessageNotification, boolean z) {
        11T.A0F(pageMessageNotification, 0);
        String str = pageMessageNotification.A03;
        String str2 = pageMessageNotification.A06;
        boolean z2 = false;
        if (str != null && str.equals(this.A0K.get()) && pageMessageNotification.A01 != null && str2 != null && A01(this, 4YV.A0R(str2, str), pageMessageNotification, ((MessagingNotification) pageMessageNotification).A02, false, z) == 0S2.A0C) {
            z2 = true;
        }
        return z2;
    }

    public final boolean A06(MissedCallNotification missedCallNotification) {
        ThreadKey threadKey = missedCallNotification.A02;
        boolean z = false;
        if (threadKey == null) {
            return false;
        }
        if (threadKey.A0x() && A01(this, threadKey, missedCallNotification, ((MessagingNotification) missedCallNotification).A02, false, true) == 0S2.A0C) {
            z = true;
        }
        return z;
    }
}

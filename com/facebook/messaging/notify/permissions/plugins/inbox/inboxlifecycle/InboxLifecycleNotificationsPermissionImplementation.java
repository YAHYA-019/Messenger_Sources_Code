package com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1EZ;
import X.1Fw;
import X.1Lm;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.neue.nux.NeueNuxActivity;
import com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation;
import com.facebook.messaging.notify.permissions.plugins.postprompt.inboxnux.BackgroundAccountNotificationNuxActivity;
import java.util.concurrent.ScheduledFuture;

/* loaded from: InboxLifecycleNotificationsPermissionImplementation.class */
public final class InboxLifecycleNotificationsPermissionImplementation {
    public ScheduledFuture A00;
    public final Context A01;
    public final Handler A02;
    public final Fragment A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final Runnable A0A;
    public final FbUserSession A0B;

    public InboxLifecycleNotificationsPermissionImplementation(Context context, Fragment fragment) {
        11T.A0F(context, 1);
        11T.A0F(fragment, 2);
        this.A01 = context;
        this.A03 = fragment;
        this.A08 = 1Bq.A00(33158);
        this.A05 = 1Bu.A00(66245);
        this.A04 = 1Bq.A00(33159);
        this.A07 = 1Bq.A00(16462);
        1Br A01 = 1Bu.A01(context, 16428);
        this.A09 = A01;
        FbUserSession A04 = 1Fw.A04((1EZ) A01.A00.get());
        this.A0B = A04;
        this.A06 = 1Lm.A00(context, A04, 82058);
        this.A02 = new Handler(Looper.getMainLooper());
        this.A0A = new Runnable() { // from class: X.5cb
            public static final String __redex_internal_original_name = "InboxLifecycleNotificationsPermissionImplementation$runnable$1";

            @Override // java.lang.Runnable
            public final void run() {
                InboxLifecycleNotificationsPermissionImplementation inboxLifecycleNotificationsPermissionImplementation = InboxLifecycleNotificationsPermissionImplementation.this;
                1Br.A0C(inboxLifecycleNotificationsPermissionImplementation.A06);
                boolean z = NeueNuxActivity.A0K;
                0fH.A0j(AbE.A00(ActionId.ABORTED), 0Pz.A1C("[BANotif] isNuxFlowOn=", z));
                if (z) {
                    inboxLifecycleNotificationsPermissionImplementation.A02.postDelayed(inboxLifecycleNotificationsPermissionImplementation.A0A, 2000L);
                    return;
                }
                0fH.A0j(1BJ.A00(288), "[BANotif] Showing background account notification NUX");
                Context context2 = inboxLifecycleNotificationsPermissionImplementation.A01;
                ((08O) 1Bi.A03(6)).A06().A0A(context2, C3o5.A0D(context2, BackgroundAccountNotificationNuxActivity.class));
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0130, code lost:
    
        if (r0 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation r301) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation.A00(com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.notify.permissions.plugins.inbox.inboxlifecycle.InboxLifecycleNotificationsPermissionImplementation.A01():void");
    }
}

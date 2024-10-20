package com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate;

import X.05X;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.4YT;
import X.4iH;
import X.51X;
import X.5SW;
import X.5YV;
import X.5qG;
import X.5sW;
import X.7zM;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AnonymousClass001;
import X.C10904ux;
import X.C10914uy;
import X.C10924uz;
import X.C5rn;
import X.C6X;
import X.C8n;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: GroupCallUpdateNotificationHandler.class */
public final class GroupCallUpdateNotificationHandler {
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
    public final 1De A0C;
    public final 1Br A0D;

    public GroupCallUpdateNotificationHandler(1De r302) {
        this.A0C = r302;
        1BY r0 = r302.A00;
        this.A05 = 1Bu.A03(r0, 49358);
        this.A02 = 7zM.A0d();
        this.A07 = 7zM.A0c();
        this.A01 = 1Bu.A03(r0, 83856);
        this.A09 = 1Bu.A03(r0, 68463);
        this.A04 = AbG.A0Z();
        this.A06 = AbH.A0e(r0);
        this.A08 = 1Bq.A00(49797);
        this.A0D = 1Bu.A03(r0, 83850);
        this.A03 = 1Bq.A00(49458);
        this.A0B = 1Bu.A03(r0, 82173);
        this.A0A = 1Bu.A03(r0, 82763);
        this.A00 = 1Bq.A00(16462);
    }

    private final PendingIntent A00(Context context, ThreadKey threadKey, ThreadSummary threadSummary, GroupCallUpdateNotification groupCallUpdateNotification, String str) {
        if (1Br.A07(A03(this).A00).AZk(36317423117217033L)) {
            C6X c6x = (C6X) 1Br.A0B(this.A01);
            boolean z = groupCallUpdateNotification.A06;
            Intent A00 = c6x.A00(threadKey, threadSummary, str, groupCallUpdateNotification.A03, (ArrayList) null, z);
            A00.setPackage(context.getPackageName());
            A00.addCategory("android.intent.category.DEFAULT");
            return ((5qG) 1Br.A0B(this.A06)).A09(A00, groupCallUpdateNotification, A04(groupCallUpdateNotification, this), z ? "MESSENGER_VIDEO_CALL" : "MESSENGER_AUDIO_CALL", 10088);
        }
        String A01 = ((51X) 1Br.A0B(this.A03)).A01("RTC_JOIN_CONFERENCE_CALL_ACTION");
        11T.A0A(A01);
        Intent A0B = AbK.A0B(context, A01);
        if (threadSummary != null) {
            A0B.putExtra("THREAD_SUMMARY", threadSummary);
        } else if (!threadKey.A0z()) {
            A06(groupCallUpdateNotification, this, "Failed to get ThreadSummary for non cryptoType threadkey", str);
            return null;
        }
        String str2 = groupCallUpdateNotification.A03;
        if (str2 != null && str2.length() != 0) {
            A0B.putExtra("SERVER_INFO_DATA", str2);
        }
        A0B.putExtra("from_notification", true);
        A0B.putExtra("notification_id", 10088).putExtra("notification_tag", A04(groupCallUpdateNotification, this)).putExtra("THREAD_KEY", groupCallUpdateNotification.A01).putExtra("IS_CONFERENCE_CALL", true).putExtra("IS_VIDEO_CALL", groupCallUpdateNotification.A06).putExtra("CALLBACK_NOTIF_TIME", 1Br.A00(this.A02)).putExtra("trigger", str);
        return ((5qG) 1Br.A0B(this.A06)).A04(A0B, groupCallUpdateNotification, 0S2.A01, A04(groupCallUpdateNotification, this), 10088);
    }

    private final 5YV A01(Context context, ThreadKey threadKey, GroupCallUpdateNotification groupCallUpdateNotification) {
        Intent A04 = ((4iH) 1Br.A0B(this.A04)).A04(threadKey, 5SW.A1Y);
        A04.putExtra("from_notification", true);
        A04.setAction(1BJ.A00(7));
        A04.putExtra("notification_id", 10088);
        A04.putExtra("notification_tag", A04(groupCallUpdateNotification, this));
        A04.putExtra("notification_type", ((MessagingNotification) groupCallUpdateNotification).A01);
        int nextInt = new Random().nextInt();
        05X r0 = new 05X();
        r0.A0C(A04);
        r0.A0A();
        r0.A08();
        5sW r02 = new 5sW(r0.A01(context, nextInt, 268435456), context.getResources().getString(2131962566), 0);
        C5rn c5rn = new C5rn(1BK.A05(), context.getResources().getString(2131962566), 4YT.A00(ActionId.MESSENGER_QUEUE_CREATION), AnonymousClass001.A0v(), null, 0, true);
        r02.A02 = false;
        r02.A03(c5rn);
        return r02.A01();
    }

    private final C10914uy A02(Context context, Bitmap bitmap, GroupCallUpdateNotification groupCallUpdateNotification) {
        C10914uy A00 = ((C10904ux) 1Br.A0B(this.A05)).A00(context, null, groupCallUpdateNotification, 10088);
        String str = groupCallUpdateNotification.A02;
        A00.A0M(str);
        boolean A1Z = AbH.A1Z(A00, 1Br.A00(this.A02));
        C10924uz.A05(A00, str);
        AbL.A0p(A00, this.A07);
        A00.A0L(groupCallUpdateNotification.A04);
        ((C10924uz) A00).A03 = A1Z ? 1 : 0;
        A00.A0A(2);
        A00.A0N(A1Z);
        A00.A0F(bitmap);
        A00.A0K(str);
        return A00;
    }

    public static final C8n A03(GroupCallUpdateNotificationHandler groupCallUpdateNotificationHandler) {
        return (C8n) 1Br.A0B(groupCallUpdateNotificationHandler.A0D);
    }

    public static String A04(GroupCallUpdateNotification groupCallUpdateNotification, GroupCallUpdateNotificationHandler groupCallUpdateNotificationHandler) {
        return groupCallUpdateNotification.A04(A03(groupCallUpdateNotificationHandler).A02());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A05(android.content.Context r301, android.graphics.Bitmap r302, com.facebook.messaging.model.threadkey.ThreadKey r303, com.facebook.messaging.model.threads.ThreadSummary r304, com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification r305, com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler r306) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler.A05(android.content.Context, android.graphics.Bitmap, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification, com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (r305 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A06(com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification r301, com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler r302, java.lang.String r303, java.lang.String r304) {
        /*
            r0 = r302
            X.1Br r0 = r0.A0B
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.C4n r0 = (X.C4n) r0
            java.lang.String r1 = "error"
            X.C82 r0 = r0.A00(r1)
            r302 = r0
            r0 = r302
            java.lang.String r1 = "feature"
            java.lang.String r2 = "GroupCallUpdateNotification"
            r0.A01(r1, r2)
            r0 = r302
            java.lang.String r1 = "handler"
            java.lang.String r2 = "GroupCallUpdateNotificationHandler"
            r0.A01(r1, r2)
            r0 = r302
            java.lang.String r1 = "errortype"
            r2 = r303
            r0.A01(r1, r2)
            r0 = r302
            java.lang.String r1 = "trigger"
            r2 = r304
            r0.A01(r1, r2)
            r0 = r301
            java.lang.String r0 = r0.A05
            r305 = r0
            java.lang.String r0 = "updateType"
            r306 = r0
            r0 = r302
            r1 = r306
            r2 = r305
            r0.A01(r1, r2)
            r0 = r301
            com.facebook.push.constants.PushProperty r0 = r0.A02
            r301 = r0
            r0 = r301
            if (r0 != 0) goto Lb0
            r0 = 0
            r307 = r0
        L53:
            java.lang.String r0 = "NoId"
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L61
            r0 = r305
            r307 = r0
        L61:
            java.lang.String r0 = "pushId"
            r306 = r0
            r0 = r302
            r1 = r306
            r2 = r307
            r0.A01(r1, r2)
            r0 = r301
            if (r0 == 0) goto L81
            r0 = r301
            java.lang.String r0 = r0.A08
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L81
            r0 = r306
            r305 = r0
        L81:
            java.lang.String r0 = "messageId"
            r306 = r0
            r0 = r302
            r1 = r306
            r2 = r305
            r0.A01(r1, r2)
            r0 = r301
            if (r0 == 0) goto L9d
            r0 = r301
            java.lang.String r0 = r0.A0B
            r305 = r0
            r0 = r305
            if (r0 != 0) goto La2
        L9d:
            java.lang.String r0 = "NoType"
            r305 = r0
        La2:
            r0 = r302
            java.lang.String r1 = "notifType"
            r2 = r305
            r0.A01(r1, r2)
            r0 = r302
            r0.A00()
            return
        Lb0:
            r0 = r301
            java.lang.String r0 = r0.A0A
            r307 = r0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler.A06(com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification, com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler, java.lang.String, java.lang.String):void");
    }
}

package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.onetrace.OneTraceInfo;
import com.facebook.messaging.service.multicache.annotations.LowPriorityThreadsQueue;
import com.facebook.messaging.service.multicache.annotations.MultiCacheThreadsQueue;
import com.facebook.messaging.service.multicache.annotations.PushQueue;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.push.constants.PushProperty;
import java.util.ArrayList;

/* renamed from: X.5a0, reason: invalid class name */
/* loaded from: 5a0.class */
public final class C5a0 {
    public final 1PB A08;
    public final C15h A0A;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A01 = new 1BQ(66351);
    public final C00i A02 = new 1BV(17006);
    public final C00i A0C = new 1BV(33031);
    public final 1Bt A0B = (1Bt) 1Bi.A03(66185);
    public final C12044yi A07 = (C12044yi) 1Bi.A03(49412);
    public final C45d A06 = (C45d) 1Bi.A03(83168);
    public final C00i A00 = new 1BQ(98584);
    public final C5a1 A09 = (C5a1) 1Bn.A0A(82824);
    public final C00i A05 = new 1BQ(83604);
    public final C00i A03 = new 1BQ(16385);
    public final C00i A0D = new 1BQ(83826);
    public final C00i A04 = new 1BQ(83846);

    public C5a0() {
        1BQ r0 = new 1BQ(16626);
        this.A0G = r0;
        this.A08 = ((1P8) r0.get()).A00("notification_instance");
        this.A0A = new DBP(this, 28);
        this.A0E = new 1BV(83835);
        this.A0F = new 1BV(116182);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(com.facebook.messaging.notify.type.NewMessageNotification r302) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5a0.A00(com.facebook.messaging.notify.type.NewMessageNotification):void");
    }

    public void A01(NewMessageNotification newMessageNotification, OneTraceInfo oneTraceInfo) {
        String str;
        5Zj r0 = (5Zj) this.A0D.get();
        PushProperty pushProperty = ((MessagingNotification) newMessageNotification).A02;
        String str2 = null;
        r0.A01(pushProperty, "notifyAndPersistNewMessage", (String) null);
        if (pushProperty != null) {
            str = pushProperty.A08;
            str2 = pushProperty.A0A;
        } else {
            str = null;
        }
        this.A08.BZR("notif_processing", 0Pz.A0v("Notify and persist new message, messageId:", str, ", notificationId:", str2));
        ((C5a9) this.A0E.get()).A00(newMessageNotification).A00("notify_and_persist_new_message");
        Message message = newMessageNotification.A0H;
        String str3 = message.A1g;
        String A00 = AcG.A00(oneTraceInfo);
        if (!TextUtils.isEmpty(A00) && !TextUtils.isEmpty(str3)) {
            C00i c00i = this.A0F;
            ((5Et) c00i.get()).A04(3, str3, A00);
            c00i.get();
            11T.A0F(A00, 1);
            TraceLogger.log(null, 3, null, 83, A00, str3, 0, null);
        }
        this.A0B.A02();
        ArrayList arrayList = new ArrayList();
        C00i c00i2 = this.A00;
        long A002 = ((C31c) c00i2.get()).A00(MultiCacheThreadsQueue.class);
        long A003 = ((C31c) c00i2.get()).A00(PushQueue.class);
        long A004 = ((C31c) c00i2.get()).A00(LowPriorityThreadsQueue.class);
        arrayList.add(Long.valueOf(A002));
        arrayList.add(Long.valueOf(A003));
        arrayList.add(Long.valueOf(A004));
        if (!5aH.A00() && ((!C0et.A0C.equals(this.A05.get()) || !1BK.A0N(this.A03).AZk(2342153556089635172L)) && !((Boolean) this.A0A.get()).booleanValue() && newMessageNotification.A09 == null)) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("message", message);
            bundle.putParcelable("pushProperty", pushProperty);
            bundle.putParcelable("one_trace_info", oneTraceInfo);
            1Ho newInstance_DEPRECATED = ((BlueServiceOperationFactory) this.A0C.get()).newInstance_DEPRECATED("pushed_message", bundle);
            newInstance_DEPRECATED.A0A = true;
            1Ho.A00(newInstance_DEPRECATED, true);
        }
        if (!TextUtils.isEmpty(A00)) {
            ((5Et) this.A0F.get()).A05(A00, arrayList, 3, 550);
        }
        A00(newMessageNotification);
    }
}

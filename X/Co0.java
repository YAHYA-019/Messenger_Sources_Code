package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.MessengerMessageReminderNotification;
import com.facebook.messaging.notify.plugins.handler.messagereminder.MessageNotificationSurveyReceiver;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: Co0.class */
public final class Co0 implements C5rt {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ MessengerMessageReminderNotification A02;
    public final /* synthetic */ COc A03;
    public final /* synthetic */ ArrayList A04;

    public Co0(Context context, FbUserSession fbUserSession, MessengerMessageReminderNotification messengerMessageReminderNotification, COc cOc, ArrayList arrayList) {
        this.A04 = arrayList;
        this.A03 = cOc;
        this.A00 = context;
        this.A02 = messengerMessageReminderNotification;
        this.A01 = fbUserSession;
    }

    private final void A00(java.util.Map map) {
        String str;
        COc cOc = this.A03;
        Context context = this.A00;
        MessengerMessageReminderNotification messengerMessageReminderNotification = this.A02;
        FbUserSession fbUserSession = this.A01;
        String str2 = messengerMessageReminderNotification.A05;
        String str3 = messengerMessageReminderNotification.A03;
        ThreadKey threadKey = messengerMessageReminderNotification.A01;
        String A02 = 11T.A02(threadKey);
        5sT r0 = (5sT) 1Br.A0B(cOc.A07);
        Intent A00 = 5sT.A00(fbUserSession, threadKey, messengerMessageReminderNotification, r0);
        A00.setFlags(67108864);
        AbJ.A1F(A00, true);
        PushProperty pushProperty = ((MessagingNotification) messengerMessageReminderNotification).A02;
        if (pushProperty != null && (str = pushProperty.A0E) != null) {
            A00.putExtra("sender_id", str);
        }
        PendingIntent A08 = ((5qG) 1Br.A0B(r0.A02)).A08(A00, messengerMessageReminderNotification, A02, 10074);
        PendingIntent A0A = ((5qG) 1Br.A0B(cOc.A08)).A0A(messengerMessageReminderNotification, A02, 10074);
        int A002 = ((C45a) 1Br.A0B(cOc.A09)).A00();
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = null;
        C10914uy A003 = ((C10904ux) 1Br.A0B(cOc.A06)).A00(context, null, null, 10074);
        11T.A0A(A003);
        ((C10924uz) A003).A01 = A002;
        A003.A0L(str2);
        A003.A0K(str3);
        A003.A0R = "reminder";
        A003.A0D(A08);
        A003.A0E(A0A);
        A003.A0N(true);
        C00i c00i = cOc.A01.A00;
        A003.A0C(4YV.A05(c00i));
        A003.A0g = true;
        ((C10924uz) A003).A03 = 2;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || !messengerMessageReminderNotification.A06) {
            11T.A0D(str2);
            11T.A0D(str3);
            User A0x = AbF.A0x(cOc.A0F);
            IconCompat iconCompat = null;
            if (A0x != null) {
                UserKey A0v = AbH.A0v(threadKey.A05);
                Bitmap bitmap = (Bitmap) map.get(A0v);
                5Ud r02 = new 5Ud(bitmap == null ? null : IconCompat.A01(bitmap), A0x.A0X.displayName, A0v.A05(), (String) null, false, false);
                UserKey A0o = AbJ.A0o(threadKey);
                Bitmap bitmap2 = (Bitmap) map.get(A0o);
                if (bitmap2 != null) {
                    iconCompat = IconCompat.A01(bitmap2);
                }
                5Ud r03 = new 5Ud(iconCompat, str2, A0o.A05(), (String) null, false, false);
                notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r02);
                notificationCompat$MessagingStyle.A08(new C5rv(r03, str3, 4YV.A05(c00i)));
            }
            A003.A0J(notificationCompat$MessagingStyle);
            if (COc.A02(threadKey, cOc) && messengerMessageReminderNotification.A02 != BMx.A01) {
                A003.A09(((5sV) 1Br.A0B(cOc.A05)).A00(context, fbUserSession, threadKey, messengerMessageReminderNotification));
            }
            if (COc.A02(threadKey, cOc) && messengerMessageReminderNotification.A02 != BMx.A01) {
                A003.A09(((5sV) 1Br.A0B(cOc.A05)).A01(context, fbUserSession, threadKey, messengerMessageReminderNotification, true));
            }
            if (COc.A02(threadKey, cOc)) {
                A003.A09(((5sV) 1Br.A0B(cOc.A05)).A04(context, threadKey, messengerMessageReminderNotification));
            }
        } else {
            packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) MessageNotificationSurveyReceiver.class), 1, 1);
            11T.A0D(str2);
            11T.A0D(str3);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2132543238);
            remoteViews.setTextViewText(2131368067, str2);
            remoteViews.setTextViewText(2131367932, str3);
            Bitmap bitmap3 = (Bitmap) map.get(AbJ.A0o(threadKey));
            if (bitmap3 != null) {
                remoteViews.setImageViewBitmap(2131362301, bitmap3);
            } else {
                remoteViews.setViewVisibility(2131362301, 8);
            }
            RemoteViews A01 = COc.A01(context, threadKey, cOc, str2, str3, map, true);
            RemoteViews A012 = COc.A01(context, threadKey, cOc, str2, str3, map, false);
            A003.A0F = remoteViews;
            A003.A0E = A01;
            A003.A0G = A012;
            A003.A0J(new 4vI());
            C5dz.A02(threadKey, (C5dz) 1Br.A0B(cOc.A0B), "notification_survey_shown", messengerMessageReminderNotification.A04);
        }
        AbJ.A1H(A003, AbJ.A0T(cOc.A0D), A02, 10074);
        messengerMessageReminderNotification.A00 = true;
        1Ql.A01(1Br.A08(((Bft) 1Br.A0B(cOc.A0C)).A00), 1NK.A1K, true);
    }

    @Override // X.C5rt
    public void Blg() {
        A00(AnonymousClass001.A0u());
    }

    @Override // X.C5rt
    public void BpW(List list) {
        HashMap A0u = AnonymousClass001.A0u();
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                A00(A0u);
                return;
            }
            2EU r0 = (2EU) list.get(i2);
            Bitmap bitmap = null;
            try {
                2EY r02 = (2Ea) r0.A09();
                if (r02 instanceof 2EY) {
                    bitmap = r02.A04;
                }
                Object obj = this.A04.get(i2);
                11T.A0A(obj);
                A0u.put(obj, bitmap);
                r0.close();
                i = i2 + 1;
            } catch (Throwable th) {
                2EU.A04(r0);
                throw th;
            }
        }
    }
}

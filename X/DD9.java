package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: DD9.class */
public final class DD9 extends C00q implements Function1 {
    public final /* synthetic */ List $actions;
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ Intent $contentIntent;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Bitmap $icon;
    public final /* synthetic */ CommunityMessagingNotification $notification;
    public final /* synthetic */ int $notificationId;
    public final /* synthetic */ String $notificationTag;
    public final /* synthetic */ B4X this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD9(Context context, Intent intent, Bitmap bitmap, Bundle bundle, CommunityMessagingNotification communityMessagingNotification, B4X b4x, String str, List list, int i) {
        super(1);
        this.this$0 = b4x;
        this.$notification = communityMessagingNotification;
        this.$context = context;
        this.$notificationId = i;
        this.$notificationTag = str;
        this.$contentIntent = intent;
        this.$bundle = bundle;
        this.$icon = bitmap;
        this.$actions = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C10924uz c10924uz = (C10924uz) obj;
        11T.A0F(c10924uz, 0);
        boolean A01 = ((CGM) 1Br.A0B(this.this$0.A00)).A01(this.$notification);
        B4X b4x = this.this$0;
        if (A01) {
            CC3 cc3 = (CC3) 1Br.A0B(b4x.A02);
            CommunityMessagingNotification communityMessagingNotification = this.$notification;
            11T.A0F(communityMessagingNotification, 0);
            CC3.A00(communityMessagingNotification, cc3, true, false);
            B4X b4x2 = this.this$0;
            Context context = this.$context;
            CommunityMessagingNotification communityMessagingNotification2 = this.$notification;
            int i = this.$notificationId;
            String str = this.$notificationTag;
            Intent intent = this.$contentIntent;
            Bundle bundle = this.$bundle;
            Bitmap bitmap = this.$icon;
            if (bundle == null) {
                bundle = 1BK.A05();
            }
            PushProperty pushProperty = ((MessagingNotification) communityMessagingNotification2).A02;
            bundle.putString(4YT.A00(ActionId.APP_MAIN), pushProperty == null ? null : pushProperty.A0A);
            bundle.putSerializable(4YT.A00(ActionId.APP_DID_ENTER_BACKGROUND), communityMessagingNotification2.A03());
            CGM cgm = (CGM) 1Br.A0B(b4x2.A00);
            1BK.A1J(intent, 1, str);
            C00i c00i = b4x2.A05.A00;
            ((5qG) c00i.get()).A08(intent, communityMessagingNotification2, str, i);
            Intent A0B = AbK.A0B(context, "com.facebook.messaging.communitymessaging.receivers.action.NOTIFICATION_SURVEY_ACTION_USEFUL");
            A0B.putExtra("from_notification", true);
            A0B.putExtra("extra_notification_obj", communityMessagingNotification2);
            PendingIntent A07 = ((5qG) c00i.get()).A07(A0B, communityMessagingNotification2, str, i);
            Intent A0B2 = AbK.A0B(context, "com.facebook.messaging.communitymessaging.receivers.action.NOTIFICATION_SURVEY_ACTION_NOT_USEFUL");
            A0B2.putExtra("from_notification", true);
            A0B2.putExtra("extra_notification_obj", communityMessagingNotification2);
            PendingIntent A072 = ((5qG) c00i.get()).A07(A0B2, communityMessagingNotification2, str, i);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2132541725);
            String A0D = communityMessagingNotification2.A0D();
            remoteViews.setTextViewText(2131368067, (A0D == null || A0D.length() == 0) ? communityMessagingNotification2.A0F() : 0Pz.A0j(A0D, " · ", communityMessagingNotification2.A0F()));
            remoteViews.setTextViewText(2131367932, communityMessagingNotification2.A0A());
            RemoteViews A00 = CGM.A00(A07, A072, context, bitmap, communityMessagingNotification2, cgm, 2132541726);
            RemoteViews A002 = CGM.A00(A07, A072, context, bitmap, communityMessagingNotification2, cgm, 2132541727);
            c10924uz.A0J(new 4vI());
            c10924uz.A0K = null;
            c10924uz.A0F = remoteViews;
            c10924uz.A0E = A00;
            c10924uz.A0G = A002;
            c10924uz.A0D = bundle;
            c10924uz.A0D(((5qG) c00i.get()).A08(intent, communityMessagingNotification2, str, i));
            c10924uz.A0E(((5qG) c00i.get()).A0A(communityMessagingNotification2, str, i));
            c10924uz.A03 = 1;
        } else {
            CommunityMessagingNotification communityMessagingNotification3 = this.$notification;
            int i2 = this.$notificationId;
            String str2 = this.$notificationTag;
            Intent intent2 = this.$contentIntent;
            Bundle bundle2 = this.$bundle;
            List list = this.$actions;
            Bitmap bitmap2 = this.$icon;
            1BL.A11(1, communityMessagingNotification3, str2, intent2);
            c10924uz.A0F(bitmap2);
            Bundle A05 = 1BK.A05();
            if (bundle2 != null) {
                A05.putAll(bundle2);
            }
            A05.putBoolean("isCommunity", true);
            String str3 = communityMessagingNotification3.A02;
            if (str3 != null && str3.length() != 0) {
                A05.putCharSequence("msgId", str3);
            }
            A05.putCharSequence("threadKeyString", 4YV.A0u(communityMessagingNotification3.A04()));
            PushProperty pushProperty2 = ((MessagingNotification) communityMessagingNotification3).A02;
            A05.putString(4YT.A00(ActionId.APP_MAIN), pushProperty2 == null ? null : pushProperty2.A0A);
            A05.putSerializable(4YT.A00(ActionId.APP_DID_ENTER_BACKGROUND), communityMessagingNotification3.A03());
            c10924uz.A0D = A05;
            C00i c00i2 = b4x.A05.A00;
            c10924uz.A0D(((5qG) c00i2.get()).A08(intent2, communityMessagingNotification3, str2, i2));
            c10924uz.A0E(((5qG) c00i2.get()).A0A(communityMessagingNotification3, str2, i2));
            c10924uz.A03 = 1;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c10924uz.A09((5YV) it.next());
                }
            }
        }
        this.this$0.A01(this.$context, this.$icon, c10924uz, this.$notification);
        AbJ.A1H(c10924uz, AbJ.A0T(this.this$0.A01), this.$notificationTag, this.$notificationId);
        return 04S.A00;
    }
}

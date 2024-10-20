package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: DD8.class */
public final class DD8 extends C00q implements Function1 {
    public final /* synthetic */ List $actions;
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ Intent $contentIntent;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ CommunityMessagingNotification $notification;
    public final /* synthetic */ int $notificationId;
    public final /* synthetic */ String $notificationTag;
    public final /* synthetic */ B4X this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD8(Context context, Intent intent, Bundle bundle, CommunityMessagingNotification communityMessagingNotification, B4X b4x, String str, List list, int i) {
        super(1);
        this.$context = context;
        this.this$0 = b4x;
        this.$notificationId = i;
        this.$notificationTag = str;
        this.$notification = communityMessagingNotification;
        this.$contentIntent = intent;
        this.$bundle = bundle;
        this.$actions = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        FbUserSession A0F = 4YV.A0F(this.$context);
        CQ5 cq5 = (CQ5) 1Br.A0B(this.this$0.A03);
        Context context = this.$context;
        int i = this.$notificationId;
        String str = this.$notificationTag;
        CommunityMessagingNotification communityMessagingNotification = this.$notification;
        cq5.A06(context, bitmap, A0F, communityMessagingNotification, str, new DD9(context, this.$contentIntent, bitmap, this.$bundle, communityMessagingNotification, this.this$0, str, this.$actions, i), i);
        return 04S.A00;
    }
}

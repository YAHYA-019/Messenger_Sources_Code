package X;

import android.app.PendingIntent;
import kotlin.jvm.functions.Function1;

/* loaded from: DD5.class */
public final class DD5 extends C00q implements Function1 {
    public final /* synthetic */ PendingIntent $clickIntent;
    public final /* synthetic */ PendingIntent $deleteIntent;
    public final /* synthetic */ int $messageNotificationId = 10080;
    public final /* synthetic */ String $notificationTag;
    public final /* synthetic */ Bs7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD5(PendingIntent pendingIntent, PendingIntent pendingIntent2, Bs7 bs7, String str) {
        super(1);
        this.$clickIntent = pendingIntent;
        this.$deleteIntent = pendingIntent2;
        this.this$0 = bs7;
        this.$notificationTag = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C10924uz c10924uz = (C10924uz) obj;
        11T.A0F(c10924uz, 0);
        c10924uz.A0D(this.$clickIntent);
        c10924uz.A0E(this.$deleteIntent);
        c10924uz.A03 = 1;
        AbJ.A1H(c10924uz, AbJ.A0T(this.this$0.A02), this.$notificationTag, this.$messageNotificationId);
        return 04S.A00;
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.prefs.notifications.NotificationPrefsSyncService;

/* renamed from: X.JoZ, reason: case insensitive filesystem */
/* loaded from: JoZ.class */
public final class C3268JoZ extends AbstractRunnableC00191ad {
    public static final String __redex_internal_original_name = "GlobalNotificationPrefsSyncUtil$4";
    public final /* synthetic */ C12024yg A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3268JoZ(C12024yg c12024yg) {
        super(C12024yg.class, "synchronizeAfterPageClientNotificationDotSettingChange");
        this.A00 = c12024yg;
    }

    @Override // java.lang.Runnable
    public void run() {
        C12024yg c12024yg = this.A00;
        0fH.A0D(C12024yg.class, "synchronizeAfterPageClientNotificationDotSettingChangeInternal");
        Context context = c12024yg.A00;
        Intent A0D = C3o5.A0D(context, NotificationPrefsSyncService.class);
        A0D.setAction("NotificationsPrefsService.ACTION_SYNC_GLOBAL_FROM_PAGE_CLIENT_FOR_NOTIF_DOT");
        0Fc.A00(context, A0D, NotificationPrefsSyncService.class);
    }
}

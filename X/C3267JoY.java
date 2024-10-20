package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.prefs.notifications.NotificationPrefsSyncService;

/* renamed from: X.JoY, reason: case insensitive filesystem */
/* loaded from: JoY.class */
public final class C3267JoY extends AbstractRunnableC00191ad {
    public static final String __redex_internal_original_name = "GlobalNotificationPrefsSyncUtil$3";
    public final /* synthetic */ C12024yg A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3267JoY(C12024yg c12024yg) {
        super(C12024yg.class, "synchronizeAfterPageClientGlobalMuteSettingChange");
        this.A00 = c12024yg;
    }

    @Override // java.lang.Runnable
    public void run() {
        C12024yg c12024yg = this.A00;
        0fH.A0D(C12024yg.class, "synchronizeAfterPageClientGlobalMuteSettingChangeInternal");
        Context context = c12024yg.A00;
        Intent A0D = C3o5.A0D(context, NotificationPrefsSyncService.class);
        A0D.setAction("NotificationsPrefsService.ACTION_SYNC_GLOBAL_FROM_PAGE_CLIENT_FOR_GLOBAL_MUTE");
        0Fc.A00(context, A0D, NotificationPrefsSyncService.class);
    }
}

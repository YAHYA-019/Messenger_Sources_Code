package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.prefs.notifications.NotificationPrefsSyncService;

/* loaded from: Lne.class */
public final class Lne implements Runnable {
    public static final String __redex_internal_original_name = "ThreadNotificationPrefsSyncUtil$1";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ L0j A01;

    public Lne(ThreadKey threadKey, L0j l0j) {
        this.A01 = l0j;
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public void run() {
        L0j l0j = this.A01;
        ThreadKey threadKey = this.A00;
        if (l0j.A04.A05()) {
            return;
        }
        0fH.A07(L0j.class, threadKey.toString(), "Setting has changed (client). Starting service for thread %s.");
        HOf hOf = (HOf) 1Lo.A09(l0j.A02, l0j.A00, 115443);
        Context context = l0j.A01;
        Intent A0D = C3o5.A0D(context, NotificationPrefsSyncService.class);
        A0D.putExtra(1BJ.A00(21), hOf.A00.BKF());
        A0D.setAction("NotificationsPrefsService.SYNC_THREAD_FROM_CLIENT");
        A0D.putExtra("THREAD_KEY_STRING", threadKey.toString());
        0Fc.A00(context, A0D, NotificationPrefsSyncService.class);
    }
}

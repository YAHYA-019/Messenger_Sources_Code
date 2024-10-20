package X;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: Lls.class */
public final class Lls implements Runnable {
    public static final String __redex_internal_original_name = "zaak";
    public final /* synthetic */ Lch A00;

    public Lls(Lch lch) {
        this.A00 = lch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.A0B;
        if (JQx.A1Z(GooglePlayServicesUtil.A02)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e) {
            android.util.Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e);
        }
    }
}

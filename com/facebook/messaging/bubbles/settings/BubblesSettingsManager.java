package com.facebook.messaging.bubbles.settings;

import X.0fH;
import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.5HB;
import X.5HC;
import X.5HF;
import X.5HG;
import X.C00i;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;

/* loaded from: BubblesSettingsManager.class */
public final class BubblesSettingsManager {
    public static final 5HB A05 = new Object();
    public final 1Br A00;
    public final 1Br A01 = 1Bq.A00(83041);
    public final 1Br A02;
    public final 1Br A03;
    public final Context A04;

    public BubblesSettingsManager() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A04 = context;
        this.A02 = 1HG.A00(context, 100188);
        this.A00 = 1Bu.A00(33230);
        this.A03 = 1Bq.A00(83825);
    }

    public final int A00() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 5HF.A00.A01((NotificationManager) this.A02.A00.get());
        }
        if (((NotificationManager) this.A02.A00.get()).areBubblesAllowed()) {
            return 2;
        }
        StatusBarNotification[] activeNotifications = ((NotificationManager) ((5HG) this.A03.A00.get()).A01.A00.get()).getActiveNotifications();
        11T.A0D(activeNotifications);
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            11T.A0A(notification);
            if ((notification.flags & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
                return 1;
            }
        }
        return 0;
    }

    public final void A01() {
        this.A00.A00.get();
        Context context = FbInjector.A03;
        11T.A0A(context);
        boolean z = false;
        if (Settings.Global.getInt(context.getContentResolver(), "notification_bubbles", 0) == 1) {
            z = true;
        }
        0fH.A0g(Boolean.valueOf(z), "BubblesSettingsManager", "Bubbles OS permission on init: %s");
        C00i c00i = this.A01.A00;
        ((5HC) c00i.get()).A07("app_launched", z);
        int A00 = A00();
        0fH.A0g(Integer.valueOf(A00), "BubblesSettingsManager", "Bubbles App permission on init: %d");
        ((5HC) c00i.get()).A06("app_launched", A00);
    }
}

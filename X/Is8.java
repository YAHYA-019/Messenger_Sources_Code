package X;

import android.net.Uri;
import android.view.View;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch.CoWatchNotificationFeature;

/* loaded from: Is8.class */
public final class Is8 implements Runnable {
    public static final String __redex_internal_original_name = "CoWatchNotificationFeature$rtcUiCallback$1$onDataReceived$1";
    public final /* synthetic */ CoWatchNotificationFeature A00;

    public Is8(CoWatchNotificationFeature coWatchNotificationFeature) {
        this.A00 = coWatchNotificationFeature;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoWatchNotificationFeature coWatchNotificationFeature = this.A00;
        I8a i8a = ((HEt) coWatchNotificationFeature).A00;
        if (i8a != null) {
            i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, (C1u3) null, C1u4.SIZE_32, (Hre) null, (Hre) null, HBr.A0O, 1BK.A0u(coWatchNotificationFeature.A01, 2131955158), (CharSequence) null, C0ty.A00, 0, 0, 0, 6000L, false, false));
        }
    }
}

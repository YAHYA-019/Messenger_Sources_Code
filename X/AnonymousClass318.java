package X;

import com.facebook.messaging.analytics.ttrc.surface.notification.event.OnNotification;
import com.facebook.messenger.platform_logger.MPLTracker;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.xapp.messaging.pre.event.PRELoggingEvent;

/* renamed from: X.318, reason: invalid class name */
/* loaded from: 318.class */
public final class AnonymousClass318 implements 1Vf {
    public final 1Br A00 = 1Bq.A00(84268);

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.messaging.analytics.ttrc.surface.notification.event.OnNotification")) {
            if (!str.equals("com.facebook.messaging.analytics.ttrc.surface.msys.event.MsysBootstrap")) {
                throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
            }
            PRELoggingEvent pRELoggingEvent = (PRELoggingEvent) r302;
            11T.A0F(pRELoggingEvent, 0);
            0fH.A0j("NotificationEventHandler", String.valueOf(pRELoggingEvent));
            ((2yR) 1Br.A0B(this.A00)).A04(pRELoggingEvent);
            return;
        }
        OnNotification onNotification = (OnNotification) r302;
        11T.A0F(onNotification, 0);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(onNotification);
        A0k.append(" type=");
        String str2 = onNotification.A00;
        0fH.A0j("NotificationEventHandler", AnonymousClass001.A0d(str2, A0k));
        C00i c00i = this.A00.A00;
        ((2yR) c00i.get()).A04(onNotification);
        2yR r0 = (2yR) c00i.get();
        1QI r02 = r0.A00;
        if (r02 != null) {
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 1Br.A0B(r0.A02);
            int i = r02.A00;
            quickPerformanceLogger.markerAnnotate(i, "notif_type", str2);
            MPLTracker.endInteraction(i, 0, (short) 2, ((PRELoggingEvent) onNotification).A00);
        }
    }
}

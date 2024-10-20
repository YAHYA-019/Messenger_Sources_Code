package X;

import com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch.CoWatchNotificationFeature;

/* loaded from: Ix6.class */
public final class Ix6 implements Runnable {
    public static final String __redex_internal_original_name = "CoWatchNotificationFeature$maybeScheduleNotEligibleNotificationForNewConnectedPeer$1";
    public final /* synthetic */ CoWatchNotificationFeature A00;
    public final /* synthetic */ String A01;

    public Ix6(CoWatchNotificationFeature coWatchNotificationFeature, String str) {
        this.A00 = coWatchNotificationFeature;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A00;
        I8a i8a;
        CoWatchNotificationFeature coWatchNotificationFeature = this.A00;
        I9O B1U = GOp.A0t(coWatchNotificationFeature.A04).B1U(this.A01);
        if (B1U == null || !I6L.A02(B1U) || I6L.A01(HBQ.A02, B1U) || (A00 = I6L.A00(B1U)) == null || A00.length() == 0 || (i8a = ((HEt) coWatchNotificationFeature).A00) == null) {
            return;
        }
        I8a.A00(i8a, HBr.A0P, AbK.A13(coWatchNotificationFeature.A01, A00, 2131955159));
    }
}

package X;

import com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate.UserStateUpdateImplementation;

/* loaded from: Ix8.class */
public final class Ix8 implements Runnable {
    public static final String __redex_internal_original_name = "UserStateUpdateImplementation$handleUserStateUpdate$2";
    public final /* synthetic */ UserStateUpdateImplementation A00;
    public final /* synthetic */ I9O A01;

    public Ix8(UserStateUpdateImplementation userStateUpdateImplementation, I9O i9o) {
        this.A00 = userStateUpdateImplementation;
        this.A01 = i9o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserStateUpdateImplementation userStateUpdateImplementation = this.A00;
        String A00 = I9O.A00(this.A01);
        HVp hVp = new HVp((HPX) C1Y6.A00(userStateUpdateImplementation.A01, "com_facebook_messaging_rtc_incall_plugins_interfaces_notification_content_NotificationContentPluginInterfaceSpec", "All", AnonymousClass001.A1Z()));
        1Br.A0C(userStateUpdateImplementation.A0B);
        11T.A0D(hVp);
        I9O A0u = GOq.A0u(userStateUpdateImplementation.A07, A00);
        if (A0u != null) {
            String A002 = I6L.A00(A0u);
            if (2yD.A03(1Br.A07(((Bj9) 1Br.A0B(userStateUpdateImplementation.A09)).A00), 36319699448969467L)) {
                AbstractC2326GOr.A0I(userStateUpdateImplementation.A04, A00).A01(new Rq1(hVp, userStateUpdateImplementation, A00, A002));
            } else {
                UserStateUpdateImplementation.A00(hVp, userStateUpdateImplementation, A00, A002);
            }
        }
    }
}

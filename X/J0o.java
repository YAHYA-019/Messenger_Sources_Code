package X;

import com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate.UserStateUpdateImplementation;
import java.util.concurrent.TimeUnit;

/* loaded from: J0o.class */
public final class J0o implements Runnable {
    public static final String __redex_internal_original_name = "UserStateUpdateImplementation$handleUserStateUpdate$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserStateUpdateImplementation A01;
    public final /* synthetic */ I9O A02;

    public J0o(UserStateUpdateImplementation userStateUpdateImplementation, I9O i9o, int i) {
        this.A01 = userStateUpdateImplementation;
        this.A02 = i9o;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserStateUpdateImplementation userStateUpdateImplementation = this.A01;
        String A00 = I9O.A00(this.A02);
        int i = this.A00;
        I9O A0u = GOq.A0u(userStateUpdateImplementation.A07, A00);
        if (A0u != null) {
            userStateUpdateImplementation.A00 = GOp.A1H(userStateUpdateImplementation.A0A).schedule((Runnable) new SD7(userStateUpdateImplementation, I6L.A00(A0u), A00), i * 3000, TimeUnit.MILLISECONDS);
        }
    }
}

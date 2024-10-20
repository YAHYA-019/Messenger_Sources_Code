package X;

import com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate.UserStateUpdateImplementation;

/* loaded from: Ix9.class */
public final class Ix9 implements Runnable {
    public static final String __redex_internal_original_name = "UserStateUpdateImplementation$handleUserStateUpdate$3";
    public final /* synthetic */ UserStateUpdateImplementation A00;
    public final /* synthetic */ I9O A01;

    public Ix9(UserStateUpdateImplementation userStateUpdateImplementation, I9O i9o) {
        this.A00 = userStateUpdateImplementation;
        this.A01 = i9o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A00;
        I8a i8a;
        UserStateUpdateImplementation userStateUpdateImplementation = this.A00;
        String A002 = I9O.A00(this.A01);
        I9O A0u = GOq.A0u(userStateUpdateImplementation.A07, A002);
        if (A0u == null || (A00 = I6L.A00(A0u)) == null || A00.length() == 0 || (i8a = ((HEt) userStateUpdateImplementation).A00) == null) {
            return;
        }
        I8a.A01(i8a, HBr.A16, AbK.A13(userStateUpdateImplementation.A01, I6L.A00(A0u), 2131965352), A002);
    }
}

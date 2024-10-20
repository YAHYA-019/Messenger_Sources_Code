package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.CountDownLatch;

/* loaded from: Ekw.class */
public final class Ekw {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FdU A01;
    public final /* synthetic */ CountDownLatch A02;

    public Ekw(FbUserSession fbUserSession, FdU fdU, CountDownLatch countDownLatch) {
        this.A02 = countDownLatch;
        this.A01 = fdU;
        this.A00 = fbUserSession;
    }
}

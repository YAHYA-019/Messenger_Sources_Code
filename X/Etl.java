package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.CountDownLatch;

/* loaded from: Etl.class */
public final class Etl {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FdU A01;
    public final /* synthetic */ CountDownLatch A02;

    public Etl(FbUserSession fbUserSession, FdU fdU, CountDownLatch countDownLatch) {
        this.A01 = fdU;
        this.A02 = countDownLatch;
        this.A00 = fbUserSession;
    }

    public void A00() {
        FdU fdU = this.A01;
        7zP.A0e(((Ecr) 1Br.A0B(fdU.A04)).A00).markerPoint(27656200, "editor_config_fetch_ended");
        fdU.A00 = false;
        CountDownLatch countDownLatch = this.A02;
        countDownLatch.countDown();
        FdU.A01(this.A00, fdU, countDownLatch);
    }
}

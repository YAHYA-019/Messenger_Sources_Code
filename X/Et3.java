package X;

import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Et3.class */
public final class Et3 {
    public final C1x1 A00 = (C1x1) 1Bi.A03(66360);
    public final 1De A01;

    public Et3(1De r302) {
        this.A01 = r302;
    }

    public final void A00(FbUserSession fbUserSession, long j, long j2, long j3) {
        LiveData liveData = new LiveData();
        22I r0 = (22I) 4YU.A0o(fbUserSession, this.A01, 33183);
        FkM fkM = new FkM(liveData, this, 0);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, fkM);
        1Um.A02(AQV, new CzY(r0, A0Q, 1, j, j2, j3), A0Q, false);
    }
}

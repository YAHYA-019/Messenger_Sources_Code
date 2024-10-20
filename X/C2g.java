package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C2g.class */
public final class C2g {
    public final C1x1 A00 = (C1x1) 1Bi.A03(66360);
    public final 1De A01;

    public C2g(1De r302) {
        this.A01 = r302;
    }

    public final MutableLiveData A00(FbUserSession fbUserSession, long j, long j2) {
        11T.A0F(fbUserSession, 0);
        MutableLiveData A0H = 7zL.A0H();
        ((22I) 4YU.A0o(fbUserSession, this.A01, 33183)).A0L(Czj.A00(A0H, this, 36), (Number) null, (Number) null, "", (String) null, j, j2);
        return A0H;
    }
}

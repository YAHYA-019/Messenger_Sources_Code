package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.86r, reason: invalid class name */
/* loaded from: 86r.class */
public final class C86r implements 6sC {
    public final 1Br A00;
    public final FbUserSession A01;
    public final 1De A02;

    public C86r(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A01 = fbUserSession;
        this.A00 = 1Bq.A00(16511);
    }

    public void Cl6(ThreadKey threadKey) {
        ((22C) 4YU.A0n(this.A01, this.A02, 65962)).A02(new A03(this, 31), threadKey.A01);
    }
}

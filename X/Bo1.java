package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Bo1.class */
public final class Bo1 {
    public final ConcurrentHashMap A00;
    public final FbUserSession A01;

    public Bo1(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A00 = new ConcurrentHashMap();
    }
}

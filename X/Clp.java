package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: Clp.class */
public final class Clp implements DFF {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C67Q A01;

    public Clp(FbUserSession fbUserSession, C67Q c67q) {
        this.A01 = c67q;
        this.A00 = fbUserSession;
    }

    public boolean CMb(List list) {
        return !C67Q.A01(this.A01, this.A00.A02, list);
    }
}

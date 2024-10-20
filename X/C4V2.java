package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.HashSet;

/* renamed from: X.4V2, reason: invalid class name */
/* loaded from: 4V2.class */
public final class C4V2 {
    public final HashSet A00;
    public final FbUserSession A01;

    public C4V2() {
        this.A00 = new HashSet();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4V2(FbUserSession fbUserSession) {
        this();
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
    }

    public final void A00(String str) {
        synchronized (this) {
            this.A00.remove(str);
        }
    }
}

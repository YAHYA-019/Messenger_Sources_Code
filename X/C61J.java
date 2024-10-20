package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashMap;

/* renamed from: X.61J, reason: invalid class name */
/* loaded from: 61J.class */
public final class C61J {
    public final FbUserSession A00;
    public final 1Br A01;
    public final HashMap A02;

    public C61J(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A01 = 1Bq.A00(16688);
        this.A02 = new HashMap();
    }

    public final void A00(ThreadKey threadKey, String str) {
        this.A02.remove(str);
        ((1Uv) 1Br.A0B(this.A01)).A0A(this.A00, threadKey, AbE.A00(326));
    }
}

package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hrd.class */
public final class Hrd {
    public final 1De A00;
    public final 1Br A01 = 1Bq.A00(83273);

    public Hrd(1De r302) {
        this.A00 = r302;
    }

    public final ImmutableList A00(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        1BY r0 = this.A00.A00;
        List list = ((I4x) 1Lo.A04((Context) null, fbUserSession, r0, 114858)).A01;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I9O B1U = ((2QU) 1Lo.A04((Context) null, fbUserSession, r0, 99981)).B1U(((C2611Gj0) it.next()).A01);
            if (B1U != null) {
                A0s.add(B1U);
            }
        }
        return 1BL.A0a(A0s);
    }

    public final boolean A01(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        ImmutableList A00 = A00(fbUserSession);
        if ((A00 instanceof Collection) && A00.isEmpty()) {
            return false;
        }
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            if (11T.A0O(I9O.A01(it), ((1G1) fbUserSession).A05)) {
                return true;
            }
        }
        return false;
    }
}

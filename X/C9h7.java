package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.9h7, reason: invalid class name */
/* loaded from: 9h7.class */
public final class C9h7 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C9h7(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A00 = 7zL.A0S(fbUserSession, r303, 65961);
        this.A01 = 1Bq.A00(68077);
    }

    public static final int A00(ImmutableSet immutableSet, int i) {
        int i2 = 0;
        if (!(immutableSet instanceof Collection) || !immutableSet.isEmpty()) {
            Iterator it = immutableSet.iterator();
            while (it.hasNext()) {
                if (ThreadKey.A00(((ThreadKey) it.next()).A06) == i) {
                    i2++;
                    if (i2 < 0) {
                        C0s8.A17();
                        throw 0Q8.createAndThrow();
                    }
                }
            }
        }
        return i2;
    }

    public final void A01(ImmutableSet immutableSet, C0Bf c0Bf) {
        5P8 r0 = (5P8) 1Br.A0B(this.A00);
        LinkedHashMap A1C = 1BK.A1C();
        1Du it = immutableSet.iterator();
        while (it.hasNext()) {
            ThreadKey threadKey = (ThreadKey) it.next();
            1Br.A0C(this.A01);
            11T.A0D(threadKey);
            1BK.A1P(5QA.A00(threadKey), A1C, ThreadKey.A00(threadKey.A06));
        }
        A1d.A01(r0.A0I(A1C), c0Bf, 58);
    }
}

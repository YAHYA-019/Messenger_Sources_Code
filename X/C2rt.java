package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2rt, reason: invalid class name */
/* loaded from: 2rt.class */
public final class C2rt {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;

    public C2rt(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A03 = 1Bu.A00(66633);
        this.A02 = 1Bq.A00(33243);
        this.A05 = 1Bq.A00(66439);
        this.A01 = 1Lm.A01(fbUserSession, 66278);
        this.A04 = 1Lm.A01(fbUserSession, 66713);
        this.A06 = 1Bu.A00(66728);
    }

    public static final int A00(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        int i = 0;
        if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                if (((2kQ) it.next()).A00 == 0) {
                    i++;
                    if (i < 0) {
                        C0s8.A17();
                        throw 0Q8.createAndThrow();
                    }
                }
            }
        }
        return i;
    }
}

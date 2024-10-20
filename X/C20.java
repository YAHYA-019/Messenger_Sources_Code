package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: C20.class */
public final class C20 {
    public final 1Br A00 = 7zM.A0N();

    public final 2sF A00(FbUserSession fbUserSession, long j) {
        Object obj;
        Iterator it = ((List) ((2sA) 1Lo.A08(fbUserSession, 66801)).A00.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            2sF r0 = (2sF) obj;
            2Zn r02 = r0.A04;
            if (r02 == 2Zn.A0G || (r02 == 2Zn.A0F && 1Br.A07(this.A00).AZk(72339915124967908L))) {
                if (r0.A05 == 6BI.A06 && r0.A03 == j) {
                    1Bn.A0A(67154);
                    if (!((1Fi) new 6CD(fbUserSession).A01.getValue()).contains(9EO.A00(r02.toString(), String.valueOf(j)))) {
                        break;
                    }
                }
            }
        }
        return (2sF) obj;
    }
}

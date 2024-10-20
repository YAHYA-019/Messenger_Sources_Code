package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ly, reason: invalid class name */
/* loaded from: 6ly.class */
public abstract class C6ly {
    public static final 2sF A00(FbUserSession fbUserSession, 2sA r302, Long l) {
        Object obj;
        11T.A0F(r302, 0);
        1Bn.A0A(67154);
        6CD r0 = new 6CD(fbUserSession);
        6Ds r02 = (6Ds) 1Bi.A03(49992);
        2yD r03 = (2yD) 1Bi.A03(16385);
        Iterator it = ((List) r302.A00.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            2sF r04 = (2sF) obj;
            if (r04.A05 == 6BI.A03) {
                long j = r04.A03;
                if (l != null && j == l.longValue() && r04.A00 * 1000 >= r02.now()) {
                    if (!((1Fi) r0.A01.getValue()).contains(0Pz.A0j(1BJ.A00(ActionId.NEW_START_FOUND), Uri.encode(String.valueOf(r04.A01)), 7zK.A00(245)))) {
                        2Zn r05 = r04.A04;
                        if (r05 == 2Zn.A07 && r03.AZk(36324307948883541L)) {
                            break;
                        }
                        if (r05 == 2Zn.A09 || r05 == 2Zn.A05 || r05 == 2Zn.A06 || r05 == 2Zn.A0C || r05 == 2Zn.A0B || r05 == 2Zn.A08 || r05 == 2Zn.A0E || r05 == 2Zn.A0A) {
                            if (r03.AZk(36324307949014615L)) {
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return (2sF) obj;
    }
}

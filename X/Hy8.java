package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;

/* loaded from: Hy8.class */
public final class Hy8 {
    public final 1Br A01 = AbG.A0N();
    public final 1Br A00 = 1Bu.A00(147458);

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0107. Please report as an issue. */
    public static void A00(Bundle bundle, 0QO r302, FbUserSession fbUserSession, RJF rjf, Hy8 hy8) {
        Object obj;
        String A01 = ((Ewy) 1Lo.A08(fbUserSession, 99761)).A01();
        C1kw A08 = AbI.A08(hy8.A01);
        if (GYf.A00 == null) {
            synchronized (GYf.class) {
                if (GYf.A00 == null) {
                    GYf.A00 = new C2J3(A08);
                }
            }
        }
        GYf gYf = GYf.A00;
        AbstractC01593ro A3u = gYf.A00.A3u(rjf.A01, false);
        if (A3u.A0B()) {
            rjf.A00.D8s(bundle);
            A3u.A06("pigeon_reserved_keyword_module", "snacks_actions");
            A3u.A06(1BJ.A00(10), A01);
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                11T.A0D(A0i);
                Number number = (Number) r302.get(A0i);
                if (number == null) {
                    obj = bundle.get(A0i);
                } else {
                    switch (number.intValue()) {
                        case 0:
                            A3u.A04(A0i, bundle.getInt(A0i));
                        case 1:
                            A3u.A05(A0i, bundle.getLong(A0i));
                        case 2:
                            A3u.A07(A0i, bundle.getBoolean(A0i));
                        case 3:
                            A3u.A06(A0i, bundle.getString(A0i));
                        case 4:
                            A3u.A03(A0i, bundle.getDouble(A0i));
                        case 5:
                            obj = bundle.getSerializable(A0i);
                            break;
                        case 6:
                            obj = bundle.getStringArrayList(A0i);
                            break;
                        default:
                            throw AnonymousClass001.A0N("Unhandled case");
                    }
                }
                A3u.A02(obj, A0i);
            }
            A3u.A0A();
        }
        1Br.A0C(hy8.A00);
    }
}

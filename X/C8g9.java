package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8g9, reason: invalid class name */
/* loaded from: 8g9.class */
public final class C8g9 extends 1LH {
    public static final CallerContext A04 = CallerContext.A0B("AvatarDetailEnvironmentsList");
    public final String A00;
    public final List A01;
    public final Function1 A02;
    public final String A03;

    public C8g9(String str, List list, Function1 function1) {
        11T.A0F(list, 1);
        this.A01 = list;
        this.A00 = str;
        this.A03 = "environment_list_fade_transition";
        this.A02 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Object A0A = 1Bn.A0A(68687);
        C06974ih c06974ih = (C06974ih) 2rO.A00(c2k5, new AQX(c2k5, 44), new Object[0]);
        C6ni c6ni = (C6ni) 2rO.A00(c2k5, new AQX(c2k5, 45), new Object[0]);
        long A09 = 7zP.A09();
        C2lu A0w = 7zL.A0w(A09);
        long A0B = 7zQ.A0B();
        8Dm A01 = C9d1.A01(c2k5, null, A0w, 7zL.A0w(A0B), 7zL.A0w(A0B));
        Integer num = 0S2.A01;
        2lQ r0 = 2lO.A02;
        2lO A0K = 7zT.A0K((2lO) null, 16.0d);
        1Iw r02 = c2k5.A05;
        2lO A0O = 7zS.A0O(r02, A0K, this.A03);
        long A08 = 7zP.A08();
        2NI r03 = C8nc.A0O;
        C02A c02a = r02.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9bp c9bp = new C9bp();
        for (8Jw r04 : this.A01) {
            String str = r04.A06;
            5BH A012 = 5BG.A01(r02);
            A012.A2X((Uri) r04.A04);
            2lO A0k = 7zT.A0k((2lO) null, 0S2.A00, num, 7zP.A0E());
            String str2 = r04.A05;
            if (str2 != null) {
                A0k = 7zS.A0d(A0k, str2);
            }
            7zS.A1K(A012, 7zS.A0b(A0k, 0S2.A1G, new AVI(33, r04, A0A, this)), 0S2.A0G, A09);
            A012.A2b(A04);
            A012.A2Z(c06974ih);
            C6ni c6ni2 = null;
            if (11T.A0O(str, this.A00)) {
                c6ni2 = c6ni;
            }
            A012.A1h(c6ni2);
            c9bp.A00(7zL.A0K(A012), str, false);
        }
        return new C8ej(r03, A01, null, A0O, null, C9mj.A04(r02, c1j8, 7zN.A03(c2k5, A08), z), c9bp, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
    }
}

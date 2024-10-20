package X;

import com.facebook.graphql.enums.GraphQLXFBGenAIPersonaAudience;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8gi, reason: invalid class name */
/* loaded from: 8gi.class */
public final class C8gi extends 1LH {
    public final 8LF A00;
    public final MigColorScheme A01;
    public final C00m A02;
    public final Function1 A03;
    public final Function2 A04;
    public final 8Cr A05;

    public C8gi(8LF r302, 8Cr r303, MigColorScheme migColorScheme, C00m c00m, Function1 function1, Function2 function2) {
        1BL.A1F(migColorScheme, r303);
        this.A01 = migColorScheme;
        this.A05 = r303;
        this.A00 = r302;
        this.A03 = function1;
        this.A04 = function2;
        this.A02 = c00m;
    }

    public static final C1rh A01(C2k6 c2k6, C8gi c8gi, String str, String str2, String str3, C00m c00m, boolean z, boolean z2) {
        C59y c59y = z ? new C59y(c8gi.A01, str3, z2, true) : null;
        2lQ r0 = 2lO.A02;
        2lO A0R = 7zR.A0R(7zS.A0c((2lO) null, 0S2.A01, true), AV1.A00(c00m, 15), 1);
        C2sn A0L = 7zS.A0L(c2k6);
        1Iw r02 = A0L.A00;
        6BC r03 = new 6BC();
        r03.A06(str);
        r03.A05(str2);
        r03.A08 = 6BD.A02;
        r03.A07 = c59y;
        C55z c55z = new C55z(r03);
        8R1 r04 = new 8R1(r02, new 6BE());
        6BE r05 = r04.A01;
        r05.A00 = c55z;
        BitSet bitSet = r04.A02;
        bitSet.set(0);
        C1rs.A05(bitSet, r04.A03, 1);
        r04.A0J();
        return 7zN.A0R(r05, A0L, c2k6, A0R);
    }

    public 1LI A0s(C2k5 c2k5) {
        String str;
        Object obj;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        int AYp = migColorScheme.AYp();
        Integer num = 0S2.A00;
        2lO A01 = C82m.A01(7zS.A0h(num, 7zL.A0j(AYp), 1), C82m.A08(num, 100.0f, A1W ? 1 : 0), A1W ? 1 : 0);
        long A08 = 7zP.A08();
        1Iw r0 = c2k5.A05;
        Dud A012 = Dzc.A01(r0);
        C2sn A0U = 7zQ.A0U(r0);
        1Iw AeS = A0U.AeS();
        C5yw A0W = 7zU.A0W(AeS, migColorScheme, A1W);
        A0W.A2Y();
        A0W.A01.A0G = true;
        7zM.A1Y(A0W, A0U, 2131952931);
        A0W.A2h(A1W);
        C9zj.A02(A0U, A0W, this, 5);
        8LF r02 = this.A00;
        2lO A04 = C82m.A04(null, num, 90.0f, A1W ? 1 : 0);
        2RH r03 = 2RH.A03;
        long A06 = 4YV.A06(r03);
        Integer num2 = 0S2.A0E;
        2lO A0K = 4YV.A0K(A04, num2, A06);
        C2sn A0U2 = 7zQ.A0U(AeS);
        2KD A0X = 7zN.A0X(A0U2.A00, migColorScheme, A1W ? 1 : 0);
        7zM.A1X(A0X, A0U2, 2131968149);
        A0X.A2f();
        A0X.A2d();
        A0X.A2q(2);
        A0X.A2Z();
        2RH r04 = 2RH.A04;
        4YU.A1M(A0X, r04);
        7zN.A1Q(A0U2, A0X);
        GBp gBp = new GBp(r02, this, 38);
        8Tm A00 = C8mf.A00(A0U2.AeS());
        8Tm.A09(A00, migColorScheme);
        A00.A2Z(18.0f);
        A00.A2g((1LI) gBp.invoke(A0U2));
        7zQ.A1E(A00.A2W(), A0U2, A0U, A0K);
        String str2 = r02.A08;
        java.util.Map map = r02.A0B;
        if (map != null) {
            GraphQLXFBGenAIPersonaAudience graphQLXFBGenAIPersonaAudience = GraphQLXFBGenAIPersonaAudience.PUBLIC;
            Iterator A0y = AnonymousClass001.A0y(map);
            while (true) {
                str = null;
                if (!A0y.hasNext()) {
                    obj = null;
                    break;
                }
                obj = A0y.next();
                if (((Map.Entry) obj).getValue() == graphQLXFBGenAIPersonaAudience) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                str = (String) entry.getKey();
            }
        } else {
            str = null;
        }
        if (11T.A0O(str2, str)) {
            List list = r02.A0A;
            2lO A0K2 = 4YV.A0K(7zT.A0d(C82m.A04(null, num, 90.0f, A1W ? 1 : 0), r03, num2), 0S2.A08, 4YV.A06(2RH.A08));
            C2sn A0U3 = 7zQ.A0U(AeS);
            1Iw r05 = A0U3.A00;
            2KD A0X2 = 7zN.A0X(r05, migColorScheme, A1W ? 1 : 0);
            7zM.A1X(A0X2, A0U3, 2131968146);
            A0X2.A2f();
            A0X2.A2d();
            A0X2.A2q(2);
            A0X2.A2Z();
            4YU.A1M(A0X2, r04);
            7zN.A1Q(A0U3, A0X2);
            GBp gBp2 = new GBp(list, this, 37);
            8Tm A002 = C8mf.A00(A0U3.AeS());
            8Tm.A09(A002, migColorScheme);
            A002.A2Z(18.0f);
            A002.A2g((1LI) gBp2.invoke(A0U3));
            A0U3.A00(A002.A2W());
            2KD A0X3 = 7zN.A0X(r05, migColorScheme, A1W ? 1 : 0);
            7zQ.A1S(A0X3, 3yH.A09(A0U3, 2131967963));
            A0X3.A2q(5);
            A0X3.A2Z();
            4YU.A1N(A0X3, r04);
            7zS.A1O(A0U3, A0U, A0K2, A0X3);
        }
        A012.A2c(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, A1W));
        c2k5.B7k();
        7zV.A12(A012, A1W);
        7zU.A1M(A012, c2k5.B7k(), A08, A1W);
        A012.A2d(null);
        C5z7.A00(A012, A01);
        Dzc A2V = A012.A2V();
        11T.A0D(A2V);
        return A2V;
    }
}

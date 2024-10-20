package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.87J, reason: invalid class name */
/* loaded from: 87J.class */
public final class C87J extends 1LH {
    public final 5VY A00;
    public final List A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C5j5 A05;
    public final MigColorScheme A06;
    public final C03853z9 A07;
    public final 9MA A08;
    public final C70t A09;
    public final C6yo A0A;
    public final 2Og A0B;
    public final 87M A0C;
    public final 6oP A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final Function1 A0H;
    public final Function2 A0I;
    public final Function2 A0J;
    public final 0Be A0K;
    public final boolean A0L;
    public final boolean A0M;

    public C87J(C5j5 c5j5, MigColorScheme migColorScheme, C03853z9 c03853z9, 9MA r305, C70t c70t, 5VY r307, C6yo c6yo, 2Og r309, 87M r310, 6oP r311, String str, String str2, List list, List list2, Function1 function1, Function2 function2, Function2 function22, 0Be r319, int i, int i2, int i3, boolean z, boolean z2) {
        7zR.A1N(str, list);
        11T.A0F(c6yo, 16);
        this.A0E = str;
        this.A0F = str2;
        this.A01 = list;
        this.A03 = i;
        this.A02 = i2;
        this.A0C = r310;
        this.A06 = migColorScheme;
        this.A0J = function2;
        this.A07 = c03853z9;
        this.A0M = z;
        this.A0B = r309;
        this.A09 = c70t;
        this.A0H = function1;
        this.A00 = r307;
        this.A0L = z2;
        this.A0A = c6yo;
        this.A0D = r311;
        this.A0I = function22;
        this.A0K = r319;
        this.A05 = c5j5;
        this.A0G = list2;
        this.A08 = r305;
        this.A04 = i3;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI c87f;
        11T.A0F(c2k5, 0);
        1Br A00 = 1Bq.A00(67699);
        List list = this.A01;
        List list2 = (List) AQs.A00(c2k5, A00, this, new Object[]{list}, 13);
        Object A002 = AQU.A00(c2k5, this, new Object[]{list}, 0);
        C2lh A003 = C2lc.A00(c2k5, 87K.A00);
        4FL.A00(c2k5, AQu.A00(A003, this, A002, 46), new Object[]{A002, this.A00});
        int size = list2.size();
        int A004 = ((C70u) 1Br.A0B(A00)).A00();
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A08, 3yH.A02(c2k5));
        C2sn A0L = 7zR.A0L(c2k5);
        String str = this.A0E;
        if (size >= A004) {
            String str2 = this.A0F;
            int i = this.A02;
            MigColorScheme migColorScheme = this.A06;
            boolean z = this.A0L;
            Function2 function2 = this.A0J;
            2Og r02 = this.A0B;
            C70t c70t = this.A09;
            boolean z2 = this.A0M;
            c87f = new AnonymousClass885(migColorScheme, c70t, r02, this.A0D, str, str2, list2, (java.util.Map) A003.A02, this.A0H, function2, this.A0I, this.A0K, i, z, z2);
        } else {
            String str3 = this.A0F;
            87M r03 = this.A0C;
            int i2 = this.A03;
            int i3 = this.A02;
            boolean z3 = this.A0L;
            Function2 function22 = this.A0J;
            2Og r04 = this.A0B;
            C70t c70t2 = this.A09;
            boolean z4 = this.A0M;
            Function1 function1 = this.A0H;
            java.util.Map map = (java.util.Map) A003.A02;
            c87f = new C87f(this.A05, this.A08, c70t2, this.A0A, r04, r03, this.A0D, str, str3, list2, this.A0G, map, function1, function22, this.A0I, this.A0K, i2, i3, this.A04, z3, z4);
        }
        return 7zN.A0R(c87f, A0L, c2k5, A0g);
    }
}

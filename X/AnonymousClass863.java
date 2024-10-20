package X;

import com.google.common.collect.ImmutableMultimap;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* renamed from: X.863, reason: invalid class name */
/* loaded from: 863.class */
public final class AnonymousClass863 extends 1LH {
    public final int A00;
    public final 1LI A01;
    public final 71U A02;
    public final 6nH A03;
    public final 7HQ A04;
    public final 6yN A05;
    public final 7HZ A06;
    public final 6qZ A07;
    public final ImmutableMultimap A08;
    public final String A09;
    public final String A0A;
    public final Function1 A0B;
    public final boolean A0C;

    public AnonymousClass863(1LI r302, 71U r303, 6nH r304, 7HQ r305, 6yN r306, 7HZ r307, 6qZ r308, ImmutableMultimap immutableMultimap, String str, String str2, Function1 function1, int i, boolean z) {
        11T.A0F(str, 4);
        this.A01 = r302;
        this.A08 = immutableMultimap;
        this.A0C = z;
        this.A09 = str;
        this.A04 = r305;
        this.A05 = r306;
        this.A07 = r308;
        this.A06 = r307;
        this.A02 = r303;
        this.A03 = r304;
        this.A00 = i;
        this.A0B = function1;
        this.A0A = str2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        final ImmutableMultimap immutableMultimap = this.A08;
        boolean z = !immutableMultimap.isEmpty();
        final boolean z2 = this.A0C;
        5XC.A00(c2k5, (C3s9) null);
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A0C;
        2lO A04 = C82m.A04(7zQ.A0X((2lO) null, num, 1.0f), 0S2.A0N, 100.0f, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r02 = A0L.A00;
        2dD A00 = C2dB.A00(r02);
        A00.A2X(this.A01);
        A00.A2C(C26z.BOTTOM, !z ? 0 : 7zO.A04(A0L, 7zM.A09(A0L)));
        A0L.A00(A00.A2W());
        2lO A0X = 7zQ.A0X((2lO) null, num, 0.0f);
        2dP r03 = 2dP.A01;
        Integer num2 = 0S2.A0Y;
        2lO A0X2 = 7zT.A0X(4YV.A0L(A0X, num2, r03, 0), new 2lV(num2, 7zO.A0B(this.A00)), 3yH.A06(A0L, 2132279379));
        C2sn A0U = 7zQ.A0U(r02);
        final String str = this.A09;
        final 7HQ r04 = this.A04;
        final 6yN r05 = this.A05;
        final 6qZ r06 = this.A07;
        final 7HZ r07 = this.A06;
        final 71U r08 = this.A02;
        final Function1 function1 = this.A0B;
        final String str2 = this.A0A;
        A0U.A00(new 1LH(r08, r04, r05, r07, r06, immutableMultimap, str, str2, function1, z2) { // from class: X.864
            public final 71U A00;
            public final 7HQ A01;
            public final 6yN A02;
            public final 7HZ A03;
            public final 6qZ A04;
            public final ImmutableMultimap A05;
            public final String A06;
            public final String A07;
            public final Function1 A08;
            public final boolean A09;

            {
                7zT.A11(3, str, r04, r05, r06);
                7zR.A1P(r07, r08);
                this.A05 = immutableMultimap;
                this.A09 = z2;
                this.A06 = str;
                this.A01 = r04;
                this.A02 = r05;
                this.A04 = r06;
                this.A03 = r07;
                this.A00 = r08;
                this.A08 = function1;
                this.A07 = str2;
            }

            public 1LI A0s(C2k5 c2k52) {
                11T.A0F(c2k52, 0);
                ImmutableMultimap immutableMultimap2 = this.A05;
                boolean z3 = !immutableMultimap2.isEmpty();
                C1ro c1ro = C1ro.CENTER;
                ArrayList A0s = AnonymousClass001.A0s();
                if (z3) {
                    boolean z4 = this.A09;
                    String str3 = this.A06;
                    7HQ r09 = this.A01;
                    6yN r010 = this.A02;
                    6qZ r011 = this.A04;
                    A0s.add(new 7Ji((2lO) null, this.A00, r09, r010, this.A03, r011, immutableMultimap2, str3, this.A07, this.A08, z4));
                }
                2lQ r012 = 2lO.A02;
                A0s.add(new AnonymousClass865(7zQ.A0Y(7zS.A0S((2lO) null, 0), 0S2.A01, 7zP.A08()), this.A02, this.A04, immutableMultimap2, this.A09));
                return new C1rh(null, c1ro, null, null, A0s, false);
            }
        });
        7zM.A1Q(A0U, A0L, A0X2);
        return C2so.A02(A0L, c2k5, A04);
    }
}

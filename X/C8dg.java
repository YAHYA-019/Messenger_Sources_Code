package X;

import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8dg, reason: invalid class name */
/* loaded from: 8dg.class */
public final class C8dg extends 1LH {
    public final 2lO A00;
    public final 9T9 A01;
    public final Function1 A02;
    public final Function1 A03;
    public final Function2 A04;
    public final Function2 A05;
    public final boolean A06;
    public final boolean A07;

    public C8dg(2lO r302, 9T9 r303, Function1 function1, Function1 function12, Function2 function2, Function2 function22, boolean z, boolean z2) {
        this.A01 = r303;
        this.A02 = function1;
        this.A05 = function2;
        this.A03 = function12;
        this.A04 = function22;
        this.A00 = r302;
        this.A07 = z;
        this.A06 = z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1rh A0Y;
        11T.A0F(c2k5, 0);
        5Rn r0 = C3s9.A04;
        5X3 A00 = C3s9.A00(r0, "overlay-appear-transition-key");
        C2jo c2jo = C2jm.A00;
        float A01 = 7zQ.A01(A00, c2jo);
        A00.A02(A01);
        7zN.A12(new LinearInterpolator(), A00, 200);
        5XC.A00(c2k5, A00);
        5X3 A002 = C3s9.A00(r0, "scrim-disappear-transition-key");
        7zP.A1C(A002, c2jo, A01);
        7zN.A12(new LinearInterpolator(), A002, 200);
        5XC.A00(c2k5, A002);
        C2lh A003 = C2lc.A00(c2k5, AQF.A00);
        9T9 r02 = this.A01;
        String str = r02.A02;
        5BO A02 = str != null ? 5Bm.A02(str, (java.util.Map) null) : null;
        long A06 = 7zU.A06(c2k5, 0S2.A0X);
        if (this.A07) {
            2lQ r03 = 2lO.A02;
            2lO A0Y2 = 7zQ.A0Y(7zS.A0S((2lO) null, 0), 0S2.A01, 7zP.A08());
            int i = 4;
            if (7zP.A1V(A003)) {
                i = 0;
            }
            A0Y = C2so.A0Y(c2k5, 4YV.A0L(7zS.A0c(7zS.A0O(c2k5.A05, 4YV.A0L(7zQ.A0Z(A0Y2, 0S2.A0u, new 3OV(i)), 0S2.A15, 7zL.A0j(FGN.A00(c2k5, C97i.A0k)), 1), "scrim-disappear-transition-key"), 0S2.A0N, true), 0S2.A05, new 8CM(7zO.A03(c2k5, A06)), 1));
        } else {
            1LI r04 = r02.A01;
            if (r04 != null) {
                2lQ r05 = 2lO.A02;
                2lO A0Y3 = 7zQ.A0Y(7zS.A0S((2lO) null, 0), 0S2.A01, 7zP.A08());
                1Iw r06 = c2k5.A05;
                A0Y = 7zT.A0F(r04, r06, c2k5, A0Y3, new 6nZ(r06, 5Rn.A02, "overlay-appear-transition-key"));
            } else {
                A0Y = null;
            }
        }
        9sO r07 = new 9sO(new GBq(this, A003, 32));
        9cN r08 = (9cN) 2rO.A00(c2k5, new AKK(this, 38), new Object[]{r02});
        C2iw c2iw = r08.A00;
        Integer num = this.A06 ? 400 : null;
        2lQ r09 = 2lO.A02;
        Dvw dvw = new Dvw(A02, A0Y, 4YV.A0L((2lO) null, 0S2.A0D, r08.A01, 1).A00(this.A00), (AXM) (A02 != null ? ACU.A00 : ACT.A00), r07, num, new AKK(this, 36), new G9G(this, r08, 32), new AKK(this, 37), new GBn(this, 38), A06);
        85X.A00(dvw, c2iw);
        return dvw;
    }
}

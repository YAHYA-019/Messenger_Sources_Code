package X;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: Kwv.class */
public abstract class Kwv {
    public static final 03Y A00;

    static {
        C0ty c0ty = C0ty.A00;
        A00 = new 03Y(c0ty, c0ty);
    }

    public static final void A00(MLv mLv, Lie lie, List list, int i) {
        mLv.D2B(-1794596951);
        int A0F = (i & 6) == 0 ? JR1.A0F(mLv, lie) | i : i;
        if ((i & 48) == 0) {
            A0F |= JR1.A0C(mLv, list);
        }
        if ((A0F & 19) != 18 || !mLv.BBC()) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= size) {
                    break;
                }
                L8b A0R = JQz.A0R(list, i3);
                C0Bd c0Bd = (C0Bd) A0R.A02;
                int i4 = A0R.A01;
                int i5 = A0R.A00;
                LP4 lp4 = LP4.A00;
                LOD lod = MLj.A00;
                LNS lns = (LNS) mLv;
                int i6 = lns.A02;
                MRT A04 = LNS.A04(lns);
                MLj A01 = KvE.A01(mLv, lod);
                LNS.A0J(mLv, lns, Kyy.A00);
                L5d.A01(mLv, lp4, A04);
                Function2 function2 = Kyy.A01;
                if (lns.A0K || !JR1.A1W(mLv, i6)) {
                    JR0.A18(mLv, function2, i6);
                }
                L5d.A00(mLv, A01);
                c0Bd.invoke(lie.subSequence(i4, i5).A00, mLv, 4YU.A0k());
                LNS.A0P(lns, true);
                i2 = i3 + 1;
            }
        } else {
            mLv.D0o();
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVV(i, 3, lie, list);
        }
    }
}

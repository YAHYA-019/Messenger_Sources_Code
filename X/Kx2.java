package X;

import com.facebook.acra.constants.ActionId;
import kotlin.jvm.functions.Function2;

/* loaded from: Kx2.class */
public abstract class Kx2 {
    public static final Kmh A00 = new Kmh();

    public static final void A00(MLv mLv, MLj mLj, L0R l0r, Function2 function2, int i, int i2) {
        MLj mLj2 = mLj;
        mLv.D2B(-511989831);
        int A0B = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0B(mLv, l0r) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0B |= 48;
        } else if ((i & 48) == 0) {
            A0B |= JR1.A0G(mLv, mLj);
        }
        if ((i2 & 4) != 0) {
            A0B |= 384;
        } else if ((i & 384) == 0) {
            A0B |= JR1.A0D(mLv, function2);
        }
        if ((A0B & ActionId.FILE_SYSTEM_FAIL) == 146 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            LNS lns = (LNS) mLv;
            int i4 = lns.A02;
            C2833Jap ACm = mLv.ACm();
            MLj A01 = KvE.A01(mLv, mLj2);
            MRT A04 = LNS.A04(lns);
            LNS.A0J(mLv, lns, LPQ.A0X);
            L5d.A02(mLv, l0r, l0r.A04);
            L5d.A02(mLv, ACm, l0r.A02);
            L5d.A02(mLv, function2, l0r.A03);
            L5d.A02(mLv, A04, Kyy.A04);
            L5d.A00(mLv, A01);
            Function2 function22 = Kyy.A01;
            if (lns.A0K || !JR1.A1W(mLv, i4)) {
                JR0.A18(mLv, function22, i4);
            }
            LNS.A0P(lns, true);
            if (mLv.BBC()) {
                mLv.D2A(-26502501);
            } else {
                mLv.D2A(-26580342);
                boolean AEk = mLv.AEk(l0r);
                Object CdA = mLv.CdA();
                if (AEk || CdA == Ky6.A00) {
                    CdA = M3K.A00(l0r, 36);
                    mLv.D7k(CdA);
                }
                mLv.Cbb((C00m) CdA);
            }
            LNS.A0P(lns, false);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M78(function2, l0r, mLj2, i2, i, 2);
        }
    }
}

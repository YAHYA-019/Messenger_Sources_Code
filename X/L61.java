package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import com.facebook.common.dextricks.DalvikInternals;
import kotlin.jvm.functions.Function2;

/* loaded from: L61.class */
public abstract class L61 {
    public static final void A00(MLv mLv, MLj mLj, String str, String str2, C00m c00m, int i, int i2, boolean z) {
        boolean z2 = z;
        C00m c00m2 = c00m;
        String str3 = str2;
        MLj mLj2 = mLj;
        11T.A0F(str, 0);
        mLv.D2B(-1163550052);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0G(mLv, mLj2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            A0F |= 384;
        } else if ((i & 384) == 0) {
            A0F |= JR1.A0H(mLv, str3);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            A0F |= 3072;
        } else if ((i & 3072) == 0) {
            A0F |= JR1.A0E(mLv, c00m2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            A0F |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0F |= JR0.A08(mLv.AEj(z2) ? 1 : 0);
        }
        if ((A0F & 9363) == 9362 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                str3 = null;
            }
            if (i5 != 0) {
                c00m2 = M2c.A00;
            }
            if (i6 != 0) {
                z2 = true;
            }
            MLj D4B = mLj2.D4B(new UnspecifiedConstraintsElement(48.0f)).D4B(L9h.A02);
            MKQ A00 = Kwt.A00(L7E.A01, mLv, Kz0.A03, 0);
            LNS lns = (LNS) mLv;
            int i7 = lns.A02;
            MRT A04 = LNS.A04(lns);
            MLj A01 = KvE.A01(mLv, D4B);
            LNS.A0J(mLv, lns, Kyy.A00);
            L5d.A01(mLv, A00, A04);
            Function2 function2 = Kyy.A01;
            if (lns.A0K || !JR1.A1W(mLv, i7)) {
                JR0.A18(mLv, function2, i7);
            }
            L5d.A00(mLv, A01);
            LOD lod = MLj.A00;
            float f = RXk.A00;
            if (str3 != null && str3.length() != 0) {
                f = RXk.A02;
            }
            LDZ.A05(mLv, L5c.A02(lod, f, 18.0f, f, 12.0f).D4B(new LayoutWeightElement()), ((KmQ) LNS.A08(lns, KaX.A00)).A01, str, (A0F & 14) | 12582912, LNS.A06(lns, KaV.A00).A0W);
            mLv.D2A(-2015541857);
            if (str3 != null && str3.length() != 0) {
                MLj A02 = L5c.A02(lod, 0.0f, 6.0f, 0.0f, 0.0f);
                int i8 = A0F >> 6;
                KWg.A00(mLv, A02, str3, c00m2, (i8 & 896) | (i8 & 14) | 48 | (A0F & 7168), 0, z2);
            }
            LNS.A0P(lns, false);
            LNS.A0P(lns, true);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7A(mLj2, str, str3, c00m2, i, i2, z2);
        }
    }

    public static final void A01(MLv mLv, String str) {
        A00(mLv, null, str, null, null, 6, 30, false);
    }

    public static final void A02(MLv mLv, String str, int i) {
        A00(mLv, null, str, null, null, i, 30, false);
    }
}

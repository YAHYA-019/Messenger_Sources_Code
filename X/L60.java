package X;

import android.content.Context;
import android.graphics.Path;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: L60.class */
public abstract class L60 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010b, code lost:
    
        if (((X.Jth) r304).A00 != 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.MLv r301, X.MLj r302, X.Jt6 r303, X.MCI r304, X.C2q1 r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L60.A00(X.MLv, X.MLj, X.Jt6, X.MCI, X.2q1, int, int):void");
    }

    public static final void A01(MLv mLv, MLj mLj, Jt6 jt6, C2q1 c2q1, 2qZ r305, String str, int i, int i2) {
        Jt6 jt62 = jt6;
        MLj mLj2 = mLj;
        mLv.D2B(-480434726);
        int A0B = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0B(mLv, r305) | i : i;
        if ((i2 & 2) != 0) {
            A0B |= 48;
        } else if ((i & 48) == 0) {
            A0B |= JR1.A0G(mLv, str);
        }
        if ((i2 & 4) != 0) {
            A0B |= 384;
        } else if ((i & 384) == 0) {
            A0B |= JR1.A0D(mLv, c2q1);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            A0B |= 3072;
        } else if ((i & 3072) == 0) {
            A0B |= JR1.A0I(mLv, mLj2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            A0B |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            A0B |= JR1.A0J(mLv, jt62);
        }
        if ((A0B & 9363) == 9362 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                jt62 = Jt6.A02;
            }
            LNS lns = (LNS) mLv;
            Context context = (Context) LNS.A08(lns, AndroidCompositionLocals_androidKt.A01);
            boolean A1Y = JR1.A1Y(mLv, context, c2q1, -609916706) | AnonymousClass001.A1Q(57344 & A0B, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            Object CdA = mLv.CdA();
            if (A1Y || CdA == Ky6.A00) {
                C2q2 c2q2 = jt62.A00;
                if (c2q2 == C2q2.A0G) {
                    CdA = C2qg.A0C;
                    11T.A0B(CdA);
                } else {
                    CdA = new C2qg(((5Ow) 1Bn.A0A(114966)).A00(context, c2q2, (MigColorScheme) 1Bu.A06(context, 16979), 2zP.A01, jt62.A01, c2q1.A00, c2q1.A05));
                }
                mLv.D7k(CdA);
            }
            C2qg c2qg = (C2qg) CdA;
            LNS.A0P(lns, false);
            String str2 = str == null ? "" : str;
            float f = c2q1.A06;
            mLv.D2A(-609906317);
            boolean AEi = mLv.AEi(c2q1);
            Object CdA2 = mLv.CdA();
            if (AEi || CdA2 == Ky6.A00) {
                Path A01 = 2qC.A01(context, c2q1, (C2py) null, jt62.A00, C2q2.A0G, C2q8.A03, L5e.A00(LDp.A04));
                11T.A0A(A01);
                CdA2 = new LWY(A01);
                LNS.A0N(lns, CdA2);
            }
            Path path = ((LWY) CdA2).A00;
            LNS.A0P(lns, false);
            KWb.A00(mLv, mLj2, new LWY(path), r305, c2qg, str2, f, (A0B & 14) | ((A0B >> 3) & 896), 0, LNS.A06(lns, KaV.A00).A0F);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M79(mLj2, jt62, c2q1, r305, str, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.MLv r301, X.MLj r302, X.C2q1 r303, X.2qZ r304, X.2qZ r305, java.lang.String r306, java.lang.String r307, int r308, int r309) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L60.A02(X.MLv, X.MLj, X.2q1, X.2qZ, X.2qZ, java.lang.String, java.lang.String, int, int):void");
    }
}

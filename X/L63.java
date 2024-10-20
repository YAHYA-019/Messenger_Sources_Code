package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import kotlin.jvm.functions.Function2;

/* loaded from: L63.class */
public abstract class L63 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.MLv r301, X.MLj r302, X.MCJ r303, X.3Dz r304, X.KMk r305, java.lang.String r306, java.lang.String r307, X.C00m r308, int r309, int r310) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L63.A00(X.MLv, X.MLj, X.MCJ, X.3Dz, X.KMk, java.lang.String, java.lang.String, X.00m, int, int):void");
    }

    public static final void A01(MLv mLv, MLj mLj, MCJ mcj, MCK mck, MCL mcl, int i, int i2) {
        MCJ mcj2 = mcj;
        MCL mcl2 = mcl;
        MLj mLj2 = mLj;
        11T.A0F(mck, 0);
        mLv.D2B(1383305320);
        int A0B = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR0.A0B(JR1.A1X(mLv, mck, i & 8) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0B |= 48;
        } else if ((i & 48) == 0) {
            A0B |= JR1.A0G(mLv, mLj2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            A0B |= 384;
        } else if ((i & 384) == 0) {
            int i5 = 128;
            if (JR1.A1X(mLv, mcl2, i & 512)) {
                i5 = 256;
            }
            A0B |= i5;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            A0B |= 3072;
        } else if ((i & 3072) == 0) {
            int i7 = 1024;
            if (JR1.A1X(mLv, mcj2, i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE)) {
                i7 = 2048;
            }
            A0B |= i7;
        }
        if ((A0B & 1171) == 1170 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (i4 != 0) {
                mcl2 = LWc.A00;
            }
            if (i6 != 0) {
                mcj2 = LWb.A00;
            }
            MBV mbv = Kz0.A02;
            MLj D4B = mLj2.D4B(new UnspecifiedConstraintsElement(56.0f)).D4B(L9h.A02);
            MKQ A00 = Kwt.A00(L7E.A01, mLv, mbv, 48);
            LNS lns = (LNS) mLv;
            int i8 = lns.A02;
            MRT A04 = LNS.A04(lns);
            MLj A01 = KvE.A01(mLv, D4B);
            LNS.A0J(mLv, lns, Kyy.A00);
            L5d.A01(mLv, A00, A04);
            Function2 function2 = Kyy.A01;
            if (lns.A0K || !JR1.A1W(mLv, i8)) {
                JR0.A18(mLv, function2, i8);
            }
            L5d.A00(mLv, A01);
            Kvt.A01(mLv, null, mck, A0B & 14, 2);
            Kvu.A01(mLv, L5c.A02(new LayoutWeightElement(), RXk.A02, 0.0f, 0.0f, 0.0f), mcl2, (A0B >> 6) & 14, 0);
            L9I.A03(mLv, (MLj) null, mcj2, (A0B >> 9) & 14, 2);
            LNS.A0P(lns, true);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7C(i, i2, 4, mck, mLj2, mcl2, mcj2);
        }
    }

    public static final void A02(MLv mLv, MCJ mcj) {
        A00(mLv, null, mcj, null, null, "Title", null, null, 1575936, 55);
    }
}

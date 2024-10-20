package X;

import com.facebook.acra.constants.ActionId;
import kotlin.jvm.functions.Function2;

/* loaded from: Kvu.class */
public abstract class Kvu {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01a7, code lost:
    
        if (r0.length() == 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.MLv r301, X.MLj r302, X.Jtm r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kvu.A00(X.MLv, X.MLj, X.Jtm, int, int):void");
    }

    public static final void A01(MLv mLv, MLj mLj, MCL mcl, int i, int i2) {
        MLj mLj2 = mLj;
        11T.A0F(mcl, 0);
        mLv.D2B(1520512727);
        int A0B = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR0.A0B(JR1.A1X(mLv, mcl, i & 8) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0B |= 48;
        } else if ((i & 48) == 0) {
            A0B |= JR1.A0G(mLv, mLj);
        }
        if ((A0B & 19) == 18 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (mcl instanceof LWc) {
                mLv.D2A(-1748891397);
                KU6.A00(mLv, mLj2);
            } else if (mcl instanceof Jtm) {
                mLv.D2A(-1748890164);
                A00(mLv, mLj2, (Jtm) mcl, A0B & ActionId.MISSED_EVENT, 0);
            } else if (mcl instanceof MQY) {
                mLv.D2A(-1748888340);
                MKQ A00 = LCh.A00(Kz0.A0C, false);
                LNS lns = (LNS) mLv;
                int i4 = lns.A02;
                MRT A04 = LNS.A04(lns);
                MLj A01 = KvE.A01(mLv, mLj2);
                LNS.A0J(mLv, lns, Kyy.A00);
                L5d.A01(mLv, A00, A04);
                Function2 function2 = Kyy.A01;
                if (lns.A0K || !JR1.A1W(mLv, i4)) {
                    JR0.A18(mLv, function2, i4);
                }
                L5d.A00(mLv, A01);
                ((MQY) mcl).A3M(mLv, 0);
                LNS.A0P(lns, true);
            } else {
                mLv.D2A(1619071991);
            }
            LNS.A0P((LNS) mLv, false);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M75(mcl, i2, mLj2, i, 8);
        }
    }
}

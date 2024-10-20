package X;

import kotlin.jvm.functions.Function2;

/* loaded from: Kv6.class */
public abstract class Kv6 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b1, code lost:
    
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r306v2, types: [X.Lz8] */
    /* JADX WARN: Type inference failed for: r306v7, types: [X.Lz8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.MLv r301, X.KlG r302, kotlin.jvm.functions.Function2 r303, int r304) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kv6.A00(X.MLv, X.KlG, kotlin.jvm.functions.Function2, int):void");
    }

    public static final void A01(MLv mLv, Function2 function2, KlG[] klGArr, int i) {
        MRT A05;
        mLv.D2B(-1390796515);
        LNS lns = (LNS) mLv;
        MRT A04 = LNS.A04(lns);
        LNS.A0O(lns, LDN.A02, (Object) null, 201, 0);
        boolean z = true;
        boolean z2 = false;
        if (lns.A0K) {
            A05 = LNS.A05(lns, A04, Kv7.A00(A04, C2856JbY.A00, klGArr));
            lns.A0Q = true;
        } else {
            L5U l5u = lns.A0B;
            Object A06 = l5u.A06(l5u.A01, 0);
            11T.A0I(A06, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            MRT mrt = (MRT) A06;
            L5U l5u2 = lns.A0B;
            Object A062 = l5u2.A06(l5u2.A01, 1);
            11T.A0I(A062, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            MRT mrt2 = (MRT) A062;
            MRT A00 = Kv7.A00(A04, mrt2, klGArr);
            if (lns.BBC() && !lns.A0O && 11T.A0O(mrt2, A00)) {
                lns.A03 += lns.A0B.A01();
                A05 = mrt;
            } else {
                A05 = LNS.A05(lns, A04, A00);
                if (!lns.A0O && 11T.A0O(A05, mrt)) {
                    z = false;
                }
                z2 = z;
                if (z && !lns.A0K) {
                    Kdg kdg = lns.A0I;
                    if (kdg == null) {
                        kdg = new Kdg();
                        lns.A0I = kdg;
                    }
                    kdg.A00.put(lns.A0B.A01, A05);
                }
            }
        }
        L1s l1s = lns.A0X;
        l1s.A01(lns.A0N ? 1 : 0);
        lns.A0N = z2;
        lns.A0A = A05;
        LNS.A0O(lns, LDN.A00, A05, 202, 0);
        JQz.A1L(mLv, function2, (i >> 3) & 14);
        boolean z3 = false;
        LNS.A0P(lns, false);
        LNS.A0P(lns, false);
        if (L1s.A00(l1s) != 0) {
            z3 = true;
        }
        lns.A0N = z3;
        lns.A0A = null;
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVV(i, 4, klGArr, function2);
        }
    }
}

package X;

import com.google.common.collect.SingletonImmutableSet;

/* loaded from: F52.class */
public final class F52 {
    public final Eie A01 = (Eie) 1Bn.A0A(100126);
    public final BiO A00 = (BiO) 1Bn.A0A(85029);

    public static void A00(RTK rtk, F52 f52) {
        if (rtk != null) {
            Eie eie = f52.A01;
            C00i c00i = eie.A01;
            1BK.A0R(c00i).AFq(new SingletonImmutableSet(EbJ.A08));
            1Ql A0V = 1BL.A0V(c00i);
            A0V.CaL(EbJ.A03, rtk.A02);
            A0V.CaL(EbJ.A00, rtk.A00);
            A0V.CaL(EbJ.A01, rtk.A01);
            A0V.CaH(EbJ.A02, 1BL.A08(eie.A00));
            A0V.CaL(EbJ.A04, rtk.A03);
            A0V.CaL(EbJ.A06, rtk.A04);
            1Ql.A01(A0V, EbJ.A05, false);
        }
    }
}

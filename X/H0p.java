package X;

import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi;

/* loaded from: H0p.class */
public final class H0p extends H1Y {
    public HvP A00;
    public GRD A01;

    public Class A04() {
        return 6UE.class;
    }

    public /* bridge */ /* synthetic */ void A05(6QK r302) {
        Hql A00;
        String str;
        CowatchAdPlayerApi Aer;
        if (((6UE) r302).A01 != 6UR.A06 || (A00 = HvP.A00()) == null) {
            return;
        }
        long A02 = this.A01.A02();
        1Br.A0C(A00.A0E);
        Ia1 A0d = GOq.A0d();
        if (A0d != null && (Aer = A0d.A02.Aer()) != null) {
            String str2 = A00.A08;
            if (str2 == null) {
                str = "clientToken";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            Aer.didStopAdPlayback(str2, A02);
        }
        DKE.A0K(A00.A0F).removeCallbacks(A00.A0I);
        GRD grd = A00.A04;
        if (grd == null) {
            str = "hostVideoState";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        GRS A04 = grd.A04();
        if (A04 != null) {
            A04.CXU(C52j.A07);
        }
    }
}

package X;

import java.util.LinkedHashMap;

/* loaded from: Fv7.class */
public final class Fv7 implements GIy {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Fv7(FHh fHh, GJj gJj, GJj gJj2, int i) {
        this.A00 = i;
        this.A03 = gJj;
        this.A01 = fHh;
        this.A02 = gJj2;
    }

    @Override // X.GIy
    public void CEX(Boolean bool, Integer num, Throwable th) {
        11T.A0F(th, 0);
        LinkedHashMap A14 = 7zS.A14("auth_factor_expired", bool, 1BK.A1G("exception", th.toString()), 1BK.A1G("remaining_attempts", 4YV.A0u(num)));
        FEK.A01(DKM.A07(DKM.A00(), A14, 0), (GJj) this.A02, this.A01);
    }

    @Override // X.GIy
    public void CEY(String str) {
        11T.A0F(str, 0);
        FEK.A01(DKM.A07(DKM.A00(), str, 0), (GJj) this.A03, this.A01);
    }
}

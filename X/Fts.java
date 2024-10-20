package X;

import android.content.Intent;

/* loaded from: Fts.class */
public final class Fts implements GGj {
    public final EgO A00;

    public Fts(EgO egO) {
        this.A00 = egO;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        if (obj instanceof EEM) {
            EgO egO = this.A00;
            Intent A05 = AbF.A05();
            A05.addFlags(268435456);
            A05.setAction("android.intent.action.VIEW");
            DKC.A1J(A05, 0Pz.A0W(C1ic.A18, "mobile_center_after_hping"));
            0LS.A0A(1BK.A04(egO.A00), A05);
        }
    }
}

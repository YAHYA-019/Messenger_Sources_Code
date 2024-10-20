package X;

/* loaded from: Esw.class */
public final class Esw {
    public final 1Br A00 = 1BK.A0D();
    public final 1Br A01 = 1BK.A0C();

    public final void A00(Nso nso, String str) {
        11T.A0F(nso, 1);
        if (1Br.A07(this.A01).AZk(36322224889677047L)) {
            return;
        }
        1UG A0A = AbG.A0A(1ZG.A03, 1Br.A02(this.A00), 1BJ.A00(1372));
        if (A0A.isSampled()) {
            AbF.A1L(A0A, str);
            A0A.A5c(nso, "upsell_flow_entry_point");
            4YU.A1I(A0A, "upsell_type", 2);
            A0A.BZL();
        }
    }
}

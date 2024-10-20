package X;

/* loaded from: Fte.class */
public final class Fte implements GGj {
    public EgQ A00;

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EDm eDm = (AbstractC10314t5) obj;
        if (eDm instanceof EDm) {
            EDm eDm2 = eDm;
            EgQ egQ = this.A00;
            String str = eDm2.A00;
            0fH.A07(EgQ.class, str, "enterUnknownState: %s");
            1UG A08 = 1BK.A08(1Br.A02(((FEM) egQ.A00.get()).A00), "zero_enter_unknown_state");
            if (A08.isSampled()) {
                A08.A7R("reason", str);
                A08.BZL();
            }
        }
    }
}

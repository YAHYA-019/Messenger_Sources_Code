package X;

import java.util.EnumMap;

/* loaded from: Hop.class */
public final class Hop {
    public int A00;
    public final 1De A01;
    public final 1Br A02;
    public final 3Fu A03 = Gyu.A00(this, 3);

    public Hop(1De r302) {
        this.A01 = r302;
        this.A02 = 7zM.A0h(r302, 114744);
    }

    public void A00(HAl hAl) {
        String name = hAl.name();
        0fH.A0g(name, "EffectListQueryManagerImpl", "maybe fetch effect list with appContext %s");
        if (hAl != HAl.A0C) {
            1BY r0 = this.A01.A00;
            if (!GOp.A0v(AbK.A0D(r0), r0).BTq() || !GOq.A1U(this.A02)) {
                return;
            }
        }
        0fH.A0g(name, "EffectListQueryManagerImpl", "start fetch effect list with appContext %s");
        1BY r02 = this.A01.A00;
        IPz iPz = (IPz) 1Lm.A07(AbK.A0D(r02), r02, 114831);
        H9U h9u = H9U.A03;
        EnumMap enumMap = new EnumMap(HCR.class);
        HCR hcr = HCR.A08;
        1Br.A0C(this.A02);
        HrV hrV = new HrV(hcr, 0);
        enumMap.put((EnumMap) hrV.A01, (HCR) hrV);
        iPz.A07(new HsJ(hAl, h9u, GOo.A0k(enumMap), (Integer) null, (String) null));
    }
}

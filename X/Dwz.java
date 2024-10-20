package X;

import java.util.BitSet;
import java.util.List;

/* loaded from: Dwz.class */
public final class Dwz extends C1rj {
    public 56A A00;

    public Dwz() {
        super("MdsBloksListItemLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        56A r0 = this.A00;
        DLQ dlq = r0.A01;
        FyG fyG = r0.A00;
        GJj gJj = r0.A02;
        DuH duH = new DuH(r302, new DyO());
        1Im r308 = null;
        EyU eyU = new EyU(dlq, (Object) null, (List) null);
        DyO dyO = duH.A01;
        dyO.A00 = eyU;
        BitSet bitSet = duH.A02;
        bitSet.set(1);
        dyO.A01 = fyG;
        bitSet.set(0);
        if (gJj != null) {
            r308 = 1LI.A09(r302, Dwz.class, "MdsBloksListItemLayout", -1121686809);
        }
        duH.A2T(r308);
        C1rs.A00(bitSet, duH.A03);
        duH.A0J();
        return dyO;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1121686809) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        56A r0 = ((Dwz) r302.A00.A01).A00;
        DLQ dlq = r0.A01;
        FyG fyG = r0.A00;
        GJj gJj = r0.A02;
        if (gJj == null) {
            return null;
        }
        DKM A02 = DKM.A02(dlq);
        A02.A0I(fyG);
        DKM.A0D(dlq, fyG, A02, gJj);
        return null;
    }
}

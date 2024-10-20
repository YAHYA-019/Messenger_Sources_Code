package X;

import java.util.ArrayList;

/* loaded from: Fu5.class */
public final class Fu5 implements GIp {
    public int A00;
    public boolean A01;
    public final 1Pr A02;
    public final 1Pr A03;
    public final 1Pr A04;

    public Fu5(1Pr r302) {
        this.A02 = r302;
        ArrayList arrayList = r302.A00;
        this.A04 = new 1Pr(new Object[arrayList.size()]);
        this.A03 = new 1Pr(new Boolean[arrayList.size()]);
    }

    @Override // X.GIp
    public void ADx(EsZ esZ) {
        this.A01 = true;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A03.A00;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i2) == null) {
                ((GIp) this.A02.A00.get(i2)).ADx(esZ);
            }
            i = i2 + 1;
        }
    }

    @Override // X.GIp
    public void Civ(GGk gGk, EsZ esZ, S4a s4a) {
        if (s4a != null) {
            throw AnonymousClass001.A0Q("getNextEffectId");
        }
        ArrayList arrayList = this.A02.A00;
        if (arrayList.isEmpty()) {
            gGk.Bvi(new 1Pr());
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((GIp) arrayList.get(i2)).Civ(new FuB(i2, 0, gGk, esZ, this), esZ, s4a);
            i = i2 + 1;
        }
    }
}

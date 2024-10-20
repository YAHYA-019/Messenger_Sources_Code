package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Fu4.class */
public final class Fu4 implements GIp {
    public int A00;
    public boolean A01;
    public final 1Pr A02 = new 1Pr();
    public final 1Pr A03 = new 1Pr();

    @Override // X.GIp
    public void ADx(EsZ esZ) {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((GIp) it.next()).ADx(esZ);
        }
    }

    @Override // X.GIp
    public void Civ(GGk gGk, EsZ esZ, S4a s4a) {
        if (s4a != null) {
            throw AnonymousClass001.A0Q("getNextEffectId");
        }
        ArrayList arrayList = this.A02.A00;
        if (arrayList.isEmpty()) {
            this.A01 = true;
            gGk.Bvi(new 1Pr());
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((GIp) arrayList.get(i2)).Civ(new FuB(i2, 1, gGk, esZ, this), esZ, s4a);
            i = i2 + 1;
        }
    }
}

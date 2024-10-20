package X;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Fu6.class */
public final class Fu6 implements GIp {
    public boolean A00;
    public final 1QC A01 = new 1QC();

    public void A00(GIp gIp, int i) {
        DKC.A1T(this.A01, Integer.valueOf(i), gIp);
    }

    @Override // X.GIp
    public void ADx(EsZ esZ) {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        Iterator it = this.A01.A00().iterator();
        while (it.hasNext()) {
            ((GIp) it.next()).ADx(esZ);
        }
    }

    @Override // X.GIp
    public void Civ(GGk gGk, EsZ esZ, S4a s4a) {
        if (s4a != null) {
            throw AnonymousClass001.A0Q("getNextEffectId");
        }
        1QC r0 = this.A01;
        Fue fue = new Fue();
        HashMap hashMap = r0.A00;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            fue.A01(it.next());
        }
        Iterator it2 = fue.iterator();
        while (it2.hasNext()) {
            Number number = (Number) it2.next();
            int intValue = number.intValue();
            GIp gIp = (GIp) hashMap.get(number);
            gIp.Civ(new FuC(gIp, gGk, esZ, this, intValue), esZ, s4a);
        }
    }
}

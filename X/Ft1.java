package X;

import java.util.Iterator;

/* loaded from: Ft1.class */
public final class Ft1 implements 3oI, GJg {
    public 3oH A00;
    public final F5D A03 = new F5D();
    public final F5D A04 = new F5D();
    public int A02 = 0;
    public final Ejy A05 = new Object();
    public int A01 = 1;

    public EqC A00(GIk gIk, EqC eqC) {
        this.A01++;
        EqC eqC2 = new EqC(gIk, this, eqC);
        if (eqC2.A01 == null) {
            eqC2.A01 = new F5w(eqC2.A03, eqC2.A05);
        }
        F5D.A00(this.A04).A00(eqC2.A05);
        return eqC2;
    }

    @Override // X.GJg
    public void A3k(GIo gIo, 3oH r303, Object obj) {
        Ejy ejy;
        Eme eme;
        this.A02++;
        gIo.accept(obj);
        F5D f5d = this.A03;
        1Pr r0 = f5d.A01;
        f5d.A00 = r0;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            EmR emR = (EmR) it.next();
            Fu7 fu7 = emR.A02;
            if (fu7.A00 != null && fu7.A01.BTc(obj)) {
                F5D.A00(emR.A01.A00.A04.A03).A00.remove(emR);
                fu7.A00 = null;
                emR.A00.Bvi(obj);
            }
        }
        while (true) {
            int i = this.A02 - 1;
            this.A02 = i;
            if (i != 0 || (eme = (ejy = this.A05).A00) == null) {
                break;
            }
            this.A02 = 1;
            Eme eme2 = eme.A00;
            ejy.A00 = eme2;
            if (eme2 == null) {
                ejy.A01 = null;
            }
            ((Runnable) eme.A01).run();
        }
        f5d.A00 = f5d.A01;
    }

    public void ANn(Object obj) {
        this.A00.ANn(obj);
    }

    @Override // X.GJg
    public void Bqk(3oH r302) {
        this.A00 = r302;
    }

    @Override // X.GJg
    public void CNs() {
        F5D f5d = this.A04;
        1Pr r0 = f5d.A01;
        f5d.A00 = r0;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            EsZ esZ = (EsZ) it.next();
            esZ.A00(esZ.A00);
        }
    }
}

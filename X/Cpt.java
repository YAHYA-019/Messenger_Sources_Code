package X;

import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cpt.class */
public class Cpt implements DIW {
    public final DIW A00;
    public final DFg A01;
    public final C1325Ae3 A02;
    public final DFe A03;
    public final String A04;

    public Cpt(DIW diw, DFg dFg) {
        11T.A0F(diw, 1);
        this.A00 = diw;
        this.A01 = dFg;
        Cpq cpq = new Cpq(this, 4);
        this.A03 = cpq;
        this.A02 = new C1325Ae3();
        diw.A5L(cpq);
        this.A04 = 0Pz.A0X("DataSourceListTransformerWrapper wrapping {", diw.getFriendlyName(), '}');
    }

    public void A5L(DFe dFe) {
        11T.A0F(dFe, 0);
        this.A02.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return this.A00.AgX();
    }

    public C1323Ae1 Cpm(ByH byH, Object obj) {
        C1323Ae1 Cpm = this.A00.Cpm(byH, obj);
        11T.A0A(Cpm);
        C1323Ae1 c1323Ae1 = C1323Ae1.A03;
        return new C1323Ae1(this.A01.D4u(byH, Cpm.A01), Cpm.A02);
    }

    public String getFriendlyName() {
        return this.A04;
    }
}

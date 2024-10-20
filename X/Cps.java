package X;

import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cps.class */
public final class Cps implements DIW {
    public final DIB A00;
    public final DFg A01;
    public final String A02;

    public Cps(DFg dFg, DIB dib) {
        11T.A0F(dib, 1);
        this.A00 = dib;
        this.A01 = dFg;
        this.A02 = 0Pz.A0X("SynchronousDataSourceListTransformerWrapper wrapping {", dib.getFriendlyName(), '}');
    }

    public void A5L(DFe dFe) {
    }

    public DataSourceIdentifier AgX() {
        return this.A00.AgX();
    }

    public C1323Ae1 Cpm(ByH byH, Object obj) {
        ImmutableList B7q = this.A00.B7q(byH, obj);
        11T.A0A(B7q);
        C1323Ae1 c1323Ae1 = C1323Ae1.A03;
        return AbG.A0n(this.A01.D4u(byH, B7q));
    }

    public String getFriendlyName() {
        return this.A02;
    }
}

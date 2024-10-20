package X;

import java.util.Iterator;

/* loaded from: Hmd.class */
public final class Hmd {
    public final /* synthetic */ IEo A00;

    public Hmd(IEo iEo) {
        this.A00 = iEo;
    }

    public final void A00() {
        IEo iEo = this.A00;
        Integer num = iEo.A04;
        Integer A00 = IEo.A00(iEo);
        iEo.A04 = A00;
        if (num != A00) {
            Iterator it = iEo.A0P.iterator();
            while (it.hasNext()) {
                ((HG0) it.next()).A01(num, iEo.A04);
            }
        }
        for (HG0 hg0 : iEo.A0P) {
            if (hg0 instanceof Gpo) {
                Gpo gpo = (Gpo) hg0;
                switch (gpo.A00) {
                    case 5:
                        GrD.A0A(gpo.A01);
                        break;
                    case 7:
                        GWo gWo = (GWo) gpo.A01;
                        ((IMJ) 1Lm.A05(gWo.A05, GOo.A0H(gWo), 98491)).A07();
                        break;
                }
            }
        }
    }
}

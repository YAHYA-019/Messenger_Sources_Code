package X;

import java.util.HashSet;

/* loaded from: Ft6.class */
public final class Ft6 implements GGh {
    @Override // X.GGh
    public /* bridge */ /* synthetic */ Object Cbo(Object obj, Object obj2) {
        F5y f5y;
        EoF eoF = (EoF) obj;
        EDw eDw = (AbstractC10314t5) obj2;
        if (eDw instanceof EDw) {
            EDw eDw2 = eDw;
            String A00 = 1BJ.A00(1098);
            HashSet hashSet = eDw2.A02.A00;
            if (hashSet.contains(A00) != eoF.A02) {
                f5y = new F5y(eoF);
                f5y.A02 = hashSet.contains(A00);
                eoF = new EoF(f5y.A00, f5y.A01, f5y.A02, f5y.A03);
            }
        } else if (eDw instanceof EEb) {
            EEb eEb = (EEb) eDw;
            if (eEb.A01) {
                f5y = new F5y(eoF);
                f5y.A00 = eEb.A00;
                eoF = new EoF(f5y.A00, f5y.A01, f5y.A02, f5y.A03);
            }
        } else {
            if (eDw instanceof EEW) {
                EEW eew = (EEW) eDw;
                1QC r0 = new 1QC(eoF.A01);
                DKC.A1T(r0, eew.A01.A01, Long.valueOf(eew.A00));
                f5y = new F5y(eoF);
                f5y.A01 = r0;
            } else if (eDw instanceof EDb) {
                f5y = new F5y(eoF);
                f5y.A03 = ((EDb) eDw).A00;
            }
            eoF = new EoF(f5y.A00, f5y.A01, f5y.A02, f5y.A03);
        }
        return eoF;
    }
}

package X;

import java.util.Iterator;

/* loaded from: Ft9.class */
public final class Ft9 implements GGh {
    @Override // X.GGh
    public /* bridge */ /* synthetic */ Object Cbo(Object obj, Object obj2) {
        String str;
        1QC r309;
        1QC r324;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        F5Z f5z = (F5Z) obj;
        EDz eDz = (AbstractC10314t5) obj2;
        if (!(eDz instanceof EDz)) {
            if (eDz instanceof EDi) {
                String str2 = ((EDi) eDz).A00;
                1QC r0 = f5z.A00;
                if (r0.A00.get(str2) == null && f5z.A01.A00.get(str2) == null) {
                    return f5z;
                }
                1QC r02 = f5z.A01;
                boolean z5 = f5z.A02;
                1QC r03 = new 1QC(r0);
                r03.A00.remove(str2);
                1QC r04 = new 1QC(r02);
                r04.A00.remove(str2);
                return new F5Z(r03, r04, z5);
            }
            if (eDz instanceof EDk) {
                str = ((EDk) eDz).A00;
                r309 = f5z.A01;
                Euk euk = (Euk) r309.A00.get(str);
                if (euk == null) {
                    euk = new Euk(0L, false, false, false);
                }
                r324 = f5z.A00;
                z = f5z.A02;
                z2 = euk.A02;
                j = euk.A00;
                z4 = euk.A01;
                z3 = true;
            } else if (eDz instanceof EDr) {
                EDr eDr = (EDr) eDz;
                str = eDr.A00;
                r309 = f5z.A01;
                Euk euk2 = (Euk) r309.A00.get(str);
                if (euk2 == null) {
                    euk2 = new Euk(0L, false, false, false);
                }
                r324 = f5z.A00;
                z = f5z.A02;
                z2 = euk2.A02;
                z3 = euk2.A03;
                j = euk2.A00;
                z4 = eDr.A01;
            }
            Euk euk3 = new Euk(j, z2, z3, z4);
            1QC r05 = new 1QC(r309);
            DKC.A1T(r05, str, euk3);
            return new F5Z(r324, r05, z);
        }
        EDz eDz2 = eDz;
        1Pr r06 = eDz2.A00;
        1QC r07 = f5z.A01;
        1QC r3092 = r07;
        boolean z6 = eDz2.A02;
        1QC r08 = new 1QC();
        Iterator it = r06.iterator();
        while (it.hasNext()) {
            F98 f98 = (F98) it.next();
            String str3 = f98.A02;
            DKC.A1T(r08, str3, new F98(str3, f98.A00, f98.A05, f98.A04, f98.A01, eDz2.A01));
            if (r07.A00.get(str3) == null) {
                Euk euk4 = new Euk(0L, false, false, false);
                if (r3092 == r07) {
                    r3092 = new 1QC(r07);
                }
                DKC.A1T(r3092, str3, euk4);
            }
        }
        f5z = new F5Z(r08, r3092, z6);
        return f5z;
    }
}

package X;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Ftb.class */
public final class Ftb implements GGi {
    public final /* synthetic */ long A00;
    public final /* synthetic */ EEl A01;

    public Ftb(EEl eEl, long j) {
        this.A01 = eEl;
        this.A00 = j;
    }

    @Override // X.GGi
    public /* bridge */ /* synthetic */ Ejp AHx(Object obj) {
        F5Z f5z = (F5Z) obj;
        if (!f5z.A02) {
            return this.A01.A00();
        }
        long j = this.A00;
        1Pr r0 = new 1Pr();
        Iterator it = f5z.A00.A00().iterator();
        while (it.hasNext()) {
            F98 f98 = (F98) it.next();
            String str = f98.A02;
            HashMap hashMap = f5z.A01.A00;
            Euk euk = (Euk) hashMap.get(str);
            if (euk.A02) {
                r0.A00(new Fu1(euk.A03 ? new EDi(str) : new EDj(f98)));
            }
            boolean A1U = DKD.A1U(((j - euk.A00) > (f98.A00 * 1000) ? 1 : ((j - euk.A00) == (f98.A00 * 1000) ? 0 : -1)));
            if (A1U != ((Euk) hashMap.get(str)).A01) {
                r0.A00(new Fu1(new EDr(str, A1U)));
            }
        }
        return new Ejp(new Fta(this, 8), new Fu5(r0));
    }
}

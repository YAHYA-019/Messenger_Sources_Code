package X;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: Ftw.class */
public final class Ftw implements GGj {
    public final 1Q7 A00;

    public Ftw(1Q7 r302) {
        this.A00 = r302;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EDl eDl = (AbstractC10314t5) obj;
        if (eDl instanceof EDl) {
            try {
                F5Z f5z = eDl.A00;
                Ezt ezt = new Ezt();
                1Pr r0 = new 1Pr();
                Iterator A00 = Fue.A00(f5z.A00);
                while (A00.hasNext()) {
                    ET7 et7 = (ET7) A00.next();
                    Ezt ezt2 = new Ezt();
                    ezt2.A05("key", (String) et7.A00);
                    ezt2.A01(((F98) et7.A01).A01(), "value");
                    r0.A00(new F9f(ezt2.A00().nodeInner));
                }
                ezt.A02(r0, "configs");
                1Pr r02 = new 1Pr();
                Iterator A002 = Fue.A00(f5z.A01);
                while (A002.hasNext()) {
                    ET7 et72 = (ET7) A002.next();
                    Ezt ezt3 = new Ezt();
                    ezt3.A05("key", (String) et72.A00);
                    Euk euk = (Euk) et72.A01;
                    Ezt ezt4 = new Ezt();
                    ezt4.A03("was_acked", Boolean.valueOf(euk.A02));
                    ezt4.A03(1BJ.A00(2148), Boolean.valueOf(euk.A03));
                    ezt4.A04(1BJ.A00(1458), Long.valueOf(euk.A00));
                    ezt4.A03(1BJ.A00(2152), Boolean.valueOf(euk.A01));
                    ezt3.A01(ezt4.A00(), "value");
                    r02.A00(new F9f(ezt3.A00().nodeInner));
                }
                ezt.A02(r02, "states");
                ezt.A03("enabled", Boolean.valueOf(f5z.A02));
                this.A00.A01("status_update", 11T.A02(ezt.A00().nodeInner));
            } catch (IOException unused) {
            }
        }
    }
}

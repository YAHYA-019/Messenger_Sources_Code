package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: Fam.class */
public final class Fam implements 1UN {
    public FHz A00;
    public final FbUserSession A01;
    public final 1De A02;
    public final 1Br A03;

    public Fam(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A01 = fbUserSession;
        this.A03 = 1Bq.A00(67196);
    }

    public void AFz() {
        List A0V;
        synchronized (this) {
            FHz fHz = this.A00;
            if (fHz != null) {
                FJh fJh = fHz.A04;
                Fwi fwi = fHz.A05;
                11T.A0F(fwi, 0);
                fJh.A00.remove(fwi);
                fHz.A07.A02.A02(11T.A04(ELX.A04));
                synchronized (fHz.A0A) {
                    Ewe ewe = fHz.A08;
                    synchronized (ewe.A00) {
                        A0V = 0QD.A0V(ewe.A01);
                    }
                    for (Ek6 ek6 : 0QD.A0V(A0V)) {
                        ek6.A00.invoke(ek6);
                        ek6.A01 = null;
                    }
                    fHz.A0B.run();
                }
                synchronized (fHz.A09) {
                    fHz.A0C.clear();
                }
            }
            this.A00 = null;
        }
    }
}

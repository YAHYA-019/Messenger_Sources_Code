package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Set;

/* loaded from: I4j.class */
public final class I4j {
    public HDa A00;
    public boolean A01;
    public final 1Br A02;
    public final Set A03;
    public final 1De A04;

    public I4j(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A02 = 7zL.A0S(fbUserSession, r303, 33088);
        this.A03 = GOn.A1J();
        this.A00 = Gpx.A00;
    }

    public static boolean A00(1Br r301) {
        return ((I4j) r301.A00.get()).A00 instanceof Gpw;
    }

    public void A01(HFc hFc) {
        11T.A0F(hFc, 0);
        this.A03.add(hFc);
    }

    public void A02(HFc hFc) {
        11T.A0F(hFc, 0);
        this.A03.remove(hFc);
    }

    public void A03(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            for (GqF gqF : this.A03) {
                if (6 - gqF.A00 == 0) {
                    GrA.A01((GrA) gqF.A01);
                }
            }
            GOp.A0O(this.A02).A04(HAp.A0L);
        }
    }
}

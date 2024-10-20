package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Hpl.class */
public final class Hpl {
    public EffectItem A00;
    public boolean A01;
    public boolean A02;
    public final 1Br A03;
    public final Set A04;
    public final 1De A05;

    public Hpl(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        this.A03 = 7zL.A0S(fbUserSession, r303, 100047);
        this.A04 = GOn.A1J();
    }

    public void A00() {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((JJn) it.next()).BpN();
        }
    }
}

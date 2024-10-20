package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: E2P.class */
public final class E2P extends C6eO {
    public final Context A00 = 7zP.A0J();

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ EeO A02(ViewGroup viewGroup) {
        return new EeO(new EBZ(this.A00));
    }

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ void A03(FbUserSession fbUserSession, 5zD r303, 5Pm r304, EeO eeO, 7Wh r306) {
        boolean z;
        ArE BEO;
        6Ay BCm = r304.BCm();
        String str = null;
        if (BCm == null || (BEO = BCm.BEO()) == null) {
            z = false;
        } else {
            2JY A0B = 1BK.A0B(BEO, 2JX.class, 213529792, 2145568369);
            if (A0B != null) {
                A0B.A0r(3556653);
            }
            2JY A0B2 = 1BK.A0B(BEO, 2JX.class, -1402760092, 98767912);
            if (A0B2 != null) {
                str = A0B2.A0i();
            }
            z = BEO.getBooleanValue(-1686479426);
        }
        eeO.A00.A0E(r303, r304, str, z);
    }
}

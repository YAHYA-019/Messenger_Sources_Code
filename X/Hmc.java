package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Hmc.class */
public final class Hmc {
    public final 1De A00;

    public Hmc(1De r302) {
        this.A00 = r302;
    }

    public void A00(FbUserSession fbUserSession, boolean z) {
        EffectItem effectItem;
        EffectItem A04;
        11T.A0F(fbUserSession, 0);
        1BY r0 = this.A00.A00;
        21Z r02 = (21Z) 1Lo.A04((Context) null, fbUserSession, r0, 115059);
        IEo iEo = (IEo) 1Lo.A04((Context) null, fbUserSession, r0, 100046);
        IDX idx = (IDX) 1Lo.A04((Context) null, fbUserSession, r0, 114847);
        r02.A00 = null;
        if (z) {
            r02.A03 = false;
            r02.A02 = null;
            Hmd hmd = r02.A01;
            if (hmd != null) {
                hmd.A00();
            }
            21Z.A00(r02);
            return;
        }
        r02.A03 = true;
        if (!iEo.A0F() || (effectItem = iEo.A02) == null || !effectItem.A09() || (A04 = idx.A04()) == null) {
            return;
        }
        iEo.A09(A04, false, true);
    }
}

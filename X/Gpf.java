package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: Gpf.class */
public final class Gpf extends HFi {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public Gpf(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        1BY r0 = r303.A00;
        this.A02 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A01 = 1Lm.A03(fbUserSession, r0, 100045);
    }

    public static final boolean A00(Gpf gpf) {
        Uri uri;
        EffectItem A04 = ((IDX) 1Br.A0B(((I8X) 1Br.A0B(gpf.A01)).A06)).A04();
        if (A04 == null || (uri = ((BaseItem) A04).A02) == null) {
            return false;
        }
        RJb rJb = ((HFi) gpf).A00;
        if (rJb != null) {
            QuickPromotionDefinition quickPromotionDefinition = rJb.A01;
            IYE iye = rJb.A00;
            if (quickPromotionDefinition.equals(iye.A03)) {
                iye.A05 = String.valueOf(uri);
                IYE.A02(iye);
            }
        }
        ((HFi) gpf).A00 = null;
        return true;
    }

    public void A01(RJb rJb) {
        ((HFi) this).A00 = rJb;
        if (A00(this)) {
            return;
        }
        I8X i8x = (I8X) 1Br.A0B(this.A01);
        ((IDX) 1Br.A0B(i8x.A06)).A06(new Ro5(this));
    }
}

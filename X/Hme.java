package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Hme.class */
public final class Hme {
    public final /* synthetic */ IEo A00;

    public Hme(IEo iEo) {
        this.A00 = iEo;
    }

    public void A00(JNp jNp, JNp jNp2) {
        IEo iEo = this.A00;
        EffectItem effectItem = iEo.A02;
        if (jNp != null && effectItem != null) {
            I7P.A01(iEo.A0A, GOp.A0S(iEo.A0N), "background_remove", "", ((BaseItem) effectItem).A09, effectItem.A0W);
        }
        if (jNp2 != null && effectItem != null) {
            I7P.A01(iEo.A0A, GOp.A0S(iEo.A0N), "background_apply", "", ((BaseItem) effectItem).A09, effectItem.A0W);
        }
        for (HG0 hg0 : iEo.A0P) {
            if (hg0 instanceof Gpo) {
                Gpo gpo = (Gpo) hg0;
                if (7 - gpo.A00 == 0) {
                    GWo gWo = (GWo) gpo.A01;
                    FbUserSession A0H = GOo.A0H(gWo);
                    Context context = gWo.A05;
                    IML A0L = AbstractC2326GOr.A0L(context, A0H);
                    if (A0L.A0D() == HCR.A01) {
                        int A05 = 7zR.A05(gWo.A01);
                        HAS has = HAS.A06;
                        gWo.A0A(A05, has);
                        Integer A0F = A0L.A0F(((I45) 1Lm.A05(context, GOo.A0H(gWo), 114931)).A02);
                        if (A0F != null) {
                            gWo.A0A(A0F.intValue(), has);
                        }
                        gWo.A01 = A0F;
                    }
                }
            }
        }
    }
}

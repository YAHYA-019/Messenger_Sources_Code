package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Gqn.class */
public final class Gqn extends GS2 {
    public final HG5 A00;
    public final 1De A01;
    public final 1Br A02;
    public final GpZ A03;

    public Gqn(1De r302) {
        super("EffectDeepLinkingVideoPreviewViewPresenter");
        this.A01 = r302;
        this.A02 = GOp.A0J(r302);
        this.A00 = new GgI(this, 1);
        this.A03 = GpZ.A00(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v3, types: [X.RIC, java.lang.Object] */
    public static final void A00(Gqn gqn) {
        Object obj;
        C00i c00i = gqn.A02.A00;
        FbUserSession A0S = GOq.A0S(c00i);
        1BY r0 = gqn.A01.A00;
        EffectItem effectItem = ((9AN) 1Lm.A07(A0S, r0, 68649)).A01;
        if (effectItem != null) {
            JDB jdb = ((GS2) gqn).A01;
            if (AbM.A1a(jdb)) {
                RrB rrB = (RrB) AbM.A0r(jdb);
                ?? obj2 = new Object();
                rrB.getClass();
                ((RIC) obj2).A00 = rrB.A00;
                ((RIC) obj2).A01 = rrB.A01;
                obj = obj2;
            } else {
                obj = new Object();
            }
            obj.A00 = effectItem;
            obj.A01 = AnonymousClass001.A1Q(GOp.A0P(GOq.A0S(c00i), r0).A03, 2);
            gqn.A0Z(new RrB(obj));
        }
    }
}

package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Gqo.class */
public final class Gqo extends GS2 {
    public final HG5 A00;
    public final 1De A01;
    public final 1Br A02;
    public final JLm A03;

    public Gqo(1De r302) {
        super("EffectCardPresenter");
        this.A01 = r302;
        this.A02 = GOp.A0J(r302);
        this.A00 = new GgI(this, 5);
        this.A03 = GpZ.A00(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r302v3, types: [java.lang.Object, X.RKq] */
    public static final void A00(Gqo gqo) {
        Object obj;
        EffectAttribution effectAttribution;
        FbUserSession A03 = 1Br.A03(gqo.A02);
        1BY r0 = gqo.A01.A00;
        EffectItem effectItem = ((Hpl) 1Lm.A07(A03, r0, 114977)).A00;
        if (effectItem != null) {
            GR1 A0P = GOp.A0P(A03, r0);
            IMJ imj = (IMJ) 1Lm.A07(A03, r0, 98491);
            JDB jdb = ((GS2) gqo).A01;
            if (AbM.A1a(jdb)) {
                RrD rrD = (RrD) AbM.A0r(jdb);
                ?? obj2 = new Object();
                rrD.getClass();
                ((RKq) obj2).A00 = rrD.A00;
                ((RKq) obj2).A01 = rrD.A01;
                ((RKq) obj2).A02 = rrD.A02;
                obj = obj2;
            } else {
                obj = new Object();
            }
            obj.A01 = effectItem;
            String str = ((BaseItem) effectItem).A09;
            if (str != null) {
                java.util.Map map = imj.A0O;
                if (map.containsKey(str)) {
                    effectAttribution = (EffectAttribution) map.get(str);
                    obj.A00 = effectAttribution;
                    obj.A02 = AnonymousClass001.A1Q(A0P.A03, 2);
                    gqo.A0Z(new RrD(obj));
                }
            }
            effectAttribution = null;
            obj.A00 = effectAttribution;
            obj.A02 = AnonymousClass001.A1Q(A0P.A03, 2);
            gqo.A0Z(new RrD(obj));
        }
    }
}

package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Ira.class */
public final class Ira implements Runnable {
    public static final String __redex_internal_original_name = "EffectAutoApplyManagerImpl$maybeAutoApplyEffect$1";
    public final /* synthetic */ I7r A00;

    public Ira(I7r i7r) {
        this.A00 = i7r;
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, X.Hff] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        I7r i7r = this.A00;
        if (i7r.A08) {
            return;
        }
        FbUserSession fbUserSession = i7r.A01;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            JNe A01 = ((I2h) 4YU.A0o(fbUserSession, i7r.A0A, 99846)).A01();
            if (A01 == null) {
                return;
            }
            HCR hcr = HCR.A0M;
            if (!I7r.A01(hcr, i7r) || !A01.BAg() || !GOp.A0p(i7r.A0C).A01.AZk(36320549852560916L)) {
                return;
            }
            IMJ imj = i7r.A03;
            if (imj == null) {
                str = "effectSharedState";
            } else {
                EffectItem effectItem = (EffectItem) 0QD.A0E(imj.A06(hcr));
                if (effectItem == null) {
                    return;
                }
                IPz iPz = i7r.A02;
                if (iPz != null) {
                    if (iPz.A0D(effectItem)) {
                        ?? obj = new Object();
                        obj.A00 = effectItem;
                        obj.A01 = 0S2.A06;
                        A01.CoK(new I3c(obj));
                    } else {
                        C2777Gnu c2777Gnu = i7r.A04;
                        if (c2777Gnu == null) {
                            str = "assetProxy";
                        } else {
                            c2777Gnu.A04(null, new IW3(A01, i7r, 4), effectItem, false);
                        }
                    }
                    i7r.A08 = true;
                    return;
                }
                str = "videoExpressionLoader";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}

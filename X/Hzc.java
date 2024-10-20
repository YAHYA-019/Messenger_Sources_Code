package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.expression.effect.interactive.metadata.InteractiveEffectMetadata;
import com.facebook.messaging.montage.model.art.EffectItem;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Hzc.class */
public final class Hzc {
    public final 1Br A00;
    public final 1Br A01;
    public final 2QY A02;
    public final java.util.Map A03;
    public final Set A04;
    public final Set A05;
    public final 1De A06;

    public Hzc(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 99981);
        this.A00 = GOn.A0g(fbUserSession, r0);
        this.A05 = GOn.A1J();
        this.A03 = AnonymousClass001.A0u();
        this.A04 = AnonymousClass001.A0v();
        this.A02 = Gys.A00(this, 1);
    }

    public static final void A00(Hzc hzc, long j) {
        InteractiveEffectMetadata interactiveEffectMetadata;
        String str;
        Iterator it = hzc.A05.iterator();
        while (it.hasNext()) {
            Hja hja = ((HPu) it.next()).A00;
            FbUserSession A03 = 1Br.A03(hja.A06);
            11T.A0F(A03, 0);
            String valueOf = String.valueOf(j);
            EffectItem A032 = ((IMJ) 4YU.A0o(A03, hja.A03, 98491)).A03(valueOf);
            if (A032 != null && (interactiveEffectMetadata = A032.A0F) != null && (str = interactiveEffectMetadata.A00) != null) {
                Set set = hja.A08;
                if (set.contains(str)) {
                    set.remove(str);
                    4YV.A11(hja.A05).execute(new Ivm(hja, valueOf));
                }
            }
        }
    }
}

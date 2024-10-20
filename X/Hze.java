package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Hze.class */
public final class Hze {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;

    public Hze(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 115503);
        this.A01 = 1Bu.A03(r0, 115504);
        this.A06 = 1Bu.A03(r0, 16428);
        this.A05 = 1Bu.A03(r0, 16430);
        this.A04 = 7zM.A0P();
        this.A03 = AbG.A0I();
    }

    public static final void A00(FbUserSession fbUserSession, Hfy hfy, Hze hze, EffectItem effectItem, String str) {
        ((Huh) 4YU.A0n(fbUserSession, hze.A00, 115493)).A00(HAu.A01, new Fjf(hfy, hze, effectItem, str, 1), effectItem, null);
    }
}

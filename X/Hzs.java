package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* loaded from: Hzs.class */
public final class Hzs {
    public IP8 A00;
    public Long A01;
    public final FbUserSession A02;
    public final HG5 A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final Gyu A07;
    public final 1De A08;

    public Hzs(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A02 = fbUserSession;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A06 = 1Bu.A03(r0, 115738);
        this.A05 = 1Lm.A03(fbUserSession, r0, 98491);
        this.A07 = Gyu.A00(this, 2);
        this.A03 = new GgI(this, 4);
    }

    public static final void A00(Hzs hzs) {
        1Br.A0C(hzs.A06);
        VideoEffectCommunicationApi A00 = HvW.A00();
        if (A00 != null) {
            A00.participantModuleReset();
        }
        IP8 ip8 = hzs.A00;
        if (ip8 != null) {
            ip8.A00 = null;
            ip8.A02.clear();
            ip8.A01 = C0ty.A00;
        }
        hzs.A00 = null;
    }
}

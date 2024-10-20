package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.reactions.gen.EmojiReactionsModel;

/* loaded from: HqV.class */
public final class HqV {
    public HVF A00;
    public boolean A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 2JM A09;
    public final 1De A0A;

    public HqV(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0A = r303;
        this.A02 = fbUserSession;
        1BY r0 = r303.A00;
        this.A05 = 1Bu.A03(r0, 68448);
        this.A07 = GOn.A0g(fbUserSession, r0);
        this.A04 = 1Bu.A03(r0, 82592);
        this.A03 = 1Bu.A03(r0, 68298);
        this.A08 = GOn.A0i(fbUserSession, r0);
        this.A06 = 1Lm.A03(fbUserSession, r0, 114858);
        this.A09 = IY8.A01(this, 25);
    }

    public final boolean A00(2JS r302) {
        11T.A0F(r302, 0);
        EmojiReactionsModel emojiReactionsModel = (EmojiReactionsModel) GOo.A0p(EmojiReactionsModel.CONVERTER, r302);
        boolean z = false;
        boolean z2 = emojiReactionsModel != null ? emojiReactionsModel.isEmojiReactionsFeatureEnabled : false;
        C00i c00i = this.A04.A00;
        I3a i3a = (I3a) c00i.get();
        Integer num = 0S2.A05;
        FbUserSession fbUserSession = this.A02;
        boolean A01 = i3a.A01(fbUserSession, num);
        1Br.A0C(this.A05);
        if (1BL.A0Q().AZk(36315125310038501L) && z2 && A01 && ((I3a) c00i.get()).A01(fbUserSession, 0S2.A1G)) {
            C00i c00i2 = this.A08.A00;
            if (GOn.A0z(c00i2).B4w().A03 && !((5VU) 1Br.A0B(this.A03)).A03(AbJ.A0j(c00i2).A05) && ((I4x) 1Br.A0B(this.A06)).A02) {
                z = true;
            }
        }
        this.A01 = z;
        return z;
    }
}

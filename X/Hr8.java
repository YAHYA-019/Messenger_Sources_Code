package X;

import com.facebook.ui.emoji.model.Emoji;

/* loaded from: Hr8.class */
public final class Hr8 {
    public final /* synthetic */ Grl A00;

    public Hr8(Grl grl) {
        this.A00 = grl;
    }

    public void A00(Emoji emoji) {
        Grl grl = this.A00;
        grl.performHapticFeedback(3);
        HiF hiF = grl.A0C;
        if (hiF != null) {
            11T.A0F(emoji, 0);
            ((2Pl) 1Br.A0B(hiF.A01)).A00(AnonymousClass001.A0Z(emoji, "Select emoji: ", AnonymousClass001.A0k()), 0S2.A15);
            ((C9hh) 4YU.A0n(1Br.A03(hiF.A02), hiF.A00, 68177)).A00(hiF.A04, "EMOJI");
            hiF.A05.Cfu(emoji.A07());
        }
        Grl.A02(grl, emoji);
    }

    public void A01(Emoji emoji) {
        Grl grl = this.A00;
        HiF hiF = grl.A0C;
        if (hiF != null) {
            11T.A0F(emoji, 0);
            6QS r0 = hiF.A03.A00.A0I.A00;
            if (r0.A0F != null && 6QS.A0X(r0)) {
                r0.A0F.A06(emoji);
            }
        }
        Grl.A02(grl, emoji);
    }
}

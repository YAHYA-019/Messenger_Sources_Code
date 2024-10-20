package X;

import com.facebook.ui.emoji.model.Emoji;
import java.util.List;

/* loaded from: Dxd.class */
public final class Dxd extends C1rj {
    public int A00;
    public 1Im A01;
    public C22a A02;
    public Integer A03;
    public List A04;
    public boolean A05;

    public Dxd() {
        super("SkinToneEmojiSelector");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, Boolean.valueOf(this.A05), Integer.valueOf(this.A00), this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        7F5 A06;
        C22a c22a = this.A02;
        List<Emoji> list = this.A04;
        boolean z = this.A05;
        int i = this.A00;
        Integer num = this.A03;
        11T.A0F(r302, 0);
        11T.A0G(c22a, 1, list);
        C1rq A00 = C1rg.A00(r302);
        A00.A1H(i);
        for (Emoji emoji : list) {
            String A0T = 0Pz.A0T("skin_tone_emoji", System.identityHashCode(emoji));
            if (z) {
                DKg dKg = new DKg(r302, new 7F5());
                7F5 r0 = dKg.A01;
                r0.A03 = true;
                dKg.A2J(A0T);
                Dug dug = new Dug(r302, new DxC());
                DxC A062 = Dug.A06(emoji, dug, num, c22a);
                Dug.A07(dug);
                dKg.A2X(A062);
                r0.A02 = 1LI.A0C(r302, Dxd.class, "SkinToneEmojiSelector", new Object[]{emoji}, 1109563125);
                dKg.A2T(1LI.A0C(r302, Dxd.class, "SkinToneEmojiSelector", new Object[]{emoji}, -230625247));
                A06 = dKg.A2W();
            } else {
                Dug dug2 = new Dug(r302, new DxC());
                dug2.A2T(1LI.A0C(r302, Dxd.class, "SkinToneEmojiSelector", new Object[]{emoji}, -230625247));
                A06 = Dug.A06(emoji, dug2, num, c22a);
                dug2.A2J(A0T);
                Dug.A07(dug2);
            }
            A00.A2f(A06);
        }
        return A00.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r308;
        7BP r313;
        7Bd r3132;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == -230625247) {
            1Iw r0 = r302.A00.A00;
            Emoji emoji = (Emoji) r302.A03[0];
            1BK.A1M(r0, emoji);
            1LI r02 = r0.A02;
            if (r02 == null) {
                return null;
            }
            r308 = ((Dxd) r02).A01;
            if (r308 == null) {
                return null;
            }
            r313 = new 7BP(emoji);
        } else {
            if (i != 1109563125) {
                return null;
            }
            1Iv r03 = r302.A00;
            1Is r04 = r03.A01;
            1Iw r05 = r03.A00;
            Emoji emoji2 = (Emoji) r302.A03[0];
            Integer num = ((EgH) obj).A00;
            2KY r06 = ((Dxd) r04).A02;
            boolean A1X = 1BL.A1X(r05, r06);
            1BK.A1J(emoji2, 2, num);
            1LI r07 = r05.A02;
            if (r07 == null) {
                return null;
            }
            r308 = ((Dxd) r07).A01;
            if (r308 == null) {
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                r3132 = new 7BX(r06.AjP(emoji2, 6qG.A00), emoji2);
            } else if (intValue == A1X) {
                r3132 = new 7BN(emoji2);
            } else {
                if (intValue != 2) {
                    return null;
                }
                r3132 = new 7Bd(emoji2);
            }
            r313 = (6Sh) r3132;
        }
        7zR.A1E(r308, r313);
        return null;
    }
}

package X;

import com.facebook.ui.emoji.model.Emoji;

/* loaded from: Dxc.class */
public final class Dxc extends C1rj {
    public 1Im A00;
    public C22a A01;
    public Emoji A02;
    public Integer A03;
    public boolean A04;

    public Dxc() {
        super("HotLikeAwareEmojiComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A01, Boolean.valueOf(this.A04)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Emoji emoji = this.A02;
        C22a c22a = this.A01;
        boolean z = this.A04;
        Integer num = this.A03;
        11T.A0F(r302, 0);
        11T.A0G(emoji, 1, c22a);
        if (!z) {
            Dug dug = new Dug(r302, new DxC());
            DxC A06 = Dug.A06(emoji, dug, num, c22a);
            7zN.A1D(dug, r302, Dxc.class, "HotLikeAwareEmojiComponent", -230625247);
            Dug.A07(dug);
            return A06;
        }
        DKg dKg = new DKg(r302, new 7F5());
        Dug dug2 = new Dug(r302, new DxC());
        DxC A062 = Dug.A06(emoji, dug2, num, c22a);
        Dug.A07(dug2);
        dKg.A2X(A062);
        7zN.A1D(dKg, r302, Dxc.class, "HotLikeAwareEmojiComponent", -230625247);
        1Im A09 = 1LI.A09(r302, Dxc.class, "HotLikeAwareEmojiComponent", 1109563125);
        7F5 r0 = dKg.A01;
        r0.A02 = A09;
        r0.A03 = true;
        return dKg.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r312;
        7BP r313;
        7Bd r3132;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == -230625247) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            1Iw r03 = r0.A00;
            Emoji emoji = ((Dxc) r02).A02;
            11T.A0H(r03, emoji);
            1LI r04 = r03.A02;
            if (r04 == null) {
                return null;
            }
            r312 = ((Dxc) r04).A00;
            if (r312 == null) {
                return null;
            }
            r313 = new 7BP(emoji);
        } else {
            if (i != 1109563125) {
                return null;
            }
            1Iv r05 = r302.A00;
            1Is r06 = r05.A01;
            1Iw r07 = r05.A00;
            Integer num = ((EgH) obj).A00;
            Dxc dxc = (Dxc) r06;
            Emoji emoji2 = dxc.A02;
            2KY r08 = dxc.A01;
            boolean A1X = 1BL.A1X(r07, emoji2);
            1BK.A1J(r08, 2, num);
            1LI r09 = r07.A02;
            if (r09 == null) {
                return null;
            }
            r312 = ((Dxc) r09).A00;
            if (r312 == null) {
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                r3132 = new 7BX(r08.AjP(emoji2, 6qG.A00), emoji2);
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
        7zR.A1E(r312, r313);
        return null;
    }
}

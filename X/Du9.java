package X;

import java.util.BitSet;

/* loaded from: Du9.class */
public final class Du9 extends C1rs {
    public 1Iw A00;
    public Dxd A01;
    public final BitSet A02;
    public final String[] A03;

    public Du9(1Iw r302, Dxd dxd) {
        super(dxd, r302, 0, 0);
        this.A03 = new String[]{"emojiUtil", "isHotLikeEnabled", "skinToneEmojiSelectorBackgroundColor", "skinTones"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = dxd;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

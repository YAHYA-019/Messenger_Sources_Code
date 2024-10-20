package X;

import java.util.BitSet;

/* loaded from: Du8.class */
public final class Du8 extends C1rs {
    public 1Iw A00;
    public Dxc A01;
    public final BitSet A02;
    public final String[] A03;

    public Du8(1Iw r302, Dxc dxc) {
        super(dxc, r302, 0, 0);
        this.A03 = new String[]{"emoji", "emojiUtil", "isHotLikeEnabled"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = dxc;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

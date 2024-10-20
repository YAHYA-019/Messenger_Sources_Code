package X;

import java.util.BitSet;

/* renamed from: X.8S8, reason: invalid class name */
/* loaded from: 8S8.class */
public final class C8S8 extends C1rs {
    public 1Iw A00;
    public C8kn A01;
    public final BitSet A02;
    public final String[] A03;

    public C8S8(1Iw r302, C8kn c8kn) {
        super(c8kn, r302, 0, 0);
        this.A03 = new String[]{"colorStrategy", "emojiCircleSize", "emojiHorizontalPadding", "emojiTopPadding", "listItemVerticalPadding", "reactorNameTextSize", "reactors"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = c8kn;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }
}

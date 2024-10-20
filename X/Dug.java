package X;

import com.facebook.ui.emoji.model.Emoji;
import java.util.BitSet;

/* loaded from: Dug.class */
public final class Dug extends C1rs {
    public 1Iw A00;
    public DxC A01;
    public final BitSet A02;
    public final String[] A03;

    public Dug(1Iw r302, DxC dxC) {
        super(dxC, r302, 0, 0);
        this.A03 = new String[]{"emojiContentDescription", "emojiDrawable"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dxC;
        this.A00 = r302;
        A18.clear();
    }

    public static DxC A06(Emoji emoji, Dug dug, Integer num, Object obj) {
        dug.A01.A02 = emoji.A07();
        BitSet bitSet = dug.A02;
        bitSet.set(0);
        dug.A01.A00 = ((2KY) obj).AjP(emoji, 6qG.A01);
        bitSet.set(1);
        DxC dxC = dug.A01;
        dxC.A01 = num;
        return dxC;
    }

    public static void A07(Dug dug) {
        C1rs.A00(dug.A02, dug.A03);
        dug.A0J();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        A07(this);
        return this.A01;
    }
}

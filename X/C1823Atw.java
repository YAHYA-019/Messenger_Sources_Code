package X;

import java.util.BitSet;

/* renamed from: X.Atw, reason: case insensitive filesystem */
/* loaded from: Atw.class */
public final class C1823Atw extends C1rs {
    public 1Iw A00;
    public C1988Ayh A01;
    public final BitSet A02;
    public final String[] A03;

    public C1823Atw(1Iw r302, C1988Ayh c1988Ayh) {
        super(c1988Ayh, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "isSuggestionOptionEnabled", "listener", "migOnUpListener", "muteSetting"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = c1988Ayh;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

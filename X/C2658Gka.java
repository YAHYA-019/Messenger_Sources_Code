package X;

import java.util.BitSet;

/* renamed from: X.Gka, reason: case insensitive filesystem */
/* loaded from: Gka.class */
public final class C2658Gka extends C1rs {
    public 1Iw A00;
    public C2698Gll A01;
    public final BitSet A02;
    public final String[] A03;

    public C2658Gka(1Iw r302, C2698Gll c2698Gll) {
        super(c2698Gll, r302, 0, 0);
        this.A03 = new String[]{"boundRichVideoPlayerEventBus", "hideCoverImageOnScrollBack", "ifpc", "playerOrigin", "richVideoPlayerParams"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = c2698Gll;
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

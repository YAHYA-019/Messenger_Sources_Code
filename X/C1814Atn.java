package X;

import java.util.BitSet;

/* renamed from: X.Atn, reason: case insensitive filesystem */
/* loaded from: Atn.class */
public final class C1814Atn extends C1rs {
    public 1Iw A00;
    public C1992Ayl A01;
    public final BitSet A02;
    public final String[] A03;

    public C1814Atn(1Iw r302, C1992Ayl c1992Ayl) {
        super(c1992Ayl, r302, 0, 0);
        this.A03 = new String[]{"backButtonClickListener", "colorScheme", "ctaButtonClickListener", "icebreakerClickListener", "platformLandingPageCTARow", "platformLandingPageRows", "scrollListener", "showTitlebar", "titlebarName"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = c1992Ayl;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A18(this, this.A02, this.A03);
        return this.A01;
    }
}

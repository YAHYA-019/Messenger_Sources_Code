package X;

import java.util.BitSet;

/* renamed from: X.87a, reason: invalid class name */
/* loaded from: 87a.class */
public final class C87a extends C1rs {
    public 1Iw A00;
    public GPt A01;
    public final BitSet A02;
    public final String[] A03;

    public C87a(1Iw r302, GPt gPt) {
        super(gPt, r302, 0, 0);
        this.A03 = new String[]{"componentGlobalKey", "measureStrategy", "playerOrigin", "pluginSelectorFactory", "richVideoPlayerParams", "videoController"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = gPt;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}

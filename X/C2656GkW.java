package X;

import java.util.BitSet;

/* renamed from: X.GkW, reason: case insensitive filesystem */
/* loaded from: GkW.class */
public final class C2656GkW extends C1rs {
    public 1Iw A00;
    public GlL A01;
    public final BitSet A02;
    public final String[] A03;

    public C2656GkW(1Iw r302, GlL glL) {
        super(glL, r302, 0, 0);
        this.A03 = new String[]{"barcodeGenerator", "defaultVideoState", "isVideoCustomSpecEnabled", "isVideoLatencyOnlySpecEnabled", "isVideoQualityOnlySpecEnabled", "isVideoSpecDisplayBarCodeEnabled", "playerOrigin", "richVideoPlayerEventBus", "richVideoPlayerParams", "videoCustomSpecFields"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = glL;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A19(this, this.A02, this.A03);
        return this.A01;
    }
}

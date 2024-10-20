package X;

import java.util.BitSet;

/* loaded from: Drm.class */
public final class Drm extends C1rs {
    public C2691Gld A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Drm(C2691Gld c2691Gld, 1Iw r303) {
        super(c2691Gld, r303, 0, 0);
        this.A03 = new String[]{"arbManifest", "autoPlay", "captionsUri", "duration", "loop", "muteOnMount", "origin", "richVideoPlayerEventSubscriber", "soundToggleEnabled", "subOrigin", "videoAspectRatio", "videoHdUri", "videoId", "videoUri"};
        BitSet A18 = 1BK.A18(14);
        this.A02 = A18;
        this.A00 = c2691Gld;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 14);
        A0J();
        return this.A00;
    }
}

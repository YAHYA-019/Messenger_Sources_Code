package X;

import java.util.BitSet;

/* renamed from: X.Gki, reason: case insensitive filesystem */
/* loaded from: Gki.class */
public final class C2666Gki extends C1rs {
    public 1Iw A00;
    public C2699Glm A01;
    public final BitSet A02;
    public final String[] A03;

    public C2666Gki(1Iw r302, C2699Glm c2699Glm) {
        super(c2699Glm, r302, 0, 0);
        this.A03 = new String[]{"audioGatingConfig", "buttonListener", "colorScheme", "composerContext", "limitReachedOnLaunch", "mediaResource", "recordControlsColorsConfig", "stateController", "updateTimerTrigger", "updateVolumeTrigger", "waveformController"};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = c2699Glm;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A1A(this, this.A02, this.A03);
        return this.A01;
    }
}

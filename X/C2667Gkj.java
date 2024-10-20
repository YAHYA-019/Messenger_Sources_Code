package X;

import java.util.BitSet;

/* renamed from: X.Gkj, reason: case insensitive filesystem */
/* loaded from: Gkj.class */
public final class C2667Gkj extends C1rs {
    public 1Iw A00;
    public C2688Gl6 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2667Gkj(1Iw r302, C2688Gl6 c2688Gl6) {
        super(c2688Gl6, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "gradientColors", "nonRecordingButtonBackgroundColor", "nonRecordingIconColor", "onClick", "recordingLimitReached", "state", "styleConfig", "themeColor", "themeIconColor"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = c2688Gl6;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A19(this, this.A02, this.A03);
        return this.A01;
    }
}

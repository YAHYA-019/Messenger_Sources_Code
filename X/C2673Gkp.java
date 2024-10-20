package X;

import java.util.BitSet;

/* renamed from: X.Gkp, reason: case insensitive filesystem */
/* loaded from: Gkp.class */
public final class C2673Gkp extends C1rs {
    public 1Iw A00;
    public C2696Gli A01;
    public final BitSet A02;
    public final String[] A03;

    public C2673Gkp(1Iw r302, C2696Gli c2696Gli) {
        super(c2696Gli, r302, 0, 0);
        this.A03 = new String[]{"audioGatingConfig", "avatarAudioMessageEnabledOnLaunch", "bottomColorFromThread", "colorScheme", "controller", "currentMediaResource", "defaultBackgroundColor", "listener", "state"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = c2696Gli;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C2696Gli A2V() {
        C1rs.A05(this.A02, this.A03, 9);
        C2696Gli c2696Gli = this.A01;
        C2ko c2ko = c2696Gli.A04;
        if (c2ko == null) {
            c2ko = 1LI.A0D(c2696Gli, this.A00, 928851057);
        }
        c2696Gli.A04 = c2ko;
        C2ko c2ko2 = c2696Gli.A03;
        if (c2ko2 == null) {
            c2ko2 = 1LI.A0D(c2696Gli, this.A00, -1299219168);
        }
        c2696Gli.A03 = c2ko2;
        C2ko c2ko3 = c2696Gli.A02;
        if (c2ko3 == null) {
            c2ko3 = 1LI.A0D(c2696Gli, this.A00, 1998489358);
        }
        c2696Gli.A02 = c2ko3;
        A0J();
        return c2696Gli;
    }
}

package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.2pz, reason: invalid class name */
/* loaded from: 2pz.class */
public final class C2pz extends C1rs {
    public 1Iw A00;
    public C2px A01;
    public final BitSet A02;
    public final String[] A03;

    public C2pz(1Iw r302, C2px c2px) {
        super(c2px, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "profileConfig", "threadTileViewData"};
        BitSet bitSet = new BitSet(3);
        this.A02 = bitSet;
        this.A01 = c2px;
        this.A00 = r302;
        bitSet.clear();
    }

    public C2px A2W() {
        C1rs.A05(this.A02, this.A03, 3);
        A0J();
        return this.A01;
    }

    public void A2X(C2q1 c2q1) {
        this.A01.A04 = c2q1;
        this.A02.set(1);
    }

    public void A2Y(MigColorScheme migColorScheme) {
        this.A01.A07 = migColorScheme;
        this.A02.set(0);
    }

    public void A2Z(C2fr c2fr) {
        this.A01.A08 = c2fr;
        this.A02.set(2);
    }
}

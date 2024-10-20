package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.31f, reason: invalid class name */
/* loaded from: 31f.class */
public final class C31f extends C1rs {
    public 1Iw A00;
    public 5Ot A01;
    public final BitSet A02;
    public final String[] A03;

    public C31f(1Iw r302, 5Ot r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"badgeBorderSizeDp", "badgeSizeDp", "badgeType", "colorScheme", "containerSizeDp"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    public 5Ot A2W() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(float f) {
        this.A01.A00 = f;
        this.A02.set(0);
    }

    public void A2Y(int i) {
        this.A01.A01 = i;
        this.A02.set(1);
    }

    public void A2Z(int i) {
        this.A01.A02 = i;
        this.A02.set(4);
    }

    public void A2a(C2q2 c2q2) {
        this.A01.A03 = c2q2;
        this.A02.set(2);
    }

    public void A2b(MigColorScheme migColorScheme) {
        this.A01.A04 = migColorScheme;
        this.A02.set(3);
    }
}

package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.2z8, reason: invalid class name */
/* loaded from: 2z8.class */
public final class C2z8 extends C1rs {
    public 1Iw A00;
    public 2Rr A01;
    public final BitSet A02;
    public final String[] A03;

    public C2z8(1Iw r302, 2Rr r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "longClickListener", "title"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    public 2Rr A2W() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(2Rt r302) {
        this.A01.A00 = r302;
        this.A02.set(1);
    }

    public void A2Y(MigColorScheme migColorScheme) {
        this.A01.A01 = migColorScheme;
        this.A02.set(0);
    }

    public void A2Z(String str) {
        this.A01.A02 = str;
        this.A02.set(2);
    }
}

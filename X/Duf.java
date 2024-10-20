package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.BitSet;

/* loaded from: Duf.class */
public final class Duf extends C1rs {
    public 1Iw A00;
    public DzD A01;
    public final BitSet A02;
    public final String[] A03;

    public Duf(1Iw r302, DzD dzD) {
        super(dzD, r302, 0, 0);
        this.A03 = new String[]{ConstantsKt.DEVICE_ID_HOST, "parseResult"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dzD;
        this.A00 = r302;
        A18.clear();
    }

    public static Duf A06(1Iw r301) {
        return new Duf(r301, new DzD());
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public DzD A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(FHf fHf) {
        this.A01.A01 = fHf;
        this.A02.set(1);
    }

    public void A2Y(GJ1 gj1) {
        this.A01.A02 = gj1;
        this.A02.set(0);
    }
}

package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.8So, reason: invalid class name */
/* loaded from: 8So.class */
public final class C8So extends C1rs {
    public 1Iw A00;
    public 8oN A01;
    public final BitSet A02;
    public final String[] A03;

    public C8So(1Iw r302, 8oN r303) {
        super(r303, r302, 0, 0);
        this.A03 = 7zL.A1b();
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 8oN A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(MigColorScheme migColorScheme) {
        this.A01.A07 = migColorScheme;
        this.A02.set(0);
    }
}

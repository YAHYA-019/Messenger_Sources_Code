package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.85s, reason: invalid class name */
/* loaded from: 85s.class */
public final class C85s extends C1rs {
    public 1Iw A00;
    public 7ME A01;
    public final BitSet A02;
    public final String[] A03;

    public C85s(1Iw r302, 7ME r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "faviconUri"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 7ME A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(MigColorScheme migColorScheme) {
        this.A01.A01 = migColorScheme;
        this.A02.set(0);
    }

    public void A2Y(String str) {
        this.A01.A02 = str;
        this.A02.set(1);
    }
}

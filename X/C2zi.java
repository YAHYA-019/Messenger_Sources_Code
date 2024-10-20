package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.2zi, reason: invalid class name */
/* loaded from: 2zi.class */
public final class C2zi extends C1rs {
    public 1Iw A00;
    public C2pa A01;
    public final BitSet A02;
    public final String[] A03;

    public C2zi(1Iw r302, C2pa c2pa) {
        super(c2pa, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "snippetText", "textColor", "textStyle"};
        BitSet bitSet = new BitSet(4);
        this.A02 = bitSet;
        this.A01 = c2pa;
        this.A00 = r302;
        bitSet.clear();
    }

    public C2pa A2W() {
        C1rs.A05(this.A02, this.A03, 4);
        A0J();
        return this.A01;
    }

    public void A2X(C1p8 c1p8) {
        this.A01.A01 = c1p8;
        this.A02.set(2);
    }

    public void A2Y(MigColorScheme migColorScheme) {
        this.A01.A02 = migColorScheme;
        this.A02.set(0);
    }

    public void A2Z(2KE r302) {
        this.A01.A03 = r302;
        this.A02.set(3);
    }

    public void A2a(CharSequence charSequence) {
        this.A01.A04 = charSequence;
        this.A02.set(1);
    }
}

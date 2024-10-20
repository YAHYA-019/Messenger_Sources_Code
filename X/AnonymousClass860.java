package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.860, reason: invalid class name */
/* loaded from: 860.class */
public final class AnonymousClass860 extends C1rs {
    public 1Iw A00;
    public C85z A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass860(1Iw r302, C85z c85z) {
        super(c85z, r302, 0, 0);
        this.A03 = 7zP.A1b();
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c85z;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C85z A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(MigColorScheme migColorScheme) {
        this.A01.A02 = migColorScheme;
        this.A02.set(0);
    }

    public void A2Y(CharSequence charSequence) {
        this.A01.A03 = charSequence;
        this.A02.set(1);
    }
}

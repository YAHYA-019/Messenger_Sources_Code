package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.85r, reason: invalid class name */
/* loaded from: 85r.class */
public final class C85r extends C1rs {
    public 1Iw A00;
    public 7LG A01;
    public final BitSet A02;
    public final String[] A03;

    public C85r(1Iw r302, 7LG r303) {
        super(r303, r302, 0, 0);
        this.A03 = 7zL.A1b();
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2S(CharSequence charSequence) {
        A2a(charSequence);
        return this;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 7LG A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(1LI r302) {
        this.A01.A09 = 7zQ.A0T(r302);
    }

    public void A2Y(1LI r302) {
        this.A01.A0A = 7zQ.A0T(r302);
    }

    public void A2Z(MigColorScheme migColorScheme) {
        this.A01.A0F = migColorScheme;
        this.A02.set(0);
    }

    public void A2a(CharSequence charSequence) {
        super.A2S(charSequence);
        this.A01.A0L = charSequence;
    }

    public void A2b(CharSequence charSequence) {
        this.A01.A0N = charSequence;
    }

    public void A2c(CharSequence charSequence) {
        this.A01.A0O = charSequence;
    }
}

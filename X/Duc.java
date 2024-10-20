package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Duc.class */
public final class Duc extends C1rs {
    public 1Iw A00;
    public Dyp A01;
    public final BitSet A02;
    public final String[] A03;

    public Duc(1Iw r302, Dyp dyp) {
        super(dyp, r302, 0, 0);
        this.A03 = new String[]{"checked", "colorScheme"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dyp;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2S(CharSequence charSequence) {
        super.A2S(charSequence);
        this.A01.A03 = charSequence;
        return this;
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2U(boolean z) {
        A2Z(z);
        return this;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public Dyp A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(MigColorScheme migColorScheme) {
        this.A01.A02 = migColorScheme;
        this.A02.set(1);
    }

    public void A2Y(boolean z) {
        this.A01.A04 = z;
        this.A02.set(0);
    }

    public void A2Z(boolean z) {
        super.A2U(z);
        this.A01.A05 = z;
    }
}

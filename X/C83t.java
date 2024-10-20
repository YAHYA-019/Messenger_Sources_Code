package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.83t, reason: invalid class name */
/* loaded from: 83t.class */
public final class C83t extends C1rs {
    public 1Iw A00;
    public C5z0 A01;
    public final BitSet A02;
    public final String[] A03;

    public C83t(1Iw r302, C5z0 c5z0) {
        super(c5z0, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "size", "tintColor"};
        BitSet bitSet = new BitSet(3);
        this.A02 = bitSet;
        this.A01 = c5z0;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2S(CharSequence charSequence) {
        A2b(charSequence);
        return this;
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2U(boolean z) {
        A2c(z);
        return this;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C5z0 A2V() {
        C1rs.A05(this.A02, this.A03, 3);
        A0J();
        return this.A01;
    }

    public void A2X(float f) {
        this.A01.A00 = super.A02.A02(f);
        this.A02.set(1);
    }

    public void A2Y(int i) {
        this.A01.A02 = super.A02.A0B(i);
    }

    public void A2Z(int i) {
        this.A01.A01 = i;
        this.A02.set(2);
    }

    public void A2a(MigColorScheme migColorScheme) {
        this.A01.A05 = migColorScheme;
        this.A02.set(0);
    }

    public void A2b(CharSequence charSequence) {
        super.A2S(charSequence);
        this.A01.A06 = charSequence;
    }

    public void A2c(boolean z) {
        super.A2U(z);
        this.A01.A08 = z;
    }
}

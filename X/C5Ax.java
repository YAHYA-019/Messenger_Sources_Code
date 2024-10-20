package X;

import android.graphics.drawable.Drawable;
import java.util.BitSet;

/* renamed from: X.5Ax, reason: invalid class name */
/* loaded from: 5Ax.class */
public final class C5Ax extends C1rs {
    public 1Iw A00;
    public 5Av A01;
    public final BitSet A02;
    public final String[] A03;

    public C5Ax(1Iw r302, 5Av r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"backgroundProp", "text", "textColor"};
        BitSet bitSet = new BitSet(3);
        this.A02 = bitSet;
        this.A01 = r303;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2U(boolean z) {
        A2j(z);
        return this;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 5Av A2V() {
        C1rs.A05(this.A02, this.A03, 3);
        A0J();
        return this.A01;
    }

    public void A2X() {
        this.A01.A03 = super.A02.A06(2132279314);
    }

    public void A2Y() {
        this.A01.A08 = super.A02.A02(20.0f);
    }

    public void A2Z(float f) {
        this.A01.A02 = super.A02.A02(f);
    }

    public void A2a(float f) {
        this.A01.A03 = super.A02.A02(f);
    }

    public void A2b(float f) {
        this.A01.A04 = super.A02.A02(f);
    }

    public void A2c(int i) {
        this.A01.A0B = super.A02.A00.getDrawable(i);
        this.A02.set(0);
    }

    public void A2d(int i) {
        this.A01.A02 = super.A02.A06(i);
    }

    public void A2e(int i) {
        this.A01.A09 = i;
        this.A02.set(2);
    }

    public void A2f(Drawable drawable) {
        this.A01.A0B = drawable;
        this.A02.set(0);
    }

    public void A2g(2KV r302) {
        this.A01.A0I = r302;
    }

    public void A2h(2KQ r302) {
        this.A01.A0K = r302;
    }

    public void A2i(CharSequence charSequence) {
        this.A01.A0M = charSequence;
        this.A02.set(1);
    }

    public void A2j(boolean z) {
        super.A2U(z);
        this.A01.A0P = z;
    }

    public void A2k(boolean z) {
        this.A01.A0Q = z;
    }
}

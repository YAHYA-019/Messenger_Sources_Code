package X;

import java.util.BitSet;

/* loaded from: Dud.class */
public final class Dud extends C1rs {
    public 1Iw A00;
    public Dzc A01;
    public final BitSet A02;
    public final String[] A03;

    public Dud(1Iw r302, Dzc dzc) {
        super(dzc, r302, 0, 0);
        this.A03 = new String[]{"childComponent"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = dzc;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public Dzc A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X() {
        this.A01.A09 = true;
    }

    public void A2Y(float f) {
        this.A01.A00 = super.A02.A02(f);
    }

    public void A2Z(int i) {
        this.A01.A00 = i;
    }

    public void A2a(int i) {
        this.A01.A01 = i;
    }

    public void A2b(C1rs c1rs) {
        this.A01.A03 = c1rs.A2V();
        this.A02.set(0);
    }

    public void A2c(1LI r302) {
        this.A01.A03 = 7zQ.A0T(r302);
        this.A02.set(0);
    }

    public void A2d(GEy gEy) {
        this.A01.A04 = gEy;
    }

    public void A2e(boolean z) {
        this.A01.A05 = z;
    }

    public void A2f(boolean z) {
        this.A01.A07 = z;
    }

    public void A2g(boolean z) {
        this.A01.A08 = z;
    }

    public void A2h(boolean z) {
        this.A01.A0A = z;
    }
}

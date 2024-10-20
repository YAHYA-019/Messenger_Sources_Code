package X;

import java.util.BitSet;

/* renamed from: X.856, reason: invalid class name */
/* loaded from: 856.class */
public final class AnonymousClass856 extends C1rs {
    public 1Iw A00;
    public AnonymousClass643 A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass856(1Iw r302, AnonymousClass643 anonymousClass643) {
        super(anonymousClass643, r302, 0, 0);
        this.A03 = new String[]{"content", "item", "listListener"};
        BitSet bitSet = new BitSet(3);
        this.A02 = bitSet;
        this.A01 = anonymousClass643;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public AnonymousClass643 A2V() {
        C1rs.A05(this.A02, this.A03, 3);
        A0J();
        return this.A01;
    }

    public void A2X(1LI r302) {
        this.A01.A01 = r302 == null ? null : r302.A0l();
        this.A02.set(0);
    }

    public void A2Y(C62r c62r) {
        this.A01.A02 = c62r;
        this.A02.set(2);
    }

    public void A2Z(AnonymousClass622 anonymousClass622) {
        this.A01.A04 = anonymousClass622;
        this.A02.set(1);
    }
}

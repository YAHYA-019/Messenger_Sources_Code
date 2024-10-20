package X;

import java.util.BitSet;

/* renamed from: X.890, reason: invalid class name */
/* loaded from: 890.class */
public final class AnonymousClass890 extends C1rs {
    public 1Iw A00;
    public C7Zz A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass890(1Iw r302, C7Zz c7Zz) {
        super(c7Zz, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "item", "theme"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c7Zz;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C7Zz A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

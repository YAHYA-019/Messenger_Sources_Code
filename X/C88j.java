package X;

import java.util.BitSet;

/* renamed from: X.88j, reason: invalid class name */
/* loaded from: 88j.class */
public final class C88j extends C1rs {
    public 1Iw A00;
    public C88i A01;
    public final BitSet A02;
    public final String[] A03;

    public C88j(1Iw r302, C88i c88i) {
        super(c88i, r302, 0, 0);
        this.A03 = new String[]{"item", "theme"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c88i;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C88i A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

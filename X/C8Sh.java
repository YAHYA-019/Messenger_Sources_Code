package X;

import java.util.BitSet;

/* renamed from: X.8Sh, reason: invalid class name */
/* loaded from: 8Sh.class */
public final class C8Sh extends C1rs {
    public 1Iw A00;
    public C8mz A01;
    public final BitSet A02;
    public final String[] A03;

    public C8Sh(1Iw r302, C8mz c8mz) {
        super(c8mz, r302, 0, 0);
        this.A03 = new String[]{"callerContext", "photoUri"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c8mz;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C8mz A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

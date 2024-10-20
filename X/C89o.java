package X;

import java.util.BitSet;

/* renamed from: X.89o, reason: invalid class name */
/* loaded from: 89o.class */
public final class C89o extends C1rs {
    public 1Iw A00;
    public C89n A01;
    public final BitSet A02;
    public final String[] A03;

    public C89o(1Iw r302, C89n c89n) {
        super(c89n, r302, 0, 0);
        this.A03 = new String[]{"capabilities", "theme", "viewModel"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c89n;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C89n A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

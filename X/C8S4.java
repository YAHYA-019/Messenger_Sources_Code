package X;

import java.util.BitSet;

/* renamed from: X.8S4, reason: invalid class name */
/* loaded from: 8S4.class */
public final class C8S4 extends C1rs {
    public 1Iw A00;
    public C8l1 A01;
    public final BitSet A02;
    public final String[] A03;

    public C8S4(1Iw r302, C8l1 c8l1) {
        super(c8l1, r302, 0, 0);
        this.A03 = new String[]{"colorRes", "isAuthorViewer", "renderedMessage", "text"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c8l1;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

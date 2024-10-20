package X;

import java.util.BitSet;

/* renamed from: X.853, reason: invalid class name */
/* loaded from: 853.class */
public final class AnonymousClass853 extends C1rs {
    public 1Iw A00;
    public C6kR A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass853(1Iw r302, C6kR c6kR) {
        super(c6kR, r302, 0, 0);
        this.A03 = new String[]{"dividerItem", "messageListClickOutsideListener", "threadViewTheme"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c6kR;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

package X;

import java.util.BitSet;

/* renamed from: X.Auf, reason: case insensitive filesystem */
/* loaded from: Auf.class */
public final class C1842Auf extends C1rs {
    public 1Iw A00;
    public C2035Azw A01;
    public final BitSet A02;
    public final String[] A03;

    public C1842Auf(1Iw r302, C2035Azw c2035Azw) {
        super(c2035Azw, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "listener", "scrollController", "selectedUsers"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c2035Azw;
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
package X;

import java.util.BitSet;

/* renamed from: X.Aui, reason: case insensitive filesystem */
/* loaded from: Aui.class */
public final class C1845Aui extends C1rs {
    public 1Iw A00;
    public B0j A01;
    public final BitSet A02;
    public final String[] A03;

    public C1845Aui(1Iw r302, B0j b0j) {
        super(b0j, r302, 0, 0);
        this.A03 = new String[]{"initialSearchText", "listener"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = b0j;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

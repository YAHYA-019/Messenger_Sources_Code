package X;

import java.util.BitSet;

/* renamed from: X.Au1, reason: case insensitive filesystem */
/* loaded from: Au1.class */
public final class C1828Au1 extends C1rs {
    public 1Iw A00;
    public Az3 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1828Au1(1Iw r302, Az3 az3) {
        super(az3, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "recyclerEventsController"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = az3;
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

package X;

import java.util.BitSet;

/* renamed from: X.8Sf, reason: invalid class name */
/* loaded from: 8Sf.class */
public final class C8Sf extends C1rs {
    public 1Iw A00;
    public 8nU A01;
    public final BitSet A02;
    public final String[] A03;

    public C8Sf(1Iw r302, 8nU r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"appName", "delegate", "layout"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2W(1LI r302) {
        this.A01.A02 = 7zQ.A0T(r302);
        this.A02.set(1);
    }
}
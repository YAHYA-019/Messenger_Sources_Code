package X;

import java.util.BitSet;

/* renamed from: X.8R7, reason: invalid class name */
/* loaded from: 8R7.class */
public final class C8R7 extends C1rs {
    public 1Iw A00;
    public 8nL A01;
    public final BitSet A02;
    public final String[] A03;

    public C8R7(1Iw r302, 8nL r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"backgroundMode", "colorScheme", "primaryButtonIsLoading"};
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
}

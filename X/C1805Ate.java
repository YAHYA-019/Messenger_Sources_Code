package X;

import java.util.BitSet;

/* renamed from: X.Ate, reason: case insensitive filesystem */
/* loaded from: Ate.class */
public final class C1805Ate extends C1rs {
    public 1Iw A00;
    public AzV A01;
    public final BitSet A02;
    public final String[] A03;

    public C1805Ate(1Iw r302, AzV azV) {
        super(azV, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "loginStyle", "stateContainer"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = azV;
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

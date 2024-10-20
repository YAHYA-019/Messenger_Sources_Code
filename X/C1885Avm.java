package X;

import java.util.BitSet;

/* renamed from: X.Avm, reason: case insensitive filesystem */
/* loaded from: Avm.class */
public final class C1885Avm extends C1rs {
    public 1Iw A00;
    public AzY A01;
    public final BitSet A02;
    public final String[] A03;

    public C1885Avm(1Iw r302, AzY azY) {
        super(azY, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "menuButton", "migOnUpListener", "renderingConfiguration", "rows"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = azY;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}

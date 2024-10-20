package X;

import java.util.BitSet;

/* renamed from: X.Auh, reason: case insensitive filesystem */
/* loaded from: Auh.class */
public final class C1844Auh extends C1rs {
    public 1Iw A00;
    public B0F A01;
    public final BitSet A02;
    public final String[] A03;

    public C1844Auh(1Iw r302, B0F b0f) {
        super(b0f, r302, 0, 0);
        this.A03 = new String[]{"isTincanMode", "listener", "showTincan", "titleText"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = b0f;
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

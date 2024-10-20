package X;

import java.util.BitSet;

/* renamed from: X.Gkg, reason: case insensitive filesystem */
/* loaded from: Gkg.class */
public final class C2664Gkg extends C1rs {
    public 1Iw A00;
    public GlA A01;
    public final BitSet A02;
    public final String[] A03;

    public C2664Gkg(1Iw r302, GlA glA) {
        super(glA, r302, 0, 0);
        this.A03 = new String[]{"actionClickListener", "actionType", "colorScheme", "iconColor"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = glA;
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

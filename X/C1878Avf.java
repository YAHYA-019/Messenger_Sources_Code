package X;

import java.util.BitSet;

/* renamed from: X.Avf, reason: case insensitive filesystem */
/* loaded from: Avf.class */
public final class C1878Avf extends C1rs {
    public 1Iw A00;
    public C2033Azu A01;
    public final BitSet A02;
    public final String[] A03;

    public C1878Avf(1Iw r302, C2033Azu c2033Azu) {
        super(c2033Azu, r302, 0, 0);
        this.A03 = new String[]{"groupsEnvironment", "headerItem"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c2033Azu;
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

package X;

import java.util.BitSet;

/* renamed from: X.Ata, reason: case insensitive filesystem */
/* loaded from: Ata.class */
public final class C1801Ata extends C1rs {
    public 1Iw A00;
    public B14 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1801Ata(1Iw r302, B14 b14) {
        super(b14, r302, 0, 0);
        this.A03 = new String[]{"loginStyle", "model"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = b14;
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
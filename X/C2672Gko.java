package X;

import java.util.BitSet;

/* renamed from: X.Gko, reason: case insensitive filesystem */
/* loaded from: Gko.class */
public final class C2672Gko extends C1rs {
    public 1Iw A00;
    public GlZ A01;
    public final BitSet A02;
    public final String[] A03;

    public C2672Gko(1Iw r302, GlZ glZ) {
        super(glZ, r302, 0, 0);
        this.A03 = new String[]{"colorSchemeLayout", "mdsBoltTheme"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = glZ;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public GlZ A2V() {
        C1rs.A00(this.A02, this.A03);
        GlZ glZ = this.A01;
        C2ko c2ko = glZ.A01;
        if (c2ko == null) {
            c2ko = 1LI.A0D(glZ, this.A00, 2081625866);
        }
        glZ.A01 = c2ko;
        C2ko c2ko2 = glZ.A03;
        if (c2ko2 == null) {
            c2ko2 = 1LI.A0D(glZ, this.A00, 635550667);
        }
        glZ.A03 = c2ko2;
        C2ko c2ko3 = glZ.A02;
        if (c2ko3 == null) {
            c2ko3 = 1LI.A0D(glZ, this.A00, -338849146);
        }
        glZ.A02 = c2ko3;
        A0J();
        return glZ;
    }
}

package X;

import java.util.BitSet;

/* renamed from: X.8Se, reason: invalid class name */
/* loaded from: 8Se.class */
public final class C8Se extends C1rs {
    public 1Iw A00;
    public 8oS A01;
    public final BitSet A02;
    public final String[] A03;

    public C8Se(1Iw r302, 8oS r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"albumCursorParams", "albumSelectionProxy", "buttonContainerHandle", "collapseDelegate", "defaultCursorParams", "eligibilityDecider", "galleryService", "galleryServiceUpdateProxy", "photoSelectionChangedProxy", "tintColor"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 8oS A2V() {
        C1rs.A05(this.A02, this.A03, 10);
        8oS r0 = this.A01;
        C2ko c2ko = r0.A0A;
        if (c2ko == null) {
            c2ko = 1LI.A0D(r0, this.A00, 1229656774);
        }
        r0.A0A = c2ko;
        C2ko c2ko2 = r0.A09;
        if (c2ko2 == null) {
            c2ko2 = 1LI.A0D(r0, this.A00, 80407307);
        }
        r0.A09 = c2ko2;
        C2ko c2ko3 = r0.A07;
        if (c2ko3 == null) {
            c2ko3 = 1LI.A0D(r0, this.A00, 1261848766);
        }
        r0.A07 = c2ko3;
        C2ko c2ko4 = r0.A08;
        if (c2ko4 == null) {
            c2ko4 = 1LI.A0D(r0, this.A00, -92595102);
        }
        r0.A08 = c2ko4;
        C2ko c2ko5 = r0.A0B;
        if (c2ko5 == null) {
            c2ko5 = 1LI.A0D(r0, this.A00, 1788872286);
        }
        r0.A0B = c2ko5;
        A0J();
        return r0;
    }
}

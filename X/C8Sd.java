package X;

import java.util.BitSet;

/* renamed from: X.8Sd, reason: invalid class name */
/* loaded from: 8Sd.class */
public final class C8Sd extends C1rs {
    public 1Iw A00;
    public C8ne A01;
    public final BitSet A02;
    public final String[] A03;

    public C8Sd(1Iw r302, C8ne c8ne) {
        super(c8ne, r302, 0, 0);
        this.A03 = new String[]{"animateHdButton", "animationMaxCount", "collapseDelegate", "discoveryBundleEnabled", "externalMediaFolderFactory", "hdButtonInitialState", "hdToggleSelectionProxy", "hideAlbumListProxy", "onGooglePhotosButtonClicked", "onHdButtonClicked", "onViewOnceButtonClicked", "showAlbumListProxy", "showAlbumToggle", "showGooglePhotosButton", "showHdMediaToggleInCollapsedState", "tintColor", "viewOncePrototypeEnabled", "viewOnceToggleSelectionProxy"};
        BitSet A18 = 1BK.A18(18);
        this.A02 = A18;
        this.A01 = c8ne;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C8ne A2V() {
        C1rs.A05(this.A02, this.A03, 18);
        C8ne c8ne = this.A01;
        C2ko c2ko = c8ne.A09;
        if (c2ko == null) {
            c2ko = 1LI.A0D(c8ne, this.A00, 2027410760);
        }
        c8ne.A09 = c2ko;
        C2ko c2ko2 = c8ne.A07;
        if (c2ko2 == null) {
            c2ko2 = 1LI.A0D(c8ne, this.A00, 734181858);
        }
        c8ne.A07 = c2ko2;
        C2ko c2ko3 = c8ne.A08;
        if (c2ko3 == null) {
            c2ko3 = 1LI.A0D(c8ne, this.A00, -1596505398);
        }
        c8ne.A08 = c2ko3;
        C2ko c2ko4 = c8ne.A0A;
        if (c2ko4 == null) {
            c2ko4 = 1LI.A0D(c8ne, this.A00, 2042417689);
        }
        c8ne.A0A = c2ko4;
        C2ko c2ko5 = c8ne.A06;
        if (c2ko5 == null) {
            c2ko5 = 1LI.A0D(c8ne, this.A00, 1474100937);
        }
        c8ne.A06 = c2ko5;
        A0J();
        return c8ne;
    }
}

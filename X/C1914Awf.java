package X;

import android.net.Uri;
import java.util.BitSet;

/* renamed from: X.Awf, reason: case insensitive filesystem */
/* loaded from: Awf.class */
public final class C1914Awf extends C1rs {
    public 1Iw A00;
    public DzT A01;
    public final BitSet A02;
    public final String[] A03;

    public C1914Awf(1Iw r302, DzT dzT, int i) {
        super(dzT, r302, 0, i);
        this.A03 = new String[]{"threadTileViewData"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = dzT;
        this.A00 = r302;
        A18.clear();
    }

    public static C1914Awf A06(Uri uri, 1Iw r302, 2fZ r303) {
        C1914Awf c1914Awf = new C1914Awf(r302, new DzT(), 2132607576);
        int i = 2RK.A04.resId;
        c1914Awf.A01.A01 = ((C1rs) c1914Awf).A02.A06(i);
        c1914Awf.A2X(r303.A0B(uri, C2fd.A0T));
        return c1914Awf;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public DzT A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(C2fr c2fr) {
        this.A01.A02 = c2fr;
        this.A02.set(0);
    }
}

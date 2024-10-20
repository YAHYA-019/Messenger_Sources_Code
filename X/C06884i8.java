package X;

import android.net.Uri;

/* renamed from: X.4i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4i8.class */
public final class C06884i8 {
    public final C06894i9 A00 = (C06894i9) 1Bi.A03(49211);

    public int A00(C2fr c2fr) {
        if (c2fr == null) {
            return 0;
        }
        if (c2fr.BFg() != C2fd.A0c) {
            return c2fr.BFz();
        }
        C06894i9 c06894i9 = this.A00;
        int BFz = c2fr.BFz();
        if (BFz == 0) {
            BFz = c06894i9.A00();
        }
        return 0AT.A01(BFz, 0.73f);
    }

    public boolean A01(2Dp r302, C2fd c2fd) {
        if (r302 != null) {
            if (c2fd == C2fd.A0c) {
                return false;
            }
            Uri uri = r302.A05;
            Uri uri2 = 0CO.A00;
            if (!"res".equals(uri == null ? null : uri.getScheme())) {
                return false;
            }
        }
        return true;
    }
}

package X;

import com.facebook.messaging.montage.model.art.ArtItem;

/* renamed from: X.Gnx, reason: case insensitive filesystem */
/* loaded from: Gnx.class */
public final class C2780Gnx extends H5O {
    public void A0F(C1u2 c1u2, ArtItem artItem) {
        int A03;
        int i;
        int i2;
        11T.A0F(c1u2, 1);
        HB0 hb0 = artItem.A03;
        if (hb0 != null) {
            int ordinal = hb0.ordinal();
            if (ordinal == 1) {
                A03 = c1u2.A03(C1u3.A1i);
                i = 2132214471;
                i2 = 2131960588;
            } else if (ordinal == 3) {
                A03 = c1u2.A03(C1u3.A0m);
                i = 2132214459;
                i2 = 2131960576;
            } else if (ordinal != 0) {
                A03 = c1u2.A03(C1u3.A1B);
                i = 2132214471;
                i2 = 2131960577;
            } else {
                A03 = c1u2.A03(C1u3.A50);
                i = 2132214466;
                i2 = 2131960579;
            }
            super.A0E(A03, i, i2);
        }
    }
}

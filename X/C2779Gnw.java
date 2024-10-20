package X;

import com.facebook.messaging.montage.model.art.ArtItem;

/* renamed from: X.Gnw, reason: case insensitive filesystem */
/* loaded from: Gnw.class */
public final class C2779Gnw extends H5O {
    public void A0F(C1u2 c1u2, ArtItem artItem) {
        int A03;
        int i;
        int i2;
        11T.A0F(c1u2, 1);
        HAv hAv = artItem.A01;
        if (hAv != null) {
            int ordinal = hAv.ordinal();
            if (ordinal == 1) {
                A03 = c1u2.A03(C1u3.A0a);
                i = 2132214466;
                i2 = 2131960580;
            } else if (ordinal != 2) {
                A03 = c1u2.A03(C1u3.A54);
                i = 2132214469;
                i2 = 2131960582;
            } else {
                A03 = c1u2.A03(C1u3.A4Z);
                i = 2132214468;
                i2 = 2131960581;
            }
            super.A0E(A03, i, i2);
        }
    }
}

package X;

import android.view.ViewGroup;

/* renamed from: X.Des, reason: case insensitive filesystem */
/* loaded from: Des.class */
public final class C2139Des extends FFu {
    public final ViewGroup A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139Des(ViewGroup viewGroup, FFu fFu, Ras ras, 1LI r305) {
        super(viewGroup, fFu, ras, 0S2.A01, r305);
        11T.A0F(r305, 4);
        this.A00 = viewGroup;
    }

    public EN8 A03() {
        1LI r0 = (1LI) ((FFu) this).A03;
        String A0a = r0.A0a();
        if (A0a != null) {
            String A19 = AbK.A19(A0a);
            if (11T.A0P("FDS", 1, A19)) {
                return 11T.A0P("FDSTHEME", 1, A19) ? EN8.A02 : EN8.A04;
            }
            if (11T.A0P("FIG", 1, A19)) {
                return EN8.A05;
            }
            if (11T.A0P("GEO", 1, A19)) {
                return EN8.A06;
            }
        }
        return Qza.A00(r0.getClass(), (String) null);
    }
}

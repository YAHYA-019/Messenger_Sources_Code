package X;

import android.content.res.Resources;

/* loaded from: HyZ.class */
public final class HyZ {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public HyZ(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 85039);
        this.A01 = 1Bu.A03(r0, 49505);
    }

    public static final QHE A00(1Iw r301, HyZ hyZ, C5ww c5ww, int i, int i2) {
        Resources A0C = 4YU.A0C(r301.A0D);
        String A0t = 4YU.A0t(A0C, i);
        5OX A00 = CJh.A00(A0C.getString(i2));
        C55h c55h = (C55h) 1Br.A0B(hyZ.A01);
        11T.A0I(c55h, "null cannot be cast to non-null type com.facebook.messaging.ui.list.item.interfaces.ListItemLayoutCreator<com.facebook.messaging.ui.list.item.interfaces.ListItem>");
        return new QHE(r301, c5ww, c55h, A00, A0t);
    }
}

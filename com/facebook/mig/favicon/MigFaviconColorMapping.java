package com.facebook.mig.favicon;

import X.C1p8;

/* loaded from: MigFaviconColorMapping.class */
public enum MigFaviconColorMapping implements C1p8 {
    STATIC_WHITE(-1, -1),
    WHITE(-1, -16777216),
    BLACK(-16777216, -1),
    BLACK_50((-1) << (-1), -2130706433),
    BLACK_34(1442840576, 1476395007),
    BLACK_20(855638016, 1476395007),
    BLACK_12(520093696, 872415231),
    BLACK_6(251658240, 872415231),
    BLACK_4(167772160, 872415231),
    BLUE_GREY_75(-1081700711, -1081700711),
    BLUE_GREY_50(2139524761, 2139524761),
    RED(-50637, -46782),
    GREEN(-13513658, -12200360),
    BLUE(-16089857, -12412161),
    PURPLE(-6278145, -5683201),
    YELLOW(-19712, -19712),
    TRANSPARENT(0, 0),
    HONEY(-19712, -1332978),
    NUX_GLYPH(-4933415, -10460557);

    public final int darkColorInt;
    public final int lightColorInt;

    MigFaviconColorMapping(int i, int i2) {
        this.lightColorInt = i;
        this.darkColorInt = i2;
    }

    @Override // X.C1p8
    public int AgL() {
        return this.darkColorInt;
    }

    @Override // X.C1p8
    public int Ato() {
        return this.lightColorInt;
    }
}

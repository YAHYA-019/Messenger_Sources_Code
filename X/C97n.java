package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.97n, reason: invalid class name */
/* loaded from: 97n.class */
public enum C97n {
    DEFAULT(18, 18),
    CAROUSEL_START(18, 8),
    CAROUSEL_END(8, 18),
    CAROUSEL_MIDDLE(8, 8),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_PHOTOS_GRID(4, 4);

    public final int mLeftRadiusDip;
    public final int mRightRadiusDip;

    C97n(int i, int i2) {
        this.mLeftRadiusDip = i;
        this.mRightRadiusDip = i2;
    }

    public static C97n A00(int i, int i2) {
        return i2 == 1 ? DEFAULT : i == 0 ? CAROUSEL_START : i == i2 - 1 ? CAROUSEL_END : CAROUSEL_MIDDLE;
    }

    public static void A01(2cM r301, 1Iw r302, C97n c97n, MigColorScheme migColorScheme) {
        8O3 A002;
        if (c97n.mLeftRadiusDip == c97n.mRightRadiusDip) {
            A002 = 8nD.A00(r302);
            int BDl = migColorScheme.BDl();
            8nD r0 = A002.A01;
            r0.A01 = BDl;
            r0.A00 = 7zL.A04(A002, c97n.mLeftRadiusDip);
        } else {
            8O3 A003 = 8nD.A00(r302);
            int BDl2 = migColorScheme.BDl();
            8nD r02 = A003.A01;
            r02.A01 = BDl2;
            r02.A00 = 7zL.A04(A003, c97n.mLeftRadiusDip);
            8nD r03 = A003.A01;
            r03.A05 = true;
            r03.A03 = true;
            A003.A0c();
            A003.A0b();
            r301.A2d(A003);
            A002 = 8nD.A00(r302);
            int BDl3 = migColorScheme.BDl();
            8nD r04 = A002.A01;
            r04.A01 = BDl3;
            r04.A00 = 7zL.A04(A002, c97n.mRightRadiusDip);
            8nD r05 = A002.A01;
            r05.A04 = true;
            r05.A02 = true;
        }
        A002.A0c();
        A002.A0b();
        r301.A2d(A002);
    }
}

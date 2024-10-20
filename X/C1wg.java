package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.1wg, reason: invalid class name */
/* loaded from: 1wg.class */
public final class C1wg {
    public static 1G9 A00(C1wk c1wk, 1G9 r302) {
        11T.A0F(C1wk.A01(c1wk), 1);
        return A02(r302);
    }

    public static 1G9 A01(C1wk c1wk, 1G9 r302, int i) {
        11T.A0F(C1wk.A01(c1wk), i);
        return A02(r302);
    }

    public static final 1G9 A02(1G9 r301) {
        String str = ((1Fv) 1Bi.A03(66351)).A04().A02;
        if (!ConstantsKt.CAMERA_ID_FRONT.equals(str)) {
            r301 = 1G9.A05(r301, str);
            11T.A0D(r301);
        }
        return r301;
    }

    public static 1G9 A03(1G9 r301, Object obj) {
        11T.A0F(obj, 1);
        return A02(r301);
    }
}

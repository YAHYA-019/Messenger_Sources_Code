package X;

import java.util.List;

/* renamed from: X.2so, reason: invalid class name */
/* loaded from: 2so.class */
public abstract class C2so {
    public static final 2cL A00(C2sn c2sn) {
        List list = null;
        if (c2sn != null) {
            list = c2sn.A01;
        }
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, list, false);
    }

    public static final 2cL A01(C2sn c2sn) {
        return new 2cL((C1ro) null, C1ro.CENTER, (C1rp) null, (EnumC00743oh) null, c2sn.A01, false);
    }

    public static final 2cL A02(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0A(c2sn, c2k6, r303, null, null, null, null, false);
    }

    public static final 2cL A03(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0A(c2sn, c2k6, r303, null, C1ro.CENTER, null, null, false);
    }

    public static final 2cL A04(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        C1ro c1ro = C1ro.CENTER;
        return A0A(c2sn, c2k6, r303, c1ro, c1ro, C1rp.CENTER, null, false);
    }

    public static final 2cL A05(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0A(c2sn, c2k6, r303, null, C1ro.FLEX_START, null, null, false);
    }

    public static final 2cL A06(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0A(c2sn, c2k6, r303, null, C1ro.CENTER, C1rp.CENTER, null, false);
    }

    public static final 2cL A07(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0A(c2sn, c2k6, r303, null, null, C1rp.CENTER, null, false);
    }

    public static final 2cL A08(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro) {
        return A0A(c2sn, c2k6, r303, c1ro, null, C1rp.CENTER, null, false);
    }

    public static final 2cL A09(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro) {
        return A0A(c2sn, c2k6, r303, null, c1ro, C1rp.CENTER, null, false);
    }

    public static final 2cL A0A(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro, C1ro c1ro2, C1rp c1rp, EnumC00743oh enumC00743oh, boolean z) {
        List list = null;
        if (c2sn != null) {
            list = c2sn.A01;
        }
        2cL r0 = new 2cL(c1ro, c1ro2, c1rp, enumC00743oh, list, z);
        if (r303 != null) {
            r303.A01(r0.A0v(), c2k6.AeS());
        }
        return r0;
    }

    public static final 2cL A0B(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro, C1rp c1rp) {
        return A0A(c2sn, c2k6, r303, null, c1ro, c1rp, null, false);
    }

    public static final 2cL A0C(C2sn c2sn, C2k6 c2k6, 2lO r303, C1rp c1rp) {
        return A0A(c2sn, c2k6, r303, null, null, c1rp, null, false);
    }

    public static final 2cL A0D(C2sn c2sn, C2k6 c2k6, 2lO r303, C1rp c1rp) {
        return A0A(c2sn, c2k6, r303, null, C1ro.CENTER, c1rp, null, false);
    }

    public static final 2cL A0E(C2k6 c2k6, 2lO r302) {
        return A0A(null, c2k6, r302, null, null, null, null, false);
    }

    public static final C1rh A0F(C2sn c2sn, C2k6 c2k6) {
        return A0U(c2sn, c2k6, null, null, C1ro.CENTER, null, null, false);
    }

    public static final C1rh A0G(C2sn c2sn, C2k6 c2k6) {
        return A0U(c2sn, c2k6, null, null, null, null, null, false);
    }

    public static final C1rh A0H(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, C1ro.CENTER, C1rp.FLEX_START, null, false);
    }

    public static final C1rh A0I(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, null, null, null, false);
    }

    public static final C1rh A0J(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        C1ro c1ro = C1ro.CENTER;
        return A0U(c2sn, c2k6, r303, c1ro, c1ro, C1rp.CENTER, null, false);
    }

    public static final C1rh A0K(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        C1ro c1ro = C1ro.CENTER;
        return A0U(c2sn, c2k6, r303, c1ro, c1ro, null, null, false);
    }

    public static final C1rh A0L(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, null, C1rp.FLEX_END, null, false);
    }

    public static final C1rh A0M(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, C1ro.CENTER, C1rp.CENTER, null, false);
    }

    public static final C1rh A0N(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, null, C1rp.CENTER, null, false);
    }

    public static final C1rh A0O(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, null, C1rp.SPACE_BETWEEN, null, false);
    }

    public static final C1rh A0P(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, C1ro.CENTER, null, null, false);
    }

    public static final C1rh A0Q(C2sn c2sn, C2k6 c2k6, 2lO r303) {
        return A0U(c2sn, c2k6, r303, null, C1ro.CENTER, C1rp.SPACE_BETWEEN, null, false);
    }

    public static final C1rh A0R(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro) {
        return A0U(c2sn, c2k6, r303, c1ro, null, null, null, false);
    }

    public static final C1rh A0S(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro) {
        return A0U(c2sn, c2k6, r303, null, c1ro, null, null, false);
    }

    public static final C1rh A0T(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro, C1ro c1ro2, C1rp c1rp) {
        return A0U(c2sn, c2k6, r303, c1ro, c1ro2, c1rp, null, false);
    }

    public static final C1rh A0U(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro, C1ro c1ro2, C1rp c1rp, EnumC00743oh enumC00743oh, boolean z) {
        11T.A0F(c2k6, 0);
        List list = null;
        if (c2sn != null) {
            list = c2sn.A01;
        }
        C1rh c1rh = new C1rh(c1ro, c1ro2, c1rp, enumC00743oh, list, z);
        if (r303 != null) {
            r303.A01(c1rh.A0v(), c2k6.AeS());
        }
        return c1rh;
    }

    public static final C1rh A0V(C2sn c2sn, C2k6 c2k6, 2lO r303, C1ro c1ro, C1rp c1rp) {
        return A0U(c2sn, c2k6, r303, null, c1ro, c1rp, null, false);
    }

    public static final C1rh A0W(C2sn c2sn, C2k6 c2k6, 2lO r303, C1rp c1rp) {
        return A0U(c2sn, c2k6, r303, null, null, c1rp, null, false);
    }

    public static final C1rh A0X(C2sn c2sn, C2k6 c2k6, 2lO r303, C1rp c1rp) {
        return A0U(c2sn, c2k6, r303, null, C1ro.CENTER, c1rp, null, false);
    }

    public static final C1rh A0Y(C2k6 c2k6, 2lO r302) {
        return A0U(null, c2k6, r302, null, null, null, null, false);
    }
}

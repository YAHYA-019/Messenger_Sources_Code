package X;

/* renamed from: X.9dI, reason: invalid class name */
/* loaded from: 9dI.class */
public abstract class C9dI {
    public static final 8JP A00(8Lh r301, C1qo c1qo, C5wh c5wh) {
        String A0C;
        int i;
        11T.A0F(c5wh, 0);
        String A0D = c1qo.A0D(2131960438);
        String A0D2 = c1qo.A0D(2131960436);
        String A0D3 = c1qo.A0D(2131967363);
        String A0D4 = c1qo.A0D(2131960437);
        String A0D5 = c1qo.A0D(2131967353);
        String A0D6 = c1qo.A0D(2131960434);
        c1qo.A0D(2131960435);
        if (c5wh == C5wh.A05) {
            A0C = r301 != null ? r301.A05 : null;
        } else {
            int ordinal = c5wh.ordinal();
            if (ordinal != 7) {
                if (ordinal == 2) {
                    A0C = c1qo.A0C(2131967356);
                    A0D = c1qo.A0D(2131954908);
                    A0D2 = c1qo.A0D(2131954904);
                    A0D4 = c1qo.A0D(2131954906);
                    A0D6 = c1qo.A0D(2131954899);
                    i = 2131954900;
                } else if (ordinal == 3) {
                    A0C = c1qo.A0D(2131967359);
                    A0D = c1qo.A0D(2131954909);
                    A0D2 = c1qo.A0D(2131954905);
                    A0D4 = c1qo.A0D(2131954907);
                    A0D6 = c1qo.A0D(2131954901);
                    i = 2131954902;
                } else {
                    if (ordinal == 4) {
                        return new 8JP(c1qo.A0D(2131967361), A0D2, A0D2, A0D3, A0D4, c1qo.A0D(2131967354), A0D6);
                    }
                    if (ordinal != 6) {
                        throw AnonymousClass002.A0C(c5wh, "Unsupported moment type: ", AnonymousClass001.A0k());
                    }
                    A0C = c1qo.A0D(2131967357);
                }
                c1qo.A0D(i);
            } else {
                A0C = c1qo.A0C(2131967358);
            }
        }
        return new 8JP(A0C, A0D, A0D2, A0D3, A0D4, A0D5, A0D6);
    }

    public static final 1G2 A01(C5wh c5wh) {
        11T.A0F(c5wh, 0);
        return 1G3.A00(1NK.A1S.A0D("/"), c5wh.name());
    }
}

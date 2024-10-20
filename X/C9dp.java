package X;

/* renamed from: X.9dp, reason: invalid class name */
/* loaded from: 9dp.class */
public final class C9dp {
    public static final AaP A00(9Xd r301) {
        AaP aaP;
        C92u c92u;
        11T.A0F(r301, 0);
        5aU A00 = r301.A00();
        MrJ mrJ = MrJ.$redex_init_class;
        switch (A00.ordinal()) {
            case 1:
                aaP = A8j.A00;
                break;
            case 2:
                aaP = A8i.A00;
                break;
            case 3:
                aaP = A8g.A00;
                break;
            case 4:
                aaP = A8h.A00;
                break;
            case 5:
            default:
                return null;
            case 6:
            case 7:
            case 8:
            case 9:
                if (!(r301 instanceof C92u) || (c92u = (C92u) r301) == null) {
                    return null;
                }
                return new A8a(c92u);
        }
        return aaP;
    }
}

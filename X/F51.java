package X;

/* loaded from: F51.class */
public final class F51 {
    public final C00i A01 = AbH.A0P();
    public final C00i A00 = 1BQ.A01();

    public static AbstractC01593ro A00(F51 f51, String str) {
        C1kw A06 = 1BK.A06(f51.A01);
        if (DTu.A00 == null) {
            synchronized (DTu.class) {
                if (DTu.A00 == null) {
                    DTu.A00 = new C2J3(A06);
                }
            }
        }
        AbstractC01593ro A0A = AbJ.A0A(DTu.A00, str);
        if (!A0A.A0B()) {
            return null;
        }
        A0A.A06("pigeon_reserved_keyword_module", "tap_button");
        return A0A;
    }
}

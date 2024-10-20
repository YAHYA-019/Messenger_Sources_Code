package X;

/* loaded from: Hx6.class */
public final class Hx6 {
    public final C00i A00 = AbH.A0P();

    public static AbstractC01593ro A00(Hx6 hx6, String str) {
        C1kw A06 = 1BK.A06(hx6.A00);
        if (GYW.A00 == null) {
            synchronized (GYW.class) {
                if (GYW.A00 == null) {
                    GYW.A00 = new C2J3(A06);
                }
            }
        }
        AbstractC01593ro A0A = AbJ.A0A(GYW.A00, str);
        if (!A0A.A0B()) {
            return null;
        }
        A0A.A06("pigeon_reserved_keyword_module", "messenger_commerce");
        return A0A;
    }
}

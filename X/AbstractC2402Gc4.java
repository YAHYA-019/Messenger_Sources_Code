package X;

/* renamed from: X.Gc4, reason: case insensitive filesystem */
/* loaded from: Gc4.class */
public abstract class AbstractC2402Gc4 extends 1pK implements JGS {
    public static final String __redex_internal_original_name = "CallScreen";

    public boolean A1X() {
        GQy gQy = (GQy) this;
        if (gQy.getContext() == null) {
            return false;
        }
        GQz gQz = ((Ifq) 1Br.A0B(gQy.A0x)).A02;
        if (gQz != null) {
            return gQz.A01() || (gQy.A08 instanceof C2384Gbl);
        }
        11T.A0L("surveyHandler");
        throw 0Q8.createAndThrow();
    }
}

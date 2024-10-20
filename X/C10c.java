package X;

/* renamed from: X.10c, reason: invalid class name */
/* loaded from: 10c.class */
public abstract class C10c {
    public static final void A00(Object obj, 0BZ r302) {
        11T.A0F(r302, 0);
        if (!r302.BTY(obj)) {
            throw new ClassCastException(0Pz.A0W("Value cannot be cast to ", C0Bx.A00(((0BY) r302).A00)));
        }
        11T.A0I(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
    }
}

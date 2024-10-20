package X;

/* renamed from: X.0cl, reason: invalid class name */
/* loaded from: 0cl.class */
public abstract class C0cl {
    public static void A00(Throwable th) {
        Class cls = Error.class;
        if (!cls.isInstance(th)) {
            cls = RuntimeException.class;
            if (!cls.isInstance(th)) {
                throw AnonymousClass001.A0U(th);
            }
        }
        throw ((Throwable) cls.cast(th));
    }
}

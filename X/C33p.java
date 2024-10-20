package X;

/* renamed from: X.33p, reason: invalid class name */
/* loaded from: 33p.class */
public final class C33p extends C2J3 {
    public static C33p A00;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.33p, X.2J3] */
    public static C33p A00(C1kw c1kw) {
        if (A00 == null) {
            synchronized (C33p.class) {
                if (A00 == null) {
                    A00 = new C2J3(c1kw);
                }
            }
        }
        return A00;
    }
}

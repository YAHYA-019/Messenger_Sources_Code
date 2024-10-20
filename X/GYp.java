package X;

/* loaded from: GYp.class */
public final class GYp extends C2J3 {
    public static GYp A00;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.GYp, X.2J3] */
    public static GYp A00(C1kw c1kw) {
        if (A00 == null) {
            synchronized (GYp.class) {
                if (A00 == null) {
                    A00 = new C2J3(c1kw);
                }
            }
        }
        return A00;
    }
}

package X;

/* renamed from: X.27Z, reason: invalid class name */
/* loaded from: 27Z.class */
public final class C27Z {
    public int A00;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.27Z, java.lang.Object] */
    public static C27Z A00(25C[] r301) {
        int length = r301.length;
        if (length > 31) {
            throw 1BK.A0f("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", AnonymousClass001.A1b(AnonymousClass001.A0Y(r301[0]), length));
        }
        int i = 0;
        for (25C r0 : r301) {
            if (r0.APc()) {
                i |= r0.Ava();
            }
        }
        ?? obj = new Object();
        obj.A00 = i;
        return obj;
    }
}

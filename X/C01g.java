package X;

/* renamed from: X.01g, reason: invalid class name */
/* loaded from: 01g.class */
public abstract class C01g {
    /* JADX WARN: Type inference failed for: r304v4, types: [X.03q, java.lang.Object] */
    public static final C01i A00(C03i c03i, C00m c00m) {
        Object obj;
        11T.A0F(c00m, 1);
        int ordinal = c03i.ordinal();
        if (ordinal == 0) {
            obj = new C01h(c00m);
        } else if (ordinal != 1) {
            ?? obj2 = new Object();
            obj2.initializer = c00m;
            obj2._value = C01j.A00;
            obj = obj2;
        } else {
            obj = new C04Q(c00m);
        }
        return (C01i) obj;
    }

    public static final C01h A01(C00m c00m) {
        11T.A0F(c00m, 0);
        return new C01h(c00m);
    }
}

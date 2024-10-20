package X;

/* renamed from: X.2ae, reason: invalid class name */
/* loaded from: 2ae.class */
public abstract class C2ae {
    public static final 2Zt A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.2Zt] */
    static {
        C2af c2af;
        String property;
        boolean z = false;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
        }
        if (property != null) {
            z = Boolean.parseBoolean(property);
            if (z) {
                2Zs r0 = 2aN.A00;
                2Zt r301 = 4ZJ.A00;
                if ((r301.A01() instanceof C3l4) || !(r301 instanceof 2Zt)) {
                    r301 = C2af.A00;
                }
                c2af = r301;
                A00 = c2af;
            }
        }
        c2af = C2af.A00;
        A00 = c2af;
    }
}

package X;

/* loaded from: Lgc.class */
public final class Lgc implements MJ2 {
    public static final Lgc A00 = new Object();

    @Override // X.MJ2
    public boolean BWR(Class cls) {
        return KJb.class.isAssignableFrom(cls);
    }

    @Override // X.MJ2
    public KkZ BeD(Class cls) {
        if (!KJb.class.isAssignableFrom(cls)) {
            throw 0Pz.A05("Unsupported message type: ", cls.getName());
        }
        try {
            Class asSubclass = cls.asSubclass(KJb.class);
            KJb kJb = (KJb) KJb.defaultInstanceMap.get(asSubclass);
            if (kJb == null) {
                try {
                    JQy.A1O(asSubclass);
                    kJb = (KJb) KJb.defaultInstanceMap.get(asSubclass);
                } catch (ClassNotFoundException e) {
                    new IllegalStateException("Class initialization cannot fail.", e);
                }
                if (kJb == null) {
                    kJb = (KJb) ((KJb) LE5.A02(asSubclass)).dynamicMethod(KMJ.A02, (Object) null, (Object) null);
                    if (kJb == null) {
                        IllegalStateException illegalStateException = JQx.A0o();
                        throw illegalStateException;
                    }
                    KJb.defaultInstanceMap.put(asSubclass, kJb);
                }
            }
            return (KkZ) kJb.dynamicMethod(KMJ.A01, (Object) null, (Object) null);
        } catch (Exception e2) {
            throw 1BK.A0s(JQx.A0v(cls, "Unable to get message info for "), e2);
        }
    }
}

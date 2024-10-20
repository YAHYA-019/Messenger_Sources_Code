package X;

/* loaded from: Lg4.class */
public final class Lg4 implements MJ1 {
    public static final Lg4 A00 = new Object();

    @Override // X.MJ1
    public boolean BWR(Class cls) {
        return KDF.class.isAssignableFrom(cls);
    }

    @Override // X.MJ1
    public KkX BeC(Class cls) {
        if (!KDF.class.isAssignableFrom(cls)) {
            throw 0Pz.A05("Unsupported message type: ", cls.getName());
        }
        try {
            Class asSubclass = cls.asSubclass(KDF.class);
            KDF kdf = (KDF) KDF.defaultInstanceMap.get(asSubclass);
            if (kdf == null) {
                try {
                    JQy.A1O(asSubclass);
                    kdf = (KDF) KDF.defaultInstanceMap.get(asSubclass);
                } catch (ClassNotFoundException e) {
                    new IllegalStateException("Class initialization cannot fail.", e);
                }
                if (kdf == null) {
                    kdf = (KDF) Lg5.A0B((KDF) LDw.A01(asSubclass), 0S2.A0j);
                    if (kdf == null) {
                        IllegalStateException illegalStateException = JQx.A0o();
                        throw illegalStateException;
                    }
                    KDF.defaultInstanceMap.put(asSubclass, kdf);
                }
            }
            return (KkX) Lg5.A0B(kdf, 0S2.A0C);
        } catch (Exception e2) {
            throw 1BK.A0s(JQx.A0v(cls, "Unable to get message info for "), e2);
        }
    }
}

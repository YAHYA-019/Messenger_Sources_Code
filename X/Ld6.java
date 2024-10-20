package X;

/* loaded from: Ld6.class */
public final class Ld6 implements MIv {
    public static final Ld6 A00 = new Object();

    @Override // X.MIv
    public final MCw DCI(Class cls) {
        if (!K5Q.class.isAssignableFrom(cls)) {
            throw AnonymousClass001.A0L("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class asSubclass = cls.asSubclass(K5Q.class);
            java.util.Map map = K5Q.zzb;
            K5Q k5q = (K5Q) map.get(asSubclass);
            if (k5q == null) {
                try {
                    JQy.A1O(asSubclass);
                    k5q = (K5Q) map.get(asSubclass);
                } catch (ClassNotFoundException e) {
                    new IllegalStateException("Class initialization cannot fail.", e);
                }
                if (k5q == null) {
                    LEW.A04(asSubclass);
                    k5q = K5W.zzb;
                    if (k5q == null) {
                        IllegalStateException illegalStateException = JQx.A0o();
                        throw illegalStateException;
                    }
                    map.put(asSubclass, k5q);
                }
            }
            return (MCw) k5q.A02(3);
        } catch (Exception e2) {
            throw 1BK.A0s("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // X.MIv
    public final boolean DCT(Class cls) {
        return K5Q.class.isAssignableFrom(cls);
    }
}

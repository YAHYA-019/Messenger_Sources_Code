package X;

/* renamed from: X.68e, reason: invalid class name */
/* loaded from: 68e.class */
public abstract class C68e {
    public static Object A00(AbstractC01033pi abstractC01033pi, 24S r302) {
        Class cls = r302._class;
        C42h A1I = abstractC01033pi.A1I();
        Boolean bool = null;
        if (A1I != null) {
            int ordinal = A1I.ordinal();
            if (ordinal != 7) {
                if (ordinal != 8) {
                    if (ordinal != 9) {
                        if (ordinal != 10) {
                            if (ordinal == 11 && cls.isAssignableFrom(Boolean.class)) {
                                bool = Boolean.FALSE;
                            }
                        } else if (cls.isAssignableFrom(Boolean.class)) {
                            return Boolean.TRUE;
                        }
                    } else if (cls.isAssignableFrom(Double.class)) {
                        return Double.valueOf(abstractC01033pi.A10());
                    }
                } else if (cls.isAssignableFrom(Integer.class)) {
                    return Integer.valueOf(abstractC01033pi.A15());
                }
            } else if (cls.isAssignableFrom(String.class)) {
                return abstractC01033pi.A1Z();
            }
        }
        return bool;
    }

    public abstract KN1 A03();

    public abstract C68e A04(68U r1);

    public abstract Object A05(AbstractC01033pi abstractC01033pi, C27T c27t);

    public abstract Object A06(AbstractC01033pi abstractC01033pi, C27T c27t);

    public abstract Object A07(AbstractC01033pi abstractC01033pi, C27T c27t);

    public abstract Object A08(AbstractC01033pi abstractC01033pi, C27T c27t);
}

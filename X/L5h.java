package X;

import java.util.List;

/* loaded from: L5h.class */
public abstract class L5h {
    public static L3v A00(Lj1 lj1, L29 l29) {
        return (L3v) A02(lj1, l29);
    }

    public static Object A01(Lj1 lj1, L29 l29) {
        List list = (List) A02(lj1, l29);
        if (list != null) {
            return 0QD.A0E(list);
        }
        return null;
    }

    public static final Object A02(Lj1 lj1, L29 l29) {
        Object obj = lj1.A02.get(l29);
        if (obj == null) {
            obj = null;
        }
        return obj;
    }
}

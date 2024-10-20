package X;

import java.util.AbstractMap;

/* loaded from: Kwe.class */
public final class Kwe {
    public static Lyg A00(Object obj, Object obj2) {
        Lyg lyg = (Lyg) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!lyg.isMutable) {
                lyg = lyg.A01();
            }
            if (!lyg.isMutable) {
                throw AnonymousClass001.A0p();
            }
            if (!abstractMap.isEmpty()) {
                lyg.putAll(abstractMap);
            }
        }
        return lyg;
    }
}

package X;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: Eae.class */
public abstract class Eae {
    public static final java.util.Map A00;
    public static final java.util.Map A01;

    static {
        HashMap A0u = AnonymousClass001.A0u();
        Integer A0k = 4YU.A0k();
        A0u.put("auto", A0k);
        Integer A0i = 7zN.A0i();
        A0u.put("yes", A0i);
        A0u.put("no", 2);
        A0u.put("no_hide_descendants", 4);
        A00 = Collections.unmodifiableMap(A0u);
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put("none", A0k);
        A0u2.put("polite", A0i);
        A0u2.put("assertive", 2);
        A01 = Collections.unmodifiableMap(A0u2);
    }
}

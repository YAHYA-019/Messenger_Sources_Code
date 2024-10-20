package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4eu.class */
public abstract class AbstractC05764eu {
    public static final Set A00 = Collections.synchronizedSet(new HashSet());

    public static void A00(Class cls) {
        A00.add(cls.getName());
    }
}

package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Si, reason: invalid class name */
/* loaded from: 3Si.class */
public final class C3Si {
    public static final C3Si A00 = new Object();

    public static final void A00(Bundle bundle, C3Si c3Si, ClassLoader classLoader, Set set) {
        if (set.contains(bundle)) {
            return;
        }
        bundle.setClassLoader(classLoader);
        set.add(bundle);
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(AnonymousClass001.A0i(it));
            if (obj instanceof Bundle) {
                A00((Bundle) obj, c3Si, classLoader, set);
            }
        }
    }
}

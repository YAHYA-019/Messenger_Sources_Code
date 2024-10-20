package X;

import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.5x8, reason: invalid class name */
/* loaded from: 5x8.class */
public final class C5x8 {
    public static final Set A01;
    public static final C5x8 A00 = new Object();
    public static final ConcurrentMap A02 = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5x8, java.lang.Object] */
    static {
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        11T.A0A(newSetFromMap);
        A01 = newSetFromMap;
    }

    public static final void A00(View view) {
        ConcurrentMap concurrentMap = A02;
        if (concurrentMap.get(view) != null) {
            if (concurrentMap.get(view) == null) {
                throw 1BK.A0h();
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            C5x8 c5x8 = A00;
            concurrentMap.put(view, i >= 30 ? new Fji(view, new M0S(c5x8, 0), new M0S(c5x8, 1), new M0t(c5x8, 0)) : new Fjh(view, new M0S(c5x8, 2), new M0t(c5x8, 1)));
        }
    }

    public static final void A01(View view) {
        ConcurrentMap concurrentMap = A02;
        7yA r0 = (7yA) concurrentMap.get(view);
        if (r0 != null) {
            r0.destroy();
        }
        concurrentMap.remove(view);
    }

    public static final void A02(C6s9 c6s9) {
        11T.A0F(c6s9, 0);
        A01.add(c6s9);
    }

    public static final void A03(C6s9 c6s9) {
        11T.A0F(c6s9, 0);
        A01.remove(c6s9);
    }
}

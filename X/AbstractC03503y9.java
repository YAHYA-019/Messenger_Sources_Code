package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3y9.class */
public abstract class AbstractC03503y9 extends 1N6 {
    public final java.util.Map A00;

    public AbstractC03503y9(int i) {
        super(i);
        this.A00 = new ConcurrentHashMap();
    }

    public final Runnable A00(final Runnable runnable, String str) {
        final Runnable A02 = C0jy.A02(runnable, str, ((1N6) this).A00);
        if (A02 == runnable) {
            return A02;
        }
        final java.util.Map map = this.A00;
        Runnable runnable2 = new Runnable(runnable, A02, map) { // from class: X.5vp
            public static final String __redex_internal_original_name = "Fury$FuryDefaultInstrumentationHandler$CleanUpRunnable";
            public final Runnable A00;
            public final Runnable A01;
            public final WeakReference A02;

            {
                this.A02 = new WeakReference(map);
                this.A01 = runnable;
                this.A00 = A02;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.util.Map map2 = (java.util.Map) this.A02.get();
                if (map2 != null) {
                    map2.remove(this.A01);
                    this.A00.run();
                }
            }
        };
        map.put(runnable, runnable2);
        return runnable2;
    }
}

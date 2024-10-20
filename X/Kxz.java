package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Kxz.class */
public abstract class Kxz {
    public static final Throwable A00 = new Ly0();

    public static boolean A00(Throwable th, AtomicReference atomicReference) {
        Object obj;
        do {
            obj = atomicReference.get();
            if (obj == A00) {
                return false;
            }
        } while (!1MG.A00(atomicReference, obj, obj == null ? th : new LxO(Arrays.asList((Throwable) obj, th))));
        return true;
    }
}

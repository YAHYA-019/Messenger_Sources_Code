package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: J7N.class */
public final class J7N extends WeakReference {
    public final int A00;

    public J7N(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.A00 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this != obj) {
            J7N j7n = (J7N) obj;
            if (this.A00 != j7n.A00 || get() != j7n.get()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }
}

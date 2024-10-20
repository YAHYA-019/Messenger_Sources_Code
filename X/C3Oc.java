package X;

import com.google.common.collect.ImmutableSet;

/* renamed from: X.3Oc, reason: invalid class name */
/* loaded from: 3Oc.class */
public abstract class C3Oc {
    public abstract ImmutableSet A00();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3Oc) {
            return A00().equals(((C3Oc) obj).A00());
        }
        return false;
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public final String toString() {
        return A00().toString();
    }
}

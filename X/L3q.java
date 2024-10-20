package X;

import java.util.Collections;

/* loaded from: L3q.class */
public final class L3q {
    public static final L3q A01 = new L3q(Collections.unmodifiableMap(AnonymousClass001.A0u()));
    public final java.util.Map A00;

    public L3q(java.util.Map map) {
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof L3q) {
            return this.A00.equals(((L3q) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
